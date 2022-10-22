package typingsJapgolly.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintObjects extends StObject {
  
  var `document-number`: js.UndefOr[Double] = js.undefined
  
  var `object-offset`: js.UndefOr[ObjectOffset] = js.undefined
  
  var `object-size`: js.UndefOr[ObjectSize] = js.undefined
  
  var `object-uuid`: js.UndefOr[String] = js.undefined
}
object PrintObjects {
  
  inline def apply(): PrintObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintObjects]
  }
  
  extension [Self <: PrintObjects](x: Self) {
    
    inline def `setDocument-number`(value: Double): Self = StObject.set(x, "document-number", value.asInstanceOf[js.Any])
    
    inline def `setDocument-numberUndefined`: Self = StObject.set(x, "document-number", js.undefined)
    
    inline def `setObject-offset`(value: ObjectOffset): Self = StObject.set(x, "object-offset", value.asInstanceOf[js.Any])
    
    inline def `setObject-offsetUndefined`: Self = StObject.set(x, "object-offset", js.undefined)
    
    inline def `setObject-size`(value: ObjectSize): Self = StObject.set(x, "object-size", value.asInstanceOf[js.Any])
    
    inline def `setObject-sizeUndefined`: Self = StObject.set(x, "object-size", js.undefined)
    
    inline def `setObject-uuid`(value: String): Self = StObject.set(x, "object-uuid", value.asInstanceOf[js.Any])
    
    inline def `setObject-uuidUndefined`: Self = StObject.set(x, "object-uuid", js.undefined)
  }
}
