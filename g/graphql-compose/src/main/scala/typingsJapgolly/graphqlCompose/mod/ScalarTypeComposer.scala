package typingsJapgolly.graphqlCompose.mod

import typingsJapgolly.graphqlCompose.graphqlMod.GraphQLScalarType
import typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposeDefinition
import typingsJapgolly.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] {
  def this(gqType: GraphQLScalarType, schemaComposer: SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  /**
    * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  /**
    * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition): typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

