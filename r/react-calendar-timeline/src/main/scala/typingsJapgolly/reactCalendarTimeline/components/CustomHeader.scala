package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderProps
import typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderPropsChildrenFnProps
import typingsJapgolly.reactCalendarTimeline.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomHeader {
  def apply[Data](
    headerData: Data = null,
    height: Int | Double = null,
    unit: Unit = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.UndefOr[CustomHeaderPropsChildrenFnProps[Data]] => CallbackTo[Node]
  ): UnmountedWithRoot[
    CustomHeaderProps[Data], 
    typingsJapgolly.reactCalendarTimeline.mod.CustomHeader[Data], 
    scala.Unit, 
    CustomHeaderProps[Data]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderPropsChildrenFnProps[Data]]) => children(t0).runNow()))
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderProps[Data], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactCalendarTimeline.mod.CustomHeader[Data]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderProps[Data]])
  }
  @JSImport("react-calendar-timeline", "CustomHeader")
  @js.native
  object componentImport extends js.Object
  
}

