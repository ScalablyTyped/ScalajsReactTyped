package typingsJapgolly.graphqlTools.filterToSchemaMod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterToSchema", JSImport.Default)
@js.native
class default protected () extends FilterToSchema {
  def this(targetSchema: GraphQLSchema) = this()
  /* CompleteClass */
  override var targetSchema: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MFilterToSchema(originalRequest: Request): Request = js.native
}

