package typingsJapgolly.jestTestResult

import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.CodeCoverageFormatter
import typingsJapgolly.jestTestResult.typesMod.CodeCoverageReporter
import typingsJapgolly.jestTestResult.typesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result/build/formatTestResults", JSImport.Namespace)
@js.native
object formatTestResultsMod extends js.Object {
  def default(results: AggregatedResult): FormattedTestResults = js.native
  def default(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

