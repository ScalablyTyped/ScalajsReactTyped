package typingsJapgolly.libp2pInterfaces

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStartableMod {
  
  @JSImport("@libp2p/interfaces/dist/src/startable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isStartable(obj: Any): /* is @libp2p/interfaces.@libp2p/interfaces/dist/src/startable.Startable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStartable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interfaces.@libp2p/interfaces/dist/src/startable.Startable */ Boolean]
  
  inline def start(objs: Any*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
  
  inline def stop(objs: Any*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
  
  trait Startable extends StObject {
    
    /**
      * If implemented, this method will be invoked after the start method.
      *
      * All other components will have had their start method invoked before this method is called.
      */
    var afterStart: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * If implemented, this method will be invoked after the stop method.
      *
      * All other components will have had their stop method invoked before this method is called.
      */
    var afterStop: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * If implemented, this method will be invoked before the start method.
      *
      * It should not assume any other components have been started.
      */
    var beforeStart: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * If implemented, this method will be invoked before the stop method.
      *
      * Any other components will still be running when this method is called.
      */
    var beforeStop: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    def isStarted(): Boolean
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    def start(): Unit | js.Promise[Unit]
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    def stop(): Unit | js.Promise[Unit]
  }
  object Startable {
    
    inline def apply(
      isStarted: CallbackTo[Boolean],
      start: CallbackTo[Unit | js.Promise[Unit]],
      stop: CallbackTo[Unit | js.Promise[Unit]]
    ): Startable = {
      val __obj = js.Dynamic.literal(isStarted = isStarted.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[Startable]
    }
    
    extension [Self <: Startable](x: Self) {
      
      inline def setAfterStart(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "afterStart", value.toJsFn)
      
      inline def setAfterStartUndefined: Self = StObject.set(x, "afterStart", js.undefined)
      
      inline def setAfterStop(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "afterStop", value.toJsFn)
      
      inline def setAfterStopUndefined: Self = StObject.set(x, "afterStop", js.undefined)
      
      inline def setBeforeStart(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "beforeStart", value.toJsFn)
      
      inline def setBeforeStartUndefined: Self = StObject.set(x, "beforeStart", js.undefined)
      
      inline def setBeforeStop(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "beforeStop", value.toJsFn)
      
      inline def setBeforeStopUndefined: Self = StObject.set(x, "beforeStop", js.undefined)
      
      inline def setIsStarted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStarted", value.toJsFn)
      
      inline def setStart(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
