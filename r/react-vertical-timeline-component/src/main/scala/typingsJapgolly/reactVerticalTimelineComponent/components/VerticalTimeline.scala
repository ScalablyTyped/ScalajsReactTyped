package typingsJapgolly.reactVerticalTimelineComponent.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineProps
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typingsJapgolly.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VerticalTimeline {
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    layout: `1-column` | `2-columns` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VerticalTimelineProps, 
    typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimeline, 
    Unit, 
    VerticalTimelineProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimeline](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineProps])(children: _*)
  }
  @JSImport("react-vertical-timeline-component", "VerticalTimeline")
  @js.native
  object componentImport extends js.Object
  
}

