package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antvG2.mod.Styles.line
import typingsJapgolly.antvG2.mod.Styles.text
import typingsJapgolly.bizcharts.mod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  def apply(
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    content: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]]) = null,
    formatter: (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double = null,
    htmlTemplate: (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String = null,
    labelEmit: js.UndefOr[Boolean] = js.undefined,
    labelLine: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean = null,
    offset: Int | Double = null,
    textStyle: text | (js.Function1[/* t */ js.UndefOr[js.Any], text]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LabelProps, typingsJapgolly.antDesignPro.bizchartsMod.Label, Unit, LabelProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (htmlTemplate != null) __obj.updateDynamic("htmlTemplate")(htmlTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(labelEmit)) __obj.updateDynamic("labelEmit")(labelEmit.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.LabelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Label](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.LabelProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Label")
  @js.native
  object componentImport extends js.Object
  
}

