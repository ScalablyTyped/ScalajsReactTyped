package typingsJapgolly.recharts.anon

import typingsJapgolly.recharts.mod.AllowEscapeViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY
  extends StObject
     with AllowEscapeViewBox {
  
  var x: Boolean
  
  var y: Boolean
}
object XY {
  
  inline def apply(x: Boolean, y: Boolean): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
