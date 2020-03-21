package typingsJapgolly.victory.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victory.mod.CursorData
import typingsJapgolly.victory.mod.DomainPropType
import typingsJapgolly.victory.mod.VictoryZoomContainerProps
import typingsJapgolly.victory.victoryStrings.all
import typingsJapgolly.victory.victoryStrings.disable
import typingsJapgolly.victory.victoryStrings.none
import typingsJapgolly.victory.victoryStrings.x
import typingsJapgolly.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryZoomContainer {
  def apply(
    allowPan: js.UndefOr[Boolean] = js.undefined,
    allowZoom: js.UndefOr[Boolean] = js.undefined,
    brushStyle: CSSProperties = null,
    clipContainerComponent: VdomElement = null,
    defaultBrushArea: all | none | disable = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    downsample: Double | Boolean = null,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    minimumZoom: CursorData = null,
    onZoomDomainChange: (/* domain */ DomainPropType, /* props */ VictoryZoomContainerProps) => Callback = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Int | Double = null,
    zoomDimension: x | y = null,
    zoomDomain: DomainPropType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VictoryZoomContainerProps, 
    typingsJapgolly.victory.mod.VictoryZoomContainer, 
    Unit, 
    VictoryZoomContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowPan)) __obj.updateDynamic("allowPan")(allowPan.asInstanceOf[js.Any])
    if (!js.isUndefined(allowZoom)) __obj.updateDynamic("allowZoom")(allowZoom.asInstanceOf[js.Any])
    if (brushStyle != null) __obj.updateDynamic("brushStyle")(brushStyle.asInstanceOf[js.Any])
    if (clipContainerComponent != null) __obj.updateDynamic("clipContainerComponent")(clipContainerComponent.rawElement.asInstanceOf[js.Any])
    if (defaultBrushArea != null) __obj.updateDynamic("defaultBrushArea")(defaultBrushArea.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (downsample != null) __obj.updateDynamic("downsample")(downsample.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (minimumZoom != null) __obj.updateDynamic("minimumZoom")(minimumZoom.asInstanceOf[js.Any])
    if (onZoomDomainChange != null) __obj.updateDynamic("onZoomDomainChange")(js.Any.fromFunction2((t0: /* domain */ typingsJapgolly.victory.mod.DomainPropType, t1: /* props */ typingsJapgolly.victory.mod.VictoryZoomContainerProps) => onZoomDomainChange(t0, t1).runNow()))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomDimension != null) __obj.updateDynamic("zoomDimension")(zoomDimension.asInstanceOf[js.Any])
    if (zoomDomain != null) __obj.updateDynamic("zoomDomain")(zoomDomain.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryZoomContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryZoomContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryZoomContainerProps])(children: _*)
  }
  @JSImport("victory", "VictoryZoomContainer")
  @js.native
  object componentImport extends js.Object
  
}

