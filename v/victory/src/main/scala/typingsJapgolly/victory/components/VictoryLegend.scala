package typingsJapgolly.victory.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.victory.Anon1
import typingsJapgolly.victory.AnonLeft
import typingsJapgolly.victory.AnonName
import typingsJapgolly.victory.AnonXBoolean
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.OmitBlockPropsleftright
import typingsJapgolly.victory.mod.AnimatePropTypeInterface
import typingsJapgolly.victory.mod.CategoryPropType
import typingsJapgolly.victory.mod.ColorScalePropType
import typingsJapgolly.victory.mod.D3Scale
import typingsJapgolly.victory.mod.DataGetterPropType
import typingsJapgolly.victory.mod.DomainPropType
import typingsJapgolly.victory.mod.EventPropTypeInterface
import typingsJapgolly.victory.mod.OrientationTypes
import typingsJapgolly.victory.mod.PaddingProps
import typingsJapgolly.victory.mod.ScalePropType
import typingsJapgolly.victory.mod.StringOrNumberOrCallback
import typingsJapgolly.victory.mod.VictoryLegendProps
import typingsJapgolly.victory.mod.VictoryStyleInterface
import typingsJapgolly.victory.mod.VictoryThemeDefinition
import typingsJapgolly.victory.victoryStrings.data
import typingsJapgolly.victory.victoryStrings.horizontal
import typingsJapgolly.victory.victoryStrings.labels
import typingsJapgolly.victory.victoryStrings.parent
import typingsJapgolly.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryLegend {
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    borderComponent: VdomElement = null,
    borderPadding: PaddingProps = null,
    categories: CategoryPropType = null,
    centerTitle: js.UndefOr[Boolean] = js.undefined,
    colorScale: ColorScalePropType = null,
    containerComponent: VdomElement = null,
    data: js.Array[AnonName] = null,
    dataComponent: VdomElement = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback | js.Array[String] = null,
    events: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]] = null,
    externalEventMutations: js.Array[_] = null,
    groupComponent: VdomElement = null,
    gutter: Double | AnonLeft = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    itemsPerRow: Int | Double = null,
    label: String | (js.Function1[/* data */ js.Any, String]) = null,
    labelComponent: VdomElement = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    orientation: horizontal | vertical = null,
    padding: PaddingProps = null,
    rowGutter: Double | OmitBlockPropsleftright = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbolSpacer: Int | Double = null,
    theme: VictoryThemeDefinition = null,
    title: String | js.Array[String] = null,
    titleComponent: VdomElement = null,
    titleOrientation: OrientationTypes = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    y0: DataGetterPropType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VictoryLegendProps, 
    typingsJapgolly.victory.mod.VictoryLegend, 
    Unit, 
    VictoryLegendProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderComponent != null) __obj.updateDynamic("borderComponent")(borderComponent.rawElement.asInstanceOf[js.Any])
    if (borderPadding != null) __obj.updateDynamic("borderPadding")(borderPadding.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(centerTitle)) __obj.updateDynamic("centerTitle")(centerTitle.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.rawElement.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (externalEventMutations != null) __obj.updateDynamic("externalEventMutations")(externalEventMutations.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.rawElement.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowGutter != null) __obj.updateDynamic("rowGutter")(rowGutter.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbolSpacer != null) __obj.updateDynamic("symbolSpacer")(symbolSpacer.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleComponent != null) __obj.updateDynamic("titleComponent")(titleComponent.rawElement.asInstanceOf[js.Any])
    if (titleOrientation != null) __obj.updateDynamic("titleOrientation")(titleOrientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryLegendProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryLegend](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryLegendProps])(children: _*)
  }
  @JSImport("victory", "VictoryLegend")
  @js.native
  object componentImport extends js.Object
  
}

