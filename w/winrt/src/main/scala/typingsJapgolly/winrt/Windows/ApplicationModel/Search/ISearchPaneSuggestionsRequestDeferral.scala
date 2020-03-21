package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequestDeferral extends js.Object {
  def complete(): Unit
}

object ISearchPaneSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: Callback): ISearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestDeferral]
  }
}

