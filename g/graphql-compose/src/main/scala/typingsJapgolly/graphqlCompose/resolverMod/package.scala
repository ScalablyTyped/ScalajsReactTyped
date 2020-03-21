package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolverMod {
  type ResolverFilterArgFn[TSource, TContext, TArgs] = js.Function3[
    /* query */ js.Any, 
    /* value */ js.Any, 
    /* resolveParams */ typingsJapgolly.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  type ResolverMiddleware[TSource, TContext, TArgs] = js.Function5[
    /* resolve */ js.Function4[
      /* source */ TSource, 
      /* args */ TArgs, 
      /* context */ TContext, 
      /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
      js.Any
    ], 
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type ResolverNextRpCb[TSource, TContext, TArgs] = js.Function1[
    /* next */ typingsJapgolly.graphqlCompose.resolverMod.ResolverRpCb[TSource, TContext, TArgs], 
    typingsJapgolly.graphqlCompose.resolverMod.ResolverRpCb[TSource, TContext, TArgs]
  ]
  type ResolverRpCb[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ typingsJapgolly.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Promise[js.Any] | js.Any
  ]
  type ResolverSortArgFn[TSource, TContext, TArgs] = js.Function1[
    /* resolveParams */ typingsJapgolly.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs], 
    js.Any
  ]
  type ResolverWrapArgsCb[TArgs] = js.Function1[
    /* prevArgs */ typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigArgumentMap, 
    typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs]
  ]
  type ResolverWrapCb[TNewSource, TPrevSource, TContext, TNewArgs, TPrevArgs] = js.Function2[
    /* newResolver */ typingsJapgolly.graphqlCompose.resolverMod.Resolver[TNewSource, TContext, TNewArgs, js.Any], 
    /* prevResolver */ typingsJapgolly.graphqlCompose.resolverMod.Resolver[TPrevSource, TContext, TPrevArgs, js.Any], 
    typingsJapgolly.graphqlCompose.resolverMod.Resolver[TNewSource, TContext, TNewArgs, js.Any]
  ]
  type ResolverWrapTypeCb[TContext, TReturn] = js.Function1[
    /* prevType */ typingsJapgolly.graphql.definitionMod.GraphQLOutputType, 
    typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeOutputType[TReturn, TContext]
  ]
}
