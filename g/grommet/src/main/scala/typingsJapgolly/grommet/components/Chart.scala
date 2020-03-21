package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.AnonColor
import typingsJapgolly.grommet.AnonHeight
import typingsJapgolly.grommet.AnonLabel
import typingsJapgolly.grommet.AnonValue
import typingsJapgolly.grommet.chartMod.ChartProps
import typingsJapgolly.grommet.grommetStrings.area
import typingsJapgolly.grommet.grommetStrings.bar
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.hair
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.line
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.point
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GapType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chart {
  def apply(
    values: js.Array[Double | js.Array[Double] | AnonLabel],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    bounds: js.Array[js.Array[Double]] = null,
    color: String | AnonColor | js.Array[AnonValue] = null,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onHover: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xxsmall | xsmall | small | medium | large | xlarge | full | AnonHeight | String = null,
    thickness: hair | xsmall | small | medium | large | xlarge | none | String = null,
    `type`: bar | line | area | point = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ChartProps, typingsJapgolly.grommet.mod.Chart, Unit, ChartProps] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
      if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onHover(t0).runNow()))
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommet.chartMod.ChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.grommet.mod.Chart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.chartMod.ChartProps])(children: _*)
  }
  @JSImport("grommet", "Chart")
  @js.native
  object componentImport extends js.Object
  
}

