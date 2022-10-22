package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityDetails extends StObject {
  
  /**
    * The EntityInfo object that contains details about the entity (user or role).
    */
  var EntityInfo: typingsJapgolly.awsSdk.clientsIamMod.EntityInfo
  
  /**
    * The date and time, in ISO 8601 date-time format, when the authenticated entity last attempted to access Amazon Web Services. Amazon Web Services does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the tracking period.
    */
  var LastAuthenticated: js.UndefOr[js.Date] = js.undefined
}
object EntityDetails {
  
  inline def apply(EntityInfo: EntityInfo): EntityDetails = {
    val __obj = js.Dynamic.literal(EntityInfo = EntityInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDetails]
  }
  
  extension [Self <: EntityDetails](x: Self) {
    
    inline def setEntityInfo(value: EntityInfo): Self = StObject.set(x, "EntityInfo", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticated(value: js.Date): Self = StObject.set(x, "LastAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticatedUndefined: Self = StObject.set(x, "LastAuthenticated", js.undefined)
  }
}
