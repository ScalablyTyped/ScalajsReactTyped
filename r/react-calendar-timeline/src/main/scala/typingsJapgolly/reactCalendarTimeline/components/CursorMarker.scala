package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCalendarTimeline.mod.CursorMarkerProps
import typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CursorMarker {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ CustomMarkerChildrenProps => CallbackTo[Node] = null
  ): UnmountedWithRoot[
    CursorMarkerProps, 
    typingsJapgolly.reactCalendarTimeline.mod.CursorMarker, 
    Unit, 
    CursorMarkerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarTimeline.mod.CursorMarkerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactCalendarTimeline.mod.CursorMarker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarTimeline.mod.CursorMarkerProps])
  }
  @JSImport("react-calendar-timeline", "CursorMarker")
  @js.native
  object componentImport extends js.Object
  
}

