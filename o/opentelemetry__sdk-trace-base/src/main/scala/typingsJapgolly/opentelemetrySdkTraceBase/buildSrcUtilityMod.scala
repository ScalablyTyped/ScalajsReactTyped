package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetrySdkTraceBase.anon.TracerConfigsamplerSample
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTypesMod.TracerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilityMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeConfig(userConfig: TracerConfig): TracerConfigsamplerSample = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(userConfig.asInstanceOf[js.Any]).asInstanceOf[TracerConfigsamplerSample]
  
  inline def reconfigureLimits(userConfig: TracerConfig): TracerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("reconfigureLimits")(userConfig.asInstanceOf[js.Any]).asInstanceOf[TracerConfig]
}
