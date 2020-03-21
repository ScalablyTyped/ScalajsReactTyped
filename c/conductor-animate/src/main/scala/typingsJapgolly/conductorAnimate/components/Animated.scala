package typingsJapgolly.conductorAnimate.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.conductorAnimate.mod.AnimatedProps
import typingsJapgolly.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Animated {
  def apply(
    id: String,
    additional: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | ReactNodeArray = null
  ): UnmountedWithRoot[AnimatedProps, typingsJapgolly.conductorAnimate.mod.Animated, Unit, AnimatedProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (additional != null) __obj.updateDynamic("additional")(additional.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.conductorAnimate.mod.AnimatedProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.conductorAnimate.mod.Animated](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.conductorAnimate.mod.AnimatedProps])
  }
  @JSImport("conductor-animate", "Animated")
  @js.native
  object componentImport extends js.Object
  
}

