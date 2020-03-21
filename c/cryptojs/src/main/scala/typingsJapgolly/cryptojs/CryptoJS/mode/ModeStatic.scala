package typingsJapgolly.cryptojs.CryptoJS.mode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeStatic extends js.Object {
  var CBC: typingsJapgolly.cryptojs.CryptoJS.mode.CBC
  var CFB: typingsJapgolly.cryptojs.CryptoJS.mode.CFB
  var CTR: typingsJapgolly.cryptojs.CryptoJS.mode.CTR
  var CTRGladman: typingsJapgolly.cryptojs.CryptoJS.mode.CTRGladman
  var ECB: typingsJapgolly.cryptojs.CryptoJS.mode.ECB
  var OFB: typingsJapgolly.cryptojs.CryptoJS.mode.OFB
}

object ModeStatic {
  @scala.inline
  def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModeStatic]
  }
}

