package typingsJapgolly.jestUtil

import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.CodeCoverageFormatter
import typingsJapgolly.jestTestResult.typesMod.CodeCoverageReporter
import typingsJapgolly.jestTestResult.typesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallResultsCodeCoverageFormatterReporter extends js.Object {
  def apply(results: AggregatedResult): FormattedTestResults = js.native
  def apply(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def apply(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

