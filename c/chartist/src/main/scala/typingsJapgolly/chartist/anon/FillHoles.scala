package typingsJapgolly.chartist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillHoles extends StObject {
  
  var fillHoles: js.UndefOr[Boolean] = js.undefined
  
  var increasingX: js.UndefOr[Boolean] = js.undefined
}
object FillHoles {
  
  inline def apply(): FillHoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillHoles]
  }
  
  extension [Self <: FillHoles](x: Self) {
    
    inline def setFillHoles(value: Boolean): Self = StObject.set(x, "fillHoles", value.asInstanceOf[js.Any])
    
    inline def setFillHolesUndefined: Self = StObject.set(x, "fillHoles", js.undefined)
    
    inline def setIncreasingX(value: Boolean): Self = StObject.set(x, "increasingX", value.asInstanceOf[js.Any])
    
    inline def setIncreasingXUndefined: Self = StObject.set(x, "increasingX", js.undefined)
  }
}
