package typingsJapgolly.overlayscrollbars.anon

import typingsJapgolly.overlayscrollbars.mod.Position
import typingsJapgolly.overlayscrollbars.mod._Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait L
  extends StObject
     with _Coordinates {
  
  var l: js.UndefOr[Position] = js.undefined
  
  var t: js.UndefOr[Position] = js.undefined
}
object L {
  
  inline def apply(): L = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L]
  }
  
  extension [Self <: L](x: Self) {
    
    inline def setL(value: Position): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setT(value: Position): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
