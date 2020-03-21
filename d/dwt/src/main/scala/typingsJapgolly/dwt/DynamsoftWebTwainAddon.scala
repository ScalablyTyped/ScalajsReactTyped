package typingsJapgolly.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftWebTwainAddon extends js.Object {
  var OCR: typingsJapgolly.dwt.OCR
  var OCRPro: typingsJapgolly.dwt.OCRPro
  var PDF: typingsJapgolly.dwt.PDF
  var Webcam: typingsJapgolly.dwt.Webcam
}

object DynamsoftWebTwainAddon {
  @scala.inline
  def apply(OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): DynamsoftWebTwainAddon = {
    val __obj = js.Dynamic.literal(OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamsoftWebTwainAddon]
  }
}

