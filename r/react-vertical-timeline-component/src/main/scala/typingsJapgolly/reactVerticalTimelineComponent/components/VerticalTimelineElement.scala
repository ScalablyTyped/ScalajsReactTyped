package typingsJapgolly.reactVerticalTimelineComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VerticalTimelineElement {
  def apply(
    className: String = null,
    contentArrowStyle: CSSProperties = null,
    contentStyle: CSSProperties = null,
    date: String = null,
    icon: VdomNode = null,
    iconOnClick: js.UndefOr[Callback] = js.undefined,
    iconStyle: CSSProperties = null,
    id: String = null,
    position: String = null,
    style: CSSProperties = null,
    visibilitySensorProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VerticalTimelineElementProps, 
    typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElement, 
    Unit, 
    VerticalTimelineElementProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentArrowStyle != null) __obj.updateDynamic("contentArrowStyle")(contentArrowStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    iconOnClick.foreach(p => __obj.updateDynamic("iconOnClick")(p.toJsFn))
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visibilitySensorProps != null) __obj.updateDynamic("visibilitySensorProps")(visibilitySensorProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElementProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElement](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElementProps])(children: _*)
  }
  @JSImport("react-vertical-timeline-component", "VerticalTimelineElement")
  @js.native
  object componentImport extends js.Object
  
}

