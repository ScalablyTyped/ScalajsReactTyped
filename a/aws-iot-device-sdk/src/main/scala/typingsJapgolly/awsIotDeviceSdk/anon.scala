package typingsJapgolly.awsIotDeviceSdk

import typingsJapgolly.awsIotDeviceSdk.awsIotDeviceSdkInts.`0`
import typingsJapgolly.awsIotDeviceSdk.awsIotDeviceSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Qos extends StObject {
    
    var qos: `0` | `1`
  }
  object Qos {
    
    inline def apply(qos: `0` | `1`): Qos = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Qos]
    }
    
    extension [Self <: Qos](x: Self) {
      
      inline def setQos(value: `0` | `1`): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    }
  }
}
