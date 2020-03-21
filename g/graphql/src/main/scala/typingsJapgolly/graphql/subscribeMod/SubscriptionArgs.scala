package typingsJapgolly.graphql.subscribeMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionArgs extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var document: DocumentNode
  var fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.undefined
  var operationName: js.UndefOr[Maybe[String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: GraphQLSchema
  var subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.undefined
  var variableValues: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
}

object SubscriptionArgs {
  @scala.inline
  def apply(
    document: DocumentNode,
    schema: GraphQLSchema,
    contextValue: js.Any = null,
    fieldResolver: (js.Any, StringDictionary[js.Any], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    operationName: Maybe[String] = null,
    rootValue: js.Any = null,
    subscribeFieldResolver: (js.Any, StringDictionary[js.Any], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    variableValues: Maybe[Record[String, _]] = null
  ): SubscriptionArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => fieldResolver(t0, t1, t2, t3).runNow()))
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (subscribeFieldResolver != null) __obj.updateDynamic("subscribeFieldResolver")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => subscribeFieldResolver(t0, t1, t2, t3).runNow()))
    if (variableValues != null) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionArgs]
  }
}

