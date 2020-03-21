package typingsJapgolly.swag

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofUtils extends js.Object {
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_]
  def createFrame(`object`: js.Any): js.Any
  def escapeExpression(str: String): String
  def extend(obj: js.Any, source: js.Any*): js.Any
  def isArray(obj: js.Any): Boolean
  def isEmpty(obj: js.Any): Boolean
  def isFunction(obj: js.Any): Boolean
  def toString(obj: js.Any): String
}

object TypeofUtils {
  @scala.inline
  def apply(
    blockParams: (js.Array[js.Any], js.Array[js.Any]) => CallbackTo[js.Array[js.Any]],
    createFrame: js.Any => CallbackTo[js.Any],
    escapeExpression: String => CallbackTo[String],
    extend: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    isArray: js.Any => CallbackTo[Boolean],
    isEmpty: js.Any => CallbackTo[Boolean],
    isFunction: js.Any => CallbackTo[Boolean],
    toString: js.Any => CallbackTo[String]
  ): TypeofUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockParams")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Array[js.Any]) => blockParams(t0, t1).runNow()))
    __obj.updateDynamic("createFrame")(js.Any.fromFunction1((t0: js.Any) => createFrame(t0).runNow()))
    __obj.updateDynamic("escapeExpression")(js.Any.fromFunction1((t0: java.lang.String) => escapeExpression(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => extend(t0, t1).runNow()))
    __obj.updateDynamic("isArray")(js.Any.fromFunction1((t0: js.Any) => isArray(t0).runNow()))
    __obj.updateDynamic("isEmpty")(js.Any.fromFunction1((t0: js.Any) => isEmpty(t0).runNow()))
    __obj.updateDynamic("isFunction")(js.Any.fromFunction1((t0: js.Any) => isFunction(t0).runNow()))
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: js.Any) => toString(t0).runNow()))
    __obj.asInstanceOf[TypeofUtils]
  }
}

