package typingsJapgolly.opentelemetryApi

import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.ContextManager
import typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogger
import typingsJapgolly.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapPropagator
import typingsJapgolly.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import typingsJapgolly.opentelemetryApi.opentelemetryApiStrings.context
import typingsJapgolly.opentelemetryApi.opentelemetryApiStrings.diag
import typingsJapgolly.opentelemetryApi.opentelemetryApiStrings.propagation
import typingsJapgolly.opentelemetryApi.opentelemetryApiStrings.trace
import typingsJapgolly.opentelemetryApi.opentelemetryApiStrings.version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInternalGlobalUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/internal/global-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobal_context(`type`: context): js.UndefOr[ContextManager] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ContextManager]]
  
  inline def getGlobal_diag(`type`: diag): js.UndefOr[DiagLogger] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DiagLogger]]
  
  inline def getGlobal_propagation(`type`: propagation): js.UndefOr[TextMapPropagator[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TextMapPropagator[Any]]]
  
  inline def getGlobal_trace(`type`: trace): js.UndefOr[TracerProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TracerProvider]]
  
  inline def getGlobal_version(`type`: version): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def registerGlobal_context(`type`: context, instance: Unit, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_context(`type`: context, instance: Unit, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_context(`type`: context, instance: ContextManager, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_context(`type`: context, instance: ContextManager, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def registerGlobal_diag(`type`: diag, instance: Unit, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_diag(`type`: diag, instance: Unit, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_diag(`type`: diag, instance: DiagLogger, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_diag(`type`: diag, instance: DiagLogger, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def registerGlobal_propagation(`type`: propagation, instance: Unit, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_propagation(`type`: propagation, instance: Unit, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_propagation(`type`: propagation, instance: TextMapPropagator[Any], diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_propagation(`type`: propagation, instance: TextMapPropagator[Any], diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def registerGlobal_trace(`type`: trace, instance: Unit, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_trace(`type`: trace, instance: Unit, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_trace(`type`: trace, instance: TracerProvider, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_trace(`type`: trace, instance: TracerProvider, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def registerGlobal_version(`type`: version, instance: String, diag: DiagLogger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def registerGlobal_version(`type`: version, instance: String, diag: DiagLogger, allowOverride: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGlobal")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], diag.asInstanceOf[js.Any], allowOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unregisterGlobal(
    `type`: /* keyof @opentelemetry/api.@opentelemetry/api/build/src/internal/global-utils.OTelGlobalAPI */ version | diag | trace | context | propagation,
    diag: DiagLogger
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterGlobal")(`type`.asInstanceOf[js.Any], diag.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait OTelGlobalAPI extends StObject {
    
    var context: js.UndefOr[ContextManager] = js.undefined
    
    var diag: js.UndefOr[DiagLogger] = js.undefined
    
    var propagation: js.UndefOr[TextMapPropagator[Any]] = js.undefined
    
    var trace: js.UndefOr[TracerProvider] = js.undefined
    
    var version: String
  }
  object OTelGlobalAPI {
    
    inline def apply(version: String): OTelGlobalAPI = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OTelGlobalAPI]
    }
    
    extension [Self <: OTelGlobalAPI](x: Self) {
      
      inline def setContext(value: ContextManager): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDiag(value: DiagLogger): Self = StObject.set(x, "diag", value.asInstanceOf[js.Any])
      
      inline def setDiagUndefined: Self = StObject.set(x, "diag", js.undefined)
      
      inline def setPropagation(value: TextMapPropagator[Any]): Self = StObject.set(x, "propagation", value.asInstanceOf[js.Any])
      
      inline def setPropagationUndefined: Self = StObject.set(x, "propagation", js.undefined)
      
      inline def setTrace(value: TracerProvider): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
