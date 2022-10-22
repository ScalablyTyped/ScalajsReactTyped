package typingsJapgolly.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMUMPU6050Option
  extends StObject
     with IMUGeneralOption {
  
  var address: Double
}
object IMUMPU6050Option {
  
  inline def apply(address: Double): IMUMPU6050Option = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMUMPU6050Option]
  }
  
  extension [Self <: IMUMPU6050Option](x: Self) {
    
    inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
