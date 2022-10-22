package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.clientsStsMod.arnType
import typingsJapgolly.awsSdk.clientsStsMod.roleSessionNameType
import typingsJapgolly.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsTemporaryCredentialsMod {
  
  @js.native
  trait TemporaryCredentials extends Credentials {
    
    /**
      * The master (non-temporary) credentials used to get and refresh temporary credentials from AWS STS.
      */
    var masterCredentials: Credentials = js.native
  }
  // Needed to expose interfaces on the class
  object TemporaryCredentials {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleRequest
      - typingsJapgolly.awsSdk.clientsStsMod.GetSessionTokenRequest
    */
    trait TemporaryCredentialsOptions extends StObject
    object TemporaryCredentialsOptions {
      
      inline def AssumeRoleRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType): typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleRequest]
      }
      
      inline def GetSessionTokenRequest(): typingsJapgolly.awsSdk.clientsStsMod.GetSessionTokenRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.awsSdk.clientsStsMod.GetSessionTokenRequest]
      }
    }
  }
}
