package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activation extends StObject {
  
  /**
    * The ID created by Systems Manager when you submitted the activation.
    */
  var ActivationId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ActivationId] = js.undefined
  
  /**
    * The date the activation was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A name for the managed node when it is created.
    */
  var DefaultInstanceName: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DefaultInstanceName] = js.undefined
  
  /**
    * A user defined description of the activation.
    */
  var Description: js.UndefOr[ActivationDescription] = js.undefined
  
  /**
    * The date when this activation can no longer be used to register managed nodes.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether or not the activation is expired.
    */
  var Expired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Identity and Access Management (IAM) role to assign to the managed node.
    */
  var IamRole: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.IamRole] = js.undefined
  
  /**
    * The maximum number of managed nodes that can be registered using this activation.
    */
  var RegistrationLimit: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.RegistrationLimit] = js.undefined
  
  /**
    * The number of managed nodes already registered with this activation.
    */
  var RegistrationsCount: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.RegistrationsCount] = js.undefined
  
  /**
    * Tags assigned to the activation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Activation {
  
  inline def apply(): Activation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activation]
  }
  
  extension [Self <: Activation](x: Self) {
    
    inline def setActivationId(value: ActivationId): Self = StObject.set(x, "ActivationId", value.asInstanceOf[js.Any])
    
    inline def setActivationIdUndefined: Self = StObject.set(x, "ActivationId", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDefaultInstanceName(value: DefaultInstanceName): Self = StObject.set(x, "DefaultInstanceName", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstanceNameUndefined: Self = StObject.set(x, "DefaultInstanceName", js.undefined)
    
    inline def setDescription(value: ActivationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    inline def setExpiredUndefined: Self = StObject.set(x, "Expired", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    inline def setRegistrationLimit(value: RegistrationLimit): Self = StObject.set(x, "RegistrationLimit", value.asInstanceOf[js.Any])
    
    inline def setRegistrationLimitUndefined: Self = StObject.set(x, "RegistrationLimit", js.undefined)
    
    inline def setRegistrationsCount(value: RegistrationsCount): Self = StObject.set(x, "RegistrationsCount", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsCountUndefined: Self = StObject.set(x, "RegistrationsCount", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
