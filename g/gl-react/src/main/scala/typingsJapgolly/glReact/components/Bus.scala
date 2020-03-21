package typingsJapgolly.glReact.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glReact.mod.BusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Bus {
  def apply(
    index: Double,
    uniform: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[BusProps, typingsJapgolly.glReact.mod.Bus, Unit, BusProps] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (uniform != null) __obj.updateDynamic("uniform")(uniform.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReact.mod.BusProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.glReact.mod.Bus](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReact.mod.BusProps])
  }
  @JSImport("gl-react", "Bus")
  @js.native
  object componentImport extends js.Object
  
}

