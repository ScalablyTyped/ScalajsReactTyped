package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMapGl.mod.PopupProps
import typingsJapgolly.reactMapGl.reactMapGlStrings.`bottom-left`
import typingsJapgolly.reactMapGl.reactMapGlStrings.`bottom-right`
import typingsJapgolly.reactMapGl.reactMapGlStrings.`top-left`
import typingsJapgolly.reactMapGl.reactMapGlStrings.`top-right`
import typingsJapgolly.reactMapGl.reactMapGlStrings.bottom
import typingsJapgolly.reactMapGl.reactMapGlStrings.left
import typingsJapgolly.reactMapGl.reactMapGlStrings.right
import typingsJapgolly.reactMapGl.reactMapGlStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popup {
  def apply(
    latitude: Double,
    longitude: Double,
    altitude: Int | Double = null,
    anchor: top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right = null,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    dynamicPosition: js.UndefOr[Boolean] = js.undefined,
    offsetLeft: Int | Double = null,
    offsetTop: Int | Double = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    sortByDepth: js.UndefOr[Boolean] = js.undefined,
    tipSize: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopupProps, typingsJapgolly.reactMapGl.mod.Popup, Unit, PopupProps] = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
      if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicPosition)) __obj.updateDynamic("dynamicPosition")(dynamicPosition.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (!js.isUndefined(sortByDepth)) __obj.updateDynamic("sortByDepth")(sortByDepth.asInstanceOf[js.Any])
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMapGl.mod.PopupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.Popup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMapGl.mod.PopupProps])(children: _*)
  }
  @JSImport("react-map-gl", "Popup")
  @js.native
  object componentImport extends js.Object
  
}

