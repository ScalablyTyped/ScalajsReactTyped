package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalAxis
  extends StObject
     with Axis {
  
  var crossAxisEnd: bottom
  
  var crossAxisLine: y
  
  var crossAxisSize: height
  
  var crossAxisStart: top
  
  var direction: horizontal
  
  var end: right
  
  var line: x
  
  var size: width
  
  var start: left
}
object HorizontalAxis {
  
  inline def apply(): HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = "bottom", crossAxisLine = "y", crossAxisSize = "height", crossAxisStart = "top", direction = "horizontal", end = "right", line = "x", size = "width", start = "left")
    __obj.asInstanceOf[HorizontalAxis]
  }
  
  extension [Self <: HorizontalAxis](x: Self) {
    
    inline def setCrossAxisEnd(value: bottom): Self = StObject.set(x, "crossAxisEnd", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisLine(value: y): Self = StObject.set(x, "crossAxisLine", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisSize(value: height): Self = StObject.set(x, "crossAxisSize", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisStart(value: top): Self = StObject.set(x, "crossAxisStart", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: right): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLine(value: typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSize(value: width): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStart(value: left): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
