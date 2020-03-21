package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionList extends js.Object {
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var incomplete: js.UndefOr[Boolean] = js.undefined
  var suggestions: js.Array[CompletionItem]
}

object CompletionList {
  @scala.inline
  def apply(
    suggestions: js.Array[CompletionItem],
    dispose: js.UndefOr[Callback] = js.undefined,
    incomplete: js.UndefOr[Boolean] = js.undefined
  ): CompletionList = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    dispose.foreach(p => __obj.updateDynamic("dispose")(p.toJsFn))
    if (!js.isUndefined(incomplete)) __obj.updateDynamic("incomplete")(incomplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionList]
  }
}

