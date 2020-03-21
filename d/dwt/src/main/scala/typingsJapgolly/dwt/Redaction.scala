package typingsJapgolly.dwt

import typingsJapgolly.dwt.EnumDWTOCRFindTextAction.OCRFT_MARKFORREDACT
import typingsJapgolly.dwt.EnumDWTOCRFindTextFlags.OCRFT_WHOLEWORD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redaction extends js.Object {
  var FindText: String
  var FindTextAction: OCRFT_MARKFORREDACT
  var FindTextFlags: OCRFT_WHOLEWORD
}

object Redaction {
  @scala.inline
  def apply(FindText: String, FindTextAction: OCRFT_MARKFORREDACT, FindTextFlags: OCRFT_WHOLEWORD): Redaction = {
    val __obj = js.Dynamic.literal(FindText = FindText.asInstanceOf[js.Any], FindTextAction = FindTextAction.asInstanceOf[js.Any], FindTextFlags = FindTextFlags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Redaction]
  }
}

