package typingsJapgolly.cryptojs.CryptoJS.enc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncStatic extends js.Object {
  var Base64: ICoder
  var Hex: ICoder
  var Latin1: ICoder
  var Utf16: ICoder
  var Utf16BE: ICoder
  var Utf16LE: ICoder
  var Utf8: ICoder
}

object EncStatic {
  @scala.inline
  def apply(
    Base64: ICoder,
    Hex: ICoder,
    Latin1: ICoder,
    Utf16: ICoder,
    Utf16BE: ICoder,
    Utf16LE: ICoder,
    Utf8: ICoder
  ): EncStatic = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16BE = Utf16BE.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncStatic]
  }
}

