package typingsJapgolly.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Definition
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.mod.ObjectTypeDefinition
  - typingsJapgolly.typedGraphql.mod.InterfaceTypeDefinition
  - typingsJapgolly.typedGraphql.mod.UnionTypeDefinition
  - typingsJapgolly.typedGraphql.mod.ScalarTypeDefinition
  - typingsJapgolly.typedGraphql.mod.EnumTypeDefinition
  - typingsJapgolly.typedGraphql.mod.InputObjectTypeDefinition
  - typingsJapgolly.typedGraphql.mod.TypeExtensionDefinition
*/
trait TypeDefinition extends Definition

object TypeDefinition {
  @scala.inline
  def ObjectTypeDefinition(
    fields: js.Array[FieldDefinition],
    kind: String,
    name: Name,
    interfaces: js.Array[NamedType] = null,
    loc: Location = null
  ): TypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name, loc: Location = null): TypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String, loc: Location = null): TypeDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name, loc: Location = null): TypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType], loc: Location = null): TypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition], loc: Location = null): TypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name, loc: Location = null): TypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
}

