package typingsJapgolly.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  val radius: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val radius2: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val theta: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val theta2: typingsJapgolly.vegaLite.vegaLiteInts.`1`
}
object Radius {
  
  inline def apply(): Radius = {
    val __obj = js.Dynamic.literal(radius = 1, radius2 = 1, theta = 1, theta2 = 1)
    __obj.asInstanceOf[Radius]
  }
  
  extension [Self <: Radius](x: Self) {
    
    inline def setRadius(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadius2(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    inline def setTheta(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setTheta2(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
  }
}
