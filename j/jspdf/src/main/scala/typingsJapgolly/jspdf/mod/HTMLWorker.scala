package typingsJapgolly.jspdf.mod

import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.URL
import org.scalajs.dom.Window
import typingsJapgolly.jspdf.anon.Filename
import typingsJapgolly.jspdf.anon.FnCall
import typingsJapgolly.jspdf.jspdfStrings.arraybuffer
import typingsJapgolly.jspdf.jspdfStrings.blob
import typingsJapgolly.jspdf.jspdfStrings.bloburi
import typingsJapgolly.jspdf.jspdfStrings.bloburl
import typingsJapgolly.jspdf.jspdfStrings.canvas
import typingsJapgolly.jspdf.jspdfStrings.container
import typingsJapgolly.jspdf.jspdfStrings.context2d
import typingsJapgolly.jspdf.jspdfStrings.datauri
import typingsJapgolly.jspdf.jspdfStrings.datauristring
import typingsJapgolly.jspdf.jspdfStrings.dataurl
import typingsJapgolly.jspdf.jspdfStrings.dataurlnewwindow
import typingsJapgolly.jspdf.jspdfStrings.dataurlstring
import typingsJapgolly.jspdf.jspdfStrings.img
import typingsJapgolly.jspdf.jspdfStrings.pdf
import typingsJapgolly.jspdf.jspdfStrings.pdfjsnewwindow
import typingsJapgolly.jspdf.jspdfStrings.pdfobjectnewwindow
import typingsJapgolly.jspdf.jspdfStrings.string
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLWorker
  extends StObject
     with Promise[Any] {
  
  def doCallback(): js.Promise[Unit] = js.native
  
  def error(msg: String): Unit = js.native
  
  def from(src: String, `type`: container | canvas | img | pdf | context2d): HTMLWorker = js.native
  def from(src: HTMLElement, `type`: container | canvas | img | pdf | context2d): HTMLWorker = js.native
  
  @JSName("get")
  def get_string(key: string): HTMLWorker = js.native
  @JSName("get")
  def get_string(key: string, cbk: js.Function1[/* value */ String, Unit]): String = js.native
  
  def outputImg(`type`: img | datauristring | dataurlstring | datauri | dataurl): js.Promise[String] = js.native
  
  def outputPdf(): String = js.native
  def outputPdf(`type`: datauristring | dataurlstring): String = js.native
  def outputPdf(`type`: datauristring | dataurlstring, options: Filename): String = js.native
  @JSName("outputPdf")
  def outputPdf_Boolean(`type`: dataurl | datauri): Boolean = js.native
  @JSName("outputPdf")
  def outputPdf_Boolean(`type`: dataurl | datauri, options: Filename): Boolean = js.native
  @JSName("outputPdf")
  var outputPdf_Original: FnCall = js.native
  @JSName("outputPdf")
  def outputPdf_URL(`type`: bloburi | bloburl): URL = js.native
  @JSName("outputPdf")
  def outputPdf_Window(`type`: pdfobjectnewwindow | pdfjsnewwindow | dataurlnewwindow): Window = js.native
  @JSName("outputPdf")
  def outputPdf_Window(`type`: pdfobjectnewwindow | pdfjsnewwindow | dataurlnewwindow, options: Filename): Window = js.native
  @JSName("outputPdf")
  def outputPdf_arraybuffer(`type`: arraybuffer): js.typedarray.ArrayBuffer = js.native
  @JSName("outputPdf")
  def outputPdf_blob(`type`: blob): Blob = js.native
  
  var progress: HTMLWorkerProgress = js.native
  
  def save(filename: String): js.Promise[Unit] = js.native
  
  def set(opt: HTMLOptions): HTMLWorker = js.native
}
