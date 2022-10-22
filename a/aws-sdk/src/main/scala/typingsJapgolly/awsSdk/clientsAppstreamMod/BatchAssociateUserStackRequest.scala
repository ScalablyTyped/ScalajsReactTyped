package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateUserStackRequest extends StObject {
  
  /**
    * The list of UserStackAssociation objects.
    */
  var UserStackAssociations: UserStackAssociationList
}
object BatchAssociateUserStackRequest {
  
  inline def apply(UserStackAssociations: UserStackAssociationList): BatchAssociateUserStackRequest = {
    val __obj = js.Dynamic.literal(UserStackAssociations = UserStackAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateUserStackRequest]
  }
  
  extension [Self <: BatchAssociateUserStackRequest](x: Self) {
    
    inline def setUserStackAssociations(value: UserStackAssociationList): Self = StObject.set(x, "UserStackAssociations", value.asInstanceOf[js.Any])
    
    inline def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = StObject.set(x, "UserStackAssociations", js.Array(value*))
  }
}
