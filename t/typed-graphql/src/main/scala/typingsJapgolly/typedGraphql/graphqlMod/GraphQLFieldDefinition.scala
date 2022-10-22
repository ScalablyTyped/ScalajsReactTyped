package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLFieldDefinition extends StObject {
  
  var args: js.Array[GraphQLArgument]
  
  var deprecationReason: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var name: String
  
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  
  var `type`: GraphQLOutputType
}
object GraphQLFieldDefinition {
  
  inline def apply(args: js.Array[GraphQLArgument], description: String, name: String, `type`: GraphQLOutputType): GraphQLFieldDefinition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldDefinition]
  }
  
  extension [Self <: GraphQLFieldDefinition](x: Self) {
    
    inline def setArgs(value: js.Array[GraphQLArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: GraphQLArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDeprecationReason(value: String): Self = StObject.set(x, "deprecationReason", value.asInstanceOf[js.Any])
    
    inline def setDeprecationReasonUndefined: Self = StObject.set(x, "deprecationReason", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResolve(
      value: (/* source */ Any, /* args */ StringDictionary[Any], /* context */ Any, /* info */ GraphQLResolveInfo) => Any
    ): Self = StObject.set(x, "resolve", js.Any.fromFunction4(value))
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setType(value: GraphQLOutputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
