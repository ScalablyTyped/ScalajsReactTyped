package typingsJapgolly.recharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.CustomizedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Customized {
  def apply(
    component: ContentRenderer[_] | Element,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CustomizedProps, typingsJapgolly.recharts.mod.Customized, Unit, CustomizedProps] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.CustomizedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.Customized](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.CustomizedProps])(children: _*)
  }
  @JSImport("recharts", "Customized")
  @js.native
  object componentImport extends js.Object
  
}

