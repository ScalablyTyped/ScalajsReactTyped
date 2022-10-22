package typingsJapgolly.snyk

import typingsJapgolly.snyk.distCliCommandsMonitorTypesMod.BadResult
import typingsJapgolly.snyk.distCliCommandsMonitorTypesMod.GoodResult
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.Ecosystem
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.EcosystemMonitorError
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.EcosystemMonitorResult
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.MonitorDependenciesRequest
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.ScanResult
import typingsJapgolly.snyk.distLibTypesMod.Contributor
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsMonitorMod {
  
  @JSImport("snyk/dist/lib/ecosystems/monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateMonitorDependenciesRequest(scanResult: ScanResult, options: Options): js.Promise[MonitorDependenciesRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMonitorDependenciesRequest")(scanResult.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesRequest]]
  
  inline def getFormattedMonitorOutput(
    results: js.Array[GoodResult | BadResult],
    monitorResults: js.Array[EcosystemMonitorResult],
    errors: js.Array[EcosystemMonitorError],
    options: Options
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedMonitorOutput")(results.asInstanceOf[js.Any], monitorResults.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def monitorEcosystem(ecosystem: Ecosystem, paths: js.Array[String], options: Options & PolicyOptions): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
  inline def monitorEcosystem(
    ecosystem: Ecosystem,
    paths: js.Array[String],
    options: Options & PolicyOptions,
    contributors: js.Array[Contributor]
  ): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
}
