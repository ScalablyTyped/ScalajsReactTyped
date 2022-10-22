package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolidEdges3DProperties
  extends StObject
     with Edges3DProperties {
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html#type)
    */
  var `type`: js.UndefOr[solid] = js.undefined
}
object SolidEdges3DProperties {
  
  inline def apply(): SolidEdges3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolidEdges3DProperties]
  }
  
  extension [Self <: SolidEdges3DProperties](x: Self) {
    
    inline def setType(value: solid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
