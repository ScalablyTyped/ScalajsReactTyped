package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.clip
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mask
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneModificationProperties extends StObject {
  
  /**
    * The geometry representing the location of the modification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#geometry)
    */
  var geometry: js.UndefOr[PolygonProperties] = js.undefined
  
  /**
    * The type of modification to perform.
    *
    * @default clip
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#type)
    */
  var `type`: js.UndefOr[clip | mask | replace] = js.undefined
}
object SceneModificationProperties {
  
  inline def apply(): SceneModificationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneModificationProperties]
  }
  
  extension [Self <: SceneModificationProperties](x: Self) {
    
    inline def setGeometry(value: PolygonProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setType(value: clip | mask | replace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
