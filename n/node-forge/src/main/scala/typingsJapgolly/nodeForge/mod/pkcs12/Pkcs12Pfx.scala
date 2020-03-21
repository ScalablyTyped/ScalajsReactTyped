package typingsJapgolly.nodeForge.mod.pkcs12

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.AnonDictkey
import typingsJapgolly.nodeForge.AnonEncrypted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12Pfx extends js.Object {
  var safeContents: js.Array[AnonEncrypted]
  var version: String
  def getBags(filter: BagsFilter): AnonDictkey
  def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag]
  def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag]
}

object Pkcs12Pfx {
  @scala.inline
  def apply(
    getBags: BagsFilter => CallbackTo[AnonDictkey],
    getBagsByFriendlyName: (String, String) => CallbackTo[js.Array[Bag]],
    getBagsByLocalKeyId: (String, String) => CallbackTo[js.Array[Bag]],
    safeContents: js.Array[AnonEncrypted],
    version: String
  ): Pkcs12Pfx = {
    val __obj = js.Dynamic.literal(safeContents = safeContents.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("getBags")(js.Any.fromFunction1((t0: typingsJapgolly.nodeForge.mod.pkcs12.BagsFilter) => getBags(t0).runNow()))
    __obj.updateDynamic("getBagsByFriendlyName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getBagsByFriendlyName(t0, t1).runNow()))
    __obj.updateDynamic("getBagsByLocalKeyId")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getBagsByLocalKeyId(t0, t1).runNow()))
    __obj.asInstanceOf[Pkcs12Pfx]
  }
}

