package typingsJapgolly.divaJs.interfacesMod

import typingsJapgolly.divaJs.anon.Ahei
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestData extends StObject {
  
  var dims: Ahei
  
  var item_title: String
  
  var max_zoom: Double
  
  var metadata: js.Object
  
  var paged: Boolean
  
  var pgs: js.Array[Page]
  
  var version: js.UndefOr[Double] = js.undefined
}
object ManifestData {
  
  inline def apply(
    dims: Ahei,
    item_title: String,
    max_zoom: Double,
    metadata: js.Object,
    paged: Boolean,
    pgs: js.Array[Page]
  ): ManifestData = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any], item_title = item_title.asInstanceOf[js.Any], max_zoom = max_zoom.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], pgs = pgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestData]
  }
  
  extension [Self <: ManifestData](x: Self) {
    
    inline def setDims(value: Ahei): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
    
    inline def setItem_title(value: String): Self = StObject.set(x, "item_title", value.asInstanceOf[js.Any])
    
    inline def setMax_zoom(value: Double): Self = StObject.set(x, "max_zoom", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPaged(value: Boolean): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
    
    inline def setPgs(value: js.Array[Page]): Self = StObject.set(x, "pgs", value.asInstanceOf[js.Any])
    
    inline def setPgsVarargs(value: Page*): Self = StObject.set(x, "pgs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
