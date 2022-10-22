package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.ImageElementPropertiestyp
import typingsJapgolly.arcgisJsApi.anon.VideoElementPropertiestyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalMediaElementSourceProperties extends StObject {
  
  /**
    * [Image](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html) and [video](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html) elements referenced in the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LocalMediaElementSource.html#elements)
    */
  var elements: js.UndefOr[CollectionProperties[ImageElementPropertiestyp | VideoElementPropertiestyp]] = js.undefined
}
object LocalMediaElementSourceProperties {
  
  inline def apply(): LocalMediaElementSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalMediaElementSourceProperties]
  }
  
  extension [Self <: LocalMediaElementSourceProperties](x: Self) {
    
    inline def setElements(value: CollectionProperties[ImageElementPropertiestyp | VideoElementPropertiestyp]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: (ImageElementPropertiestyp | VideoElementPropertiestyp)*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
