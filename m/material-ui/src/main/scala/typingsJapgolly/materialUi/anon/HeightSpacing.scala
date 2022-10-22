package typingsJapgolly.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightSpacing extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
}
object HeightSpacing {
  
  inline def apply(): HeightSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightSpacing]
  }
  
  extension [Self <: HeightSpacing](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
