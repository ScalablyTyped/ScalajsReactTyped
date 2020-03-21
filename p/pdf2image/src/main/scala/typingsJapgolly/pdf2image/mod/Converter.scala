package typingsJapgolly.pdf2image.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]]
  def convertPDFList(pdfList: js.Array[String]): js.Promise[js.Array[ConvertedFile]]
}

object Converter {
  @scala.inline
  def apply(
    convertPDF: String => CallbackTo[js.Promise[js.Array[ConvertedFile]]],
    convertPDFList: js.Array[String] => CallbackTo[js.Promise[js.Array[ConvertedFile]]]
  ): Converter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertPDF")(js.Any.fromFunction1((t0: java.lang.String) => convertPDF(t0).runNow()))
    __obj.updateDynamic("convertPDFList")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => convertPDFList(t0).runNow()))
    __obj.asInstanceOf[Converter]
  }
}

