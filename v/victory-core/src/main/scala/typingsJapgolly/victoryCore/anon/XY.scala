package typingsJapgolly.victoryCore.anon

import typingsJapgolly.victoryCore.esTypesPropTypesMod.D3Scale
import typingsJapgolly.victoryCore.esTypesPropTypesMod.ScalePropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  var x: js.UndefOr[ScalePropType | D3Scale[Any]] = js.undefined
  
  var y: js.UndefOr[ScalePropType | D3Scale[Any]] = js.undefined
}
object XY {
  
  inline def apply(): XY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: ScalePropType | D3Scale[Any]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: ScalePropType | D3Scale[Any]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
