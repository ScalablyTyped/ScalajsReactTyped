package typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.client
import typingsJapgolly.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "ExpiredTokenException")
@js.native
open class ExpiredTokenException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeExpire) = this()
  
  @JSName("$fault")
  val $fault_ExpiredTokenException: client = js.native
  
  @JSName("name")
  val name_ExpiredTokenException: typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.ExpiredTokenException = js.native
}
