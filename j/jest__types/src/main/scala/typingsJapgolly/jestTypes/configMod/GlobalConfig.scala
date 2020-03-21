package typingsJapgolly.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jestTypes.AnonConfig
import typingsJapgolly.jestTypes.jestTypesStrings.`json-summary`
import typingsJapgolly.jestTypes.jestTypesStrings.`text-lcov`
import typingsJapgolly.jestTypes.jestTypesStrings.`text-summary`
import typingsJapgolly.jestTypes.jestTypesStrings.clover
import typingsJapgolly.jestTypes.jestTypesStrings.cobertura
import typingsJapgolly.jestTypes.jestTypesStrings.html
import typingsJapgolly.jestTypes.jestTypesStrings.json_
import typingsJapgolly.jestTypes.jestTypesStrings.lcovonly
import typingsJapgolly.jestTypes.jestTypesStrings.none
import typingsJapgolly.jestTypes.jestTypesStrings.teamcity
import typingsJapgolly.jestTypes.jestTypesStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var bail: Double
  var changedFilesWithAncestor: Boolean
  var changedSince: String
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.undefined
  var coverageDirectory: String
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var coverageReporters: js.Array[
    clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
  ]
  var coverageThreshold: CoverageThreshold
  var detectLeaks: Boolean
  var detectOpenHandles: Boolean
  var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]] | Null] = js.undefined
  var errorOnDeprecated: Boolean
  var expand: Boolean
  var extraGlobals: js.Array[String]
  var filter: js.UndefOr[Path | Null] = js.undefined
  var findRelatedTests: Boolean
  var forceExit: Boolean
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  var json: Boolean
  var lastCommit: Boolean
  var listTests: Boolean
  var logHeapUsage: Boolean
  var maxConcurrency: Double
  var maxWorkers: Double
  var noSCM: js.UndefOr[Boolean | Null] = js.undefined
  var noStackTrace: Boolean
  var nonFlagArgs: js.Array[String]
  var notifyMode: NotifyMode
  @JSName("notify")
  var notify_FGlobalConfig: Boolean
  var onlyChanged: Boolean
  var onlyFailures: Boolean
  var outputFile: js.UndefOr[Path | Null] = js.undefined
  var passWithNoTests: Boolean
  var projects: js.Array[Glob]
  var replname: js.UndefOr[String | Null] = js.undefined
  var reporters: js.Array[String | ReporterConfig]
  var rootDir: Path
  var runTestsByPath: Boolean
  var silent: Boolean
  var skipFilter: Boolean
  var testFailureExitCode: Double
  var testNamePattern: String
  var testPathPattern: String
  var testResultsProcessor: js.UndefOr[String | Null] = js.undefined
  var testSequencer: String
  var testTimeout: Double
  var updateSnapshot: SnapshotUpdateState
  var useStderr: Boolean
  var verbose: js.UndefOr[Boolean | Null] = js.undefined
  var watch: Boolean
  var watchAll: Boolean
  var watchPlugins: js.UndefOr[js.Array[AnonConfig] | Null] = js.undefined
  var watchman: Boolean
}

object GlobalConfig {
  @scala.inline
  def apply(
    bail: Double,
    changedFilesWithAncestor: Boolean,
    changedSince: String,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    coverageDirectory: String,
    coverageReporters: js.Array[
      clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
    ],
    coverageThreshold: CoverageThreshold,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    extraGlobals: js.Array[String],
    findRelatedTests: Boolean,
    forceExit: Boolean,
    json: Boolean,
    lastCommit: Boolean,
    listTests: Boolean,
    logHeapUsage: Boolean,
    maxConcurrency: Double,
    maxWorkers: Double,
    noStackTrace: Boolean,
    nonFlagArgs: js.Array[String],
    notify: Boolean,
    notifyMode: NotifyMode,
    onlyChanged: Boolean,
    onlyFailures: Boolean,
    passWithNoTests: Boolean,
    projects: js.Array[Glob],
    reporters: js.Array[String | ReporterConfig],
    rootDir: Path,
    runTestsByPath: Boolean,
    silent: Boolean,
    skipFilter: Boolean,
    testFailureExitCode: Double,
    testNamePattern: String,
    testPathPattern: String,
    testSequencer: String,
    testTimeout: Double,
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchman: Boolean,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    coveragePathIgnorePatterns: js.Array[String] = null,
    enabledTestsMap: StringDictionary[StringDictionary[Boolean]] = null,
    filter: Path = null,
    globalSetup: String = null,
    globalTeardown: String = null,
    noSCM: js.UndefOr[Boolean] = js.undefined,
    outputFile: Path = null,
    replname: String = null,
    testResultsProcessor: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watchPlugins: js.Array[AnonConfig] = null
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], changedSince = changedSince.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns.asInstanceOf[js.Any])
    if (enabledTestsMap != null) __obj.updateDynamic("enabledTestsMap")(enabledTestsMap.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM.asInstanceOf[js.Any])
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    if (replname != null) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (watchPlugins != null) __obj.updateDynamic("watchPlugins")(watchPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

