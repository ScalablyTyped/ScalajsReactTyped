package typingsJapgolly.novaEditorNode.anon

import typingsJapgolly.novaEditorNode.FileLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line
  extends StObject
     with FileLocation {
  
  var column: js.UndefOr[Double] = js.undefined
  
  var line: Double
}
object Line {
  
  inline def apply(line: Double): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  extension [Self <: Line](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
