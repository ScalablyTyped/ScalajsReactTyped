package typingsJapgolly.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.pdfkit.AnonCount
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFAnnotation
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFColor
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFFont
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFImage
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFText
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDocument
  extends ReadableStream
     with PDFAnnotation
     with PDFColor
     with PDFImage
     with PDFText
     with PDFVector
     with PDFFont
     with Instantiable0[PDFDocument]
     with Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
  /**
    * Wheter streams should be compressed
    */
  var compress: Boolean = js.native
  /**
    * PDF document Metadata
    */
  var info: DocumentInfo = js.native
  /**
    * Options for the document
    */
  var options: PDFDocumentOptions = js.native
  /**
    * Represent the current page.
    */
  var page: PDFPage = js.native
  /**
    * PDF Version
    */
  var version: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addContent(data: js.Any): PDFDocument = js.native
  def addPage(): PDFDocument = js.native
  def addPage(options: PDFDocumentOptions): PDFDocument = js.native
  def bufferedPageRange(): AnonCount = js.native
  def end(): Unit = js.native
  def flushPages(): Unit = js.native
  /**
    * Deprecated. Throws exception
    */
  def output(fn: js.Any): Unit = js.native
  def ref(data: js.Object): PDFKitReference = js.native
  def switchToPage(): PDFPage = js.native
  def switchToPage(n: Double): PDFPage = js.native
  /**
    * Deprecated
    */
  def write(fileName: String, fn: js.Any): Unit = js.native
}

