package typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeIntern
import typingsJapgolly.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.server
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "InternalErrorException")
@js.native
open class InternalErrorException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIntern) = this()
  
  @JSName("$fault")
  val $fault_InternalErrorException: server = js.native
  
  @JSName("name")
  val name_InternalErrorException: typingsJapgolly.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException = js.native
}
