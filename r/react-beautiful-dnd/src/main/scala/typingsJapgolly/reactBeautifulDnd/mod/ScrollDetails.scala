package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollDetails extends StObject {
  
  var current: Position
  
  var diff: ScrollDifference
  
  var initial: Position
  
  // the maximum allowable scroll for the frame
  var max: Position
}
object ScrollDetails {
  
  inline def apply(current: Position, diff: ScrollDifference, initial: Position, max: Position): ScrollDetails = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDetails]
  }
  
  extension [Self <: ScrollDetails](x: Self) {
    
    inline def setCurrent(value: Position): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDiff(value: ScrollDifference): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: Position): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Position): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
