package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps
import typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderProps
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SidebarHeader {
  def apply[Data](
    headerData: Data = null,
    variant: left | right = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: SidebarHeaderChildrenFnProps[Data] => CallbackTo[Node]
  ): UnmountedWithRoot[
    SidebarHeaderProps[Data], 
    typingsJapgolly.reactCalendarTimeline.mod.SidebarHeader[Data], 
    Unit, 
    SidebarHeaderProps[Data]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps[Data]) => children(t0).runNow()))
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderProps[Data], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactCalendarTimeline.mod.SidebarHeader[Data]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderProps[Data]])
  }
  @JSImport("react-calendar-timeline", "SidebarHeader")
  @js.native
  object componentImport extends js.Object
  
}

