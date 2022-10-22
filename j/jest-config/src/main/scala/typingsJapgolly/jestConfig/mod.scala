package typingsJapgolly.jestConfig

import typingsJapgolly.jestConfig.anon.Config
import typingsJapgolly.jestConfig.anon.Configs
import typingsJapgolly.jestConfig.anon.HasDeprecationWarnings
import typingsJapgolly.jestSchemas.mod.SnapshotFormat
import typingsJapgolly.jestTypes.mod.Argv
import typingsJapgolly.jestTypes.mod.ConfigGlobals
import typingsJapgolly.jestTypes.mod.CoverageProvider
import typingsJapgolly.jestTypes.mod.CoverageReporterName
import typingsJapgolly.jestTypes.mod.CoverageReporterWithOptions
import typingsJapgolly.jestTypes.mod.CoverageReporters
import typingsJapgolly.jestTypes.mod.CoverageThreshold
import typingsJapgolly.jestTypes.mod.DefaultOptions
import typingsJapgolly.jestTypes.mod.FakeTimers
import typingsJapgolly.jestTypes.mod.GlobalConfig
import typingsJapgolly.jestTypes.mod.HasteConfig
import typingsJapgolly.jestTypes.mod.InitialOptions
import typingsJapgolly.jestTypes.mod.NotifyMode
import typingsJapgolly.jestTypes.mod.ProjectConfig
import typingsJapgolly.jestTypes.mod.ReporterConfig
import typingsJapgolly.jestTypes.mod.ShardConfig
import typingsJapgolly.jestTypes.mod.SnapshotUpdateState
import typingsJapgolly.jestValidate.mod.DeprecatedOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-config", "defaults")
  @js.native
  val defaults: DefaultOptions = js.native
  
  @JSImport("jest-config", "deprecationEntries")
  @js.native
  val deprecationEntries: DeprecatedOptions = js.native
  
  /* Inlined {[ key in keyof @jest/types.@jest/types.InitialOptions ]: string} */
  object descriptions {
    
    @JSImport("jest-config", "descriptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-config", "descriptions.automock")
    @js.native
    def automock: js.UndefOr[String] = js.native
    inline def automock_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("automock")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.bail")
    @js.native
    def bail: js.UndefOr[String] = js.native
    inline def bail_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bail")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.cache")
    @js.native
    def cache: js.UndefOr[String] = js.native
    
    @JSImport("jest-config", "descriptions.cacheDirectory")
    @js.native
    def cacheDirectory: js.UndefOr[String] = js.native
    inline def cacheDirectory_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(x.asInstanceOf[js.Any])
    
    inline def cache_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.changedFilesWithAncestor")
    @js.native
    def changedFilesWithAncestor: js.UndefOr[String] = js.native
    inline def changedFilesWithAncestor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changedFilesWithAncestor")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.changedSince")
    @js.native
    def changedSince: js.UndefOr[String] = js.native
    inline def changedSince_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changedSince")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.ci")
    @js.native
    def ci: js.UndefOr[String] = js.native
    inline def ci_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ci")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.clearMocks")
    @js.native
    def clearMocks: js.UndefOr[String] = js.native
    inline def clearMocks_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearMocks")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.collectCoverage")
    @js.native
    def collectCoverage: js.UndefOr[String] = js.native
    
    @JSImport("jest-config", "descriptions.collectCoverageFrom")
    @js.native
    def collectCoverageFrom: js.UndefOr[String] = js.native
    inline def collectCoverageFrom_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(x.asInstanceOf[js.Any])
    
    inline def collectCoverage_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectCoverage")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.coverageDirectory")
    @js.native
    def coverageDirectory: js.UndefOr[String] = js.native
    inline def coverageDirectory_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.coveragePathIgnorePatterns")
    @js.native
    def coveragePathIgnorePatterns: js.UndefOr[String] = js.native
    inline def coveragePathIgnorePatterns_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coveragePathIgnorePatterns")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.coverageProvider")
    @js.native
    def coverageProvider: js.UndefOr[String] = js.native
    inline def coverageProvider_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverageProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.coverageReporters")
    @js.native
    def coverageReporters: js.UndefOr[String] = js.native
    inline def coverageReporters_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverageReporters")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.coverageThreshold")
    @js.native
    def coverageThreshold: js.UndefOr[String] = js.native
    inline def coverageThreshold_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverageThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.dependencyExtractor")
    @js.native
    def dependencyExtractor: js.UndefOr[String] = js.native
    inline def dependencyExtractor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.detectLeaks")
    @js.native
    def detectLeaks: js.UndefOr[String] = js.native
    inline def detectLeaks_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detectLeaks")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.detectOpenHandles")
    @js.native
    def detectOpenHandles: js.UndefOr[String] = js.native
    inline def detectOpenHandles_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detectOpenHandles")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.errorOnDeprecated")
    @js.native
    def errorOnDeprecated: js.UndefOr[String] = js.native
    inline def errorOnDeprecated_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorOnDeprecated")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.expand")
    @js.native
    def expand: js.UndefOr[String] = js.native
    inline def expand_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.extensionsToTreatAsEsm")
    @js.native
    def extensionsToTreatAsEsm: js.UndefOr[String] = js.native
    inline def extensionsToTreatAsEsm_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsToTreatAsEsm")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.fakeTimers")
    @js.native
    def fakeTimers: js.UndefOr[String] = js.native
    inline def fakeTimers_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fakeTimers")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.filter")
    @js.native
    def filter: js.UndefOr[String] = js.native
    inline def filter_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.findRelatedTests")
    @js.native
    def findRelatedTests: js.UndefOr[String] = js.native
    inline def findRelatedTests_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findRelatedTests")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.forceCoverageMatch")
    @js.native
    def forceCoverageMatch: js.UndefOr[String] = js.native
    inline def forceCoverageMatch_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceCoverageMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.forceExit")
    @js.native
    def forceExit: js.UndefOr[String] = js.native
    inline def forceExit_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceExit")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.globalSetup")
    @js.native
    def globalSetup: js.UndefOr[String] = js.native
    inline def globalSetup_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalSetup")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.globalTeardown")
    @js.native
    def globalTeardown: js.UndefOr[String] = js.native
    inline def globalTeardown_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalTeardown")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.globals")
    @js.native
    def globals: js.UndefOr[String] = js.native
    inline def globals_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globals")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.haste")
    @js.native
    def haste: js.UndefOr[String] = js.native
    inline def haste_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("haste")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.id")
    @js.native
    def id: js.UndefOr[String] = js.native
    inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.injectGlobals")
    @js.native
    def injectGlobals: js.UndefOr[String] = js.native
    inline def injectGlobals_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("injectGlobals")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.json")
    @js.native
    def json: js.UndefOr[String] = js.native
    inline def json_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.lastCommit")
    @js.native
    def lastCommit: js.UndefOr[String] = js.native
    inline def lastCommit_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastCommit")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.listTests")
    @js.native
    def listTests: js.UndefOr[String] = js.native
    inline def listTests_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listTests")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.logHeapUsage")
    @js.native
    def logHeapUsage: js.UndefOr[String] = js.native
    inline def logHeapUsage_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logHeapUsage")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.maxConcurrency")
    @js.native
    def maxConcurrency: js.UndefOr[String] = js.native
    inline def maxConcurrency_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.maxWorkers")
    @js.native
    def maxWorkers: js.UndefOr[String] = js.native
    inline def maxWorkers_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.moduleDirectories")
    @js.native
    def moduleDirectories: js.UndefOr[String] = js.native
    inline def moduleDirectories_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectories")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.moduleFileExtensions")
    @js.native
    def moduleFileExtensions: js.UndefOr[String] = js.native
    inline def moduleFileExtensions_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleFileExtensions")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.moduleNameMapper")
    @js.native
    def moduleNameMapper: js.UndefOr[String] = js.native
    inline def moduleNameMapper_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleNameMapper")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.modulePathIgnorePatterns")
    @js.native
    def modulePathIgnorePatterns: js.UndefOr[String] = js.native
    inline def modulePathIgnorePatterns_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulePathIgnorePatterns")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.modulePaths")
    @js.native
    def modulePaths: js.UndefOr[String] = js.native
    inline def modulePaths_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulePaths")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.noStackTrace")
    @js.native
    def noStackTrace: js.UndefOr[String] = js.native
    inline def noStackTrace_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noStackTrace")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.notifyMode")
    @js.native
    def notifyMode: js.UndefOr[String] = js.native
    inline def notifyMode_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifyMode")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.notify")
    @js.native
    def notify_ : js.UndefOr[String] = js.native
    
    inline def notify__=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notify")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.onlyChanged")
    @js.native
    def onlyChanged: js.UndefOr[String] = js.native
    inline def onlyChanged_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyChanged")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.onlyFailures")
    @js.native
    def onlyFailures: js.UndefOr[String] = js.native
    inline def onlyFailures_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyFailures")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.outputFile")
    @js.native
    def outputFile: js.UndefOr[String] = js.native
    inline def outputFile_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputFile")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.passWithNoTests")
    @js.native
    def passWithNoTests: js.UndefOr[String] = js.native
    inline def passWithNoTests_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passWithNoTests")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.preset")
    @js.native
    def preset: js.UndefOr[String] = js.native
    inline def preset_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preset")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.prettierPath")
    @js.native
    def prettierPath: js.UndefOr[String] = js.native
    inline def prettierPath_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prettierPath")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.projects")
    @js.native
    def projects: js.UndefOr[String] = js.native
    inline def projects_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("projects")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.replname")
    @js.native
    def replname: js.UndefOr[String] = js.native
    inline def replname_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replname")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.reporters")
    @js.native
    def reporters: js.UndefOr[String] = js.native
    inline def reporters_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reporters")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.resetMocks")
    @js.native
    def resetMocks: js.UndefOr[String] = js.native
    inline def resetMocks_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetMocks")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.resetModules")
    @js.native
    def resetModules: js.UndefOr[String] = js.native
    inline def resetModules_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetModules")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.resolver")
    @js.native
    def resolver: js.UndefOr[String] = js.native
    inline def resolver_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolver")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.restoreMocks")
    @js.native
    def restoreMocks: js.UndefOr[String] = js.native
    inline def restoreMocks_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restoreMocks")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.rootDir")
    @js.native
    def rootDir: js.UndefOr[String] = js.native
    inline def rootDir_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.roots")
    @js.native
    def roots: js.UndefOr[String] = js.native
    inline def roots_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roots")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.runTestsByPath")
    @js.native
    def runTestsByPath: js.UndefOr[String] = js.native
    inline def runTestsByPath_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runTestsByPath")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.runner")
    @js.native
    def runner: js.UndefOr[String] = js.native
    inline def runner_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runner")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.runtime")
    @js.native
    def runtime: js.UndefOr[String] = js.native
    inline def runtime_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtime")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.sandboxInjectedGlobals")
    @js.native
    def sandboxInjectedGlobals: js.UndefOr[String] = js.native
    inline def sandboxInjectedGlobals_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sandboxInjectedGlobals")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.setupFiles")
    @js.native
    def setupFiles: js.UndefOr[String] = js.native
    
    @JSImport("jest-config", "descriptions.setupFilesAfterEnv")
    @js.native
    def setupFilesAfterEnv: js.UndefOr[String] = js.native
    inline def setupFilesAfterEnv_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setupFilesAfterEnv")(x.asInstanceOf[js.Any])
    
    inline def setupFiles_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setupFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.showSeed")
    @js.native
    def showSeed: js.UndefOr[String] = js.native
    inline def showSeed_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showSeed")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.silent")
    @js.native
    def silent: js.UndefOr[String] = js.native
    inline def silent_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silent")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.skipFilter")
    @js.native
    def skipFilter: js.UndefOr[String] = js.native
    inline def skipFilter_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipFilter")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.skipNodeResolution")
    @js.native
    def skipNodeResolution: js.UndefOr[String] = js.native
    inline def skipNodeResolution_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipNodeResolution")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.slowTestThreshold")
    @js.native
    def slowTestThreshold: js.UndefOr[String] = js.native
    inline def slowTestThreshold_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slowTestThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.snapshotFormat")
    @js.native
    def snapshotFormat: js.UndefOr[String] = js.native
    inline def snapshotFormat_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshotFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.snapshotResolver")
    @js.native
    def snapshotResolver: js.UndefOr[String] = js.native
    inline def snapshotResolver_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshotResolver")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.snapshotSerializers")
    @js.native
    def snapshotSerializers: js.UndefOr[String] = js.native
    inline def snapshotSerializers_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshotSerializers")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testEnvironment")
    @js.native
    def testEnvironment: js.UndefOr[String] = js.native
    
    @JSImport("jest-config", "descriptions.testEnvironmentOptions")
    @js.native
    def testEnvironmentOptions: js.UndefOr[String] = js.native
    inline def testEnvironmentOptions_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testEnvironmentOptions")(x.asInstanceOf[js.Any])
    
    inline def testEnvironment_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testFailureExitCode")
    @js.native
    def testFailureExitCode: js.UndefOr[String] = js.native
    inline def testFailureExitCode_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testFailureExitCode")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testLocationInResults")
    @js.native
    def testLocationInResults: js.UndefOr[String] = js.native
    inline def testLocationInResults_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testLocationInResults")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testMatch")
    @js.native
    def testMatch: js.UndefOr[String] = js.native
    inline def testMatch_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testNamePattern")
    @js.native
    def testNamePattern: js.UndefOr[String] = js.native
    inline def testNamePattern_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testPathIgnorePatterns")
    @js.native
    def testPathIgnorePatterns: js.UndefOr[String] = js.native
    inline def testPathIgnorePatterns_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testPathIgnorePatterns")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testRegex")
    @js.native
    def testRegex: js.UndefOr[String] = js.native
    inline def testRegex_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testResultsProcessor")
    @js.native
    def testResultsProcessor: js.UndefOr[String] = js.native
    inline def testResultsProcessor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testResultsProcessor")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testRunner")
    @js.native
    def testRunner: js.UndefOr[String] = js.native
    inline def testRunner_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testSequencer")
    @js.native
    def testSequencer: js.UndefOr[String] = js.native
    inline def testSequencer_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testSequencer")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.testTimeout")
    @js.native
    def testTimeout: js.UndefOr[String] = js.native
    inline def testTimeout_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.transform")
    @js.native
    def transform: js.UndefOr[String] = js.native
    
    @JSImport("jest-config", "descriptions.transformIgnorePatterns")
    @js.native
    def transformIgnorePatterns: js.UndefOr[String] = js.native
    inline def transformIgnorePatterns_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformIgnorePatterns")(x.asInstanceOf[js.Any])
    
    inline def transform_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transform")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.unmockedModulePathPatterns")
    @js.native
    def unmockedModulePathPatterns: js.UndefOr[String] = js.native
    inline def unmockedModulePathPatterns_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmockedModulePathPatterns")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.updateSnapshot")
    @js.native
    def updateSnapshot: js.UndefOr[String] = js.native
    inline def updateSnapshot_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.useStderr")
    @js.native
    def useStderr: js.UndefOr[String] = js.native
    inline def useStderr_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useStderr")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.verbose")
    @js.native
    def verbose: js.UndefOr[String] = js.native
    inline def verbose_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.watch")
    @js.native
    def watch: js.UndefOr[String] = js.native
    
    @JSImport("jest-config", "descriptions.watchAll")
    @js.native
    def watchAll: js.UndefOr[String] = js.native
    inline def watchAll_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watchAll")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.watchPathIgnorePatterns")
    @js.native
    def watchPathIgnorePatterns: js.UndefOr[String] = js.native
    inline def watchPathIgnorePatterns_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watchPathIgnorePatterns")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.watchPlugins")
    @js.native
    def watchPlugins: js.UndefOr[String] = js.native
    inline def watchPlugins_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watchPlugins")(x.asInstanceOf[js.Any])
    
    inline def watch_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watch")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.watchman")
    @js.native
    def watchman: js.UndefOr[String] = js.native
    inline def watchman_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watchman")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-config", "descriptions.workerIdleMemoryLimit")
    @js.native
    def workerIdleMemoryLimit: js.UndefOr[String] = js.native
    inline def workerIdleMemoryLimit_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerIdleMemoryLimit")(x.asInstanceOf[js.Any])
  }
  
  inline def isJSONString(): /* is jest-config.jest-config.JSONString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONString")().asInstanceOf[/* is jest-config.jest-config.JSONString */ Boolean]
  inline def isJSONString(text: JSONString | String): /* is jest-config.jest-config.JSONString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONString")(text.asInstanceOf[js.Any]).asInstanceOf[/* is jest-config.jest-config.JSONString */ Boolean]
  
  inline def normalize(initialOptions: InitialOptions, argv: Argv): js.Promise[HasDeprecationWarnings] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(initialOptions.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HasDeprecationWarnings]]
  inline def normalize(initialOptions: InitialOptions, argv: Argv, configPath: String): js.Promise[HasDeprecationWarnings] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(initialOptions.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HasDeprecationWarnings]]
  inline def normalize(initialOptions: InitialOptions, argv: Argv, configPath: String, projectIndex: Double): js.Promise[HasDeprecationWarnings] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(initialOptions.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HasDeprecationWarnings]]
  inline def normalize(initialOptions: InitialOptions, argv: Argv, configPath: Null, projectIndex: Double): js.Promise[HasDeprecationWarnings] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(initialOptions.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HasDeprecationWarnings]]
  inline def normalize(initialOptions: InitialOptions, argv: Argv, configPath: Unit, projectIndex: Double): js.Promise[HasDeprecationWarnings] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(initialOptions.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HasDeprecationWarnings]]
  
  inline def readConfig(argv: Argv, packageRootOrConfig: String): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(argv: Argv, packageRootOrConfig: String, skipArgvConfigOption: Boolean): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Null,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Null,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Null,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Unit,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Unit,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Unit,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(argv: Argv, packageRootOrConfig: String, skipArgvConfigOption: Unit, parentConfigDirname: String): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Null,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Null,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Null,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Unit,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Unit,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: String,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Unit,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(argv: Argv, packageRootOrConfig: InitialOptions): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(argv: Argv, packageRootOrConfig: InitialOptions, skipArgvConfigOption: Boolean): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: String,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Null,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Null,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Null,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Unit,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Unit,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigDirname: Unit,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: String,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Null,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Null,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Null,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Unit,
    projectIndex: Double
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Unit,
    projectIndex: Double,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  inline def readConfig(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Unit,
    parentConfigDirname: Unit,
    projectIndex: Unit,
    skipMultipleConfigError: Boolean
  ): js.Promise[ReadConfig_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfig")(argv.asInstanceOf[js.Any], packageRootOrConfig.asInstanceOf[js.Any], skipArgvConfigOption.asInstanceOf[js.Any], parentConfigDirname.asInstanceOf[js.Any], projectIndex.asInstanceOf[js.Any], skipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfig_]]
  
  inline def readConfigs(argv: Argv, projectPaths: js.Array[String]): js.Promise[Configs] = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigs")(argv.asInstanceOf[js.Any], projectPaths.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configs]]
  
  inline def readInitialOptions(): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("readInitialOptions")().asInstanceOf[js.Promise[Config]]
  inline def readInitialOptions(config: String): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("readInitialOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config]]
  inline def readInitialOptions(
    config: String,
    hasPackageRootOrConfigParentConfigDirnameReadFromCwdSkipMultipleConfigError: ReadJestConfigOptions
  ): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInitialOptions")(config.asInstanceOf[js.Any], hasPackageRootOrConfigParentConfigDirnameReadFromCwdSkipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def readInitialOptions(
    config: Unit,
    hasPackageRootOrConfigParentConfigDirnameReadFromCwdSkipMultipleConfigError: ReadJestConfigOptions
  ): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInitialOptions")(config.asInstanceOf[js.Any], hasPackageRootOrConfigParentConfigDirnameReadFromCwdSkipMultipleConfigError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  
  inline def replaceRootDirInPath(rootDir: String, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRootDirInPath")(rootDir.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.jestTypes.mod.GlobalConfig because var conflicts: coveragePathIgnorePatterns, detectLeaks, detectOpenHandles, errorOnDeprecated, filter, globalSetup, globalTeardown, rootDir, skipFilter, snapshotFormat, workerIdleMemoryLimit. Inlined projects, testPathPattern, notifyMode, maxWorkers, coverageProvider, onlyFailures, coverageReporters, watchAll, seed, collectCoverageFrom, noSCM, replname, changedSince, testTimeout, lastCommit, forceExit, findRelatedTests, updateSnapshot, notify_FGlobalConfig, expand, testFailureExitCode, testResultsProcessor, json, runTestsByPath, logHeapUsage, testNamePattern, coverageDirectory, coverageThreshold, testSequencer, changedFilesWithAncestor, collectCoverage, onlyChanged, showSeed, listTests, outputFile, useStderr, noStackTrace, watchman, nonFlagArgs, reporters, shard, passWithNoTests, verbose, watchPlugins, maxConcurrency, ci, bail, watch, silent */ trait AllOptions
    extends StObject
       with ProjectConfig {
    
    var bail: Double
    
    var changedFilesWithAncestor: Boolean
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var ci: Boolean
    
    var collectCoverage: Boolean
    
    var collectCoverageFrom: js.Array[String]
    
    var coverageDirectory: String
    
    var coverageProvider: CoverageProvider
    
    var coverageReporters: CoverageReporters
    
    var coverageThreshold: js.UndefOr[CoverageThreshold] = js.undefined
    
    var expand: Boolean
    
    var findRelatedTests: Boolean
    
    var forceExit: Boolean
    
    var json: Boolean
    
    var lastCommit: Boolean
    
    var listTests: Boolean
    
    var logHeapUsage: Boolean
    
    var maxConcurrency: Double
    
    var maxWorkers: Double
    
    var noSCM: js.UndefOr[Boolean] = js.undefined
    
    var noStackTrace: Boolean
    
    var nonFlagArgs: js.Array[String]
    
    var notifyMode: NotifyMode
    
    @JSName("notify")
    var notify_FGlobalConfig: Boolean
    
    var onlyChanged: Boolean
    
    var onlyFailures: Boolean
    
    var outputFile: js.UndefOr[String] = js.undefined
    
    var passWithNoTests: Boolean
    
    var projects: js.Array[String]
    
    var replname: js.UndefOr[String] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ReporterConfig]] = js.undefined
    
    var runTestsByPath: Boolean
    
    var seed: Double
    
    var shard: js.UndefOr[ShardConfig] = js.undefined
    
    var showSeed: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var testFailureExitCode: Double
    
    var testNamePattern: js.UndefOr[String] = js.undefined
    
    var testPathPattern: String
    
    var testResultsProcessor: js.UndefOr[String] = js.undefined
    
    var testSequencer: String
    
    var testTimeout: js.UndefOr[Double] = js.undefined
    
    var updateSnapshot: SnapshotUpdateState
    
    var useStderr: Boolean
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: Boolean
    
    var watchAll: Boolean
    
    var watchPlugins: js.UndefOr[js.Array[typingsJapgolly.jestTypes.anon.Config] | Null] = js.undefined
    
    var watchman: Boolean
  }
  object AllOptions {
    
    inline def apply(
      automock: Boolean,
      bail: Double,
      cache: Boolean,
      cacheDirectory: String,
      changedFilesWithAncestor: Boolean,
      ci: Boolean,
      clearMocks: Boolean,
      collectCoverage: Boolean,
      collectCoverageFrom: js.Array[String],
      coverageDirectory: String,
      coveragePathIgnorePatterns: js.Array[String],
      coverageProvider: CoverageProvider,
      coverageReporters: CoverageReporters,
      cwd: String,
      detectLeaks: Boolean,
      detectOpenHandles: Boolean,
      errorOnDeprecated: Boolean,
      expand: Boolean,
      extensionsToTreatAsEsm: js.Array[String],
      fakeTimers: FakeTimers,
      findRelatedTests: Boolean,
      forceCoverageMatch: js.Array[String],
      forceExit: Boolean,
      globals: ConfigGlobals,
      haste: HasteConfig,
      id: String,
      injectGlobals: Boolean,
      json: Boolean,
      lastCommit: Boolean,
      listTests: Boolean,
      logHeapUsage: Boolean,
      maxConcurrency: Double,
      maxWorkers: Double,
      moduleDirectories: js.Array[String],
      moduleFileExtensions: js.Array[String],
      moduleNameMapper: js.Array[js.Tuple2[String, String]],
      modulePathIgnorePatterns: js.Array[String],
      noStackTrace: Boolean,
      nonFlagArgs: js.Array[String],
      notifyMode: NotifyMode,
      notify_ : Boolean,
      onlyChanged: Boolean,
      onlyFailures: Boolean,
      passWithNoTests: Boolean,
      prettierPath: String,
      projects: js.Array[String],
      resetMocks: Boolean,
      resetModules: Boolean,
      restoreMocks: Boolean,
      rootDir: String,
      roots: js.Array[String],
      runTestsByPath: Boolean,
      runner: String,
      sandboxInjectedGlobals: js.Array[/* keyof / * globalThis * / any */ String],
      seed: Double,
      setupFiles: js.Array[String],
      setupFilesAfterEnv: js.Array[String],
      skipFilter: Boolean,
      slowTestThreshold: Double,
      snapshotFormat: SnapshotFormat,
      snapshotSerializers: js.Array[String],
      testEnvironment: String,
      testEnvironmentOptions: Record[String, Any],
      testFailureExitCode: Double,
      testLocationInResults: Boolean,
      testMatch: js.Array[String],
      testPathIgnorePatterns: js.Array[String],
      testPathPattern: String,
      testRegex: js.Array[String | js.RegExp],
      testRunner: String,
      testSequencer: String,
      transform: js.Array[js.Tuple3[String, String, Record[String, Any]]],
      transformIgnorePatterns: js.Array[String],
      updateSnapshot: SnapshotUpdateState,
      useStderr: Boolean,
      watch: Boolean,
      watchAll: Boolean,
      watchPathIgnorePatterns: js.Array[String],
      watchman: Boolean
    ): AllOptions = {
      val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], ci = ci.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extensionsToTreatAsEsm = extensionsToTreatAsEsm.asInstanceOf[js.Any], fakeTimers = fakeTimers.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], sandboxInjectedGlobals = sandboxInjectedGlobals.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotFormat = snapshotFormat.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllOptions]
    }
    
    extension [Self <: AllOptions](x: Self) {
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFrom(value: js.Array[String]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromVarargs(value: String*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value*))
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
      
      inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
      
      inline def setCoverageThreshold(value: CoverageThreshold): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
      
      inline def setCoverageThresholdUndefined: Self = StObject.set(x, "coverageThreshold", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
      
      inline def setListTests(value: Boolean): Self = StObject.set(x, "listTests", value.asInstanceOf[js.Any])
      
      inline def setLogHeapUsage(value: Boolean): Self = StObject.set(x, "logHeapUsage", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setNoSCM(value: Boolean): Self = StObject.set(x, "noSCM", value.asInstanceOf[js.Any])
      
      inline def setNoSCMUndefined: Self = StObject.set(x, "noSCM", js.undefined)
      
      inline def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
      
      inline def setNonFlagArgs(value: js.Array[String]): Self = StObject.set(x, "nonFlagArgs", value.asInstanceOf[js.Any])
      
      inline def setNonFlagArgsVarargs(value: String*): Self = StObject.set(x, "nonFlagArgs", js.Array(value*))
      
      inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setOnlyChanged(value: Boolean): Self = StObject.set(x, "onlyChanged", value.asInstanceOf[js.Any])
      
      inline def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
      
      inline def setReplname(value: String): Self = StObject.set(x, "replname", value.asInstanceOf[js.Any])
      
      inline def setReplnameUndefined: Self = StObject.set(x, "replname", js.undefined)
      
      inline def setReporters(value: js.Array[ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ReporterConfig*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setShard(value: ShardConfig): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
      
      inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
      
      inline def setShowSeed(value: Boolean): Self = StObject.set(x, "showSeed", value.asInstanceOf[js.Any])
      
      inline def setShowSeedUndefined: Self = StObject.set(x, "showSeed", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTestFailureExitCode(value: Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
      
      inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      inline def setTestPathPattern(value: String): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
      
      inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
      
      inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
      
      inline def setUpdateSnapshot(value: SnapshotUpdateState): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
      
      inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchAll(value: Boolean): Self = StObject.set(x, "watchAll", value.asInstanceOf[js.Any])
      
      inline def setWatchPlugins(value: js.Array[typingsJapgolly.jestTypes.anon.Config]): Self = StObject.set(x, "watchPlugins", value.asInstanceOf[js.Any])
      
      inline def setWatchPluginsNull: Self = StObject.set(x, "watchPlugins", null)
      
      inline def setWatchPluginsUndefined: Self = StObject.set(x, "watchPlugins", js.undefined)
      
      inline def setWatchPluginsVarargs(value: typingsJapgolly.jestTypes.anon.Config*): Self = StObject.set(x, "watchPlugins", js.Array(value*))
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    }
  }
  
  type JSONString = String
  
  trait ReadConfig_ extends StObject {
    
    var configPath: js.UndefOr[String | Null] = js.undefined
    
    var globalConfig: GlobalConfig
    
    var hasDeprecationWarnings: Boolean
    
    var projectConfig: ProjectConfig
  }
  object ReadConfig_ {
    
    inline def apply(globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean, projectConfig: ProjectConfig): ReadConfig_ = {
      val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadConfig_]
    }
    
    extension [Self <: ReadConfig_](x: Self) {
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathNull: Self = StObject.set(x, "configPath", null)
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setGlobalConfig(value: GlobalConfig): Self = StObject.set(x, "globalConfig", value.asInstanceOf[js.Any])
      
      inline def setHasDeprecationWarnings(value: Boolean): Self = StObject.set(x, "hasDeprecationWarnings", value.asInstanceOf[js.Any])
      
      inline def setProjectConfig(value: ProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadJestConfigOptions extends StObject {
    
    /**
      * The package root or deserialized config (default is cwd)
      */
    var packageRootOrConfig: js.UndefOr[String | InitialOptions] = js.undefined
    
    /**
      * When the `packageRootOrConfig` contains config, this parameter should
      * contain the dirname of the parent config
      */
    var parentConfigDirname: js.UndefOr[Null | String] = js.undefined
    
    /**
      * Indicates whether or not to read the specified config file from disk.
      * When true, jest will read try to read config from the current working directory.
      * (default is false)
      */
    var readFromCwd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether or not to ignore the error of jest finding multiple config files.
      * (default is false)
      */
    var skipMultipleConfigError: js.UndefOr[Boolean] = js.undefined
  }
  object ReadJestConfigOptions {
    
    inline def apply(): ReadJestConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadJestConfigOptions]
    }
    
    extension [Self <: ReadJestConfigOptions](x: Self) {
      
      inline def setPackageRootOrConfig(value: String | InitialOptions): Self = StObject.set(x, "packageRootOrConfig", value.asInstanceOf[js.Any])
      
      inline def setPackageRootOrConfigUndefined: Self = StObject.set(x, "packageRootOrConfig", js.undefined)
      
      inline def setParentConfigDirname(value: String): Self = StObject.set(x, "parentConfigDirname", value.asInstanceOf[js.Any])
      
      inline def setParentConfigDirnameNull: Self = StObject.set(x, "parentConfigDirname", null)
      
      inline def setParentConfigDirnameUndefined: Self = StObject.set(x, "parentConfigDirname", js.undefined)
      
      inline def setReadFromCwd(value: Boolean): Self = StObject.set(x, "readFromCwd", value.asInstanceOf[js.Any])
      
      inline def setReadFromCwdUndefined: Self = StObject.set(x, "readFromCwd", js.undefined)
      
      inline def setSkipMultipleConfigError(value: Boolean): Self = StObject.set(x, "skipMultipleConfigError", value.asInstanceOf[js.Any])
      
      inline def setSkipMultipleConfigErrorUndefined: Self = StObject.set(x, "skipMultipleConfigError", js.undefined)
    }
  }
}
