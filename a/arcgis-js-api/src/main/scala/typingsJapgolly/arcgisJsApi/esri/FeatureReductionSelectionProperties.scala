package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureReductionSelectionProperties extends StObject {
  
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html#type)
    */
  var `type`: js.UndefOr[selection] = js.undefined
}
object FeatureReductionSelectionProperties {
  
  inline def apply(): FeatureReductionSelectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionSelectionProperties]
  }
  
  extension [Self <: FeatureReductionSelectionProperties](x: Self) {
    
    inline def setType(value: selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
