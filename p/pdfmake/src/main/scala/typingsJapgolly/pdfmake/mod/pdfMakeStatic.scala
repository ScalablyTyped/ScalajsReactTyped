package typingsJapgolly.pdfmake.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pdfMakeStatic extends js.Object {
  var fonts: StringDictionary[TFontFamilyTypes]
  var vfs: TFontFamily
  def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf
}

object pdfMakeStatic {
  @scala.inline
  def apply(
    createPdf: TDocumentDefinitions => CallbackTo[TCreatedPdf],
    fonts: StringDictionary[TFontFamilyTypes],
    vfs: TFontFamily
  ): pdfMakeStatic = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], vfs = vfs.asInstanceOf[js.Any])
    __obj.updateDynamic("createPdf")(js.Any.fromFunction1((t0: typingsJapgolly.pdfmake.mod.TDocumentDefinitions) => createPdf(t0).runNow()))
    __obj.asInstanceOf[pdfMakeStatic]
  }
}

