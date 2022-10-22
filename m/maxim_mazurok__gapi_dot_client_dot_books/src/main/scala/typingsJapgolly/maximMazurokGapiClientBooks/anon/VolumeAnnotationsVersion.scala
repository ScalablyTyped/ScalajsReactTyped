package typingsJapgolly.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeAnnotationsVersion extends StObject {
  
  /** The layer id of this layer (e.g. "geo"). */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.* responses. The actual
    * annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.undefined
}
object VolumeAnnotationsVersion {
  
  inline def apply(): VolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAnnotationsVersion]
  }
  
  extension [Self <: VolumeAnnotationsVersion](x: Self) {
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setVolumeAnnotationsVersion(value: String): Self = StObject.set(x, "volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    inline def setVolumeAnnotationsVersionUndefined: Self = StObject.set(x, "volumeAnnotationsVersion", js.undefined)
  }
}
