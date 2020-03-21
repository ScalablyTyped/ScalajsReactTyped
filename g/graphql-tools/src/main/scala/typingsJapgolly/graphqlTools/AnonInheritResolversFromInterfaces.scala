package typingsJapgolly.graphqlTools

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IResolversParameter
import typingsJapgolly.graphqlTools.mergeSchemasMod.OnTypeConflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInheritResolversFromInterfaces extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var mergeDirectives: js.UndefOr[Boolean] = js.undefined
  var onTypeConflict: js.UndefOr[OnTypeConflict] = js.undefined
  var resolvers: js.UndefOr[IResolversParameter] = js.undefined
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.undefined
  var schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]]
}

object AnonInheritResolversFromInterfaces {
  @scala.inline
  def apply(
    schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]],
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    mergeDirectives: js.UndefOr[Boolean] = js.undefined,
    onTypeConflict: (/* left */ GraphQLNamedType, /* right */ GraphQLNamedType, /* info */ js.UndefOr[AnonLeft]) => CallbackTo[GraphQLNamedType] = null,
    resolvers: IResolversParameter = null,
    schemaDirectives: StringDictionary[TypeofSchemaDirectiveVisi] = null
  ): AnonInheritResolversFromInterfaces = {
    val __obj = js.Dynamic.literal(schemas = schemas.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeDirectives)) __obj.updateDynamic("mergeDirectives")(mergeDirectives.asInstanceOf[js.Any])
    if (onTypeConflict != null) __obj.updateDynamic("onTypeConflict")(js.Any.fromFunction3((t0: /* left */ typingsJapgolly.graphql.definitionMod.GraphQLNamedType, t1: /* right */ typingsJapgolly.graphql.definitionMod.GraphQLNamedType, t2: /* info */ js.UndefOr[typingsJapgolly.graphqlTools.AnonLeft]) => onTypeConflict(t0, t1, t2).runNow()))
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInheritResolversFromInterfaces]
  }
}

