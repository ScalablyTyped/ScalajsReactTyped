package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.typesGrantMod.Grant
import typingsJapgolly.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typingsJapgolly.awsSdkClientS3Browser.typesOwnerMod.Owner
import typingsJapgolly.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccessControlPolicyMod {
  
  trait AccessControlPolicy extends StObject {
    
    /**
      * <p>A list of grants.</p>
      */
    var Grants: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.undefined
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typingsJapgolly.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.undefined
  }
  object AccessControlPolicy {
    
    inline def apply(): AccessControlPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessControlPolicy]
    }
    
    extension [Self <: AccessControlPolicy](x: Self) {
      
      inline def setGrants(value: js.Array[Grant] | js.Iterable[Grant]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
      
      inline def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "Grants", js.Array(value*))
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
  
  trait UnmarshalledAccessControlPolicy
    extends StObject
       with AccessControlPolicy {
    
    /**
      * <p>A list of grants.</p>
      */
    @JSName("Grants")
    var Grants_UnmarshalledAccessControlPolicy: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledAccessControlPolicy: js.UndefOr[UnmarshalledOwner] = js.undefined
  }
  object UnmarshalledAccessControlPolicy {
    
    inline def apply(): UnmarshalledAccessControlPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAccessControlPolicy]
    }
    
    extension [Self <: UnmarshalledAccessControlPolicy](x: Self) {
      
      inline def setGrants(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
      
      inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
      
      inline def setGrantsVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "Grants", js.Array(value*))
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
