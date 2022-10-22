package typingsJapgolly.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileId extends StObject {
  
  var profileId: js.UndefOr[String] = js.undefined
}
object ProfileId {
  
  inline def apply(): ProfileId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileId]
  }
  
  extension [Self <: ProfileId](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
