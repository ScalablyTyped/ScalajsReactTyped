package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.jestSchemas.mod.SnapshotFormat
import typingsJapgolly.jestTypes.mod.FakeTimers
import typingsJapgolly.jestTypes.mod.HasteConfig
import typingsJapgolly.jestTypes.mod.ProjectConfig
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectConfigTsJest
  extends StObject
     with ProjectConfig {
  
  @JSName("globals")
  var globals_ProjectConfigTsJest: GlobalConfigTsJest
}
object ProjectConfigTsJest {
  
  inline def apply(
    automock: Boolean,
    cache: Boolean,
    cacheDirectory: String,
    clearMocks: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    cwd: String,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    extensionsToTreatAsEsm: js.Array[String],
    fakeTimers: FakeTimers,
    forceCoverageMatch: js.Array[String],
    globals: GlobalConfigTsJest,
    haste: HasteConfig,
    id: String,
    injectGlobals: Boolean,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: js.Array[js.Tuple2[String, String]],
    modulePathIgnorePatterns: js.Array[String],
    prettierPath: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    rootDir: String,
    roots: js.Array[String],
    runner: String,
    sandboxInjectedGlobals: js.Array[/* keyof / * globalThis * / any */ String],
    setupFiles: js.Array[String],
    setupFilesAfterEnv: js.Array[String],
    skipFilter: Boolean,
    slowTestThreshold: Double,
    snapshotFormat: SnapshotFormat,
    snapshotSerializers: js.Array[String],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, Any],
    testLocationInResults: Boolean,
    testMatch: js.Array[String],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String | js.RegExp],
    testRunner: String,
    transform: js.Array[js.Tuple3[String, String, Record[String, Any]]],
    transformIgnorePatterns: js.Array[String],
    watchPathIgnorePatterns: js.Array[String]
  ): ProjectConfigTsJest = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], extensionsToTreatAsEsm = extensionsToTreatAsEsm.asInstanceOf[js.Any], fakeTimers = fakeTimers.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], sandboxInjectedGlobals = sandboxInjectedGlobals.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotFormat = snapshotFormat.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigTsJest]
  }
  
  extension [Self <: ProjectConfigTsJest](x: Self) {
    
    inline def setGlobals(value: GlobalConfigTsJest): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
  }
}
