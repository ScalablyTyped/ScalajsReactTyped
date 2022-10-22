package typingsJapgolly.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxListDepth extends StObject {
  
  var maxListDepth: js.UndefOr[Double] = js.undefined
}
object MaxListDepth {
  
  inline def apply(): MaxListDepth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxListDepth]
  }
  
  extension [Self <: MaxListDepth](x: Self) {
    
    inline def setMaxListDepth(value: Double): Self = StObject.set(x, "maxListDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxListDepthUndefined: Self = StObject.set(x, "maxListDepth", js.undefined)
  }
}
