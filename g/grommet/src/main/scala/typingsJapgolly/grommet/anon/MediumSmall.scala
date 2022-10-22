package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediumSmall extends StObject {
  
  var large: js.UndefOr[Double] = js.undefined
  
  var medium: js.UndefOr[Double] = js.undefined
  
  var small: js.UndefOr[Double] = js.undefined
}
object MediumSmall {
  
  inline def apply(): MediumSmall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediumSmall]
  }
  
  extension [Self <: MediumSmall](x: Self) {
    
    inline def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
