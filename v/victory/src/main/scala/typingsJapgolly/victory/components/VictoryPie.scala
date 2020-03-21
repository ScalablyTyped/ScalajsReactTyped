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
import typingsJapgolly.victory.mod.ColorScalePropType
import typingsJapgolly.victory.mod.D3Scale
import typingsJapgolly.victory.mod.DataGetterPropType
import typingsJapgolly.victory.mod.EventPropTypeInterface
import typingsJapgolly.victory.mod.PaddingProps
import typingsJapgolly.victory.mod.ScalePropType
import typingsJapgolly.victory.mod.StringOrNumberOrCallback
import typingsJapgolly.victory.mod.VictoryPieProps
import typingsJapgolly.victory.mod.VictorySliceProps
import typingsJapgolly.victory.mod.VictoryStyleInterface
import typingsJapgolly.victory.mod.VictoryThemeDefinition
import typingsJapgolly.victory.victoryStrings.data
import typingsJapgolly.victory.victoryStrings.labels
import typingsJapgolly.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryPie {
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    colorScale: ColorScalePropType = null,
    containerComponent: VdomElement = null,
    cornerRadius: Int | Double = null,
    data: js.Array[_] = null,
    dataComponent: VdomElement = null,
    endAngle: Int | Double = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[
      EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback | (js.Array[Double | String])]
    ] = null,
    groupComponent: VdomElement = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    innerRadius: Double | (js.Function1[/* props */ VictorySliceProps, Double]) = null,
    labelComponent: VdomElement = null,
    labelRadius: Int | Double = null,
    labels: js.Array[String] | (js.Function1[/* data */ js.Any, String]) = null,
    maxDomain: Double | AnonY = null,
    minDomain: Double | AnonY = null,
    name: String = null,
    padAngle: Int | Double = null,
    padding: PaddingProps = null,
    radius: Int | Double = null,
    scale: ScalePropType | D3Scale | Anon1 = null,
    singleQuadrantDomainPadding: Boolean | AnonXBoolean = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    style: VictoryStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    width: Int | Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VictoryPieProps, typingsJapgolly.victory.mod.VictoryPie, Unit, VictoryPieProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.rawElement.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.rawElement.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.rawElement.asInstanceOf[js.Any])
    if (labelRadius != null) __obj.updateDynamic("labelRadius")(labelRadius.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (singleQuadrantDomainPadding != null) __obj.updateDynamic("singleQuadrantDomainPadding")(singleQuadrantDomainPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryPieProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryPie](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryPieProps])(children: _*)
  }
  @JSImport("victory", "VictoryPie")
  @js.native
  object componentImport extends js.Object
  
}

