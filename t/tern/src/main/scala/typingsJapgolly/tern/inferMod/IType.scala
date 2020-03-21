package typingsJapgolly.tern.inferMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IType extends ANull {
  /** The origin file of the type. */
  var origin: String
  /**
    * The syntax node that defined the type. Only present for object and function types,
    * and even for those it may be missing (if the type was created by a type definition file,
    * or synthesized in some other way).
    */
  var originNode: js.UndefOr[Node] = js.undefined
  def getType(): Type
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): Boolean
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  def toString(maxDepth: Double): String
}

object IType {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => Callback,
    forAllProps: /* repeated */ js.Any => Callback,
    gatherProperties: /* repeated */ js.Any => Callback,
    getFunctionType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull]],
    getObjType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull | Null]],
    getProp: /* repeated */ js.Any => CallbackTo[ANull],
    getSymbolType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull]],
    getType: CallbackTo[Type],
    hasType: Type => CallbackTo[Boolean],
    isEmpty: /* repeated */ js.Any => CallbackTo[Boolean],
    origin: String,
    propHint: /* repeated */ js.Any => CallbackTo[js.UndefOr[String]],
    propagate: /* repeated */ js.Any => Callback,
    propagatesTo: CallbackTo[js.Any],
    toString: Double => CallbackTo[String],
    typeHint: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull | Null]],
    originNode: Node = null
  ): IType = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("addType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => addType(t0).runNow()))
    __obj.updateDynamic("forAllProps")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => forAllProps(t0).runNow()))
    __obj.updateDynamic("gatherProperties")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => gatherProperties(t0).runNow()))
    __obj.updateDynamic("getFunctionType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getFunctionType(t0).runNow()))
    __obj.updateDynamic("getObjType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getObjType(t0).runNow()))
    __obj.updateDynamic("getProp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getProp(t0).runNow()))
    __obj.updateDynamic("getSymbolType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getSymbolType(t0).runNow()))
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("hasType")(js.Any.fromFunction1((t0: typingsJapgolly.tern.inferMod.Type) => hasType(t0).runNow()))
    __obj.updateDynamic("isEmpty")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => isEmpty(t0).runNow()))
    __obj.updateDynamic("propHint")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => propHint(t0).runNow()))
    __obj.updateDynamic("propagate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => propagate(t0).runNow()))
    __obj.updateDynamic("propagatesTo")(propagatesTo.toJsFn)
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: scala.Double) => toString(t0).runNow()))
    __obj.updateDynamic("typeHint")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => typeHint(t0).runNow()))
    if (originNode != null) __obj.updateDynamic("originNode")(originNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
}

