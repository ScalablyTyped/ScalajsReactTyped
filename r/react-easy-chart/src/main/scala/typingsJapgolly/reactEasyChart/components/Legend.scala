package typingsJapgolly.reactEasyChart.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactEasyChart.AnonColorString
import typingsJapgolly.reactEasyChart.mod.LegendProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Legend {
  def apply(
    data: js.Array[_],
    dataId: String,
    config: js.Array[AnonColorString] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    styles: StringDictionary[CSSProperties] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LegendProps, typingsJapgolly.reactEasyChart.mod.Legend, Unit, LegendProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
  
      if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEasyChart.mod.LegendProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEasyChart.mod.Legend](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEasyChart.mod.LegendProps])(children: _*)
  }
  @JSImport("react-easy-chart", "Legend")
  @js.native
  object componentImport extends js.Object
  
}

