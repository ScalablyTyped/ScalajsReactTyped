package typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserChanges extends StObject {
  
  /** Rule name */
  var name: js.UndefOr[String] = js.undefined
}
object UserChanges {
  
  inline def apply(): UserChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserChanges]
  }
  
  extension [Self <: UserChanges](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
