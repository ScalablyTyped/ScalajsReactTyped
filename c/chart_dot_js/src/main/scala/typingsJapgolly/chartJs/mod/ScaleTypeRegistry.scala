package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.anon.Options
import typingsJapgolly.chartJs.anon.OptionsCategoryScaleOptions
import typingsJapgolly.chartJs.anon.OptionsLogarithmicScaleOptions
import typingsJapgolly.chartJs.anon.OptionsRadialLinearScaleOptions
import typingsJapgolly.chartJs.anon.OptionsTimeScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTypeRegistry
  extends StObject
     with CartesianScaleTypeRegistry
     with RadialScaleTypeRegistry
object ScaleTypeRegistry {
  
  inline def apply(
    category: OptionsCategoryScaleOptions,
    linear: Options,
    logarithmic: OptionsLogarithmicScaleOptions,
    radialLinear: OptionsRadialLinearScaleOptions,
    time: OptionsTimeScaleOptions,
    timeseries: OptionsTimeScaleOptions
  ): ScaleTypeRegistry = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], radialLinear = radialLinear.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeseries = timeseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTypeRegistry]
  }
}
