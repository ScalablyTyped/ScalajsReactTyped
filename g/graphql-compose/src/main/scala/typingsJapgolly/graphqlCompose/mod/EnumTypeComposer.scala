package typingsJapgolly.graphqlCompose.mod

import typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposeDefinition
import typingsJapgolly.graphqlCompose.graphqlMod.GraphQLEnumType
import typingsJapgolly.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(gqType: GraphQLEnumType, schemaComposer: SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](typeDef: EnumTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition): typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

