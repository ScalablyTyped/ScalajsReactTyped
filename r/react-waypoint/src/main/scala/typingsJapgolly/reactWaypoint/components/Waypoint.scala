package typingsJapgolly.reactWaypoint.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactWaypoint.mod.Waypoint.CallbackArgs
import typingsJapgolly.reactWaypoint.mod.Waypoint.WaypointProps
import typingsJapgolly.reactWaypoint.mod.Waypoint_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Waypoint {
  def apply(
    bottomOffset: String | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    fireOnRapidScroll: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* args */ CallbackArgs => Callback = null,
    onLeave: /* args */ CallbackArgs => Callback = null,
    onPositionChange: /* args */ CallbackArgs => Callback = null,
    scrollableAncestor: js.Any = null,
    topOffset: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WaypointProps, Waypoint_, Unit, WaypointProps] = {
    val __obj = js.Dynamic.literal()
  
      if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnRapidScroll)) __obj.updateDynamic("fireOnRapidScroll")(fireOnRapidScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactWaypoint.mod.Waypoint.CallbackArgs) => onEnter(t0).runNow()))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactWaypoint.mod.Waypoint.CallbackArgs) => onLeave(t0).runNow()))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactWaypoint.mod.Waypoint.CallbackArgs) => onPositionChange(t0).runNow()))
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWaypoint.mod.Waypoint.WaypointProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactWaypoint.mod.Waypoint_](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWaypoint.mod.Waypoint.WaypointProps])(children: _*)
  }
  @JSImport("react-waypoint", "Waypoint")
  @js.native
  object componentImport extends js.Object
  
}

