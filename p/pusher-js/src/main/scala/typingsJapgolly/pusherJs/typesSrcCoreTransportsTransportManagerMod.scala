package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreTransportsPingDelayOptionsMod.PingDelayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsTransportManagerMod {
  
  @JSImport("pusher-js/types/src/core/transports/transport_manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TransportManager {
    def this(options: TransportManagerOptions) = this()
    
    /* CompleteClass */
    override def getAssistant(transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default): typingsJapgolly.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default = js.native
    
    /* CompleteClass */
    override def isAlive(): Boolean = js.native
    
    /* CompleteClass */
    var livesLeft: Double = js.native
    
    /* CompleteClass */
    var options: TransportManagerOptions = js.native
    
    /* CompleteClass */
    override def reportDeath(): Unit = js.native
  }
  
  trait TransportManager extends StObject {
    
    def getAssistant(transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default): typingsJapgolly.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default
    
    def isAlive(): Boolean
    
    var livesLeft: Double
    
    var options: TransportManagerOptions
    
    def reportDeath(): Unit
  }
  object TransportManager {
    
    inline def apply(
      getAssistant: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default => typingsJapgolly.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default,
      isAlive: CallbackTo[Boolean],
      livesLeft: Double,
      options: TransportManagerOptions,
      reportDeath: Callback
    ): TransportManager = {
      val __obj = js.Dynamic.literal(getAssistant = js.Any.fromFunction1(getAssistant), isAlive = isAlive.toJsFn, livesLeft = livesLeft.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], reportDeath = reportDeath.toJsFn)
      __obj.asInstanceOf[TransportManager]
    }
    
    extension [Self <: TransportManager](x: Self) {
      
      inline def setGetAssistant(
        value: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default => typingsJapgolly.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default
      ): Self = StObject.set(x, "getAssistant", js.Any.fromFunction1(value))
      
      inline def setIsAlive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAlive", value.toJsFn)
      
      inline def setLivesLeft(value: Double): Self = StObject.set(x, "livesLeft", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: TransportManagerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setReportDeath(value: Callback): Self = StObject.set(x, "reportDeath", value.toJsFn)
    }
  }
  
  trait TransportManagerOptions
    extends StObject
       with PingDelayOptions {
    
    var lives: js.UndefOr[Double] = js.undefined
  }
  object TransportManagerOptions {
    
    inline def apply(): TransportManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportManagerOptions]
    }
    
    extension [Self <: TransportManagerOptions](x: Self) {
      
      inline def setLives(value: Double): Self = StObject.set(x, "lives", value.asInstanceOf[js.Any])
      
      inline def setLivesUndefined: Self = StObject.set(x, "lives", js.undefined)
    }
  }
}
