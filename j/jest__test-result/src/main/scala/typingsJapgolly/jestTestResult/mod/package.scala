package typingsJapgolly.jestTestResult.mod

import typingsJapgolly.istanbulLibCoverage.mod.CoverageMapData
import typingsJapgolly.jestTestResult.anon.CodeTransformResult
import typingsJapgolly.jestTestResult.jestTestResultStrings.`test-case-result`
import typingsJapgolly.jestTestResult.jestTestResultStrings.`test-file-failure`
import typingsJapgolly.jestTestResult.jestTestResultStrings.`test-file-start`
import typingsJapgolly.jestTestResult.jestTestResultStrings.`test-file-success`
import typingsJapgolly.jestTestResult.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addResult")(aggregatedResults.asInstanceOf[js.Any], testResult.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFailureTestResult")(testPath.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[TestResult]

inline def createEmptyTestResult(): TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyTestResult")().asInstanceOf[TestResult]

inline def formatTestResults(results: AggregatedResult): FormattedTestResults = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any]).asInstanceOf[FormattedTestResults]
inline def formatTestResults(results: AggregatedResult, codeCoverageFormatter: Unit, reporter: CodeCoverageReporter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
inline def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
inline def formatTestResults(
  results: AggregatedResult,
  codeCoverageFormatter: CodeCoverageFormatter,
  reporter: CodeCoverageReporter
): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]

inline def makeEmptyAggregatedTestResult(): AggregatedResult = ^.asInstanceOf[js.Dynamic].applyDynamic("makeEmptyAggregatedTestResult")().asInstanceOf[AggregatedResult]

type AssertionResult = typingsJapgolly.jestTypes.mod.AssertionResult

type CodeCoverageFormatter = js.Function2[
/* coverage */ js.UndefOr[CoverageMapData | Null], 
/* reporter */ CodeCoverageReporter, 
js.UndefOr[(Record[String, Any]) | Null]]

type CodeCoverageReporter = Any

type SerializableError = typingsJapgolly.jestTypes.mod.SerializableError

type TestCaseResult = AssertionResult

type TestFileEvent[T /* <: /* keyof @jest/test-result.@jest/test-result.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result` */] = js.Function2[
/* eventName */ T, 
/* import warning: importer.ImportType#apply Failed type conversion: @jest/test-result.@jest/test-result.TestEvents[T] */ /* args */ js.Any, 
Any]

type TestResultsProcessor = js.Function1[/* results */ AggregatedResult, AggregatedResult]

type V8CoverageResult = js.Array[CodeTransformResult]
