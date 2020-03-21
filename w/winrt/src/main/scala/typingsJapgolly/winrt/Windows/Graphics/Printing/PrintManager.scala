package typingsJapgolly.winrt.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
class PrintManager () extends IPrintManager {
  /* CompleteClass */
  override var onprinttaskrequested: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
object PrintManager extends js.Object {
  def getForCurrentView(): PrintManager = js.native
  def showPrintUIAsync(): IAsyncOperation[Boolean] = js.native
}

