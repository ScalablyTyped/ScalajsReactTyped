package typingsJapgolly.snyk

import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PolicyMetadata
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TestMeta
import typingsJapgolly.snyk.distLibErrorsMod.CustomError
import typingsJapgolly.snyk.distLibSnykTestCommonMod.SEVERITY
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsResultsFormatterMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/results-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/results-formatter", "FailedToFormatResults")
  @js.native
  open class FailedToFormatResults () extends CustomError {
    def this(message: String) = this()
  }
  
  inline def filterPoliciesBySeverity(violatedPolicies: js.Array[PolicyMetadata]): js.Array[PolicyMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterPoliciesBySeverity")(violatedPolicies.asInstanceOf[js.Any]).asInstanceOf[js.Array[PolicyMetadata]]
  inline def filterPoliciesBySeverity(violatedPolicies: js.Array[PolicyMetadata], severityThreshold: SEVERITY): js.Array[PolicyMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterPoliciesBySeverity")(violatedPolicies.asInstanceOf[js.Any], severityThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[PolicyMetadata]]
  
  inline def formatScanResults(
    scanResults: js.Array[IacFileScanResult],
    options: IaCTestFlags,
    meta: TestMeta,
    projectPublicIds: Record[String, String],
    projectRoot: String
  ): js.Array[FormattedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatScanResults")(scanResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], projectPublicIds.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedResult]]
  inline def formatScanResults(
    scanResults: js.Array[IacFileScanResult],
    options: IaCTestFlags,
    meta: TestMeta,
    projectPublicIds: Record[String, String],
    projectRoot: String,
    gitRemoteUrl: String
  ): js.Array[FormattedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatScanResults")(scanResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], projectPublicIds.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], gitRemoteUrl.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedResult]]
}
