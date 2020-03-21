package typingsJapgolly.cryptojs.CryptoJS.pad

import japgolly.scalajs.react.Callback
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaddingImpl extends js.Object {
  def pad(data: WordArray, blockSize: Double): Unit
  def unpad(data: WordArray): Unit
}

object IPaddingImpl {
  @scala.inline
  def apply(pad: (WordArray, Double) => Callback, unpad: WordArray => Callback): IPaddingImpl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pad")(js.Any.fromFunction2((t0: typingsJapgolly.cryptojs.CryptoJS.lib.WordArray, t1: scala.Double) => pad(t0, t1).runNow()))
    __obj.updateDynamic("unpad")(js.Any.fromFunction1((t0: typingsJapgolly.cryptojs.CryptoJS.lib.WordArray) => unpad(t0).runNow()))
    __obj.asInstanceOf[IPaddingImpl]
  }
}

