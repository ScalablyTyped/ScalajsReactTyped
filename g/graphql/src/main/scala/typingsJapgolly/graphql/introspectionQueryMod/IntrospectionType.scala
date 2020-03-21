package typingsJapgolly.graphql.introspectionQueryMod

import typingsJapgolly.graphql.graphqlStrings.ENUM
import typingsJapgolly.graphql.graphqlStrings.INPUT_OBJECT
import typingsJapgolly.graphql.graphqlStrings.INTERFACE
import typingsJapgolly.graphql.graphqlStrings.OBJECT
import typingsJapgolly.graphql.graphqlStrings.SCALAR
import typingsJapgolly.graphql.graphqlStrings.UNION
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionScalarType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionObjectType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionInterfaceType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionUnionType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionEnumType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionInputObjectType
*/
trait IntrospectionType extends js.Object

object IntrospectionType {
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String, description: Maybe[String] = null): IntrospectionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionUnionType(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: Maybe[String] = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]],
    kind: OBJECT,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionInputObjectType(
    inputFields: js.Array[IntrospectionInputValue],
    kind: INPUT_OBJECT,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: Maybe[String] = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionEnumType(
    enumValues: js.Array[IntrospectionEnumValue],
    kind: ENUM,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
}

