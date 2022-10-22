package typingsJapgolly.winrt.Windows.System

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Threading {
  
  @js.native
  sealed trait WorkItemOptions extends StObject
  @JSGlobal("Windows.System.Threading.WorkItemOptions")
  @js.native
  object WorkItemOptions extends StObject {
    
    @js.native
    sealed trait none
      extends StObject
         with WorkItemOptions
    
    @js.native
    sealed trait timeSliced
      extends StObject
         with WorkItemOptions
  }
  
  @js.native
  sealed trait WorkItemPriority extends StObject
  @JSGlobal("Windows.System.Threading.WorkItemPriority")
  @js.native
  object WorkItemPriority extends StObject {
    
    @js.native
    sealed trait high
      extends StObject
         with WorkItemPriority
    
    @js.native
    sealed trait low
      extends StObject
         with WorkItemPriority
    
    @js.native
    sealed trait normal
      extends StObject
         with WorkItemPriority
  }
  
  object Core {
    
    trait IPreallocatedWorkItem extends StObject {
      
      def runAsync(): IAsyncAction
    }
    object IPreallocatedWorkItem {
      
      inline def apply(runAsync: CallbackTo[IAsyncAction]): IPreallocatedWorkItem = {
        val __obj = js.Dynamic.literal(runAsync = runAsync.toJsFn)
        __obj.asInstanceOf[IPreallocatedWorkItem]
      }
      
      extension [Self <: IPreallocatedWorkItem](x: Self) {
        
        inline def setRunAsync(value: CallbackTo[IAsyncAction]): Self = StObject.set(x, "runAsync", value.toJsFn)
      }
    }
    
    trait IPreallocatedWorkItemFactory extends StObject {
      
      def createWorkItem(handler: WorkItemHandler): PreallocatedWorkItem
      
      def createWorkItemWithPriority(handler: WorkItemHandler, priority: WorkItemPriority): PreallocatedWorkItem
      
      def createWorkItemWithPriorityAndOptions(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): PreallocatedWorkItem
    }
    object IPreallocatedWorkItemFactory {
      
      inline def apply(
        createWorkItem: WorkItemHandler => PreallocatedWorkItem,
        createWorkItemWithPriority: (WorkItemHandler, WorkItemPriority) => PreallocatedWorkItem,
        createWorkItemWithPriorityAndOptions: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => PreallocatedWorkItem
      ): IPreallocatedWorkItemFactory = {
        val __obj = js.Dynamic.literal(createWorkItem = js.Any.fromFunction1(createWorkItem), createWorkItemWithPriority = js.Any.fromFunction2(createWorkItemWithPriority), createWorkItemWithPriorityAndOptions = js.Any.fromFunction3(createWorkItemWithPriorityAndOptions))
        __obj.asInstanceOf[IPreallocatedWorkItemFactory]
      }
      
      extension [Self <: IPreallocatedWorkItemFactory](x: Self) {
        
        inline def setCreateWorkItem(value: WorkItemHandler => PreallocatedWorkItem): Self = StObject.set(x, "createWorkItem", js.Any.fromFunction1(value))
        
        inline def setCreateWorkItemWithPriority(value: (WorkItemHandler, WorkItemPriority) => PreallocatedWorkItem): Self = StObject.set(x, "createWorkItemWithPriority", js.Any.fromFunction2(value))
        
        inline def setCreateWorkItemWithPriorityAndOptions(value: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => PreallocatedWorkItem): Self = StObject.set(x, "createWorkItemWithPriorityAndOptions", js.Any.fromFunction3(value))
      }
    }
    
    trait ISignalNotifier extends StObject {
      
      def enable(): Unit
      
      def terminate(): Unit
    }
    object ISignalNotifier {
      
      inline def apply(enable: Callback, terminate: Callback): ISignalNotifier = {
        val __obj = js.Dynamic.literal(enable = enable.toJsFn, terminate = terminate.toJsFn)
        __obj.asInstanceOf[ISignalNotifier]
      }
      
      extension [Self <: ISignalNotifier](x: Self) {
        
        inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
        
        inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
      }
    }
    
    @js.native
    trait ISignalNotifierStatics extends StObject {
      
      def attachToEvent(name: String, handler: SignalHandler): SignalNotifier = js.native
      def attachToEvent(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
      
      def attachToSemaphore(name: String, handler: SignalHandler): SignalNotifier = js.native
      def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
    }
    
    trait PreallocatedWorkItem
      extends StObject
         with IPreallocatedWorkItem
    object PreallocatedWorkItem {
      
      inline def apply(runAsync: CallbackTo[IAsyncAction]): PreallocatedWorkItem = {
        val __obj = js.Dynamic.literal(runAsync = runAsync.toJsFn)
        __obj.asInstanceOf[PreallocatedWorkItem]
      }
    }
    
    type SignalHandler = js.Function2[/* signalNotifier */ SignalNotifier, /* timedOut */ Boolean, Unit]
    
    trait SignalNotifier
      extends StObject
         with ISignalNotifier
    object SignalNotifier {
      
      inline def apply(enable: Callback, terminate: Callback): SignalNotifier = {
        val __obj = js.Dynamic.literal(enable = enable.toJsFn, terminate = terminate.toJsFn)
        __obj.asInstanceOf[SignalNotifier]
      }
    }
  }
  
  @js.native
  trait IThreadPoolStatics extends StObject {
    
    def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
  }
  
  trait IThreadPoolTimer extends StObject {
    
    def cancel(): Unit
    
    var delay: Double
    
    var period: Double
  }
  object IThreadPoolTimer {
    
    inline def apply(cancel: Callback, delay: Double, period: Double): IThreadPoolTimer = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThreadPoolTimer]
    }
    
    extension [Self <: IThreadPoolTimer](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IThreadPoolTimerStatics extends StObject {
    
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): ThreadPoolTimer = js.native
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
    
    def createTimer(handler: TimerElapsedHandler, delay: Double): ThreadPoolTimer = js.native
    def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
  }
  
  trait ThreadPool extends StObject
  
  trait ThreadPoolTimer
    extends StObject
       with IThreadPoolTimer
  object ThreadPoolTimer {
    
    inline def apply(cancel: Callback, delay: Double, period: Double): ThreadPoolTimer = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadPoolTimer]
    }
  }
  
  type TimerDestroyedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  
  type TimerElapsedHandler = js.Function1[/* timer */ ThreadPoolTimer, Unit]
  
  type WorkItemHandler = js.Function1[/* operation */ IAsyncAction, Unit]
}
