package typingsJapgolly.victory.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.mod.BlockProps
import typingsJapgolly.victory.mod.VictoryClipContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryClipContainer {
  def apply(
    circleComponent: VdomElement = null,
    className: String = null,
    clipHeight: Int | Double = null,
    clipId: Double | String = null,
    clipPadding: BlockProps = null,
    clipPathComponent: VdomElement = null,
    clipWidth: Int | Double = null,
    events: DOMAttributes[_] = null,
    groupComponent: VdomElement = null,
    origin: AnonY = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    rectComponent: VdomElement = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element] = null
  ): UnmountedWithRoot[
    VictoryClipContainerProps, 
    typingsJapgolly.victory.mod.VictoryClipContainer, 
    Unit, 
    VictoryClipContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (circleComponent != null) __obj.updateDynamic("circleComponent")(circleComponent.rawElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clipHeight != null) __obj.updateDynamic("clipHeight")(clipHeight.asInstanceOf[js.Any])
    if (clipId != null) __obj.updateDynamic("clipId")(clipId.asInstanceOf[js.Any])
    if (clipPadding != null) __obj.updateDynamic("clipPadding")(clipPadding.asInstanceOf[js.Any])
    if (clipPathComponent != null) __obj.updateDynamic("clipPathComponent")(clipPathComponent.rawElement.asInstanceOf[js.Any])
    if (clipWidth != null) __obj.updateDynamic("clipWidth")(clipWidth.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rectComponent != null) __obj.updateDynamic("rectComponent")(rectComponent.rawElement.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryClipContainerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.victory.mod.VictoryClipContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryClipContainerProps])
  }
  @JSImport("victory", "VictoryClipContainer")
  @js.native
  object componentImport extends js.Object
  
}

