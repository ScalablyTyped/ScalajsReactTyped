package typingsJapgolly.graphqlCompose.mod

import typingsJapgolly.graphql.mod.GraphQLInterfaceType
import typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposeDefinition
import typingsJapgolly.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(gqType: GraphQLInterfaceType, schemaComposer: SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx]): typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

