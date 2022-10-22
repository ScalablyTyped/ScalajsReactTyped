package typingsJapgolly.nrwlJest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExecutorsJestSchemaMod {
  
  trait JestExecutorOptions extends StObject {
    
    var bail: js.UndefOr[Boolean | Double] = js.undefined
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var ci: js.UndefOr[Boolean] = js.undefined
    
    var clearCache: js.UndefOr[Boolean] = js.undefined
    
    var codeCoverage: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var coverageDirectory: js.UndefOr[String] = js.undefined
    
    var coverageReporters: js.UndefOr[js.Array[String]] = js.undefined
    
    var detectLeaks: js.UndefOr[Boolean] = js.undefined
    
    var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
    
    var findRelatedTests: js.UndefOr[String] = js.undefined
    
    var jestConfig: String
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var logHeapUsage: js.UndefOr[Boolean] = js.undefined
    
    var maxWorkers: js.UndefOr[Double | String] = js.undefined
    
    var onlyChanged: js.UndefOr[Boolean] = js.undefined
    
    var outputFile: js.UndefOr[String] = js.undefined
    
    var passWithNoTests: js.UndefOr[Boolean] = js.undefined
    
    var reporters: js.UndefOr[js.Array[String]] = js.undefined
    
    var runInBand: js.UndefOr[Boolean] = js.undefined
    
    var setupFile: js.UndefOr[String] = js.undefined
    
    var showConfig: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var testFile: js.UndefOr[String] = js.undefined
    
    var testLocationInResults: js.UndefOr[Boolean] = js.undefined
    
    var testNamePattern: js.UndefOr[String] = js.undefined
    
    var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var testPathPattern: js.UndefOr[js.Array[String]] = js.undefined
    
    var testResultsProcessor: js.UndefOr[String] = js.undefined
    
    var testTimeout: js.UndefOr[Double] = js.undefined
    
    var updateSnapshot: js.UndefOr[Boolean] = js.undefined
    
    var useStderr: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var watchAll: js.UndefOr[Boolean] = js.undefined
  }
  object JestExecutorOptions {
    
    inline def apply(jestConfig: String): JestExecutorOptions = {
      val __obj = js.Dynamic.literal(jestConfig = jestConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestExecutorOptions]
    }
    
    extension [Self <: JestExecutorOptions](x: Self) {
      
      inline def setBail(value: Boolean | Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      inline def setClearCache(value: Boolean): Self = StObject.set(x, "clearCache", value.asInstanceOf[js.Any])
      
      inline def setClearCacheUndefined: Self = StObject.set(x, "clearCache", js.undefined)
      
      inline def setCodeCoverage(value: Boolean): Self = StObject.set(x, "codeCoverage", value.asInstanceOf[js.Any])
      
      inline def setCodeCoverageUndefined: Self = StObject.set(x, "codeCoverage", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
      
      inline def setCoverageReporters(value: js.Array[String]): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
      
      inline def setCoverageReportersVarargs(value: String*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
      
      inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
      
      inline def setDetectLeaksUndefined: Self = StObject.set(x, "detectLeaks", js.undefined)
      
      inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
      
      inline def setDetectOpenHandlesUndefined: Self = StObject.set(x, "detectOpenHandles", js.undefined)
      
      inline def setFindRelatedTests(value: String): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
      
      inline def setJestConfig(value: String): Self = StObject.set(x, "jestConfig", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLogHeapUsage(value: Boolean): Self = StObject.set(x, "logHeapUsage", value.asInstanceOf[js.Any])
      
      inline def setLogHeapUsageUndefined: Self = StObject.set(x, "logHeapUsage", js.undefined)
      
      inline def setMaxWorkers(value: Double | String): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setOnlyChanged(value: Boolean): Self = StObject.set(x, "onlyChanged", value.asInstanceOf[js.Any])
      
      inline def setOnlyChangedUndefined: Self = StObject.set(x, "onlyChanged", js.undefined)
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
      
      inline def setPassWithNoTestsUndefined: Self = StObject.set(x, "passWithNoTests", js.undefined)
      
      inline def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setRunInBand(value: Boolean): Self = StObject.set(x, "runInBand", value.asInstanceOf[js.Any])
      
      inline def setRunInBandUndefined: Self = StObject.set(x, "runInBand", js.undefined)
      
      inline def setSetupFile(value: String): Self = StObject.set(x, "setupFile", value.asInstanceOf[js.Any])
      
      inline def setSetupFileUndefined: Self = StObject.set(x, "setupFile", js.undefined)
      
      inline def setShowConfig(value: Boolean): Self = StObject.set(x, "showConfig", value.asInstanceOf[js.Any])
      
      inline def setShowConfigUndefined: Self = StObject.set(x, "showConfig", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTestFile(value: String): Self = StObject.set(x, "testFile", value.asInstanceOf[js.Any])
      
      inline def setTestFileUndefined: Self = StObject.set(x, "testFile", js.undefined)
      
      inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
      
      inline def setTestLocationInResultsUndefined: Self = StObject.set(x, "testLocationInResults", js.undefined)
      
      inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestPathIgnorePatternsUndefined: Self = StObject.set(x, "testPathIgnorePatterns", js.undefined)
      
      inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value*))
      
      inline def setTestPathPattern(value: js.Array[String]): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
      
      inline def setTestPathPatternUndefined: Self = StObject.set(x, "testPathPattern", js.undefined)
      
      inline def setTestPathPatternVarargs(value: String*): Self = StObject.set(x, "testPathPattern", js.Array(value*))
      
      inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
      
      inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
      
      inline def setUpdateSnapshot(value: Boolean): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
      
      inline def setUpdateSnapshotUndefined: Self = StObject.set(x, "updateSnapshot", js.undefined)
      
      inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
      
      inline def setUseStderrUndefined: Self = StObject.set(x, "useStderr", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchAll(value: Boolean): Self = StObject.set(x, "watchAll", value.asInstanceOf[js.Any])
      
      inline def setWatchAllUndefined: Self = StObject.set(x, "watchAll", js.undefined)
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
