package typingsJapgolly.cryptoJs

import typingsJapgolly.cryptoJs.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnsiX923 extends js.Object {
  var AnsiX923: Padding
  var Iso10126: Padding
  var Iso97971: Padding
  var NoPadding: Padding
  var Pkcs7: Padding
  var ZeroPadding: Padding
}

object AnonAnsiX923 {
  @scala.inline
  def apply(
    AnsiX923: Padding,
    Iso10126: Padding,
    Iso97971: Padding,
    NoPadding: Padding,
    Pkcs7: Padding,
    ZeroPadding: Padding
  ): AnonAnsiX923 = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnsiX923]
  }
}

