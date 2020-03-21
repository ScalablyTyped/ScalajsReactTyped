package typingsJapgolly.reactHighcharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.highcharts.mod.Options
import typingsJapgolly.reactHighcharts.mod.ReactHighchartsProps
import typingsJapgolly.reactHighcharts.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHighcharts {
  def apply(
    config: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any => Callback = null,
    isPureConfig: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactHighchartsProps, default, Unit, ReactHighchartsProps] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any) => callback(t0).runNow()))
    if (!js.isUndefined(isPureConfig)) __obj.updateDynamic("isPureConfig")(isPureConfig.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHighcharts.mod.ReactHighchartsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHighcharts.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHighcharts.mod.ReactHighchartsProps])(children: _*)
  }
  @JSImport("react-highcharts", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

