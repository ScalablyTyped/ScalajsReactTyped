package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityUserLink extends StObject {
  
  /** Entity for this link. It can be an account, a web property, or a view (profile). */
  var entity: js.UndefOr[typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountRef] = js.undefined
  
  /** Entity user link ID */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for entity user link. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Permissions the user has for this entity. */
  var permissions: js.UndefOr[Local] = js.undefined
  
  /** Self link for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** User reference. */
  var userRef: js.UndefOr[UserRef] = js.undefined
}
object EntityUserLink {
  
  inline def apply(): EntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityUserLink]
  }
  
  extension [Self <: EntityUserLink](x: Self) {
    
    inline def setEntity(value: typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPermissions(value: Local): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUserRef(value: UserRef): Self = StObject.set(x, "userRef", value.asInstanceOf[js.Any])
    
    inline def setUserRefUndefined: Self = StObject.set(x, "userRef", js.undefined)
  }
}
