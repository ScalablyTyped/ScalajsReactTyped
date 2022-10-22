package typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeTooMan
import typingsJapgolly.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "TooManyRequestsException")
@js.native
open class TooManyRequestsException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTooMan) = this()
  
  @JSName("$fault")
  val $fault_TooManyRequestsException: client = js.native
  
  @JSName("name")
  val name_TooManyRequestsException: typingsJapgolly.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.TooManyRequestsException = js.native
}
