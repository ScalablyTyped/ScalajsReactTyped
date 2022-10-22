package typingsJapgolly.openlayers.mod.olx.source

import org.scalajs.dom.ImageData
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.RasterOperation
import typingsJapgolly.openlayers.mod.RasterOperationType
import typingsJapgolly.openlayers.mod.source.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @api
  */
trait RasterOptions extends StObject {
  
  var lib: js.UndefOr[GlobalObject] = js.undefined
  
  var operation: js.UndefOr[RasterOperation] = js.undefined
  
  var operationType: js.UndefOr[RasterOperationType] = js.undefined
  
  var sources: js.Array[Source]
  
  var threads: js.UndefOr[Double] = js.undefined
}
object RasterOptions {
  
  inline def apply(sources: js.Array[Source]): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
  
  extension [Self <: RasterOptions](x: Self) {
    
    inline def setLib(value: GlobalObject): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
    
    inline def setOperation(
      value: (/* data */ js.Array[js.Array[Double] | ImageData], /* obj */ GlobalObject) => js.Array[Double] | ImageData
    ): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
    
    inline def setOperationType(value: RasterOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
  }
}
