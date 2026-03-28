# AGENTS Guide

## Project Snapshot
- This repo is a personal DSA practice workspace with two runnable tracks: Kotlin (`src/main/kotlin`) and Python (`src/main/python`).
- There is no Gradle/Maven/Poetry manifest; workflows are script/file driven.
- Kotlin is configured as an IntelliJ module via `data-structures-algorithms.iml` (source roots under `src/main/kotlin` and `src/test/kotlin`).

## Architecture and Boundaries
- Kotlin entrypoint: `src/main/kotlin/Main.kt`.
- Core Kotlin examples currently live in `src/main/kotlin/datastructures/StringOperations.kt` and `src/main/kotlin/datastructures/Stack.kt`.
- Python examples are standalone scripts (for example `src/main/python/rotate-array.py`) with top-level execution.
- Concept notes are documented in `src/main/Patterns.md` and `src/main/kotlin/datastructures/README.md`.
- AI interview-evaluation behavior is defined separately in `prompts/leetcode-evaluator.prompt.md` (not runtime code).

## Verified Developer Workflows
- Kotlin CLI run (verified): compile `Main.kt` plus `datastructures/*.kt`, then run the jar.
- Python CLI run (verified): `python3 src/main/python/rotate-array.py`.
- No automated tests are present in `src/test` yet; prefer adding small executable checks near new examples.

## Project-Specific Coding Conventions
- Kotlin package name used in code is `data.structures` (`StringOperations.kt`, `Stack.kt`) even though folder name is `datastructures`; keep imports/package declarations consistent with existing files.
- `StringOperations.kt` includes a reusable "Problem Template" comment block; use that template for new solve methods in this file.
- Current style favors small, single-purpose demo methods (`frequencyOfCharacters`, `isPalindrome`) and direct `println` output for quick validation.
- Python scripts are imperative and in-place (e.g., `reverse(left, right, numbers)` mutates the input list and prints intermediate states).

## Integration Points and Cross-File Flow
- `Main.kt` imports `data.structures.StringOperations` and is the handoff point from runner -> algorithm method.
- `Patterns.md` documents strategy-level guidance (character frequency maps, ASCII-array counting) that maps directly to implementations in `StringOperations.kt`.
- `prompts/leetcode-evaluator.prompt.md` is a reusable rubric for evaluating solutions; keep it in sync if you add new evaluation dimensions.

## Agent Tips for Productive Changes
- When adding Kotlin algorithms, place them in `src/main/kotlin/datastructures/` and wire a quick call from `Main.kt` to keep a runnable demo path.
- When adding Python algorithms, keep each problem self-contained in `src/main/python/` and include a tiny input/output example at file bottom.
- Do not assume hidden build tooling; if you introduce one (Gradle, pytest, etc.), document it explicitly in `README.md` and this file.
