package typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.client
import typingsJapgolly.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "PackedPolicyTooLargeException")
@js.native
open class PackedPolicyTooLargeException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypePacked) = this()
  
  @JSName("$fault")
  val $fault_PackedPolicyTooLargeException: client = js.native
  
  @JSName("name")
  val name_PackedPolicyTooLargeException: typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.PackedPolicyTooLargeException = js.native
}
