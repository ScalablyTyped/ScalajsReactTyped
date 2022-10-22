package typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod

import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeRegion
import typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.client
import typingsJapgolly.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "RegionDisabledException")
@js.native
open class RegionDisabledException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeRegion) = this()
  
  @JSName("$fault")
  val $fault_RegionDisabledException: client = js.native
  
  @JSName("name")
  val name_RegionDisabledException: typingsJapgolly.awsSdkClientSts.awsSdkClientStsStrings.RegionDisabledException = js.native
}
