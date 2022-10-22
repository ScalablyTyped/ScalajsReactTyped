package typingsJapgolly.sinonjsFakeTimers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.sinonjsFakeTimers.anon.Now
import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sinonjs/fake-timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClock(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("createClock")().asInstanceOf[Clock]
  inline def createClock(now: js.Date): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any]).asInstanceOf[Clock]
  inline def createClock(now: js.Date, loopLimit: Double): Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any], loopLimit.asInstanceOf[js.Any])).asInstanceOf[Clock]
  inline def createClock(now: Double): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any]).asInstanceOf[Clock]
  inline def createClock(now: Double, loopLimit: Double): Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any], loopLimit.asInstanceOf[js.Any])).asInstanceOf[Clock]
  inline def createClock(now: Unit, loopLimit: Double): Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any], loopLimit.asInstanceOf[js.Any])).asInstanceOf[Clock]
  
  inline def install(): InstalledClock = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[InstalledClock]
  inline def install(opts: FakeTimerInstallOpts): InstalledClock = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(opts.asInstanceOf[js.Any]).asInstanceOf[InstalledClock]
  
  object timers extends Shortcut {
    
    @JSImport("@sinonjs/fake-timers", "timers")
    @js.native
    val ^ : GlobalTimers[TimerId] = js.native
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sinonjs/fake-timers", "timers.Date")
    @js.native
    /* standard es5 */
    open class Date ()
      extends StObject
         with typingsJapgolly.std.Date {
      def this(value: String) = this()
      def this(value: js.Date) = this()
      /* standard es5 */
      def this(value: Double) = this()
      /* standard scripthost */
      def this(vd: VarDate) = this()
      /* standard es5 */
      def this(year: Double, month: Double) = this()
      def this(year: Double, month: Double, date: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Unit,
        seconds: Double,
        ms: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Unit,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: Unit,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
    }
    
    type _To = GlobalTimers[TimerId]
    
    /* This means you don't have to write `^`, but can instead just say `timers.foo` */
    override def _to: GlobalTimers[TimerId] = ^
  }
  
  inline def withGlobal(global: js.Object): FakeTimerWithContext = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobal")(global.asInstanceOf[js.Any]).asInstanceOf[FakeTimerWithContext]
  
  type BrowserClock = FakeClock[Double]
  
  type Clock = BrowserClock | NodeClock
  
  @js.native
  trait FakeClock[TTimerId /* <: TimerId */]
    extends StObject
       with GlobalTimers[TTimerId] {
    
    /**
      * Cancel animation frame request.
      *
      * @param id   The id returned from requestAnimationFrame method.
      */
    def cancelAnimationFrame(id: TTimerId): Unit = js.native
    
    /**
      * Clears a timer, as long as it was created using requestIdleCallback.
      *
      * @param id   Timer ID or object.
      */
    def cancelIdleCallback(id: TTimerId): Unit = js.native
    
    /**
      * Get the number of waiting timers.
      *
      * @returns number of waiting timers.
      */
    def countTimers(): Double = js.native
    
    /**
      * Maximum number of timers that will be run when calling runAll().
      */
    var loopLimit: Double = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      * @returns Fake milliseconds since the unix epoch.
      */
    def next(): Double = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      * @returns Fake milliseconds since the unix epoch.
      */
    def nextAsync(): js.Promise[Double] = js.native
    
    /**
      * Current clock time.
      */
    var now: Double = js.native
    
    /**
      * Mimics performance.now().
      */
    var performance: Now = js.native
    
    /**
      * Schedule callback to run in the next animation frame.
      *
      * @param callback   Callback to be fired.
      * @returns Request id.
      */
    def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): TTimerId = js.native
    
    /**
      * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
      *
      * @param callback   Callback to be fired.
      * @param timeout   The maximum number of ticks before the callback must be fired.
      * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
      */
    def requestIdleCallback(callback: js.Function0[Unit]): TTimerId = js.native
    def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): TTimerId = js.native
    
    /**
      * Removes all timers and tick without firing them and restore now to its original value.
      */
    def reset(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      * @returns Fake milliseconds since the unix epoch.
      */
    def runAll(): Double = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      * @returns Fake milliseconds since the unix epoch.
      */
    def runAllAsync(): js.Promise[Double] = js.native
    
    /**
      * Advanced the clock to the next animation frame while firing all scheduled callbacks.
      * @returns Fake milliseconds since the unix epoch.
      */
    def runToFrame(): Double = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      * @returns Fake milliseconds since the unix epoch.
      */
    def runToLast(): Double = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      * @returns Fake milliseconds since the unix epoch.
      */
    def runToLastAsync(): js.Promise[Double] = js.native
    
    /**
      * Simulates a user changing the system clock.
      *
      * @param now   New system time.
      * @remarks This affects the current time but it does not in itself cause timers to fire.
      */
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: js.Date): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    
    def tick(time: String): Double = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * @param time   How many ticks to advance by.
      * @returns Fake milliseconds since the unix epoch.
      */
    def tick(time: Double): Double = js.native
    
    def tickAsync(time: String): js.Promise[Double] = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @param time   How many ticks to advance by.
      * @returns Fake milliseconds since the unix epoch.
      */
    def tickAsync(time: Double): js.Promise[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setTimeout
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearTimeout
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setImmediate
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearImmediate
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setInterval
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearInterval
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.Date
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.nextTick
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.hrtime
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestAnimationFrame
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelAnimationFrame
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestIdleCallback
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelIdleCallback
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.performance
    - typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.queueMicrotask
  */
  trait FakeMethod extends StObject
  object FakeMethod {
    
    inline def Date: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.Date = "Date".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.Date]
    
    inline def cancelAnimationFrame: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelAnimationFrame = "cancelAnimationFrame".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelAnimationFrame]
    
    inline def cancelIdleCallback: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelIdleCallback = "cancelIdleCallback".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.cancelIdleCallback]
    
    inline def clearImmediate: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearImmediate = "clearImmediate".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearImmediate]
    
    inline def clearInterval: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearInterval = "clearInterval".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearInterval]
    
    inline def clearTimeout: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearTimeout = "clearTimeout".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.clearTimeout]
    
    inline def hrtime: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.hrtime = "hrtime".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.hrtime]
    
    inline def nextTick: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.nextTick = "nextTick".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.nextTick]
    
    inline def performance: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.performance = "performance".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.performance]
    
    inline def queueMicrotask: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.queueMicrotask = "queueMicrotask".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.queueMicrotask]
    
    inline def requestAnimationFrame: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestAnimationFrame = "requestAnimationFrame".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestAnimationFrame]
    
    inline def requestIdleCallback: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestIdleCallback = "requestIdleCallback".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.requestIdleCallback]
    
    inline def setImmediate: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setImmediate = "setImmediate".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setImmediate]
    
    inline def setInterval: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setInterval = "setInterval".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setInterval]
    
    inline def setTimeout: typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setTimeout = "setTimeout".asInstanceOf[typingsJapgolly.sinonjsFakeTimers.sinonjsFakeTimersStrings.setTimeout]
  }
  
  trait FakeTimerInstallOpts extends StObject {
    
    /**
      * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
      * in the real system time (default: 20)
      */
    var advanceTimeDelta: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of timers that will be run when calling runAll() (default: 1000)
      */
    var loopLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Installs fake timers with the specified unix epoch (default: 0)
      */
    var now: js.UndefOr[Double | js.Date] = js.undefined
    
    /**
      * Tells @sinonjs/fake-timers to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
      * 20ms for every 20ms change in the real system time) (default: false)
      */
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tells FakeTimers to clear 'native' (i.e. not fake) timers by delegating to their respective handlers. These are not cleared by
      * default, leading to potentially unexpected behavior if timers existed prior to installing FakeTimers. (default: false)
      */
    var shouldClearNativeTimers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array with names of global methods and APIs to fake. By default, `@sinonjs/fake-timers` does not replace `nextTick()` and `queueMicrotask()`.
      * For instance, `FakeTimers.install({ toFake: ['setTimeout', 'nextTick'] })` will fake only `setTimeout()` and `nextTick()`
      */
    var toFake: js.UndefOr[js.Array[FakeMethod]] = js.undefined
  }
  object FakeTimerInstallOpts {
    
    inline def apply(): FakeTimerInstallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FakeTimerInstallOpts]
    }
    
    extension [Self <: FakeTimerInstallOpts](x: Self) {
      
      inline def setAdvanceTimeDelta(value: Double): Self = StObject.set(x, "advanceTimeDelta", value.asInstanceOf[js.Any])
      
      inline def setAdvanceTimeDeltaUndefined: Self = StObject.set(x, "advanceTimeDelta", js.undefined)
      
      inline def setLoopLimit(value: Double): Self = StObject.set(x, "loopLimit", value.asInstanceOf[js.Any])
      
      inline def setLoopLimitUndefined: Self = StObject.set(x, "loopLimit", js.undefined)
      
      inline def setNow(value: Double | js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      inline def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      inline def setShouldClearNativeTimers(value: Boolean): Self = StObject.set(x, "shouldClearNativeTimers", value.asInstanceOf[js.Any])
      
      inline def setShouldClearNativeTimersUndefined: Self = StObject.set(x, "shouldClearNativeTimers", js.undefined)
      
      inline def setToFake(value: js.Array[FakeMethod]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      inline def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      inline def setToFakeVarargs(value: FakeMethod*): Self = StObject.set(x, "toFake", js.Array(value*))
    }
  }
  
  @js.native
  trait FakeTimerWithContext extends StObject {
    
    def createClock(): Clock = js.native
    def createClock(now: js.Date): Clock = js.native
    def createClock(now: js.Date, loopLimit: Double): Clock = js.native
    def createClock(now: Double): Clock = js.native
    def createClock(now: Double, loopLimit: Double): Clock = js.native
    def createClock(now: Unit, loopLimit: Double): Clock = js.native
    
    def install(): InstalledClock = js.native
    def install(opts: FakeTimerInstallOpts): InstalledClock = js.native
    
    var timers: GlobalTimers[TimerId] = js.native
    
    def withGlobal(global: js.Object): FakeTimerWithContext = js.native
  }
  
  trait GlobalTimers[TTimerId /* <: TimerId */] extends StObject {
    
    /* standard es5 */
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    def Date(): String
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    @JSName("Date")
    var Date_Original: DateConstructor
    
    /**
      * Clears a timer, as long as it was created using setImmediate.
      *
      * @param id   Timer ID or object.
      */
    def clearImmediate(id: TTimerId): Unit
    
    /**
      * Clears a timer, as long as it was created using setInterval.
      *
      * @param id   Timer ID or object.
      */
    def clearInterval(id: TTimerId): Unit
    
    /**
      * Clears a timer, as long as it was created using setTimeout.
      *
      * @param id   Timer ID or object.
      */
    def clearTimeout(id: TTimerId): Unit
    
    /**
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param args   Any extra arguments to pass to the callback.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function1[/* repeated */ Any, Unit], args: Any*): TTimerId
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function1[/* repeated */ Any, Unit], timeout: Double, args: Any*): TTimerId
    
    /**
      * Schedules a callback to be fired once timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait to run the callback.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setTimeout(callback: js.Function1[/* repeated */ Any, Unit], timeout: Double, args: Any*): TTimerId
  }
  object GlobalTimers {
    
    inline def apply[TTimerId /* <: TimerId */](
      Date: DateConstructor,
      clearImmediate: TTimerId => Callback,
      clearInterval: TTimerId => Callback,
      clearTimeout: TTimerId => Callback,
      setImmediate: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => TTimerId,
      setInterval: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => TTimerId,
      setTimeout: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => TTimerId
    ): GlobalTimers[TTimerId] = {
      val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], clearImmediate = js.Any.fromFunction1((t0: TTimerId) => clearImmediate(t0).runNow()), clearInterval = js.Any.fromFunction1((t0: TTimerId) => clearInterval(t0).runNow()), clearTimeout = js.Any.fromFunction1((t0: TTimerId) => clearTimeout(t0).runNow()), setImmediate = js.Any.fromFunction2(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout))
      __obj.asInstanceOf[GlobalTimers[TTimerId]]
    }
    
    extension [Self <: GlobalTimers[?], TTimerId /* <: TimerId */](x: Self & GlobalTimers[TTimerId]) {
      
      inline def setClearImmediate(value: TTimerId => Callback): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1((t0: TTimerId) => value(t0).runNow()))
      
      inline def setClearInterval(value: TTimerId => Callback): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1((t0: TTimerId) => value(t0).runNow()))
      
      inline def setClearTimeout(value: TTimerId => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: TTimerId) => value(t0).runNow()))
      
      inline def setDate(value: DateConstructor): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setSetImmediate(value: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => TTimerId): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      inline def setSetInterval(value: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => TTimerId): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => TTimerId): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
    }
  }
  
  type InstalledClock = Clock & InstalledMethods
  
  trait InstalledMethods extends StObject {
    
    var methods: js.Array[FakeMethod]
    
    /**
      * Restores the original methods on the context that was passed to FakeTimers.install,
      * or the native timers if no context was given.
      */
    def uninstall(): Unit
  }
  object InstalledMethods {
    
    inline def apply(methods: js.Array[FakeMethod], uninstall: Callback): InstalledMethods = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uninstall = uninstall.toJsFn)
      __obj.asInstanceOf[InstalledMethods]
    }
    
    extension [Self <: InstalledMethods](x: Self) {
      
      inline def setMethods(value: js.Array[FakeMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: FakeMethod*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setUninstall(value: Callback): Self = StObject.set(x, "uninstall", value.toJsFn)
    }
  }
  
  @js.native
  trait NodeClock
    extends StObject
       with FakeClock[NodeTimer] {
    
    /**
      * Mimics process.hrtime().
      *
      * @param prevTime   Previous system time to calculate time elapsed.
      * @returns High resolution real time as [seconds, nanoseconds].
      */
    def hrtime(): js.Tuple2[Double, Double] = js.native
    def hrtime(prevTime: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
    
    /**
      * Simulates process.nextTick().
      */
    def nextTick(callback: js.Function1[/* repeated */ Any, Unit], args: Any*): Unit = js.native
    
    /**
      * Mimics process.nextTick() explicitly dropping additional arguments.
      */
    def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Run all pending microtasks scheduled with nextTick.
      */
    def runMicrotasks(): Unit = js.native
  }
  
  trait NodeTimer extends StObject {
    
    /**
      * Stub method call. Does nothing.
      */
    def ref(): NodeTimer
    
    /**
      * Refreshes the timer.
      */
    def refresh(): NodeTimer
    
    /**
      * Stub method call. Does nothing.
      */
    def unref(): NodeTimer
  }
  object NodeTimer {
    
    inline def apply(ref: CallbackTo[NodeTimer], refresh: CallbackTo[NodeTimer], unref: CallbackTo[NodeTimer]): NodeTimer = {
      val __obj = js.Dynamic.literal(ref = ref.toJsFn, refresh = refresh.toJsFn, unref = unref.toJsFn)
      __obj.asInstanceOf[NodeTimer]
    }
    
    extension [Self <: NodeTimer](x: Self) {
      
      inline def setRef(value: CallbackTo[NodeTimer]): Self = StObject.set(x, "ref", value.toJsFn)
      
      inline def setRefresh(value: CallbackTo[NodeTimer]): Self = StObject.set(x, "refresh", value.toJsFn)
      
      inline def setUnref(value: CallbackTo[NodeTimer]): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
  
  type TimerId = Double | NodeTimer
}
