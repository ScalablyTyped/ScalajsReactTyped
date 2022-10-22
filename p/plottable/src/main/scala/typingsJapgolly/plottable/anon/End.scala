package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.end
import typingsJapgolly.plottable.plottableStrings.middle
import typingsJapgolly.plottable.plottableStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: typingsJapgolly.plottable.plottableStrings.end
  
  var middle: typingsJapgolly.plottable.plottableStrings.middle
  
  var start: typingsJapgolly.plottable.plottableStrings.start
}
object End {
  
  inline def apply(): End = {
    val __obj = js.Dynamic.literal(end = "end", middle = "middle", start = "start")
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setMiddle(value: middle): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
