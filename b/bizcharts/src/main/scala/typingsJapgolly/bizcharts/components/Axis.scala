package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antvG2.mod.AxisGrid
import typingsJapgolly.antvG2.mod.AxisLabel
import typingsJapgolly.antvG2.mod.Styles.line
import typingsJapgolly.antvG2.mod.Styles.tickLine
import typingsJapgolly.bizcharts.mod.AxisProps
import typingsJapgolly.bizcharts.mod.PositionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Axis {
  def apply(
    grid: AxisGrid = null,
    label: AxisLabel = null,
    line: line = null,
    min: Int | Double = null,
    name: String = null,
    position: PositionType = null,
    subTickCount: Int | Double = null,
    subTickLine: tickLine = null,
    tickLine: tickLine = null,
    title: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2.AxisTile */ js.Any) | Boolean = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AxisProps, typingsJapgolly.bizcharts.mod.Axis, Unit, AxisProps] = {
    val __obj = js.Dynamic.literal()
  
      if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (subTickCount != null) __obj.updateDynamic("subTickCount")(subTickCount.asInstanceOf[js.Any])
    if (subTickLine != null) __obj.updateDynamic("subTickLine")(subTickLine.asInstanceOf[js.Any])
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.AxisProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.bizcharts.mod.Axis](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.AxisProps])(children: _*)
  }
  @JSImport("bizcharts", "Axis")
  @js.native
  object componentImport extends js.Object
  
}

