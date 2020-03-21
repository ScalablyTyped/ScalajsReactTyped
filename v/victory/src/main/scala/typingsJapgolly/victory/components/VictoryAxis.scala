package typingsJapgolly.victory.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.victory.Anon1
import typingsJapgolly.victory.AnonAxisLabel
import typingsJapgolly.victory.AnonXBoolean
import typingsJapgolly.victory.AnonY
import typingsJapgolly.victory.mod.AnimatePropTypeInterface
import typingsJapgolly.victory.mod.D3Scale
import typingsJapgolly.victory.mod.DomainPropType
import typingsJapgolly.victory.mod.EventPropTypeInterface
import typingsJapgolly.victory.mod.PaddingProps
import typingsJapgolly.victory.mod.ScalePropType
import typingsJapgolly.victory.mod.VictoryAxisProps
import typingsJapgolly.victory.mod.VictoryThemeDefinition
import typingsJapgolly.victory.victoryStrings.axis
import typingsJapgolly.victory.victoryStrings.axisLabel
import typingsJapgolly.victory.victoryStrings.bottom
import typingsJapgolly.victory.victoryStrings.grid
import typingsJapgolly.victory.victoryStrings.left
import typingsJapgolly.victory.victoryStrings.parent
import typingsJapgolly.victory.victoryStrings.right
import typingsJapgolly.victory.victoryStrings.tickLabels
import typingsJapgolly.victory.victoryStrings.ticks
import typingsJapgolly.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryAxis {
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    axisComponent: VdomElement = null,
    axisLabelComponent: VdomElement = null,
    axisValue: Double | String | js.Object = null,
    containerComponent: VdomElement = null,
    crossAxis: js.UndefOr[Boolean] = js.undefined,
    dependentAxis: js.UndefOr[Boolean] = js.undefined,
    domain: DomainPropType = null,
    events: js.Array[
      EventPropTypeInterface[axis | axisLabel | grid | ticks | tickLabels | parent, Double | String]
    ] = null,
    fixLabelOverlap: js.UndefOr[Boolean] = js.undefined,
    gridComponent: VdomElement = null,
    groupComponent: VdomElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    invertAxis: js.UndefOr[Boolean] = js.undefined,
    label: js.Any = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    orientation: top | bottom | left | right = null,
    padding: PaddingProps = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: AnonAxisLabel = null,
    theme: VictoryThemeDefinition = null,
    tickComponent: VdomElement = null,
    tickCount: Int | Double = null,
    tickFormat: js.Array[_] | (js.Function3[/* tick */ js.Any, /* index */ Double, /* ticks */ js.Array[_], String | Double]) = null,
    tickLabelComponent: VdomElement = null,
    tickValues: js.Array[_] = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VictoryAxisProps, typingsJapgolly.victory.mod.VictoryAxis, Unit, VictoryAxisProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisComponent != null) __obj.updateDynamic("axisComponent")(axisComponent.rawElement.asInstanceOf[js.Any])
    if (axisLabelComponent != null) __obj.updateDynamic("axisLabelComponent")(axisLabelComponent.rawElement.asInstanceOf[js.Any])
    if (axisValue != null) __obj.updateDynamic("axisValue")(axisValue.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(crossAxis)) __obj.updateDynamic("crossAxis")(crossAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(dependentAxis)) __obj.updateDynamic("dependentAxis")(dependentAxis.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(fixLabelOverlap)) __obj.updateDynamic("fixLabelOverlap")(fixLabelOverlap.asInstanceOf[js.Any])
    if (gridComponent != null) __obj.updateDynamic("gridComponent")(gridComponent.rawElement.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(invertAxis)) __obj.updateDynamic("invertAxis")(invertAxis.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tickComponent != null) __obj.updateDynamic("tickComponent")(tickComponent.rawElement.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(tickFormat.asInstanceOf[js.Any])
    if (tickLabelComponent != null) __obj.updateDynamic("tickLabelComponent")(tickLabelComponent.rawElement.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryAxisProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryAxis](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryAxisProps])(children: _*)
  }
  @JSImport("victory", "VictoryAxis")
  @js.native
  object componentImport extends js.Object
  
}

