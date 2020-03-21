package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.statisticStatisticMod.StatisticProps
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Statistic {
  def apply(
    contextTypes: ValidationMap[_] = null,
    defaultProps: Partial[StatisticProps] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StatisticProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FunctionComponent[StatisticProps], 
    MountedWithRawType[
      FunctionComponent[StatisticProps], 
      js.Object, 
      RawMounted[FunctionComponent[StatisticProps], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (contextTypes != null) __obj.updateDynamic("contextTypes")(contextTypes.asInstanceOf[js.Any])
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.FunctionComponent[typingsJapgolly.antd.statisticStatisticMod.StatisticProps], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.FunctionComponent[typingsJapgolly.antd.statisticStatisticMod.StatisticProps]])(children: _*)
  }
  @JSImport("antd/lib/statistic", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

