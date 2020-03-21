package typingsJapgolly.highchartsReactOfficial.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.highcharts.mod.Chart_
import typingsJapgolly.highcharts.mod.Options
import typingsJapgolly.highchartsReactOfficial.TypeofHighcharts
import typingsJapgolly.highchartsReactOfficial.mod.HighchartsReact.Props
import typingsJapgolly.highchartsReactOfficial.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HighchartsReactOfficial {
  def apply(
    StringDictionary: /* *
    *
    *  Properties
    *
    * */
  /**
    * Indexer for custom properties
    */
  /* key */ StringDictionary[js.Any] = null,
    allowChartUpdate: js.UndefOr[Boolean] = js.undefined,
    callback: /* chart */ Chart_ => Callback = null,
    constructorType: String = null,
    containerProps: StringDictionary[js.Any] = null,
    highcharts: TypeofHighcharts = null,
    immutable: js.UndefOr[Boolean] = js.undefined,
    options: Options = null,
    updateArgs: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowChartUpdate)) __obj.updateDynamic("allowChartUpdate")(allowChartUpdate.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* chart */ typingsJapgolly.highcharts.mod.Chart_) => callback(t0).runNow()))
    if (constructorType != null) __obj.updateDynamic("constructorType")(constructorType.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (highcharts != null) __obj.updateDynamic("highcharts")(highcharts.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (updateArgs != null) __obj.updateDynamic("updateArgs")(updateArgs.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.highchartsReactOfficial.mod.HighchartsReact.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.highchartsReactOfficial.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.highchartsReactOfficial.mod.HighchartsReact.Props])(children: _*)
  }
  @JSImport("highcharts-react-official", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

