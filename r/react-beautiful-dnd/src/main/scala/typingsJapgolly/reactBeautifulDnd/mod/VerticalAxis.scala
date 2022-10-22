package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.vertical
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalAxis
  extends StObject
     with Axis {
  
  var crossAxisEnd: right
  
  var crossAxisLine: x
  
  var crossAxisSize: width
  
  var crossAxisStart: left
  
  var direction: vertical
  
  var end: bottom
  
  var line: y
  
  var size: height
  
  var start: top
}
object VerticalAxis {
  
  inline def apply(): VerticalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = "right", crossAxisLine = "x", crossAxisSize = "width", crossAxisStart = "left", direction = "vertical", end = "bottom", line = "y", size = "height", start = "top")
    __obj.asInstanceOf[VerticalAxis]
  }
  
  extension [Self <: VerticalAxis](x: Self) {
    
    inline def setCrossAxisEnd(value: right): Self = StObject.set(x, "crossAxisEnd", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisLine(value: typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = StObject.set(x, "crossAxisLine", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisSize(value: width): Self = StObject.set(x, "crossAxisSize", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisStart(value: left): Self = StObject.set(x, "crossAxisStart", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: bottom): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLine(value: y): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSize(value: height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStart(value: top): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
