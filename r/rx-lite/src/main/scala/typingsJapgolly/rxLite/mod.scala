package typingsJapgolly.rxLite

import typingsJapgolly.rxCore.Rx.IDisposable
import typingsJapgolly.rxCore.Rx.IPromise
import typingsJapgolly.rxLite.Rx.IScheduler
import typingsJapgolly.rxLite.Rx.ObservableStatic
import typingsJapgolly.rxLite.Rx.ObserverStatic
import typingsJapgolly.rxLite.Rx.SchedulerStatic
import typingsJapgolly.rxLite.anon.GetDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx-lite", "CompositeDisposable")
  @js.native
  open class CompositeDisposable protected ()
    extends StObject
       with typingsJapgolly.rxLite.Rx.CompositeDisposable {
    def this(disposables: IDisposable*) = this()
    def this(disposables: js.Array[IDisposable]) = this()
    
    /* CompleteClass */
    override def add(item: IDisposable): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    override def remove(item: IDisposable): Boolean = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[IDisposable] = js.native
  }
  
  @JSImport("rx-lite", "Disposable")
  @js.native
  open class Disposable protected ()
    extends StObject
       with typingsJapgolly.rxLite.Rx.Disposable {
    def this(action: js.Function0[Unit]) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  object Disposable {
    
    @JSImport("rx-lite", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(action: js.Function0[Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
    
    /* static member */
    @JSImport("rx-lite", "Disposable.empty")
    @js.native
    def empty: IDisposable = js.native
    inline def empty_=(x: IDisposable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  // Notifications
  @JSImport("rx-lite", "Notification")
  @js.native
  open class Notification[T] ()
    extends StObject
       with typingsJapgolly.rxLite.Rx.Notification[T]
  object Notification {
    
    @JSImport("rx-lite", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createOnCompleted[T](): typingsJapgolly.rxLite.Rx.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnCompleted")().asInstanceOf[typingsJapgolly.rxLite.Rx.Notification[T]]
    
    /* static member */
    inline def createOnError[T](exception: Any): typingsJapgolly.rxLite.Rx.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnError")(exception.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rxLite.Rx.Notification[T]]
    
    /* static member */
    inline def createOnNext[T](value: T): typingsJapgolly.rxLite.Rx.Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnNext")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rxLite.Rx.Notification[T]]
  }
  
  @JSImport("rx-lite", "Observable")
  @js.native
  val Observable: ObservableStatic = js.native
  
  @JSImport("rx-lite", "Observer")
  @js.native
  val Observer: ObserverStatic = js.native
  
  @JSImport("rx-lite", "RefCountDisposable")
  @js.native
  open class RefCountDisposable protected ()
    extends StObject
       with typingsJapgolly.rxLite.Rx.RefCountDisposable {
    def this(disposable: IDisposable) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getDisposable(): IDisposable = js.native
    
    /* CompleteClass */
    var isDisposed: Boolean = js.native
  }
  
  @JSImport("rx-lite", "Scheduler")
  @js.native
  val Scheduler: SchedulerStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-lite", "Scheduler")
  @js.native
  open class SchedulerCls protected ()
    extends StObject
       with IScheduler {
    def this(
      now: js.Function0[Double],
      schedule: js.Function2[
            /* state */ Any, 
            /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable], 
            IDisposable
          ],
      scheduleRelative: js.Function3[
            /* state */ Any, 
            /* dueTime */ Double, 
            /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable], 
            IDisposable
          ],
      scheduleAbsolute: js.Function3[
            /* state */ Any, 
            /* dueTime */ Double, 
            /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable], 
            IDisposable
          ]
    ) = this()
    
    /* CompleteClass */
    override def isScheduler(value: Any): Boolean = js.native
    
    /* CompleteClass */
    override def now(): Double = js.native
    
    /* CompleteClass */
    override def schedule(action: js.Function0[Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def schedulePeriodic(period: Double, action: js.Function0[Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def schedulePeriodicWithState[TState](state: TState, period: Double, action: js.Function1[/* state */ TState, TState]): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleRecursive(action: js.Function1[/* action */ js.Function0[Unit], Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleRecursiveWithAbsolute(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleRecursiveWithAbsoluteAndState[TState](
      state: TState,
      dueTime: Double,
      action: js.Function2[
          /* state */ TState, 
          /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
          Unit
        ]
    ): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleRecursiveWithRelative(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleRecursiveWithRelativeAndState[TState](
      state: TState,
      dueTime: Double,
      action: js.Function2[
          /* state */ TState, 
          /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
          Unit
        ]
    ): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleRecursiveWithState[TState](
      state: TState,
      action: js.Function2[/* state */ TState, /* action */ js.Function1[/* state */ TState, Unit], Unit]
    ): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleWithAbsolute(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleWithAbsoluteAndState[TState](
      state: TState,
      dueTime: Double,
      action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
    ): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleWithRelative(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleWithRelativeAndState[TState](
      state: TState,
      dueTime: Double,
      action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
    ): IDisposable = js.native
    
    /* CompleteClass */
    override def scheduleWithState[TState](state: TState, action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]): IDisposable = js.native
  }
  
  // SerialDisposable it's an alias of SingleAssignmentDisposable
  @JSImport("rx-lite", "SerialDisposable")
  @js.native
  open class SerialDisposable ()
    extends StObject
       with typingsJapgolly.rxLite.Rx.SingleAssignmentDisposable {
    
    /* CompleteClass */
    var current: IDisposable = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getDisposable(): IDisposable = js.native
    
    /* CompleteClass */
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    override def setDisposable(value: IDisposable): Unit = js.native
  }
  
  // Single assignment
  @JSImport("rx-lite", "SingleAssignmentDisposable")
  @js.native
  open class SingleAssignmentDisposable ()
    extends StObject
       with typingsJapgolly.rxLite.Rx.SingleAssignmentDisposable {
    
    /* CompleteClass */
    var current: IDisposable = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getDisposable(): IDisposable = js.native
    
    /* CompleteClass */
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    override def setDisposable(value: IDisposable): Unit = js.native
  }
  
  object config {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rx-lite", "config.Promise")
    @js.native
    open class Promise[T] protected ()
      extends StObject
         with IPromise[T] {
      def this(resolver: js.Function2[
                /* resolvePromise */ js.Function1[/* value */ T, Unit], 
                /* rejectPromise */ js.Function1[/* reason */ Any, Unit], 
                Unit
              ]) = this()
    }
    
    /**
      * Configuration option to determine whether to use native events only
      */
    @JSImport("rx-lite", "config.useNativeEvents")
    @js.native
    val useNativeEvents: Boolean = js.native
  }
  
  object helpers {
    
    @JSImport("rx-lite", "helpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def asArray[T](args: T*): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[T]]
    
    inline def defaultComparer(left: Any, right: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultComparer")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultError(err: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def defaultKeySerializer(key: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultKeySerializer")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def defaultNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNow")().asInstanceOf[Double]
    
    inline def defaultSubComparer(left: Any, right: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSubComparer")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def identity[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPromise(p: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
    
    inline def not(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def notDefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object internals {
    
    @JSImport("rx-lite", "internals")
    @js.native
    val ^ : js.Any = js.native
    
    // Priority Queue for Scheduling
    @JSImport("rx-lite", "internals.PriorityQueue")
    @js.native
    open class PriorityQueue[TTime] protected ()
      extends StObject
         with typingsJapgolly.rxLite.Rx.internals.PriorityQueue[TTime] {
      def this(capacity: Double) = this()
      
      /* CompleteClass */
      override def dequeue(): typingsJapgolly.rxLite.Rx.internals.ScheduledItem[TTime] = js.native
      
      /* CompleteClass */
      override def enqueue(item: typingsJapgolly.rxLite.Rx.internals.ScheduledItem[TTime]): Unit = js.native
      
      /* CompleteClass */
      override def heapify(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def isHigherPriority(left: Double, right: Double): Boolean = js.native
      
      /* CompleteClass */
      var length: Double = js.native
      
      /* CompleteClass */
      override def peek(): typingsJapgolly.rxLite.Rx.internals.ScheduledItem[TTime] = js.native
      
      /* CompleteClass */
      override def percolate(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def remove(item: typingsJapgolly.rxLite.Rx.internals.ScheduledItem[TTime]): Boolean = js.native
      
      /* CompleteClass */
      override def removeAt(index: Double): Unit = js.native
    }
    object PriorityQueue {
      
      @JSImport("rx-lite", "internals.PriorityQueue")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("rx-lite", "internals.PriorityQueue.count")
      @js.native
      def count: Double = js.native
      inline def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rx-lite", "internals.ScheduledItem")
    @js.native
    open class ScheduledItem[TTime] protected ()
      extends StObject
         with typingsJapgolly.rxLite.Rx.internals.ScheduledItem[TTime] {
      def this(
        scheduler: IScheduler,
        state: Any,
        action: js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable],
        dueTime: TTime
      ) = this()
      def this(
        scheduler: IScheduler,
        state: Any,
        action: js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable],
        dueTime: TTime,
        comparer: js.Function2[/* x */ TTime, /* y */ TTime, Double]
      ) = this()
      
      /* CompleteClass */
      override def action(scheduler: IScheduler, state: Any): IDisposable = js.native
      
      /* CompleteClass */
      override def compareTo(other: typingsJapgolly.rxLite.Rx.internals.ScheduledItem[TTime]): Double = js.native
      
      /* CompleteClass */
      override def comparer(x: TTime, y: TTime): Double = js.native
      
      /* CompleteClass */
      var disposable: typingsJapgolly.rxLite.Rx.SingleAssignmentDisposable = js.native
      
      /* CompleteClass */
      var dueTime: TTime = js.native
      
      /* CompleteClass */
      override def invoke(): Unit = js.native
      
      /* CompleteClass */
      override def invokeCore(): IDisposable = js.native
      
      /* CompleteClass */
      override def isCancelled(): Boolean = js.native
      
      /* CompleteClass */
      var scheduler: IScheduler = js.native
      
      /* CompleteClass */
      var state: TTime = js.native
    }
    
    inline def addRef[T](xs: typingsJapgolly.rxLite.Rx.Observable[T], r: GetDisposable): typingsJapgolly.rxLite.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addRef")(xs.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rxLite.Rx.Observable[T]]
    
    inline def isEqual(left: Any, right: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
