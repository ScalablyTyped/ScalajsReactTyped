package typingsJapgolly.opentelemetrySdkTraceNode

import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.PROPAGATOR_FACTORY
import typingsJapgolly.opentelemetrySdkTraceNode.buildSrcConfigMod.NodeTracerConfig
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/sdk-trace-node", "NodeTracerProvider")
  @js.native
  open class NodeTracerProvider ()
    extends typingsJapgolly.opentelemetrySdkTraceNode.buildSrcNodeTracerProviderMod.NodeTracerProvider {
    def this(config: NodeTracerConfig) = this()
  }
  /* static members */
  object NodeTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-node", "NodeTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
}
