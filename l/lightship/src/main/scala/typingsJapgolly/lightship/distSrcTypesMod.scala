package typingsJapgolly.lightship

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type BeaconContext = StringDictionary[Any]
  
  trait BeaconController extends StObject {
    
    def die(): js.Promise[Unit]
  }
  object BeaconController {
    
    inline def apply(die: CallbackTo[js.Promise[Unit]]): BeaconController = {
      val __obj = js.Dynamic.literal(die = die.toJsFn)
      __obj.asInstanceOf[BeaconController]
    }
    
    extension [Self <: BeaconController](x: Self) {
      
      inline def setDie(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "die", value.toJsFn)
    }
  }
  
  type BlockingTask = js.Promise[Any]
  
  trait Configuration extends StObject {
    
    val detectKubernetes: Boolean
    
    val gracefulShutdownTimeout: Double
    
    val port: Double
    
    val shutdownDelay: Double
    
    val shutdownHandlerTimeout: Double
    
    val signals: js.Array[String]
    
    def terminate(): Unit
  }
  object Configuration {
    
    inline def apply(
      detectKubernetes: Boolean,
      gracefulShutdownTimeout: Double,
      port: Double,
      shutdownDelay: Double,
      shutdownHandlerTimeout: Double,
      signals: js.Array[String],
      terminate: Callback
    ): Configuration = {
      val __obj = js.Dynamic.literal(detectKubernetes = detectKubernetes.asInstanceOf[js.Any], gracefulShutdownTimeout = gracefulShutdownTimeout.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], shutdownDelay = shutdownDelay.asInstanceOf[js.Any], shutdownHandlerTimeout = shutdownHandlerTimeout.asInstanceOf[js.Any], signals = signals.asInstanceOf[js.Any], terminate = terminate.toJsFn)
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setDetectKubernetes(value: Boolean): Self = StObject.set(x, "detectKubernetes", value.asInstanceOf[js.Any])
      
      inline def setGracefulShutdownTimeout(value: Double): Self = StObject.set(x, "gracefulShutdownTimeout", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setShutdownDelay(value: Double): Self = StObject.set(x, "shutdownDelay", value.asInstanceOf[js.Any])
      
      inline def setShutdownHandlerTimeout(value: Double): Self = StObject.set(x, "shutdownHandlerTimeout", value.asInstanceOf[js.Any])
      
      inline def setSignals(value: js.Array[String]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsVarargs(value: String*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
    }
  }
  
  trait ConfigurationInput extends StObject {
    
    val detectKubernetes: js.UndefOr[Boolean] = js.undefined
    
    val gracefulShutdownTimeout: js.UndefOr[Double] = js.undefined
    
    val port: js.UndefOr[Double] = js.undefined
    
    val shutdownDelay: js.UndefOr[Double] = js.undefined
    
    val shutdownHandlerTimeout: js.UndefOr[Double] = js.undefined
    
    val signals: js.UndefOr[js.Array[String]] = js.undefined
    
    val terminate: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ConfigurationInput {
    
    inline def apply(): ConfigurationInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationInput]
    }
    
    extension [Self <: ConfigurationInput](x: Self) {
      
      inline def setDetectKubernetes(value: Boolean): Self = StObject.set(x, "detectKubernetes", value.asInstanceOf[js.Any])
      
      inline def setDetectKubernetesUndefined: Self = StObject.set(x, "detectKubernetes", js.undefined)
      
      inline def setGracefulShutdownTimeout(value: Double): Self = StObject.set(x, "gracefulShutdownTimeout", value.asInstanceOf[js.Any])
      
      inline def setGracefulShutdownTimeoutUndefined: Self = StObject.set(x, "gracefulShutdownTimeout", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setShutdownDelay(value: Double): Self = StObject.set(x, "shutdownDelay", value.asInstanceOf[js.Any])
      
      inline def setShutdownDelayUndefined: Self = StObject.set(x, "shutdownDelay", js.undefined)
      
      inline def setShutdownHandlerTimeout(value: Double): Self = StObject.set(x, "shutdownHandlerTimeout", value.asInstanceOf[js.Any])
      
      inline def setShutdownHandlerTimeoutUndefined: Self = StObject.set(x, "shutdownHandlerTimeout", js.undefined)
      
      inline def setSignals(value: js.Array[String]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setSignalsVarargs(value: String*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
      
      inline def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
    }
  }
  
  @js.native
  trait Lightship extends StObject {
    
    def createBeacon(): BeaconController = js.native
    def createBeacon(context: BeaconContext): BeaconController = js.native
    
    def isServerReady(): Boolean = js.native
    
    def isServerShuttingDown(): Boolean = js.native
    
    def queueBlockingTask(blockingTask: js.Promise[Any]): Unit = js.native
    
    def registerShutdownHandler(shutdownHandler: ShutdownHandler): Unit = js.native
    
    val server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    def shutdown(): js.Promise[Unit] = js.native
    
    def signalNotReady(): Unit = js.native
    
    def signalReady(): Unit = js.native
    
    def whenFirstReady(): js.Promise[Unit] = js.native
  }
  
  type ShutdownHandler = js.Function0[js.Promise[Unit] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lightship.lightshipStrings.SERVER_IS_NOT_READY
    - typingsJapgolly.lightship.lightshipStrings.SERVER_IS_NOT_SHUTTING_DOWN
    - typingsJapgolly.lightship.lightshipStrings.SERVER_IS_READY
    - typingsJapgolly.lightship.lightshipStrings.SERVER_IS_SHUTTING_DOWN
  */
  trait State extends StObject
  object State {
    
    inline def SERVER_IS_NOT_READY: typingsJapgolly.lightship.lightshipStrings.SERVER_IS_NOT_READY = "SERVER_IS_NOT_READY".asInstanceOf[typingsJapgolly.lightship.lightshipStrings.SERVER_IS_NOT_READY]
    
    inline def SERVER_IS_NOT_SHUTTING_DOWN: typingsJapgolly.lightship.lightshipStrings.SERVER_IS_NOT_SHUTTING_DOWN = "SERVER_IS_NOT_SHUTTING_DOWN".asInstanceOf[typingsJapgolly.lightship.lightshipStrings.SERVER_IS_NOT_SHUTTING_DOWN]
    
    inline def SERVER_IS_READY: typingsJapgolly.lightship.lightshipStrings.SERVER_IS_READY = "SERVER_IS_READY".asInstanceOf[typingsJapgolly.lightship.lightshipStrings.SERVER_IS_READY]
    
    inline def SERVER_IS_SHUTTING_DOWN: typingsJapgolly.lightship.lightshipStrings.SERVER_IS_SHUTTING_DOWN = "SERVER_IS_SHUTTING_DOWN".asInstanceOf[typingsJapgolly.lightship.lightshipStrings.SERVER_IS_SHUTTING_DOWN]
  }
}
