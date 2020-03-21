package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.antvG2.mod.Styles.background
import typingsJapgolly.antvG2.mod.Styles.text
import typingsJapgolly.bizcharts.bizchartsStrings.multiple
import typingsJapgolly.bizcharts.bizchartsStrings.single
import typingsJapgolly.bizcharts.mod.LegendLayoutType
import typingsJapgolly.bizcharts.mod.LegendPositionType
import typingsJapgolly.bizcharts.mod.LegendProps
import typingsJapgolly.bizcharts.mod.MarkerType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Legend {
  def apply(
    allowAllCanceled: js.UndefOr[Boolean] = js.undefined,
    background: background = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    containerTpl: String = null,
    custom: js.UndefOr[Boolean] = js.undefined,
    `g2-legend`: CSSProperties = null,
    `g2-legend-item`: CSSProperties = null,
    `g2-legend-list-item`: CSSProperties = null,
    `g2-legend-marker`: CSSProperties = null,
    `g2-legend-text`: CSSProperties = null,
    height: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    itemFormatter: /* val */ js.UndefOr[js.Any] => CallbackTo[String | Double] = null,
    itemGap: Int | Double = null,
    itemMarginBottom: Int | Double = null,
    itemTpl: String | (js.Function4[
      /* value */ js.UndefOr[String], 
      /* color */ js.UndefOr[String], 
      /* checked */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      String
    ]) = null,
    itemWidth: Int | Double = null,
    items: js.Array[_] = null,
    layout: LegendLayoutType = null,
    marker: String | MarkerType | (js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* r */ js.UndefOr[Double], 
      /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
      Unit
    ]) = null,
    name: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    onClick: /* ev */ MouseEvent => Callback = null,
    onHover: /* ev */ MouseEvent => Callback = null,
    position: LegendPositionType = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    selectedMode: single | multiple = null,
    slidable: js.UndefOr[Boolean] = js.undefined,
    textStyle: text = null,
    title: js.UndefOr[Boolean] = js.undefined,
    unChecked: String = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LegendProps, typingsJapgolly.antDesignPro.bizchartsMod.Legend, Unit, LegendProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowAllCanceled)) __obj.updateDynamic("allowAllCanceled")(allowAllCanceled.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (`g2-legend` != null) __obj.updateDynamic("g2-legend")(`g2-legend`.asInstanceOf[js.Any])
    if (`g2-legend-item` != null) __obj.updateDynamic("g2-legend-item")(`g2-legend-item`.asInstanceOf[js.Any])
    if (`g2-legend-list-item` != null) __obj.updateDynamic("g2-legend-list-item")(`g2-legend-list-item`.asInstanceOf[js.Any])
    if (`g2-legend-marker` != null) __obj.updateDynamic("g2-legend-marker")(`g2-legend-marker`.asInstanceOf[js.Any])
    if (`g2-legend-text` != null) __obj.updateDynamic("g2-legend-text")(`g2-legend-text`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (itemFormatter != null) __obj.updateDynamic("itemFormatter")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[js.Any]) => itemFormatter(t0).runNow()))
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (itemMarginBottom != null) __obj.updateDynamic("itemMarginBottom")(itemMarginBottom.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onHover(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(slidable)) __obj.updateDynamic("slidable")(slidable.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unChecked != null) __obj.updateDynamic("unChecked")(unChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.LegendProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Legend](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.LegendProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Legend")
  @js.native
  object componentImport extends js.Object
  
}

