package typingsJapgolly.jestCore.testPathPatternPromptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestRunner.mod.Test
import typingsJapgolly.std.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PatternPrompt * / any */ trait TestPathPatternPrompt extends js.Object {
  var _searchSources: js.UndefOr[SearchSources] = js.undefined
  def _getMatchedTests(pattern: String): js.Array[Test]
  def _onChange(pattern: String, options: ScrollOptions): Unit
  def _printPrompt(pattern: String): Unit
  def updateSearchSources(searchSources: SearchSources): Unit
}

object TestPathPatternPrompt {
  @scala.inline
  def apply(
    _getMatchedTests: String => CallbackTo[js.Array[Test]],
    _onChange: (String, ScrollOptions) => Callback,
    _printPrompt: String => Callback,
    updateSearchSources: SearchSources => Callback,
    _searchSources: SearchSources = null
  ): TestPathPatternPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_getMatchedTests")(js.Any.fromFunction1((t0: java.lang.String) => _getMatchedTests(t0).runNow()))
    __obj.updateDynamic("_onChange")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.ScrollOptions) => _onChange(t0, t1).runNow()))
    __obj.updateDynamic("_printPrompt")(js.Any.fromFunction1((t0: java.lang.String) => _printPrompt(t0).runNow()))
    __obj.updateDynamic("updateSearchSources")(js.Any.fromFunction1((t0: typingsJapgolly.jestCore.testPathPatternPromptMod.SearchSources) => updateSearchSources(t0).runNow()))
    if (_searchSources != null) __obj.updateDynamic("_searchSources")(_searchSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPathPatternPrompt]
  }
}

