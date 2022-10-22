package typingsJapgolly.kendoUi.kendo.dataviz.ui

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.drawing.PDFOptions
import typingsJapgolly.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCode
  extends StObject
     with Widget {
  
  def exportImage(options: Any): JQueryPromise[Any] = js.native
  
  def exportPDF(): JQueryPromise[Any] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[Any] = js.native
  
  def exportSVG(options: Any): JQueryPromise[Any] = js.native
  
  def imageDataURL(): String = js.native
  
  @JSName("options")
  var options_QRCode: QRCodeOptions = js.native
  
  def redraw(): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def svg(): String = js.native
  
  def value(options: String): Unit = js.native
  def value(options: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
