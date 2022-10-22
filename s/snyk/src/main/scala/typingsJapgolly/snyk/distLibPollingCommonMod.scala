package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibEcosystemsTypesMod.ScanResult
import typingsJapgolly.snyk.distLibPollingTypesMod.ResolutionMeta
import typingsJapgolly.snyk.distLibPollingTypesMod.ResolveAndMonitorFactsResponse
import typingsJapgolly.snyk.distLibPollingTypesMod.ResolveAndTestFactsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPollingCommonMod {
  
  @JSImport("snyk/dist/lib/polling/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delayNextStep(attemptsCount: Double, maxAttempts: Double, pollInterval: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayNextStep")(attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def extractResolutionMetaFromScanResult(hasNameTargetIdentityPolicyTargetReference: ScanResult): ResolutionMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("extractResolutionMetaFromScanResult")(hasNameTargetIdentityPolicyTargetReference.asInstanceOf[js.Any]).asInstanceOf[ResolutionMeta]
  
  inline def handleProcessingStatus(response: ResolveAndMonitorFactsResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleProcessingStatus")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def handleProcessingStatus(response: ResolveAndTestFactsResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleProcessingStatus")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
