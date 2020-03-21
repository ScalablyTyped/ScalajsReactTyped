package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonX
import typingsJapgolly.antDesignPro.pieMod.IPieProps
import typingsJapgolly.antDesignPro.pieMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pie {
  def apply(
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    colors: js.Array[String] = null,
    data: js.Array[AnonX] = null,
    hasLegend: js.UndefOr[Boolean] = js.undefined,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    percent: Int | Double = null,
    subTitle: VdomNode = null,
    title: VdomNode = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    total: Node | Double | (js.Function0[Node | Double]) = null,
    valueFormat: /* value */ String => CallbackTo[String | Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IPieProps, default, Unit, IPieProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLegend)) __obj.updateDynamic("hasLegend")(hasLegend.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => valueFormat(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.pieMod.IPieProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.pieMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.pieMod.IPieProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/Pie", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

