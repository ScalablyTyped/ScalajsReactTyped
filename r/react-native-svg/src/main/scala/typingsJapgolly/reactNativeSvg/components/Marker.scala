package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvg.mod.MarkerProps
import typingsJapgolly.reactNativeSvg.mod.MarkerUnits
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.Orient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Marker {
  def apply(
    id: String = null,
    markerHeight: NumberProp = null,
    markerUnits: MarkerUnits = null,
    markerWidth: NumberProp = null,
    orient: Orient | NumberProp = null,
    preserveAspectRatio: String = null,
    refX: NumberProp = null,
    refY: NumberProp = null,
    viewBox: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MarkerProps, typingsJapgolly.reactNativeSvg.mod.Marker, Unit, MarkerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (refX != null) __obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
    if (refY != null) __obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvg.mod.MarkerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvg.mod.Marker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvg.mod.MarkerProps])(children: _*)
  }
  @JSImport("react-native-svg", "Marker")
  @js.native
  object componentImport extends js.Object
  
}

