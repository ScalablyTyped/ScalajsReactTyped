package typingsJapgolly.conductorAnimate.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.conductorAnimate.mod.Animations
import typingsJapgolly.conductorAnimate.mod.ConductorProps
import typingsJapgolly.conductorAnimate.mod.Config
import typingsJapgolly.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Conductor {
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config]),
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | ReactNodeArray = null
  ): UnmountedWithRoot[ConductorProps, typingsJapgolly.conductorAnimate.mod.Conductor, Unit, ConductorProps] = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.conductorAnimate.mod.ConductorProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.conductorAnimate.mod.Conductor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.conductorAnimate.mod.ConductorProps])
  }
  @JSImport("conductor-animate", "Conductor")
  @js.native
  object componentImport extends js.Object
  
}

