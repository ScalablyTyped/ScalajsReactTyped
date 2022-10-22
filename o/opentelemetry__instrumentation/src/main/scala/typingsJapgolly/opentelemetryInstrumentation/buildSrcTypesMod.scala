package typingsJapgolly.opentelemetryInstrumentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import typingsJapgolly.opentelemetryApiMetrics.buildSrcTypesMeterProviderMod.MeterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  trait Instrumentation extends StObject {
    
    /** Method to disable the instrumentation  */
    def disable(): Unit
    
    /** Method to enable the instrumentation  */
    def enable(): Unit
    
    /** Method to get instrumentation config  */
    def getConfig(): InstrumentationConfig
    
    /**
      * Instrumentation Description - please describe all useful information
      * as Instrumentation might patch different version of different modules,
      * or support different browsers etc.
      */
    var instrumentationDescription: js.UndefOr[String] = js.undefined
    
    /** Instrumentation Name  */
    var instrumentationName: String
    
    /** Instrumentation Version  */
    var instrumentationVersion: String
    
    /** Method to set instrumentation config  */
    def setConfig(config: InstrumentationConfig): Unit
    
    /** Method to set meter provider  */
    def setMeterProvider(meterProvider: MeterProvider): Unit
    
    /** Method to set tracer provider  */
    def setTracerProvider(tracerProvider: TracerProvider): Unit
    
    /**
      * Contains all supported versions.
      * All versions must be compatible with [semver](https://semver.org/spec/v2.0.0.html) format.
      * If the version is not supported, we won't apply instrumentation patch (see `enable` method).
      * If omitted, all versions of the module will be patched.
      */
    var supportedVersions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Instrumentation {
    
    inline def apply(
      disable: Callback,
      enable: Callback,
      getConfig: CallbackTo[InstrumentationConfig],
      instrumentationName: String,
      instrumentationVersion: String,
      setConfig: InstrumentationConfig => Callback,
      setMeterProvider: MeterProvider => Callback,
      setTracerProvider: TracerProvider => Callback
    ): Instrumentation = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, getConfig = getConfig.toJsFn, instrumentationName = instrumentationName.asInstanceOf[js.Any], instrumentationVersion = instrumentationVersion.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1((t0: InstrumentationConfig) => setConfig(t0).runNow()), setMeterProvider = js.Any.fromFunction1((t0: MeterProvider) => setMeterProvider(t0).runNow()), setTracerProvider = js.Any.fromFunction1((t0: TracerProvider) => setTracerProvider(t0).runNow()))
      __obj.asInstanceOf[Instrumentation]
    }
    
    extension [Self <: Instrumentation](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setGetConfig(value: CallbackTo[InstrumentationConfig]): Self = StObject.set(x, "getConfig", value.toJsFn)
      
      inline def setInstrumentationDescription(value: String): Self = StObject.set(x, "instrumentationDescription", value.asInstanceOf[js.Any])
      
      inline def setInstrumentationDescriptionUndefined: Self = StObject.set(x, "instrumentationDescription", js.undefined)
      
      inline def setInstrumentationName(value: String): Self = StObject.set(x, "instrumentationName", value.asInstanceOf[js.Any])
      
      inline def setInstrumentationVersion(value: String): Self = StObject.set(x, "instrumentationVersion", value.asInstanceOf[js.Any])
      
      inline def setSetConfig(value: InstrumentationConfig => Callback): Self = StObject.set(x, "setConfig", js.Any.fromFunction1((t0: InstrumentationConfig) => value(t0).runNow()))
      
      inline def setSetMeterProvider(value: MeterProvider => Callback): Self = StObject.set(x, "setMeterProvider", js.Any.fromFunction1((t0: MeterProvider) => value(t0).runNow()))
      
      inline def setSetTracerProvider(value: TracerProvider => Callback): Self = StObject.set(x, "setTracerProvider", js.Any.fromFunction1((t0: TracerProvider) => value(t0).runNow()))
      
      inline def setSupportedVersions(value: js.Array[String]): Self = StObject.set(x, "supportedVersions", value.asInstanceOf[js.Any])
      
      inline def setSupportedVersionsUndefined: Self = StObject.set(x, "supportedVersions", js.undefined)
      
      inline def setSupportedVersionsVarargs(value: String*): Self = StObject.set(x, "supportedVersions", js.Array(value*))
    }
  }
  
  trait InstrumentationConfig extends StObject {
    
    /**
      * Whether to enable the plugin.
      * @default true
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object InstrumentationConfig {
    
    inline def apply(): InstrumentationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstrumentationConfig]
    }
    
    extension [Self <: InstrumentationConfig](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  @js.native
  trait ShimWrapped
    extends js.Function {
    
    var __original: js.Function = js.native
    
    var __unwrap: js.Function = js.native
    
    var __wrapped: Boolean = js.native
  }
}
