package typingsJapgolly.cassandraDriver.policiesMod.policies.addressResolution

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressTranslator extends js.Object {
  def translate(address: String, port: Double, callback: js.Function): Unit
}

object AddressTranslator {
  @scala.inline
  def apply(translate: (String, Double, js.Function) => Callback): AddressTranslator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("translate")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: js.Function) => translate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AddressTranslator]
  }
}

