package typingsJapgolly.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLength extends StObject {
  
  var lineLength: Double
  
  var lineStartIndex: Double
}
object LineLength {
  
  inline def apply(lineLength: Double, lineStartIndex: Double): LineLength = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], lineStartIndex = lineStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLength]
  }
  
  extension [Self <: LineLength](x: Self) {
    
    inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    inline def setLineStartIndex(value: Double): Self = StObject.set(x, "lineStartIndex", value.asInstanceOf[js.Any])
  }
}
