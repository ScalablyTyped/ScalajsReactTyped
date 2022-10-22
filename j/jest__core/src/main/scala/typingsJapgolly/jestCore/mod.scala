package typingsJapgolly.jestCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.jestChangedFiles.mod.ChangedFiles
import typingsJapgolly.jestCore.anon.Filtered
import typingsJapgolly.jestReporters.mod.BaseReporter
import typingsJapgolly.jestReporters.mod.Reporter
import typingsJapgolly.jestReporters.mod.ReporterContext
import typingsJapgolly.jestTestResult.mod.AggregatedResult
import typingsJapgolly.jestTestResult.mod.Test
import typingsJapgolly.jestTestResult.mod.TestContext
import typingsJapgolly.jestTypes.mod.Argv
import typingsJapgolly.jestTypes.mod.GlobalConfig
import typingsJapgolly.jestWatcher.mod.TestWatcher
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jest/core", "SearchSource")
  @js.native
  open class SearchSource protected () extends StObject {
    def this(context: TestContext) = this()
    
    /* private */ val _context: Any = js.native
    
    /* private */ var _dependencyResolver: Any = js.native
    
    /* private */ var _filterTestPathsWithStats: Any = js.native
    
    /* private */ var _getAllTestPaths: Any = js.native
    
    /* private */ var _getOrBuildDependencyResolver: Any = js.native
    
    /* private */ var _getTestPaths: Any = js.native
    
    /* private */ val _testPathCases: Any = js.native
    
    def filterPathsWin32(paths: js.Array[String]): js.Array[String] = js.native
    
    def findMatchingTests(testPathPattern: String): SearchResult = js.native
    
    def findRelatedSourcesFromTestsInChangedFiles(changedFilesInfo: ChangedFiles): js.Promise[js.Array[String]] = js.native
    
    def findRelatedTests(allPaths: Set[String], collectCoverage: Boolean): js.Promise[SearchResult] = js.native
    
    def findRelatedTestsFromPattern(paths: js.Array[String], collectCoverage: Boolean): js.Promise[SearchResult] = js.native
    
    def findTestRelatedToChangedFiles(changedFilesInfo: ChangedFiles, collectCoverage: Boolean): js.Promise[SearchResult] = js.native
    
    def findTestsByPaths(paths: js.Array[String]): SearchResult = js.native
    
    def getTestPaths(globalConfig: GlobalConfig): js.Promise[SearchResult] = js.native
    def getTestPaths(globalConfig: GlobalConfig, changedFiles: Unit, filter: Filter): js.Promise[SearchResult] = js.native
    def getTestPaths(globalConfig: GlobalConfig, changedFiles: ChangedFiles): js.Promise[SearchResult] = js.native
    def getTestPaths(globalConfig: GlobalConfig, changedFiles: ChangedFiles, filter: Filter): js.Promise[SearchResult] = js.native
    
    def isTestFilePath(path: String): Boolean = js.native
  }
  
  inline def createTestScheduler(globalConfig: GlobalConfig, context: TestSchedulerContext): js.Promise[TestScheduler] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestScheduler")(globalConfig.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestScheduler]]
  
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  inline def runCLI(argv: Argv, projects: js.Array[String]): js.Promise[typingsJapgolly.jestCore.anon.GlobalConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCLI")(argv.asInstanceOf[js.Any], projects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.jestCore.anon.GlobalConfig]]
  
  type Filter = js.Function1[/* testPaths */ js.Array[String], js.Promise[Filtered]]
  
  trait FilterResult extends StObject {
    
    var message: String
    
    var test: String
  }
  object FilterResult {
    
    inline def apply(message: String, test: String): FilterResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterResult]
    }
    
    extension [Self <: FilterResult](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  type ReporterConstructor = Instantiable3[
    /* globalConfig */ GlobalConfig, 
    /* reporterConfig */ Record[String, Any], 
    /* reporterContext */ ReporterContext, 
    BaseReporter
  ]
  
  trait SearchResult extends StObject {
    
    var collectCoverageFrom: js.UndefOr[Set[String]] = js.undefined
    
    var noSCM: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[Stats] = js.undefined
    
    var tests: js.Array[Test]
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object SearchResult {
    
    inline def apply(tests: js.Array[Test]): SearchResult = {
      val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    extension [Self <: SearchResult](x: Self) {
      
      inline def setCollectCoverageFrom(value: Set[String]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
      
      inline def setNoSCM(value: Boolean): Self = StObject.set(x, "noSCM", value.asInstanceOf[js.Any])
      
      inline def setNoSCMUndefined: Self = StObject.set(x, "noSCM", js.undefined)
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait Stats extends StObject {
    
    var roots: Double
    
    var testMatch: Double
    
    var testPathIgnorePatterns: Double
    
    var testPathPattern: js.UndefOr[Double] = js.undefined
    
    var testRegex: Double
  }
  object Stats {
    
    inline def apply(roots: Double, testMatch: Double, testPathIgnorePatterns: Double, testRegex: Double): Stats = {
      val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setRoots(value: Double): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setTestMatch(value: Double): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      inline def setTestPathIgnorePatterns(value: Double): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestPathPattern(value: Double): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
      
      inline def setTestPathPatternUndefined: Self = StObject.set(x, "testPathPattern", js.undefined)
      
      inline def setTestRegex(value: Double): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestScheduler extends StObject {
    
    /* private */ var _addCustomReporter: Any
    
    /* private */ var _bailIfNeeded: Any
    
    /* private */ val _context: Any
    
    /* private */ val _dispatcher: Any
    
    /* private */ val _globalConfig: Any
    
    /* private */ var _partitionTests: Any
    
    def _setupReporters(): js.Promise[Unit]
    
    def addReporter(reporter: Reporter): Unit
    
    def removeReporter(reporterConstructor: ReporterConstructor): Unit
    
    def scheduleTests(tests: js.Array[Test], watcher: TestWatcher): js.Promise[AggregatedResult]
  }
  object TestScheduler {
    
    inline def apply(
      _addCustomReporter: Any,
      _bailIfNeeded: Any,
      _context: Any,
      _dispatcher: Any,
      _globalConfig: Any,
      _partitionTests: Any,
      _setupReporters: CallbackTo[js.Promise[Unit]],
      addReporter: Reporter => Callback,
      removeReporter: ReporterConstructor => Callback,
      scheduleTests: (js.Array[Test], TestWatcher) => js.Promise[AggregatedResult]
    ): TestScheduler = {
      val __obj = js.Dynamic.literal(_addCustomReporter = _addCustomReporter.asInstanceOf[js.Any], _bailIfNeeded = _bailIfNeeded.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _dispatcher = _dispatcher.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _partitionTests = _partitionTests.asInstanceOf[js.Any], _setupReporters = _setupReporters.toJsFn, addReporter = js.Any.fromFunction1((t0: Reporter) => addReporter(t0).runNow()), removeReporter = js.Any.fromFunction1((t0: ReporterConstructor) => removeReporter(t0).runNow()), scheduleTests = js.Any.fromFunction2(scheduleTests))
      __obj.asInstanceOf[TestScheduler]
    }
    
    extension [Self <: TestScheduler](x: Self) {
      
      inline def setAddReporter(value: Reporter => Callback): Self = StObject.set(x, "addReporter", js.Any.fromFunction1((t0: Reporter) => value(t0).runNow()))
      
      inline def setRemoveReporter(value: ReporterConstructor => Callback): Self = StObject.set(x, "removeReporter", js.Any.fromFunction1((t0: ReporterConstructor) => value(t0).runNow()))
      
      inline def setScheduleTests(value: (js.Array[Test], TestWatcher) => js.Promise[AggregatedResult]): Self = StObject.set(x, "scheduleTests", js.Any.fromFunction2(value))
      
      inline def set_addCustomReporter(value: Any): Self = StObject.set(x, "_addCustomReporter", value.asInstanceOf[js.Any])
      
      inline def set_bailIfNeeded(value: Any): Self = StObject.set(x, "_bailIfNeeded", value.asInstanceOf[js.Any])
      
      inline def set_context(value: Any): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_dispatcher(value: Any): Self = StObject.set(x, "_dispatcher", value.asInstanceOf[js.Any])
      
      inline def set_globalConfig(value: Any): Self = StObject.set(x, "_globalConfig", value.asInstanceOf[js.Any])
      
      inline def set_partitionTests(value: Any): Self = StObject.set(x, "_partitionTests", value.asInstanceOf[js.Any])
      
      inline def set_setupReporters(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "_setupReporters", value.toJsFn)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.jestRunner.mod.TestRunnerContext because var conflicts: changedFiles, sourcesRelatedToTestsInChangedFiles. Inlined  */ trait TestSchedulerContext
    extends StObject
       with ReporterContext
  object TestSchedulerContext {
    
    inline def apply(firstRun: Boolean, previousSuccess: Boolean): TestSchedulerContext = {
      val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], previousSuccess = previousSuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestSchedulerContext]
    }
  }
}
