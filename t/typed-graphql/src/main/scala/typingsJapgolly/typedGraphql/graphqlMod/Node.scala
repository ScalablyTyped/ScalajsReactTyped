package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.graphqlMod.Name
  - typingsJapgolly.typedGraphql.graphqlMod.Document
  - typingsJapgolly.typedGraphql.graphqlMod.OperationDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.VariableDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.Variable
  - typingsJapgolly.typedGraphql.graphqlMod.SelectionSet
  - typingsJapgolly.typedGraphql.graphqlMod.Field
  - typingsJapgolly.typedGraphql.graphqlMod.Argument
  - typingsJapgolly.typedGraphql.graphqlMod.FragmentSpread
  - typingsJapgolly.typedGraphql.graphqlMod.InlineFragment
  - typingsJapgolly.typedGraphql.graphqlMod.FragmentDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.IntValue
  - typingsJapgolly.typedGraphql.graphqlMod.FloatValue
  - typingsJapgolly.typedGraphql.graphqlMod.StringValue
  - typingsJapgolly.typedGraphql.graphqlMod.BooleanValue
  - typingsJapgolly.typedGraphql.graphqlMod.EnumValue
  - typingsJapgolly.typedGraphql.graphqlMod.ListValue
  - typingsJapgolly.typedGraphql.graphqlMod.ObjectValue
  - typingsJapgolly.typedGraphql.graphqlMod.ObjectField
  - typingsJapgolly.typedGraphql.graphqlMod.Directive
  - typingsJapgolly.typedGraphql.graphqlMod.ListType
  - typingsJapgolly.typedGraphql.graphqlMod.NonNullType
  - typingsJapgolly.typedGraphql.graphqlMod.ObjectTypeDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.FieldDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.InputValueDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.InterfaceTypeDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.UnionTypeDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.ScalarTypeDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.EnumTypeDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.EnumValueDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.InputObjectTypeDefinition
  - typingsJapgolly.typedGraphql.graphqlMod.TypeExtensionDefinition
*/
trait Node extends StObject
object Node {
  
  inline def Argument(kind: String, name: Name, value: Value): typingsJapgolly.typedGraphql.graphqlMod.Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Argument]
  }
  
  inline def BooleanValue(kind: String, value: Boolean): typingsJapgolly.typedGraphql.graphqlMod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.BooleanValue]
  }
  
  inline def Directive(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Directive]
  }
  
  inline def Document(definitions: js.Array[Definition], kind: String): typingsJapgolly.typedGraphql.graphqlMod.Document = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Document]
  }
  
  inline def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typingsJapgolly.typedGraphql.graphqlMod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.EnumTypeDefinition]
  }
  
  inline def EnumValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.EnumValue]
  }
  
  inline def EnumValueDefinition(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.EnumValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.EnumValueDefinition]
  }
  
  inline def Field(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Field]
  }
  
  inline def FieldDefinition(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): typingsJapgolly.typedGraphql.graphqlMod.FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.FieldDefinition]
  }
  
  inline def FloatValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.FloatValue]
  }
  
  inline def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typingsJapgolly.typedGraphql.graphqlMod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.FragmentDefinition]
  }
  
  inline def FragmentSpread(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.FragmentSpread]
  }
  
  inline def InlineFragment(kind: String, selectionSet: SelectionSet): typingsJapgolly.typedGraphql.graphqlMod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.InlineFragment]
  }
  
  inline def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.InputObjectTypeDefinition]
  }
  
  inline def InputValueDefinition(kind: String, name: Name, `type`: Type): typingsJapgolly.typedGraphql.graphqlMod.InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.InputValueDefinition]
  }
  
  inline def IntValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntValue]
  }
  
  inline def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.InterfaceTypeDefinition]
  }
  
  inline def ListType(kind: String, `type`: Type): typingsJapgolly.typedGraphql.graphqlMod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ListType]
  }
  
  inline def ListValue(kind: String, values: js.Array[Value]): typingsJapgolly.typedGraphql.graphqlMod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ListValue]
  }
  
  inline def Name(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.Name = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Name]
  }
  
  inline def NonNullType(kind: String, `type`: NamedType | ListType): typingsJapgolly.typedGraphql.graphqlMod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.NonNullType]
  }
  
  inline def ObjectField(kind: String, name: Name, value: Value): typingsJapgolly.typedGraphql.graphqlMod.ObjectField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ObjectField]
  }
  
  inline def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ObjectTypeDefinition]
  }
  
  inline def ObjectValue(fields: js.Array[ObjectField], kind: String): typingsJapgolly.typedGraphql.graphqlMod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ObjectValue]
  }
  
  inline def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typingsJapgolly.typedGraphql.graphqlMod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.OperationDefinition]
  }
  
  inline def ScalarTypeDefinition(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ScalarTypeDefinition]
  }
  
  inline def SelectionSet(kind: String, selections: js.Array[Selection]): typingsJapgolly.typedGraphql.graphqlMod.SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.SelectionSet]
  }
  
  inline def StringValue(kind: String, value: String): typingsJapgolly.typedGraphql.graphqlMod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.StringValue]
  }
  
  inline def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): typingsJapgolly.typedGraphql.graphqlMod.TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.TypeExtensionDefinition]
  }
  
  inline def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): typingsJapgolly.typedGraphql.graphqlMod.UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.UnionTypeDefinition]
  }
  
  inline def Variable(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Variable]
  }
  
  inline def VariableDefinition(kind: String, `type`: Type, variable: Variable): typingsJapgolly.typedGraphql.graphqlMod.VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.VariableDefinition]
  }
}
