package typingsJapgolly.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolation extends StObject {
  
  var interpolation: js.UndefOr[Type] = js.undefined
}
object Interpolation {
  
  inline def apply(): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interpolation]
  }
  
  extension [Self <: Interpolation](x: Self) {
    
    inline def setInterpolation(value: Type): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
  }
}
