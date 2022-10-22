package typingsJapgolly.aceBuilds.mod.Ace

import typingsJapgolly.aceBuilds.aceBuildsStrings.insert
import typingsJapgolly.aceBuilds.aceBuildsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var action: insert | remove
  
  var end: Point
  
  var lines: js.Array[String]
  
  var start: Point
}
object Delta {
  
  inline def apply(action: insert | remove, end: Point, lines: js.Array[String], start: Point): Delta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
