package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utilities/Typeinfo.js
trait TypeInfo extends js.Object {
  def enter(node: Node): Unit
  def getArgument(): GraphQLArgument
  def getDirective(): GraphQLDirective
  def getFieldDef(): GraphQLFieldDefinition
  def getInputType(): GraphQLInputType
  def getParentType(): GraphQLCompositeType
  def getType(): GraphQLOutputType
  def leave(node: Node): Unit
}

object TypeInfo {
  @scala.inline
  def apply(
    enter: Node => Callback,
    getArgument: CallbackTo[GraphQLArgument],
    getDirective: CallbackTo[GraphQLDirective],
    getFieldDef: CallbackTo[GraphQLFieldDefinition],
    getInputType: CallbackTo[GraphQLInputType],
    getParentType: CallbackTo[GraphQLCompositeType],
    getType: CallbackTo[GraphQLOutputType],
    leave: Node => Callback
  ): TypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enter")(js.Any.fromFunction1((t0: typingsJapgolly.typedGraphql.mod.Node) => enter(t0).runNow()))
    __obj.updateDynamic("getArgument")(getArgument.toJsFn)
    __obj.updateDynamic("getDirective")(getDirective.toJsFn)
    __obj.updateDynamic("getFieldDef")(getFieldDef.toJsFn)
    __obj.updateDynamic("getInputType")(getInputType.toJsFn)
    __obj.updateDynamic("getParentType")(getParentType.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("leave")(js.Any.fromFunction1((t0: typingsJapgolly.typedGraphql.mod.Node) => leave(t0).runNow()))
    __obj.asInstanceOf[TypeInfo]
  }
}

