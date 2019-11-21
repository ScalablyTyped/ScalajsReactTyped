package typingsJapgolly.mobxDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble it yourself using js.Dynamic.literal(...) or similar */
object Provider {
  def apply(
    props: js.Any with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    js.Any with js.Object, 
    typingsJapgolly.mobxDashReact.mobxDashReactMod.Provider, 
    Unit, 
    js.Any with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  js.Any with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mobxDashReact.mobxDashReactMod.Provider](js.constructorOf[typingsJapgolly.mobxDashReact.mobxDashReactMod.Provider])
    f(__obj.asInstanceOf[js.Any with js.Object])(children: _*)
  }
}

