package typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.client
import typingsJapgolly.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "IDPRejectedClaimException")
@js.native
open class IDPRejectedClaimException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIDPRej) = this()
  
  @JSName("$fault")
  val $fault_IDPRejectedClaimException: client = js.native
  
  @JSName("name")
  val name_IDPRejectedClaimException: typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.IDPRejectedClaimException = js.native
}
