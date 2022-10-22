package typingsJapgolly.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checksum extends StObject {
  
  var checksum: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var returnAll: js.UndefOr[Boolean] = js.undefined
  
  var security: js.UndefOr[typingsJapgolly.iotaLibJs.mod.Security] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object Checksum {
  
  inline def apply(): Checksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checksum]
  }
  
  extension [Self <: Checksum](x: Self) {
    
    inline def setChecksum(value: Boolean): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setReturnAll(value: Boolean): Self = StObject.set(x, "returnAll", value.asInstanceOf[js.Any])
    
    inline def setReturnAllUndefined: Self = StObject.set(x, "returnAll", js.undefined)
    
    inline def setSecurity(value: typingsJapgolly.iotaLibJs.mod.Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
