package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Values
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.graphqlMod.Variable
  - typingsJapgolly.typedGraphql.graphqlMod.IntValue
  - typingsJapgolly.typedGraphql.graphqlMod.FloatValue
  - typingsJapgolly.typedGraphql.graphqlMod.StringValue
  - typingsJapgolly.typedGraphql.graphqlMod.BooleanValue
  - typingsJapgolly.typedGraphql.graphqlMod.EnumValue
  - typingsJapgolly.typedGraphql.graphqlMod.ListValue
  - typingsJapgolly.typedGraphql.graphqlMod.ObjectValue
*/
trait Value extends StObject
object Value {
  
  inline def BooleanValue(kind: String, value: Boolean): typingsJapgolly.typedGraphql.graphqlMod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.BooleanValue]
  }
  
  inline def EnumValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.EnumValue]
  }
  
  inline def FloatValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.FloatValue]
  }
  
  inline def IntValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntValue]
  }
  
  inline def ListValue(kind: String, values: js.Array[Value]): typingsJapgolly.typedGraphql.graphqlMod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ListValue]
  }
  
  inline def ObjectValue(fields: js.Array[ObjectField], kind: String): typingsJapgolly.typedGraphql.graphqlMod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ObjectValue]
  }
  
  inline def StringValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.StringValue]
  }
  
  inline def Variable(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Variable]
  }
}
