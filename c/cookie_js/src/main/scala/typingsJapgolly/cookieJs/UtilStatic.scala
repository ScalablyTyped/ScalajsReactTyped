package typingsJapgolly.cookieJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilStatic extends js.Object {
  def decode(value: String): String
  def encode(value: String): String
  def getKeys(value: js.Object): js.Array[_]
  def isArray(value: js.Any): Boolean
  def isObject(value: js.Any): Boolean
  def retrieve(x: String, y: String): String
  def toArray(args: js.Any*): js.Array[_]
}

object UtilStatic {
  @scala.inline
  def apply(
    decode: String => CallbackTo[String],
    encode: String => CallbackTo[String],
    getKeys: js.Object => CallbackTo[js.Array[js.Any]],
    isArray: js.Any => CallbackTo[Boolean],
    isObject: js.Any => CallbackTo[Boolean],
    retrieve: (String, String) => CallbackTo[String],
    toArray: /* repeated */ js.Any => CallbackTo[js.Array[js.Any]]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: java.lang.String) => encode(t0).runNow()))
    __obj.updateDynamic("getKeys")(js.Any.fromFunction1((t0: js.Object) => getKeys(t0).runNow()))
    __obj.updateDynamic("isArray")(js.Any.fromFunction1((t0: js.Any) => isArray(t0).runNow()))
    __obj.updateDynamic("isObject")(js.Any.fromFunction1((t0: js.Any) => isObject(t0).runNow()))
    __obj.updateDynamic("retrieve")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => retrieve(t0, t1).runNow()))
    __obj.updateDynamic("toArray")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toArray(t0).runNow()))
    __obj.asInstanceOf[UtilStatic]
  }
}

