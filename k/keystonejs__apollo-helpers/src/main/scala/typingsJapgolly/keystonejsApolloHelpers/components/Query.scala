package typingsJapgolly.keystonejsApolloHelpers.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneQueryTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Query {
  def apply(
    query: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    KeystoneQueryTypeProps, 
    typingsJapgolly.keystonejsApolloHelpers.mod.Query, 
    Unit, 
    KeystoneQueryTypeProps
  ] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneQueryTypeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.keystonejsApolloHelpers.mod.Query](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.keystonejsApolloHelpers.mod.KeystoneQueryTypeProps])(children: _*)
  }
  @JSImport("@keystonejs/apollo-helpers", "Query")
  @js.native
  object componentImport extends js.Object
  
}

