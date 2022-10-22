package typingsJapgolly.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QEndIndex extends StObject {
  
  var qEndIndex: Double
  
  var qStartIndex: Double
}
object QEndIndex {
  
  inline def apply(qEndIndex: Double, qStartIndex: Double): QEndIndex = {
    val __obj = js.Dynamic.literal(qEndIndex = qEndIndex.asInstanceOf[js.Any], qStartIndex = qStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QEndIndex]
  }
  
  extension [Self <: QEndIndex](x: Self) {
    
    inline def setQEndIndex(value: Double): Self = StObject.set(x, "qEndIndex", value.asInstanceOf[js.Any])
    
    inline def setQStartIndex(value: Double): Self = StObject.set(x, "qStartIndex", value.asInstanceOf[js.Any])
  }
}
