package typingsJapgolly.iostContract.IOSTContract

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalStorage extends js.Object {
  def globalGet(contract: String, key: String): String | Null
  def globalHas(contract: String, key: String): Boolean
  def globalMapGet(contract: String, key: String, field: String): String | Null
  def globalMapHas(contract: String, key: String, field: String): Boolean
  def globalMapKeys(contract: String, key: String): js.Array[String]
  def globalMapLen(contract: String, key: String): Double
}

object GlobalStorage {
  @scala.inline
  def apply(
    globalGet: (String, String) => CallbackTo[String | Null],
    globalHas: (String, String) => CallbackTo[Boolean],
    globalMapGet: (String, String, String) => CallbackTo[String | Null],
    globalMapHas: (String, String, String) => CallbackTo[Boolean],
    globalMapKeys: (String, String) => CallbackTo[js.Array[String]],
    globalMapLen: (String, String) => CallbackTo[Double]
  ): GlobalStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("globalGet")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => globalGet(t0, t1).runNow()))
    __obj.updateDynamic("globalHas")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => globalHas(t0, t1).runNow()))
    __obj.updateDynamic("globalMapGet")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => globalMapGet(t0, t1, t2).runNow()))
    __obj.updateDynamic("globalMapHas")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => globalMapHas(t0, t1, t2).runNow()))
    __obj.updateDynamic("globalMapKeys")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => globalMapKeys(t0, t1).runNow()))
    __obj.updateDynamic("globalMapLen")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => globalMapLen(t0, t1).runNow()))
    __obj.asInstanceOf[GlobalStorage]
  }
}

