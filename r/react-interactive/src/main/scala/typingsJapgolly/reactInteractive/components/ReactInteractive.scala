package typingsJapgolly.reactInteractive.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInteractive.mod.InteractiveProps
import typingsJapgolly.reactInteractive.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ReactInteractive {
  def apply(
    props: InteractiveProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InteractiveProps with js.Object, default, Unit, InteractiveProps with js.Object] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInteractive.mod.InteractiveProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInteractive.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInteractive.mod.InteractiveProps with js.Object])(children: _*)
  }
  @JSImport("react-interactive", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

