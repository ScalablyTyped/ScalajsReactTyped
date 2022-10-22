package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionScalarType
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionObjectType
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionInterfaceType
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionUnionType
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionEnumType
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionInputObjectType
*/
trait IntrospectionType extends StObject
object IntrospectionType {
  
  inline def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], name: String): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = "ENUM", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionEnumType]
  }
  
  inline def IntrospectionInputObjectType(inputFields: js.Array[IntrospectionInputValue], name: String): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = "INPUT_OBJECT", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionInputObjectType]
  }
  
  inline def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = "INTERFACE", name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionInterfaceType]
  }
  
  inline def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    name: String
  ): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = "OBJECT", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionObjectType]
  }
  
  inline def IntrospectionScalarType(name: String): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = "SCALAR", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionScalarType]
  }
  
  inline def IntrospectionUnionType(name: String, possibleTypes: js.Array[IntrospectionNamedTypeRef]): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = "UNION", name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionUnionType]
  }
}
