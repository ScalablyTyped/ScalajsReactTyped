package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.enabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.snowy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SnowyWeatherProperties & {  type :'snowy'} */
trait SnowyWeatherPropertiestyp extends StObject {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#cloudCover)
    */
  var cloudCover: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the amount of falling snow.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#precipitation)
    */
  var precipitation: js.UndefOr[Double] = js.undefined
  
  /**
    * Display surfaces covered with snow.
    *
    * @default "disabled"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#snowCover)
    */
  var snowCover: js.UndefOr[enabled | disabled] = js.undefined
  
  var `type`: snowy
}
object SnowyWeatherPropertiestyp {
  
  inline def apply(): SnowyWeatherPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("snowy")
    __obj.asInstanceOf[SnowyWeatherPropertiestyp]
  }
  
  extension [Self <: SnowyWeatherPropertiestyp](x: Self) {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
    
    inline def setPrecipitation(value: Double): Self = StObject.set(x, "precipitation", value.asInstanceOf[js.Any])
    
    inline def setPrecipitationUndefined: Self = StObject.set(x, "precipitation", js.undefined)
    
    inline def setSnowCover(value: enabled | disabled): Self = StObject.set(x, "snowCover", value.asInstanceOf[js.Any])
    
    inline def setSnowCoverUndefined: Self = StObject.set(x, "snowCover", js.undefined)
    
    inline def setType(value: snowy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
