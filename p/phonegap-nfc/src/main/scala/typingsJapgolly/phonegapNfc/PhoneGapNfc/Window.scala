package typingsJapgolly.phonegapNfc.PhoneGapNfc

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global object NFC.
  */
trait Window extends js.Object {
  var ndef: Ndef
  var nfc: Nfc
  var util: Util
  def fireNfcTagEvent(event: TagEvent, tagAsJson: String): Unit
}

object Window {
  @scala.inline
  def apply(fireNfcTagEvent: (TagEvent, String) => Callback, ndef: Ndef, nfc: Nfc, util: Util): Window = {
    val __obj = js.Dynamic.literal(ndef = ndef.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.updateDynamic("fireNfcTagEvent")(js.Any.fromFunction2((t0: typingsJapgolly.phonegapNfc.PhoneGapNfc.TagEvent, t1: java.lang.String) => fireNfcTagEvent(t0, t1).runNow()))
    __obj.asInstanceOf[Window]
  }
}

