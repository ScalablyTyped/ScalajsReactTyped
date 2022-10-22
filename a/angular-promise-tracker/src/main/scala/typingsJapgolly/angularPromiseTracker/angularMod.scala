package typingsJapgolly.angularPromiseTracker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IDeferred
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angularPromiseTracker.angularMod.promisetracker.PromiseTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  trait IRequestShortcutConfig extends StObject {
    
    var tracker: js.UndefOr[PromiseTracker | js.Array[PromiseTracker]] = js.undefined
  }
  object IRequestShortcutConfig {
    
    inline def apply(): IRequestShortcutConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestShortcutConfig]
    }
    
    extension [Self <: IRequestShortcutConfig](x: Self) {
      
      inline def setTracker(value: PromiseTracker | js.Array[PromiseTracker]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      inline def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
      
      inline def setTrackerVarargs(value: PromiseTracker*): Self = StObject.set(x, "tracker", js.Array(value*))
    }
  }
  
  object promisetracker {
    
    trait PromiseTracker extends StObject {
      
      def active(): Boolean
      
      def addPromise[T](promise: IPromise[T]): IDeferred[Unit]
      
      def cancel(): Unit
      
      def createPromise(): IDeferred[Unit]
      
      def tracking(): Boolean
      
      def trackingCount(): Double
    }
    object PromiseTracker {
      
      inline def apply(
        active: CallbackTo[Boolean],
        addPromise: IPromise[Any] => IDeferred[Unit],
        cancel: Callback,
        createPromise: CallbackTo[IDeferred[Unit]],
        tracking: CallbackTo[Boolean],
        trackingCount: CallbackTo[Double]
      ): PromiseTracker = {
        val __obj = js.Dynamic.literal(active = active.toJsFn, addPromise = js.Any.fromFunction1(addPromise), cancel = cancel.toJsFn, createPromise = createPromise.toJsFn, tracking = tracking.toJsFn, trackingCount = trackingCount.toJsFn)
        __obj.asInstanceOf[PromiseTracker]
      }
      
      extension [Self <: PromiseTracker](x: Self) {
        
        inline def setActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "active", value.toJsFn)
        
        inline def setAddPromise(value: IPromise[Any] => IDeferred[Unit]): Self = StObject.set(x, "addPromise", js.Any.fromFunction1(value))
        
        inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
        
        inline def setCreatePromise(value: CallbackTo[IDeferred[Unit]]): Self = StObject.set(x, "createPromise", value.toJsFn)
        
        inline def setTracking(value: CallbackTo[Boolean]): Self = StObject.set(x, "tracking", value.toJsFn)
        
        inline def setTrackingCount(value: CallbackTo[Double]): Self = StObject.set(x, "trackingCount", value.toJsFn)
      }
    }
    
    trait PromiseTrackerOptions extends StObject {
      
      var activationDelay: js.UndefOr[Double] = js.undefined
      
      var minDuration: js.UndefOr[Double] = js.undefined
    }
    object PromiseTrackerOptions {
      
      inline def apply(): PromiseTrackerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PromiseTrackerOptions]
      }
      
      extension [Self <: PromiseTrackerOptions](x: Self) {
        
        inline def setActivationDelay(value: Double): Self = StObject.set(x, "activationDelay", value.asInstanceOf[js.Any])
        
        inline def setActivationDelayUndefined: Self = StObject.set(x, "activationDelay", js.undefined)
        
        inline def setMinDuration(value: Double): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
        
        inline def setMinDurationUndefined: Self = StObject.set(x, "minDuration", js.undefined)
      }
    }
    
    type PromiseTrackerService = js.Function1[/* options */ js.UndefOr[PromiseTrackerOptions], PromiseTracker]
  }
}
