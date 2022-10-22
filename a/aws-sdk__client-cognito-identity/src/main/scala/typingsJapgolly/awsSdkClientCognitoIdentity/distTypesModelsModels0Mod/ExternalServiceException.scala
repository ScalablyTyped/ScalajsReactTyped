package typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeExtern
import typingsJapgolly.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "ExternalServiceException")
@js.native
open class ExternalServiceException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeExtern) = this()
  
  @JSName("$fault")
  val $fault_ExternalServiceException: client = js.native
  
  @JSName("name")
  val name_ExternalServiceException: typingsJapgolly.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ExternalServiceException = js.native
}
