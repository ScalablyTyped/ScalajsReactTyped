package typingsJapgolly.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Family extends StObject {
  
  var color: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var family: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object Family {
  
  inline def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  
  extension [Self <: Family](x: Self) {
    
    inline def setColor(value: String | js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFamily(value: String | js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
