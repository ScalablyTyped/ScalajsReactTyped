package typingsJapgolly.graphqlBinding.distTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingWithoutSchemaOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.undefined
}

object BindingWithoutSchemaOptions {
  @scala.inline
  def apply(
    before: js.UndefOr[Callback] = js.undefined,
    fragmentReplacements: js.Array[FragmentReplacement] = null
  ): BindingWithoutSchemaOptions = {
    val __obj = js.Dynamic.literal()
    before.foreach(p => __obj.updateDynamic("before")(p.toJsFn))
    if (fragmentReplacements != null) __obj.updateDynamic("fragmentReplacements")(fragmentReplacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingWithoutSchemaOptions]
  }
}

