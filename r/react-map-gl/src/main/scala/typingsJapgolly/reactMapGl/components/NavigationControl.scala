package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMapGl.mod.NavigationControlProps
import typingsJapgolly.reactMapGl.mod.ViewStateChangeInfo
import typingsJapgolly.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationControl {
  def apply(
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    compassLabel: String = null,
    onViewStateChange: /* info */ ViewStateChangeInfo => Callback = null,
    onViewportChange: /* viewState */ ViewportProps => Callback = null,
    showCompass: js.UndefOr[Boolean] = js.undefined,
    showZoom: js.UndefOr[Boolean] = js.undefined,
    zoomInLabel: String = null,
    zoomOutLabel: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NavigationControlProps, 
    typingsJapgolly.reactMapGl.mod.NavigationControl, 
    Unit, 
    NavigationControlProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (compassLabel != null) __obj.updateDynamic("compassLabel")(compassLabel.asInstanceOf[js.Any])
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactMapGl.mod.ViewStateChangeInfo) => onViewStateChange(t0).runNow()))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1((t0: /* viewState */ typingsJapgolly.reactMapGl.mod.ViewportProps) => onViewportChange(t0).runNow()))
    if (!js.isUndefined(showCompass)) __obj.updateDynamic("showCompass")(showCompass.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoom)) __obj.updateDynamic("showZoom")(showZoom.asInstanceOf[js.Any])
    if (zoomInLabel != null) __obj.updateDynamic("zoomInLabel")(zoomInLabel.asInstanceOf[js.Any])
    if (zoomOutLabel != null) __obj.updateDynamic("zoomOutLabel")(zoomOutLabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMapGl.mod.NavigationControlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.NavigationControl](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMapGl.mod.NavigationControlProps])(children: _*)
  }
  @JSImport("react-map-gl", "NavigationControl")
  @js.native
  object componentImport extends js.Object
  
}

