# Notebook Utilities

## LeetCode Evaluator Input Template
- Notebook: `notebooks/leetcode-evaluator-input-template.ipynb`
- Goal: generate a copy-paste payload for `prompts/leetcode-evaluator.prompt.md`

### How to use in Kotlin Notebook
1. Open `notebooks/leetcode-evaluator-input-template.ipynb` in IntelliJ Kotlin Notebook.
2. Edit the `val input = EvaluatorPromptInput(...)` cell with your problem, code, and language.
3. Run all cells.
4. Copy the printed payload into your evaluator prompt session.

### CLI verification (optional)
Use the script mirror to generate a payload file without opening the notebook.
- Script: `scripts/generate_leetcode_prompt_input.main.kts`
- Output: `out/leetcode-evaluator-input.md`

