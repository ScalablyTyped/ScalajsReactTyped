package typingsJapgolly.graphql.introspectionQueryMod

import typingsJapgolly.graphql.graphqlStrings.ENUM
import typingsJapgolly.graphql.graphqlStrings.INPUT_OBJECT
import typingsJapgolly.graphql.graphqlStrings.SCALAR
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionScalarType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionEnumType
  - typingsJapgolly.graphql.introspectionQueryMod.IntrospectionInputObjectType
*/
trait IntrospectionInputType extends js.Object

object IntrospectionInputType {
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String, description: Maybe[String] = null): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
  @scala.inline
  def IntrospectionEnumType(
    enumValues: js.Array[IntrospectionEnumValue],
    kind: ENUM,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
  @scala.inline
  def IntrospectionInputObjectType(
    inputFields: js.Array[IntrospectionInputValue],
    kind: INPUT_OBJECT,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
}

