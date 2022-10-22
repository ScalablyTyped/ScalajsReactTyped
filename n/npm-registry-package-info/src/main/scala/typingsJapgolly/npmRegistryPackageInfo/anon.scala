package typingsJapgolly.npmRegistryPackageInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Failure extends StObject {
    
    var failure: Double
    
    var success: Double
    
    var total: Double
  }
  object Failure {
    
    inline def apply(failure: Double, success: Double, total: Double): Failure = {
      val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure]
    }
    
    extension [Self <: Failure](x: Self) {
      
      inline def setFailure(value: Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
