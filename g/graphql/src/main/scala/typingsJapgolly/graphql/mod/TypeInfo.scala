package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.definitionMod.GraphQLType
import typingsJapgolly.graphql.typeInfoMod.getFieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "TypeInfo")
@js.native
class TypeInfo protected ()
  extends typingsJapgolly.graphql.utilitiesMod.TypeInfo {
  def this(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema) = this()
  def this(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef
  ) = this()
  def this(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef,
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
}

