package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.CloudyWeather
import typingsJapgolly.arcgisJsApi.esri.CloudyWeatherConstructor
import typingsJapgolly.arcgisJsApi.esri.CloudyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentCloudyWeatherMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/CloudyWeather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CloudyWeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/CloudyWeather", JSImport.Namespace)
  @js.native
  /**
    * The CloudyWeather class allows you to change the weather conditions in the scene to cloudy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html)
    */
  open class Class ()
    extends StObject
       with CloudyWeather {
    def this(properties: CloudyWeatherProperties) = this()
  }
  
  type _To = js.Object & CloudyWeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dEnvironmentCloudyWeatherMod.foo` */
  override def _to: js.Object & CloudyWeatherConstructor = ^
}
