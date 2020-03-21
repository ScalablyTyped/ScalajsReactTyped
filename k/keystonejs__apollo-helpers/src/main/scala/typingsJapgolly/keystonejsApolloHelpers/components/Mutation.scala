package typingsJapgolly.keystonejsApolloHelpers.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneMutationTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mutation {
  def apply(
    mutation: String,
    invalidatesTypes: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    KeystoneMutationTypeProps, 
    typingsJapgolly.keystonejsApolloHelpers.mod.Mutation, 
    Unit, 
    KeystoneMutationTypeProps
  ] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
  
      if (!js.isUndefined(invalidatesTypes)) __obj.updateDynamic("invalidatesTypes")(invalidatesTypes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneMutationTypeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.keystonejsApolloHelpers.mod.Mutation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneMutationTypeProps])(children: _*)
  }
  @JSImport("@keystonejs/apollo-helpers", "Mutation")
  @js.native
  object componentImport extends js.Object
  
}

