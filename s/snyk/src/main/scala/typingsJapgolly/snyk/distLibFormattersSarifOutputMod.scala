package typingsJapgolly.snyk

import typingsJapgolly.sarif.mod.Log
import typingsJapgolly.sarif.mod.ReportingConfiguration.level
import typingsJapgolly.sarif.mod.Result
import typingsJapgolly.sarif.mod.Tool
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.SEVERITY
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.TestResult
import typingsJapgolly.snyk.snykStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersSarifOutputMod {
  
  @JSImport("snyk/dist/lib/formatters/sarif-output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSarifOutputForContainers(testResults: js.Array[TestResult]): Log = ^.asInstanceOf[js.Dynamic].applyDynamic("createSarifOutputForContainers")(testResults.asInstanceOf[js.Any]).asInstanceOf[Log]
  
  inline def getIssueLevel(severity: SEVERITY): level = ^.asInstanceOf[js.Dynamic].applyDynamic("getIssueLevel")(severity.asInstanceOf[js.Any]).asInstanceOf[level]
  
  inline def getIssueLevel_none(severity: none): level = ^.asInstanceOf[js.Dynamic].applyDynamic("getIssueLevel")(severity.asInstanceOf[js.Any]).asInstanceOf[level]
  
  inline def getResults(testResult: Any): js.Array[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResults")(testResult.asInstanceOf[js.Any]).asInstanceOf[js.Array[Result]]
  
  inline def getTool(testResult: Any): Tool = ^.asInstanceOf[js.Dynamic].applyDynamic("getTool")(testResult.asInstanceOf[js.Any]).asInstanceOf[Tool]
}
