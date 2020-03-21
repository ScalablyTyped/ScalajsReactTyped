package typingsJapgolly.graphqlCompose.resolverMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverFilterArgConfig[TSource, TContext, TArgs] extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var filterTypeNameFallback: js.UndefOr[String] = js.undefined
  var name: String
  var query: js.UndefOr[ResolverFilterArgFn[TSource, TContext, TArgs]] = js.undefined
  var `type`: ComposeArgumentType
}

object ResolverFilterArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    name: String,
    `type`: ComposeArgumentType,
    defaultValue: js.Any = null,
    description: String = null,
    filterTypeNameFallback: String = null,
    query: (/* query */ js.Any, /* value */ js.Any, /* resolveParams */ ResolveParams[TSource, TContext, TArgs]) => CallbackTo[js.Any] = null
  ): ResolverFilterArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (filterTypeNameFallback != null) __obj.updateDynamic("filterTypeNameFallback")(filterTypeNameFallback.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction3((t0: /* query */ js.Any, t1: /* value */ js.Any, t2: /* resolveParams */ typingsJapgolly.graphqlCompose.resolverMod.ResolveParams[TSource, TContext, TArgs]) => query(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ResolverFilterArgConfig[TSource, TContext, TArgs]]
  }
}

