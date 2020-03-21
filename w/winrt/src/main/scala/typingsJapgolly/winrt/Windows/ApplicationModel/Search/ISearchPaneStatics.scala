package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneStatics extends js.Object {
  def getForCurrentView(): SearchPane
}

object ISearchPaneStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[SearchPane]): ISearchPaneStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.asInstanceOf[ISearchPaneStatics]
  }
}

