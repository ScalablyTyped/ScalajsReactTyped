package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(response: KiiGcmInstallationResponse): Any
}
object `16` {
  
  inline def apply(failure: js.Error => Any, success: KiiGcmInstallationResponse => Any): `16` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: KiiGcmInstallationResponse => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
