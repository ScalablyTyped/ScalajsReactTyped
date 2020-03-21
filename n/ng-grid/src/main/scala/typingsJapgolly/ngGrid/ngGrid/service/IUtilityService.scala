package typingsJapgolly.ngGrid.ngGrid.service

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ngGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilityService extends js.Object {
  def endsWith(str: String, suffix: String): Boolean
  def evalProperty(entity: js.Any, path: String): js.Any
  def forIn(obj: js.Any, action: js.Function2[/* value */ js.Any, /* property */ String, js.Object]): Unit
  def getElementsByClassName(cl: String): js.Array[_]
  def getInstanceType(o: js.Any): String
  def isNullOrUndefined(obj: js.Any): Boolean
  def newId(): String
  def seti18n($scope: IGridScope, language: String): Unit
  def visualLength(node: js.Any): Double
}

object IUtilityService {
  @scala.inline
  def apply(
    endsWith: (String, String) => CallbackTo[Boolean],
    evalProperty: (js.Any, String) => CallbackTo[js.Any],
    forIn: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Callback,
    getElementsByClassName: String => CallbackTo[js.Array[js.Any]],
    getInstanceType: js.Any => CallbackTo[String],
    isNullOrUndefined: js.Any => CallbackTo[Boolean],
    newId: CallbackTo[String],
    seti18n: (IGridScope, String) => Callback,
    visualLength: js.Any => CallbackTo[Double]
  ): IUtilityService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endsWith")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => endsWith(t0, t1).runNow()))
    __obj.updateDynamic("evalProperty")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => evalProperty(t0, t1).runNow()))
    __obj.updateDynamic("forIn")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[/* value */ js.Any, /* property */ java.lang.String, js.Object]) => forIn(t0, t1).runNow()))
    __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByClassName(t0).runNow()))
    __obj.updateDynamic("getInstanceType")(js.Any.fromFunction1((t0: js.Any) => getInstanceType(t0).runNow()))
    __obj.updateDynamic("isNullOrUndefined")(js.Any.fromFunction1((t0: js.Any) => isNullOrUndefined(t0).runNow()))
    __obj.updateDynamic("newId")(newId.toJsFn)
    __obj.updateDynamic("seti18n")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: java.lang.String) => seti18n(t0, t1).runNow()))
    __obj.updateDynamic("visualLength")(js.Any.fromFunction1((t0: js.Any) => visualLength(t0).runNow()))
    __obj.asInstanceOf[IUtilityService]
  }
}

