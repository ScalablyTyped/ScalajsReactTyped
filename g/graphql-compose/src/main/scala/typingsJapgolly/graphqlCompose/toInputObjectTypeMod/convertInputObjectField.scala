package typingsJapgolly.graphqlCompose.toInputObjectTypeMod

import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.definitionMod.GraphQLType
import typingsJapgolly.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", "convertInputObjectField")
@js.native
object convertInputObjectField extends js.Object {
  def apply(field: GraphQLType, opts: ConvertInputObjectFieldOpts, schemaComposer: SchemaComposer[_]): GraphQLInputType | Null = js.native
}

