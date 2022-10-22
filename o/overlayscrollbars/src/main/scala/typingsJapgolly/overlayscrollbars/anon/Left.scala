package typingsJapgolly.overlayscrollbars.anon

import typingsJapgolly.overlayscrollbars.mod.Position
import typingsJapgolly.overlayscrollbars.mod._Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left
  extends StObject
     with _Coordinates {
  
  var left: js.UndefOr[Position] = js.undefined
  
  var top: js.UndefOr[Position] = js.undefined
}
object Left {
  
  inline def apply(): Left = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setLeft(value: Position): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Position): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
