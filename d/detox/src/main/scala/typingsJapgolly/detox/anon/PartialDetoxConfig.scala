package typingsJapgolly.detox.anon

import typingsJapgolly.detox.mod.global.Detox.DetoxAppConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxArtifactsConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxBehaviorConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxConfiguration
import typingsJapgolly.detox.mod.global.Detox.DetoxDeviceConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxSessionConfig
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<detox.detox.<global>.Detox.DetoxConfig> */
trait PartialDetoxConfig extends StObject {
  
  var apps: js.UndefOr[Record[String, DetoxAppConfig]] = js.undefined
  
  var artifacts: js.UndefOr[DetoxArtifactsConfig] = js.undefined
  
  var behavior: js.UndefOr[DetoxBehaviorConfig] = js.undefined
  
  var configurations: js.UndefOr[Record[String, DetoxConfiguration]] = js.undefined
  
  var devices: js.UndefOr[Record[String, DetoxDeviceConfig]] = js.undefined
  
  var `extends`: js.UndefOr[String] = js.undefined
  
  var runnerConfig: js.UndefOr[String] = js.undefined
  
  var selectedConfiguration: js.UndefOr[String] = js.undefined
  
  var session: js.UndefOr[DetoxSessionConfig] = js.undefined
  
  var skipLegacyWorkersInjection: js.UndefOr[Boolean] = js.undefined
  
  var specs: js.UndefOr[String] = js.undefined
  
  var testRunner: js.UndefOr[String] = js.undefined
}
object PartialDetoxConfig {
  
  inline def apply(): PartialDetoxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDetoxConfig]
  }
  
  extension [Self <: PartialDetoxConfig](x: Self) {
    
    inline def setApps(value: Record[String, DetoxAppConfig]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setArtifacts(value: DetoxArtifactsConfig): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setBehavior(value: DetoxBehaviorConfig): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setConfigurations(value: Record[String, DetoxConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
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
