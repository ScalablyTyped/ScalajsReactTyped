package typingsJapgolly.userIdleObserver

import typingsJapgolly.userIdleObserver.userIdleObserverStrings.DOMContentLoaded
import typingsJapgolly.userIdleObserver.userIdleObserverStrings.devicemotion
import typingsJapgolly.userIdleObserver.userIdleObserverStrings.deviceorientation
import typingsJapgolly.userIdleObserver.userIdleObserverStrings.gamepadconnected
import typingsJapgolly.userIdleObserver.userIdleObserverStrings.gamepaddisconnected
import typingsJapgolly.userIdleObserver.userIdleObserverStrings.orientationchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This lib allows you to track user inactivity time.
    */
  inline def apply(): UserIDLEObserver = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[UserIDLEObserver]
  inline def apply(opts: Options): UserIDLEObserver = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[UserIDLEObserver]
  
  @JSImport("user-idle-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* time */ Double, Unit]
  
  /**
    * observer options
    */
  trait Options extends StObject {
    
    /**
      * callback that will triger after opts.idleTime of user's IDLE
      * @default console.log
      */
    var cb: js.UndefOr[Callback] = js.undefined
    
    /**
      * fire callback on user inactivity time in ms
      * @default 3_000
      */
    var idleTime: js.UndefOr[Double] = js.undefined
    
    /**
      * @default ["mousemove", "mousedown", "keydown", "scroll", "touchstart", "resize", "visibilitychange"]
      */
    var listeners: js.UndefOr[
        js.Array[
          DOMContentLoaded | devicemotion | deviceorientation | gamepadconnected | gamepaddisconnected | orientationchange
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCb(value: /* time */ Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "cb", js.Any.fromFunction1((t0: /* time */ Double) => value(t0).runNow()))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      inline def setIdleTime(value: Double): Self = StObject.set(x, "idleTime", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeUndefined: Self = StObject.set(x, "idleTime", js.undefined)
      
      inline def setListeners(
        value: js.Array[
              DOMContentLoaded | devicemotion | deviceorientation | gamepadconnected | gamepaddisconnected | orientationchange
            ]
      ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setListenersVarargs(
        value: (DOMContentLoaded | devicemotion | deviceorientation | gamepadconnected | gamepaddisconnected | orientationchange)*
      ): Self = StObject.set(x, "listeners", js.Array(value*))
    }
  }
  
  trait UserIDLEObserver extends StObject {
    
    /**
      * destroy observer instance
      */
    def destroy(): Unit
  }
  object UserIDLEObserver {
    
    inline def apply(destroy: japgolly.scalajs.react.Callback): UserIDLEObserver = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
      __obj.asInstanceOf[UserIDLEObserver]
    }
    
    extension [Self <: UserIDLEObserver](x: Self) {
      
      inline def setDestroy(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
}
