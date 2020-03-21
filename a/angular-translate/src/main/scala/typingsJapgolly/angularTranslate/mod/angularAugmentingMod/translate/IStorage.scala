package typingsJapgolly.angularTranslate.mod.angularAugmentingMod.translate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorage extends js.Object {
  def get(name: String): String
  def put(name: String, value: String): Unit
}

object IStorage {
  @scala.inline
  def apply(get: String => CallbackTo[String], put: (String, String) => Callback): IStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => put(t0, t1).runNow()))
    __obj.asInstanceOf[IStorage]
  }
}

