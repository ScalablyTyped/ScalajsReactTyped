package typingsJapgolly.angularCompiler.srcUtilMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueVisitor extends js.Object {
  def visitArray(arr: js.Array[_], context: js.Any): js.Any
  def visitOther(value: js.Any, context: js.Any): js.Any
  def visitPrimitive(value: js.Any, context: js.Any): js.Any
  def visitStringMap(map: StringDictionary[js.Any], context: js.Any): js.Any
}

object ValueVisitor {
  @scala.inline
  def apply(
    visitArray: (js.Array[js.Any], js.Any) => CallbackTo[js.Any],
    visitOther: (js.Any, js.Any) => CallbackTo[js.Any],
    visitPrimitive: (js.Any, js.Any) => CallbackTo[js.Any],
    visitStringMap: (StringDictionary[js.Any], js.Any) => CallbackTo[js.Any]
  ): ValueVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitArray")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Any) => visitArray(t0, t1).runNow()))
    __obj.updateDynamic("visitOther")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => visitOther(t0, t1).runNow()))
    __obj.updateDynamic("visitPrimitive")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => visitPrimitive(t0, t1).runNow()))
    __obj.updateDynamic("visitStringMap")(js.Any.fromFunction2((t0: org.scalablytyped.runtime.StringDictionary[js.Any], t1: js.Any) => visitStringMap(t0, t1).runNow()))
    __obj.asInstanceOf[ValueVisitor]
  }
}

