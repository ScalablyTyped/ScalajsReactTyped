package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Weather
import typingsJapgolly.arcgisJsApi.esri.WeatherConstructor
import typingsJapgolly.arcgisJsApi.esri.WeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsWeatherMod extends Shortcut {
  
  @JSImport("esri/widgets/Weather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Weather", JSImport.Namespace)
  @js.native
  /**
    * The Weather widget provides an interface for easily selecting and configuring the weather effects in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html)
    */
  open class Class ()
    extends StObject
       with Weather {
    def this(properties: WeatherProperties) = this()
  }
  
  type _To = js.Object & WeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsWeatherMod.foo` */
  override def _to: js.Object & WeatherConstructor = ^
}
