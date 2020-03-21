package typingsJapgolly.pdfkit.PDFKit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pdfkit.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a single page in the PDF document
  */
trait PDFPage extends js.Object {
  var annotations: js.Any
  var content: PDFKitReference
  /**
    * The page dictionnary
    */
  var dictionary: PDFKitReference
  var document: PDFDocument
  var ext_gstates: js.Any
  var fonts: js.Any
  var height: Double
  var layout: String
  var margins: AnonBottom
  var patterns: js.Any
  var size: String
  var width: Double
  var xobjects: js.Any
  def end(): Unit
  def maxY(): Double
  def write(chunk: js.Any): Unit
}

object PDFPage {
  @scala.inline
  def apply(
    annotations: js.Any,
    content: PDFKitReference,
    dictionary: PDFKitReference,
    document: PDFDocument,
    end: Callback,
    ext_gstates: js.Any,
    fonts: js.Any,
    height: Double,
    layout: String,
    margins: AnonBottom,
    maxY: CallbackTo[Double],
    patterns: js.Any,
    size: String,
    width: Double,
    write: js.Any => Callback,
    xobjects: js.Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xobjects = xobjects.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("maxY")(maxY.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Any) => write(t0).runNow()))
    __obj.asInstanceOf[PDFPage]
  }
}

