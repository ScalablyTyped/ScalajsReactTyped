package typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaliciousEntity extends StObject {
  
  /** The header from display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The actor who triggered a gmail phishing alert. */
  var entity: js.UndefOr[User] = js.undefined
  
  /** The sender email address. */
  var fromHeader: js.UndefOr[String] = js.undefined
}
object MaliciousEntity {
  
  inline def apply(): MaliciousEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaliciousEntity]
  }
  
  extension [Self <: MaliciousEntity](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntity(value: User): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setFromHeader(value: String): Self = StObject.set(x, "fromHeader", value.asInstanceOf[js.Any])
    
    inline def setFromHeaderUndefined: Self = StObject.set(x, "fromHeader", js.undefined)
  }
}
