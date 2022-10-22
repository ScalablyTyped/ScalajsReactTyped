package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharRange extends StObject {
  
  var qCharCount: Double
  
  var qCharPos: Double
}
object CharRange {
  
  inline def apply(qCharCount: Double, qCharPos: Double): CharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharRange]
  }
  
  extension [Self <: CharRange](x: Self) {
    
    inline def setQCharCount(value: Double): Self = StObject.set(x, "qCharCount", value.asInstanceOf[js.Any])
    
    inline def setQCharPos(value: Double): Self = StObject.set(x, "qCharPos", value.asInstanceOf[js.Any])
  }
}
