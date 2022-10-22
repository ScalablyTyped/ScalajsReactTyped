package typingsJapgolly.terser

import typingsJapgolly.terser.terserStrings.comment1
import typingsJapgolly.terser.terserStrings.comment2
import typingsJapgolly.terser.terserStrings.comment3
import typingsJapgolly.terser.terserStrings.comment4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Col extends StObject {
    
    var col: Double
    
    var line: Double
    
    var pos: Double
    
    var `type`: comment1 | comment2 | comment3 | comment4
    
    var value: String
  }
  object Col {
    
    inline def apply(
      col: Double,
      line: Double,
      pos: Double,
      `type`: comment1 | comment2 | comment3 | comment4,
      value: String
    ): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    extension [Self <: Col](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setType(value: comment1 | comment2 | comment3 | comment4): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
