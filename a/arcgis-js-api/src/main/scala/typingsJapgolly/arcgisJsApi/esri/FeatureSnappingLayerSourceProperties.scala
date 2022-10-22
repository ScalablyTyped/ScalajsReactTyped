package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.CSVLayerPropertiestypecsv
import typingsJapgolly.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typingsJapgolly.arcgisJsApi.anon.GeoJSONLayerPropertiestyp
import typingsJapgolly.arcgisJsApi.anon.GraphicsLayerPropertiesty
import typingsJapgolly.arcgisJsApi.anon.WFSLayerPropertiestypewfs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSnappingLayerSourceProperties extends StObject {
  
  /**
    * Indicates whether feature snapping is turned on or off.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source layer used for snapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html#layer)
    */
  var layer: js.UndefOr[
    FeatureLayerPropertiestyp | GraphicsLayerPropertiesty | GeoJSONLayerPropertiestyp | CSVLayerPropertiestypecsv | WFSLayerPropertiestypewfs
  ] = js.undefined
}
object FeatureSnappingLayerSourceProperties {
  
  inline def apply(): FeatureSnappingLayerSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSnappingLayerSourceProperties]
  }
  
  extension [Self <: FeatureSnappingLayerSourceProperties](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLayer(
      value: FeatureLayerPropertiestyp | GraphicsLayerPropertiesty | GeoJSONLayerPropertiestyp | CSVLayerPropertiestypecsv | WFSLayerPropertiestypewfs
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
