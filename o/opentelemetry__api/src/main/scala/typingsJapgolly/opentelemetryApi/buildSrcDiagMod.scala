package typingsJapgolly.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDiagMod {
  
  @JSImport("@opentelemetry/api/build/src/diag", "DiagConsoleLogger")
  @js.native
  open class DiagConsoleLogger ()
    extends typingsJapgolly.opentelemetryApi.buildSrcDiagConsoleLoggerMod.DiagConsoleLogger
  
  @JSImport("@opentelemetry/api/build/src/diag", "DiagLogLevel")
  @js.native
  object DiagLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel & Double] = js.native
    
    /* 9999 */ val ALL: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ALL & Double = js.native
    
    /* 70 */ val DEBUG: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.DEBUG & Double = js.native
    
    /* 30 */ val ERROR: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ERROR & Double = js.native
    
    /* 60 */ val INFO: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.INFO & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.NONE & Double = js.native
    
    /* 80 */ val VERBOSE: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.VERBOSE & Double = js.native
    
    /* 50 */ val WARN: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.WARN & Double = js.native
  }
}
