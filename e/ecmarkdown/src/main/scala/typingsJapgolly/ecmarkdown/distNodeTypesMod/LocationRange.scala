package typingsJapgolly.ecmarkdown.distNodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRange extends StObject {
  
  var end: Position
  
  var start: Position
}
object LocationRange {
  
  inline def apply(end: Position, start: Position): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRange]
  }
  
  extension [Self <: LocationRange](x: Self) {
    
    inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
