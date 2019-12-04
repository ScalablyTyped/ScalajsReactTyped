package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libStatisticNumberMod.NumberProps
import typingsJapgolly.antd.libStatisticUtilsMod.Formatter
import typingsJapgolly.antd.libStatisticUtilsMod.valueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Number {
  def apply(
    value: valueType,
    decimalSeparator: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    precision: Int | Double = null,
    prefixCls: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    NumberProps, 
    MountedWithRawType[NumberProps, js.Object, RawMounted[NumberProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.libStatisticNumberMod.NumberProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libStatisticNumberMod.NumberProps])(children: _*)
  }
  @JSImport("antd/lib/statistic/Number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

