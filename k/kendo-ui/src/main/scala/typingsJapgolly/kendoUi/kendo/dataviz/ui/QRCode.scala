package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.drawing.PDFOptions
import typingsJapgolly.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.QRCode")
@js.native
class QRCode protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: QRCodeOptions) = this()
  @JSName("options")
  var options_QRCode: QRCodeOptions = js.native
  var wrapper: JQuery = js.native
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  def imageDataURL(): String = js.native
  def redraw(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def svg(): String = js.native
  def value(options: String): Unit = js.native
  def value(options: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.QRCode")
@js.native
object QRCode extends js.Object {
  var fn: QRCode = js.native
  def extend(proto: js.Object): QRCode = js.native
}

