package typingsJapgolly.jestReporters

import typingsJapgolly.jestReporters.coverageReporterMod.default
import typingsJapgolly.jestReporters.typesMod.Context
import typingsJapgolly.jestReporters.typesMod.CoverageReporterOptions
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestReporters.typesMod.Test
import typingsJapgolly.jestReporters.typesMod.TestSchedulerContext
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.AssertionResult
import typingsJapgolly.jestTestResult.typesMod.Suite
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BaseReporter ()
    extends typingsJapgolly.jestReporters.baseReporterMod.BaseReporter {
    /* CompleteClass */
    /* protected */ override def _setError(error: js.Error): Unit = js.native
    /* CompleteClass */
    override def getLastError(): js.Error | Unit = js.native
    /* CompleteClass */
    override def log(message: String): Unit = js.native
    /* CompleteClass */
    override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
  }
  
  @js.native
  class CoverageReporter protected () extends default {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
  
  @js.native
  class DefaultReporter protected ()
    extends typingsJapgolly.jestReporters.defaultReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class NotifyReporter protected ()
    extends typingsJapgolly.jestReporters.notifyReporterMod.default {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class SummaryReporter protected ()
    extends typingsJapgolly.jestReporters.summaryReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class VerboseReporter protected ()
    extends typingsJapgolly.jestReporters.verboseReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object VerboseReporter extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
}

