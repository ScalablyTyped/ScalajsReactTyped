package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def failure(adminContext: KiiAppAdminContext, anErrorString: String): Any
  
  def success(adminContext: KiiAppAdminContext, theMatchedUser: KiiUser): Any
}
object `0` {
  
  inline def apply(failure: (KiiAppAdminContext, String) => Any, success: (KiiAppAdminContext, KiiUser) => Any): `0` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFailure(value: (KiiAppAdminContext, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: (KiiAppAdminContext, KiiUser) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
