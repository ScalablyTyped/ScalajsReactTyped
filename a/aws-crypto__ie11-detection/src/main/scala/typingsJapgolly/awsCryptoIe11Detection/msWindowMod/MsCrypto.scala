package typingsJapgolly.awsCryptoIe11Detection.msWindowMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsCryptoIe11Detection.msSubtleCryptoMod.MsSubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsCrypto extends js.Object {
  var subtle: MsSubtleCrypto
  def getRandomValues(toFill: scala.scalajs.js.typedarray.Uint8Array): Unit
}

object MsCrypto {
  @scala.inline
  def apply(getRandomValues: scala.scalajs.js.typedarray.Uint8Array => Callback, subtle: MsSubtleCrypto): MsCrypto = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("getRandomValues")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => getRandomValues(t0).runNow()))
    __obj.asInstanceOf[MsCrypto]
  }
}

