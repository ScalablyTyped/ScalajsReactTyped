package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ_ACP
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE_ACP
import typingsJapgolly.awsSdkClientS3Browser.typesGranteeMod.Grantee
import typingsJapgolly.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGrantMod {
  
  trait Grant extends StObject {
    
    /**
      * _Grantee shape
      */
    var Grantee: js.UndefOr[typingsJapgolly.awsSdkClientS3Browser.typesGranteeMod.Grantee] = js.undefined
    
    /**
      * <p>Specifies the permission given to the grantee.</p>
      */
    var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.undefined
  }
  object Grant {
    
    inline def apply(): Grant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grant]
    }
    
    extension [Self <: Grant](x: Self) {
      
      inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
      
      inline def setPermission(value: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    }
  }
  
  trait UnmarshalledGrant
    extends StObject
       with Grant {
    
    /**
      * _Grantee shape
      */
    @JSName("Grantee")
    var Grantee_UnmarshalledGrant: js.UndefOr[UnmarshalledGrantee] = js.undefined
  }
  object UnmarshalledGrant {
    
    inline def apply(): UnmarshalledGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGrant]
    }
    
    extension [Self <: UnmarshalledGrant](x: Self) {
      
      inline def setGrantee(value: UnmarshalledGrantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    }
  }
}
