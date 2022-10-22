package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.anon.DisableHostPrefix
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotsharedMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/runtimeConfig.shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: STSClientConfig): DisableHostPrefix = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[DisableHostPrefix]
}
