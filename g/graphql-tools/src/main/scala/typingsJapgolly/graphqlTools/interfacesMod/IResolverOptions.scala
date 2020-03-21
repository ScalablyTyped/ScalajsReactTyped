package typingsJapgolly.graphqlTools.interfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLIsTypeOfFn
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphqlTools.GraphQLResolveInfomergeIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var __isTypeOf: js.UndefOr[GraphQLIsTypeOfFn[TSource, TContext]] = js.undefined
  var __resolveType: js.UndefOr[GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]] = js.undefined
  var fragment: js.UndefOr[String] = js.undefined
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.undefined
}

object IResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    __isTypeOf: (TSource, TContext, /* info */ GraphQLResolveInfo) => CallbackTo[PromiseOrValue[Boolean]] = null,
    __resolveType: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => CallbackTo[
      PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, StringDictionary[js.Any]]) | String]]
    ] = null,
    fragment: String = null,
    resolve: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfomergeIn) => CallbackTo[js.Any] = null,
    subscribe: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfomergeIn) => CallbackTo[js.Any] = null
  ): IResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (__isTypeOf != null) __obj.updateDynamic("__isTypeOf")(js.Any.fromFunction3((t0: TSource, t1: TContext, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => __isTypeOf(t0, t1, t2).runNow()))
    if (__resolveType != null) __obj.updateDynamic("__resolveType")(js.Any.fromFunction4((t0: TSource, t1: TContext, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, t3: /* abstractType */ typingsJapgolly.graphql.definitionMod.GraphQLAbstractType) => __resolveType(t0, t1, t2, t3).runNow()))
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4((t0: TSource, t1: TArgs, t2: TContext, t3: /* info */ typingsJapgolly.graphqlTools.GraphQLResolveInfomergeIn) => resolve(t0, t1, t2, t3).runNow()))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4((t0: TSource, t1: TArgs, t2: TContext, t3: /* info */ typingsJapgolly.graphqlTools.GraphQLResolveInfomergeIn) => subscribe(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IResolverOptions[TSource, TContext, TArgs]]
  }
}

