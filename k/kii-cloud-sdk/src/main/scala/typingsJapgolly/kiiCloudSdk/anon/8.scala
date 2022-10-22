package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def failure(theGroup: KiiGroup, anErrorString: String): Any
  
  def success(theGroup: KiiGroup, memberList: js.Array[KiiUser]): Any
}
object `8` {
  
  inline def apply(failure: (KiiGroup, String) => Any, success: (KiiGroup, js.Array[KiiUser]) => Any): `8` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setFailure(value: (KiiGroup, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: (KiiGroup, js.Array[KiiUser]) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
