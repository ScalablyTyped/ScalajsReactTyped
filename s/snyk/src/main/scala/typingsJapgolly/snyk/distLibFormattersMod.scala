package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibSnykTestIacTestResultMod.IacTestResponse
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.GroupedVuln
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.LegalInstruction
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.RemediationChanges
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.TestResult
import typingsJapgolly.snyk.distLibTypesMod.MonitorResult
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersMod {
  
  @JSImport("snyk/dist/lib/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDockerBinaryHeading(pkgInfo: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createDockerBinaryHeading")(pkgInfo.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dockerRemediationForDisplay(res: TestResult): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dockerRemediationForDisplay")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatDockerBinariesIssues(dockerBinariesSortedGroupedVulns: Any, binariesVulns: Any, options: Options & TestOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDockerBinariesIssues")(dockerBinariesSortedGroupedVulns.asInstanceOf[js.Any], binariesVulns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def formatErrorMonitorOutput(packageManager: Any, res: MonitorResult, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrorMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatErrorMonitorOutput(packageManager: Any, res: MonitorResult, options: Any, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrorMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatIssues(vuln: GroupedVuln, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssues")(vuln.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatIssuesWithRemediation(vulns: js.Array[GroupedVuln], remediationInfo: RemediationChanges, options: TestOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssuesWithRemediation")(vulns.asInstanceOf[js.Any], remediationInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def formatLegalInstructions(legalInstructions: js.Array[LegalInstruction]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLegalInstructions")(legalInstructions.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatLegalInstructions(legalInstructions: js.Array[LegalInstruction], paddingLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLegalInstructions")(legalInstructions.asInstanceOf[js.Any], paddingLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonitorOutput(packageManager: Any, res: MonitorResult, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonitorOutput(packageManager: Any, res: MonitorResult, options: Any, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonitorOutput(
    packageManager: Any,
    res: MonitorResult,
    options: Any,
    projectName: String,
    foundProjectCount: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], foundProjectCount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonitorOutput(
    packageManager: Any,
    res: MonitorResult,
    options: Any,
    projectName: Unit,
    foundProjectCount: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], foundProjectCount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTestMeta(res: IacTestResponse, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestMeta")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTestMeta(res: TestResult, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestMeta")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def summariseErrorResults(errorResultsLength: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("summariseErrorResults")(errorResultsLength.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def summariseVulnerableResults(vulnerableResults: Any, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("summariseVulnerableResults")(vulnerableResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
