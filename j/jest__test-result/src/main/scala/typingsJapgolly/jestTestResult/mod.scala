package typingsJapgolly.jestTestResult

import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.CodeCoverageFormatter
import typingsJapgolly.jestTestResult.typesMod.CodeCoverageReporter
import typingsJapgolly.jestTestResult.typesMod.FormattedTestResults
import typingsJapgolly.jestTestResult.typesMod.SerializableError
import typingsJapgolly.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}

