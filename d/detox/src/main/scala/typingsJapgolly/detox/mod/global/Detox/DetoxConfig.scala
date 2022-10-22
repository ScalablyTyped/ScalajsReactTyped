package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// region DetoxConfig
trait DetoxConfig extends StObject {
  
  var apps: js.UndefOr[Record[String, DetoxAppConfig]] = js.undefined
  
  var artifacts: js.UndefOr[DetoxArtifactsConfig] = js.undefined
  
  var behavior: js.UndefOr[DetoxBehaviorConfig] = js.undefined
  
  var configurations: Record[String, DetoxConfiguration]
  
  var devices: js.UndefOr[Record[String, DetoxDeviceConfig]] = js.undefined
  
  /**
    * @example extends: './relative/detox.config'
    * @example extends: '@my-org/detox-preset'
    */
  var `extends`: js.UndefOr[String] = js.undefined
  
  /**
    * @example runnerConfig: 'e2e/config.js'
    */
  var runnerConfig: js.UndefOr[String] = js.undefined
  
  var selectedConfiguration: js.UndefOr[String] = js.undefined
  
  var session: js.UndefOr[DetoxSessionConfig] = js.undefined
  
  /**
    * Stops passing default `--maxWorkers 1` to the test runner,
    * presuming that from now on you have that already configured
    * in your test runner config as a default.
    */
  var skipLegacyWorkersInjection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. A default glob pattern for a test runner to use when no test files are specified.
    *
    * @example specs: 'detoxE2E'
    */
  var specs: js.UndefOr[String] = js.undefined
  
  /**
    * @example testRunner: 'jest'
    * @example testRunner: 'mocha'
    */
  var testRunner: js.UndefOr[String] = js.undefined
}
object DetoxConfig {
  
  inline def apply(configurations: Record[String, DetoxConfiguration]): DetoxConfig = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxConfig]
  }
  
  extension [Self <: DetoxConfig](x: Self) {
    
    inline def setApps(value: Record[String, DetoxAppConfig]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setArtifacts(value: DetoxArtifactsConfig): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setBehavior(value: DetoxBehaviorConfig): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setConfigurations(value: Record[String, DetoxConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setDevices(value: Record[String, DetoxDeviceConfig]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setRunnerConfig(value: String): Self = StObject.set(x, "runnerConfig", value.asInstanceOf[js.Any])
    
    inline def setRunnerConfigUndefined: Self = StObject.set(x, "runnerConfig", js.undefined)
    
    inline def setSelectedConfiguration(value: String): Self = StObject.set(x, "selectedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSelectedConfigurationUndefined: Self = StObject.set(x, "selectedConfiguration", js.undefined)
    
    inline def setSession(value: DetoxSessionConfig): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSkipLegacyWorkersInjection(value: Boolean): Self = StObject.set(x, "skipLegacyWorkersInjection", value.asInstanceOf[js.Any])
    
    inline def setSkipLegacyWorkersInjectionUndefined: Self = StObject.set(x, "skipLegacyWorkersInjection", js.undefined)
    
    inline def setSpecs(value: String): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
  }
}
