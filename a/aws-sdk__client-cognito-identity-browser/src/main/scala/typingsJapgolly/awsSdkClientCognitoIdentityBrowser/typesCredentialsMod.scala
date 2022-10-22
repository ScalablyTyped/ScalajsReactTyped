package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCredentialsMod {
  
  trait Credentials extends StObject {
    
    /**
      * <p>The Access Key portion of the credentials.</p>
      */
    var AccessKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date at which these credentials will expire.</p>
      */
    var Expiration: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The Secret Access Key portion of the credentials</p>
      */
    var SecretKey: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Session Token portion of the credentials</p>
      */
    var SessionToken: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
      
      inline def setExpiration(value: js.Date | String | Double): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
    }
  }
  
  trait UnmarshalledCredentials
    extends StObject
       with Credentials {
    
    /**
      * <p>The date at which these credentials will expire.</p>
      */
    @JSName("Expiration")
    var Expiration_UnmarshalledCredentials: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledCredentials {
    
    inline def apply(): UnmarshalledCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCredentials]
    }
    
    extension [Self <: UnmarshalledCredentials](x: Self) {
      
      inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    }
  }
}
