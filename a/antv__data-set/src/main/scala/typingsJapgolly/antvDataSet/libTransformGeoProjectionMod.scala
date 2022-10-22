package typingsJapgolly.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformGeoProjectionMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Array[String]] = js.undefined
    
    var projection: String
  }
  object Options {
    
    inline def apply(projection: String): Options = {
      val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value*))
      
      inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    }
  }
}
