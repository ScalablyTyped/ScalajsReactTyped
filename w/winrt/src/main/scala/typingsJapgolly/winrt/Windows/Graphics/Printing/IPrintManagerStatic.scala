package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintManagerStatic extends js.Object {
  def getForCurrentView(): PrintManager
  def showPrintUIAsync(): IAsyncOperation[Boolean]
}

object IPrintManagerStatic {
  @scala.inline
  def apply(
    getForCurrentView: CallbackTo[PrintManager],
    showPrintUIAsync: CallbackTo[IAsyncOperation[Boolean]]
  ): IPrintManagerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.updateDynamic("showPrintUIAsync")(showPrintUIAsync.toJsFn)
    __obj.asInstanceOf[IPrintManagerStatic]
  }
}

