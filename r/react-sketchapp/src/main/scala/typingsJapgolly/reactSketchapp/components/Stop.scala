package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.stopMod.StopProps
import typingsJapgolly.reactSketchapp.stopMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stop {
  def apply(
    stopColor: String = null,
    stopOpacity: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[StopProps, default, Unit, StopProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.stopMod.StopProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.stopMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.stopMod.StopProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/Stop", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

