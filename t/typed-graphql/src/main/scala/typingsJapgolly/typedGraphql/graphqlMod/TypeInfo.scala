package typingsJapgolly.typedGraphql.graphqlMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// utilities/Typeinfo.js
trait TypeInfo extends StObject {
  
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
  
  inline def apply(
    enter: Node => Callback,
    getArgument: CallbackTo[GraphQLArgument],
    getDirective: CallbackTo[GraphQLDirective],
    getFieldDef: CallbackTo[GraphQLFieldDefinition],
    getInputType: CallbackTo[GraphQLInputType],
    getParentType: CallbackTo[GraphQLCompositeType],
    getType: CallbackTo[GraphQLOutputType],
    leave: Node => Callback
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1((t0: Node) => enter(t0).runNow()), getArgument = getArgument.toJsFn, getDirective = getDirective.toJsFn, getFieldDef = getFieldDef.toJsFn, getInputType = getInputType.toJsFn, getParentType = getParentType.toJsFn, getType = getType.toJsFn, leave = js.Any.fromFunction1((t0: Node) => leave(t0).runNow()))
    __obj.asInstanceOf[TypeInfo]
  }
  
  extension [Self <: TypeInfo](x: Self) {
    
    inline def setEnter(value: Node => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
    
    inline def setGetArgument(value: CallbackTo[GraphQLArgument]): Self = StObject.set(x, "getArgument", value.toJsFn)
    
    inline def setGetDirective(value: CallbackTo[GraphQLDirective]): Self = StObject.set(x, "getDirective", value.toJsFn)
    
    inline def setGetFieldDef(value: CallbackTo[GraphQLFieldDefinition]): Self = StObject.set(x, "getFieldDef", value.toJsFn)
    
    inline def setGetInputType(value: CallbackTo[GraphQLInputType]): Self = StObject.set(x, "getInputType", value.toJsFn)
    
    inline def setGetParentType(value: CallbackTo[GraphQLCompositeType]): Self = StObject.set(x, "getParentType", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[GraphQLOutputType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setLeave(value: Node => Callback): Self = StObject.set(x, "leave", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
  }
}
