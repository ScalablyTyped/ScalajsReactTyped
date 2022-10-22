package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSliderViewModelConstructor
  extends StObject
     with /**
  * Provides the logic for the [TimeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html)
  */
Instantiable0[TimeSliderViewModel]
     with Instantiable1[/* properties */ TimeSliderViewModelProperties, TimeSliderViewModel] {
  
  /**
    * Extracts time slider settings from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) if the webmap contains a [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider) definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#getPropertiesFromWebMap)
    */
  def getPropertiesFromWebMap(webMap: WebMap): js.Promise[Any] = js.native
  def getPropertiesFromWebMap(webMap: WebMap, signal: AbortSignal): js.Promise[Any] = js.native
}
