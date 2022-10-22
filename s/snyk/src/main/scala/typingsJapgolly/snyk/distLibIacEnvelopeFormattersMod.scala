package typingsJapgolly.snyk

import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacShareResultsFormat
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.ScanResult
import typingsJapgolly.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typingsJapgolly.snyk.distLibTypesMod.IacOutputMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacEnvelopeFormattersMod {
  
  @JSImport("snyk/dist/lib/iac/envelope-formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertIacResultToScanResult(iacResult: IacShareResultsFormat, policy: Unit, meta: IacOutputMeta, options: IaCTestFlags): ScanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertIacResultToScanResult")(iacResult.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScanResult]
  inline def convertIacResultToScanResult(iacResult: IacShareResultsFormat, policy: Policy, meta: IacOutputMeta, options: IaCTestFlags): ScanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertIacResultToScanResult")(iacResult.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScanResult]
}
