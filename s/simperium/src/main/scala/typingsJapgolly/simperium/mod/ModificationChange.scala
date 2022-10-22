package typingsJapgolly.simperium.mod

import typingsJapgolly.simperium.simperiumStrings.M
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModificationChange[T]
  extends StObject
     with Change[T] {
  
  var ccid: String
  
  var d: js.UndefOr[T] = js.undefined
  
  var id: String
  
  var o: M
  
  var sv: js.UndefOr[Double] = js.undefined
  
  var v: JSONDiff[T]
}
object ModificationChange {
  
  inline def apply[T](ccid: String, id: String, v: JSONDiff[T]): ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = "M", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModificationChange[T]]
  }
  
  extension [Self <: ModificationChange[?], T](x: Self & ModificationChange[T]) {
    
    inline def setCcid(value: String): Self = StObject.set(x, "ccid", value.asInstanceOf[js.Any])
    
    inline def setD(value: T): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setO(value: M): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setSv(value: Double): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
    
    inline def setSvUndefined: Self = StObject.set(x, "sv", js.undefined)
    
    inline def setV(value: JSONDiff[T]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
