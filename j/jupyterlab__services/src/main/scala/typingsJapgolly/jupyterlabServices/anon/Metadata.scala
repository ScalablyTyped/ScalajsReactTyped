package typingsJapgolly.jupyterlabServices.anon

import typingsJapgolly.jupyterlabNbformat.mod.IMimeBundle
import typingsJapgolly.jupyterlabNbformat.mod.OutputMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var data: IMimeBundle
  
  var metadata: OutputMetadata
  
  var transient: js.UndefOr[Displayid] = js.undefined
}
object Metadata {
  
  inline def apply(data: IMimeBundle, metadata: OutputMetadata): Metadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setTransient(value: Displayid): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
  }
}
