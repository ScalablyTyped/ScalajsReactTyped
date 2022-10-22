package typingsJapgolly.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  val center: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val normalize: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val zero: typingsJapgolly.vegaLite.vegaLiteInts.`1`
}
object Center {
  
  inline def apply(): Center = {
    val __obj = js.Dynamic.literal(center = 1, normalize = 1, zero = 1)
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setZero(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
  }
}
