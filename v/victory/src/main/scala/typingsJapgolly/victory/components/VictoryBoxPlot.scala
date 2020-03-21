package typingsJapgolly.victory.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.victory.Anon1
import typingsJapgolly.victory.AnonXBoolean
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.mod.AnimatePropTypeInterface
import typingsJapgolly.victory.mod.CategoryPropType
import typingsJapgolly.victory.mod.D3Scale
import typingsJapgolly.victory.mod.DataGetterPropType
import typingsJapgolly.victory.mod.DomainPaddingPropType
import typingsJapgolly.victory.mod.DomainPropType
import typingsJapgolly.victory.mod.EventPropTypeInterface
import typingsJapgolly.victory.mod.PaddingProps
import typingsJapgolly.victory.mod.ScalePropType
import typingsJapgolly.victory.mod.StringOrNumberOrCallback
import typingsJapgolly.victory.mod.VictoryBoxPlotProps
import typingsJapgolly.victory.mod.VictoryBoxPlotStyleInterface
import typingsJapgolly.victory.mod.VictoryThemeDefinition
import typingsJapgolly.victory.victoryStrings.bottom
import typingsJapgolly.victory.victoryStrings.left
import typingsJapgolly.victory.victoryStrings.right
import typingsJapgolly.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryBoxPlot {
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    boxWidth: Int | Double = null,
    categories: CategoryPropType = null,
    containerComponent: VdomElement = null,
    data: js.Array[_] = null,
    dataComponent: VdomElement = null,
    domain: DomainPropType = null,
    domainPadding: DomainPaddingPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]] = null,
    groupComponent: VdomElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    labelOrientation: top | bottom | left | right = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    max: StringOrNumberOrCallback | js.Array[String] = null,
    maxComponent: VdomElement = null,
    maxDomain: Double | AnonY = null,
    maxLabelComponent: VdomElement = null,
    median: StringOrNumberOrCallback | js.Array[String] = null,
    medianComponent: VdomElement = null,
    medianLabelComponent: VdomElement = null,
    min: StringOrNumberOrCallback | js.Array[String] = null,
    minComponent: VdomElement = null,
    minDomain: Double | AnonY = null,
    minLabelComponent: VdomElement = null,
    name: String = null,
    padding: PaddingProps = null,
    q1: StringOrNumberOrCallback | js.Array[String] = null,
    q1Component: VdomElement = null,
    q1LabelComponent: VdomElement = null,
    q3: StringOrNumberOrCallback | js.Array[String] = null,
    q3Component: VdomElement = null,
    q3LabelComponent: VdomElement = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryBoxPlotStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    whiskerWidth: Int | Double = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    y0: DataGetterPropType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VictoryBoxPlotProps, 
    typingsJapgolly.victory.mod.VictoryBoxPlot, 
    Unit, 
    VictoryBoxPlotProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.rawElement.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainPadding != null) __obj.updateDynamic("domainPadding")(domainPadding.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxComponent != null) __obj.updateDynamic("maxComponent")(maxComponent.rawElement.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (maxLabelComponent != null) __obj.updateDynamic("maxLabelComponent")(maxLabelComponent.rawElement.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (medianComponent != null) __obj.updateDynamic("medianComponent")(medianComponent.rawElement.asInstanceOf[js.Any])
    if (medianLabelComponent != null) __obj.updateDynamic("medianLabelComponent")(medianLabelComponent.rawElement.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minComponent != null) __obj.updateDynamic("minComponent")(minComponent.rawElement.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (minLabelComponent != null) __obj.updateDynamic("minLabelComponent")(minLabelComponent.rawElement.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q1Component != null) __obj.updateDynamic("q1Component")(q1Component.rawElement.asInstanceOf[js.Any])
    if (q1LabelComponent != null) __obj.updateDynamic("q1LabelComponent")(q1LabelComponent.rawElement.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (q3Component != null) __obj.updateDynamic("q3Component")(q3Component.rawElement.asInstanceOf[js.Any])
    if (q3LabelComponent != null) __obj.updateDynamic("q3LabelComponent")(q3LabelComponent.rawElement.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (whiskerWidth != null) __obj.updateDynamic("whiskerWidth")(whiskerWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryBoxPlotProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryBoxPlot](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryBoxPlotProps])(children: _*)
  }
  @JSImport("victory", "VictoryBoxPlot")
  @js.native
  object componentImport extends js.Object
  
}

