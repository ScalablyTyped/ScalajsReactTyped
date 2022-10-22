package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.WeatherViewModel
import typingsJapgolly.arcgisJsApi.esri.WeatherViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.WeatherViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsWeatherWeatherViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Weather/WeatherViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WeatherViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Weather/WeatherViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Weather](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather-WeatherViewModel.html)
    */
  open class Class ()
    extends StObject
       with WeatherViewModel {
    def this(properties: WeatherViewModelProperties) = this()
  }
  
  type _To = js.Object & WeatherViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsWeatherWeatherViewModelMod.foo` */
  override def _to: js.Object & WeatherViewModelConstructor = ^
}
