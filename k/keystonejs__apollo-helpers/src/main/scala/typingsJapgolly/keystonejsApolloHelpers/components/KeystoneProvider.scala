package typingsJapgolly.keystonejsApolloHelpers.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeystoneProvider {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    js.Object, 
    typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneProvider, 
    Unit, 
    js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneProvider](this.componentImport)
    f(__obj.asInstanceOf[js.Object])(children: _*)
  }
  @JSImport("@keystonejs/apollo-helpers", "KeystoneProvider")
  @js.native
  object componentImport extends js.Object
  
}

