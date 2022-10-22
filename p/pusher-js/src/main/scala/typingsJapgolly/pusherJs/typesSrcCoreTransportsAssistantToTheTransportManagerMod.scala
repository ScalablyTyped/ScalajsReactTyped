package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreTransportsPingDelayOptionsMod.PingDelayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsAssistantToTheTransportManagerMod {
  
  @JSImport("pusher-js/types/src/core/transports/assistant_to_the_transport_manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AssistantToTheTransportManager {
    def this(
      manager: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default,
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default,
      options: PingDelayOptions
    ) = this()
    
    /* CompleteClass */
    override def createConnection(name: String, priority: Double, key: String, options: js.Object): typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default = js.native
    
    /* CompleteClass */
    override def isSupported(environment: String): Boolean = js.native
    
    /* CompleteClass */
    var manager: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default = js.native
    
    /* CompleteClass */
    var maxPingDelay: Double = js.native
    
    /* CompleteClass */
    var minPingDelay: Double = js.native
    
    /* CompleteClass */
    var pingDelay: Double = js.native
    
    /* CompleteClass */
    var transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default = js.native
  }
  
  trait AssistantToTheTransportManager extends StObject {
    
    def createConnection(name: String, priority: Double, key: String, options: js.Object): typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default
    
    def isSupported(environment: String): Boolean
    
    var manager: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default
    
    var maxPingDelay: Double
    
    var minPingDelay: Double
    
    var pingDelay: Double
    
    var transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default
  }
  object AssistantToTheTransportManager {
    
    inline def apply(
      createConnection: (String, Double, String, js.Object) => typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default,
      isSupported: String => Boolean,
      manager: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default,
      maxPingDelay: Double,
      minPingDelay: Double,
      pingDelay: Double,
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default
    ): AssistantToTheTransportManager = {
      val __obj = js.Dynamic.literal(createConnection = js.Any.fromFunction4(createConnection), isSupported = js.Any.fromFunction1(isSupported), manager = manager.asInstanceOf[js.Any], maxPingDelay = maxPingDelay.asInstanceOf[js.Any], minPingDelay = minPingDelay.asInstanceOf[js.Any], pingDelay = pingDelay.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantToTheTransportManager]
    }
    
    extension [Self <: AssistantToTheTransportManager](x: Self) {
      
      inline def setCreateConnection(
        value: (String, Double, String, js.Object) => typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction4(value))
      
      inline def setIsSupported(value: String => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction1(value))
      
      inline def setManager(value: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setMaxPingDelay(value: Double): Self = StObject.set(x, "maxPingDelay", value.asInstanceOf[js.Any])
      
      inline def setMinPingDelay(value: Double): Self = StObject.set(x, "minPingDelay", value.asInstanceOf[js.Any])
      
      inline def setPingDelay(value: Double): Self = StObject.set(x, "pingDelay", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
