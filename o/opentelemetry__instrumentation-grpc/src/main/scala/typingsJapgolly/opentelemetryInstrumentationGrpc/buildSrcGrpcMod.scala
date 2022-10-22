package typingsJapgolly.opentelemetryInstrumentationGrpc

import typingsJapgolly.opentelemetryInstrumentation.mod.InstrumentationBase
import typingsJapgolly.opentelemetryInstrumentationGrpc.anon.TypeofgrpcTypes
import typingsJapgolly.opentelemetryInstrumentationGrpc.buildSrcTypesMod.GrpcInstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc", "GrpcNativeInstrumentation")
  @js.native
  open class GrpcNativeInstrumentation protected () extends InstrumentationBase[TypeofgrpcTypes] {
    def this(name: String, version: String) = this()
    def this(name: String, version: String, config: GrpcInstrumentationConfig) = this()
    
    /* private */ var _getInternalPatchs: Any = js.native
    
    /* private */ var _getMethodsToWrap: Any = js.native
    
    /* private */ var _getPatchedClientMethods: Any = js.native
    
    /* private */ var _patchClient: Any = js.native
    
    /* private */ var _patchServer: Any = js.native
  }
}
