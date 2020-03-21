package typingsJapgolly.graphqlBinding.distTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disableCache: js.UndefOr[Boolean] = js.undefined
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.undefined
  var schema: GraphQLSchema
}

object BindingOptions {
  @scala.inline
  def apply(
    schema: GraphQLSchema,
    before: js.UndefOr[Callback] = js.undefined,
    disableCache: js.UndefOr[Boolean] = js.undefined,
    fragmentReplacements: js.Array[FragmentReplacement] = null
  ): BindingOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    before.foreach(p => __obj.updateDynamic("before")(p.toJsFn))
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.asInstanceOf[js.Any])
    if (fragmentReplacements != null) __obj.updateDynamic("fragmentReplacements")(fragmentReplacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingOptions]
  }
}

