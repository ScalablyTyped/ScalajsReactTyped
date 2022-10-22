package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): Any
  
  def success(theSavedGroup: KiiGroup): Any
}
object `10` {
  
  inline def apply(failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => Any, success: KiiGroup => Any): `10` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setFailure(value: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction4(value))
    
    inline def setSuccess(value: KiiGroup => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
