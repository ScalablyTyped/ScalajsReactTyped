package typingsJapgolly.lolex

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.lolex.anon.Now
import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lolex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClock[TClock /* <: Clock */](): TClock = ^.asInstanceOf[js.Dynamic].applyDynamic("createClock")().asInstanceOf[TClock]
  inline def createClock[TClock /* <: Clock */](now: js.Date): TClock = ^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any]).asInstanceOf[TClock]
  inline def createClock[TClock /* <: Clock */](now: js.Date, loopLimit: Double): TClock = (^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any], loopLimit.asInstanceOf[js.Any])).asInstanceOf[TClock]
  inline def createClock[TClock /* <: Clock */](now: Double): TClock = ^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any]).asInstanceOf[TClock]
  inline def createClock[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = (^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any], loopLimit.asInstanceOf[js.Any])).asInstanceOf[TClock]
  inline def createClock[TClock /* <: Clock */](now: Unit, loopLimit: Double): TClock = (^.asInstanceOf[js.Dynamic].applyDynamic("createClock")(now.asInstanceOf[js.Any], loopLimit.asInstanceOf[js.Any])).asInstanceOf[TClock]
  
  inline def install[TClock /* <: Clock */](): InstalledClock[TClock] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[InstalledClock[TClock]]
  inline def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(opts.asInstanceOf[js.Any]).asInstanceOf[InstalledClock[TClock]]
  
  object timers extends Shortcut {
    
    @JSImport("lolex", "timers")
    @js.native
    val ^ : GlobalTimers[TimerId] = js.native
    
    /**
      * Implements the Date object but using this clock to provide the correct time.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("lolex", "timers.Date")
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
  
  inline def withGlobal(global: js.Object): LolexWithContext = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobal")(global.asInstanceOf[js.Any]).asInstanceOf[LolexWithContext]
  
  /**
    * Lolex clock for a browser environment.
    */
  @js.native
  trait BrowserClock
    extends StObject
       with LolexClock[Double]
       with Clock {
    
    /**
      * Mimics performance.now().
      */
    var performance: Now = js.native
  }
  
  /**
    * Clock object created by lolex.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lolex.mod.BrowserClock
    - typingsJapgolly.lolex.mod.NodeClock
  */
  trait Clock extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lolex.lolexStrings.setTimeout
    - typingsJapgolly.lolex.lolexStrings.clearTimeout
    - typingsJapgolly.lolex.lolexStrings.setImmediate
    - typingsJapgolly.lolex.lolexStrings.clearImmediate
    - typingsJapgolly.lolex.lolexStrings.setInterval
    - typingsJapgolly.lolex.lolexStrings.clearInterval
    - typingsJapgolly.lolex.lolexStrings.Date
    - typingsJapgolly.lolex.lolexStrings.nextTick
    - typingsJapgolly.lolex.lolexStrings.hrtime
    - typingsJapgolly.lolex.lolexStrings.requestAnimationFrame
    - typingsJapgolly.lolex.lolexStrings.cancelAnimationFrame
    - typingsJapgolly.lolex.lolexStrings.requestIdleCallback
    - typingsJapgolly.lolex.lolexStrings.cancelIdleCallback
  */
  trait FakeMethod extends StObject
  object FakeMethod {
    
    inline def Date: typingsJapgolly.lolex.lolexStrings.Date = "Date".asInstanceOf[typingsJapgolly.lolex.lolexStrings.Date]
    
    inline def cancelAnimationFrame: typingsJapgolly.lolex.lolexStrings.cancelAnimationFrame = "cancelAnimationFrame".asInstanceOf[typingsJapgolly.lolex.lolexStrings.cancelAnimationFrame]
    
    inline def cancelIdleCallback: typingsJapgolly.lolex.lolexStrings.cancelIdleCallback = "cancelIdleCallback".asInstanceOf[typingsJapgolly.lolex.lolexStrings.cancelIdleCallback]
    
    inline def clearImmediate: typingsJapgolly.lolex.lolexStrings.clearImmediate = "clearImmediate".asInstanceOf[typingsJapgolly.lolex.lolexStrings.clearImmediate]
    
    inline def clearInterval: typingsJapgolly.lolex.lolexStrings.clearInterval = "clearInterval".asInstanceOf[typingsJapgolly.lolex.lolexStrings.clearInterval]
    
    inline def clearTimeout: typingsJapgolly.lolex.lolexStrings.clearTimeout = "clearTimeout".asInstanceOf[typingsJapgolly.lolex.lolexStrings.clearTimeout]
    
    inline def hrtime: typingsJapgolly.lolex.lolexStrings.hrtime = "hrtime".asInstanceOf[typingsJapgolly.lolex.lolexStrings.hrtime]
    
    inline def nextTick: typingsJapgolly.lolex.lolexStrings.nextTick = "nextTick".asInstanceOf[typingsJapgolly.lolex.lolexStrings.nextTick]
    
    inline def requestAnimationFrame: typingsJapgolly.lolex.lolexStrings.requestAnimationFrame = "requestAnimationFrame".asInstanceOf[typingsJapgolly.lolex.lolexStrings.requestAnimationFrame]
    
    inline def requestIdleCallback: typingsJapgolly.lolex.lolexStrings.requestIdleCallback = "requestIdleCallback".asInstanceOf[typingsJapgolly.lolex.lolexStrings.requestIdleCallback]
    
    inline def setImmediate: typingsJapgolly.lolex.lolexStrings.setImmediate = "setImmediate".asInstanceOf[typingsJapgolly.lolex.lolexStrings.setImmediate]
    
    inline def setInterval: typingsJapgolly.lolex.lolexStrings.setInterval = "setInterval".asInstanceOf[typingsJapgolly.lolex.lolexStrings.setInterval]
    
    inline def setTimeout: typingsJapgolly.lolex.lolexStrings.setTimeout = "setTimeout".asInstanceOf[typingsJapgolly.lolex.lolexStrings.setTimeout]
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
    def clearTimeout(id: TimerId): Unit
    
    /**
      * Schedules the callback to be fired once 0 milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @remarks You'll still have to call clock.tick() for the callback to fire.
      * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
      */
    def setImmediate(callback: js.Function0[Unit]): TTimerId
    
    /**
      * Schedules a callback to be fired every time timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait between callbacks.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setInterval(callback: js.Function0[Unit], timeout: Double, args: Any*): TTimerId
    
    /**
      * Schedules a callback to be fired once timeout milliseconds have ticked by.
      *
      * @param callback   Callback to be fired.
      * @param timeout   How many ticks to wait to run the callback.
      * @param args   Any extra arguments to pass to the callback.
      * @returns Time identifier for cancellation.
      */
    def setTimeout(callback: js.Function0[Unit], timeout: Double, args: Any*): TTimerId
  }
  object GlobalTimers {
    
    inline def apply[TTimerId /* <: TimerId */](
      Date: DateConstructor,
      clearImmediate: TTimerId => Callback,
      clearInterval: TTimerId => Callback,
      clearTimeout: TimerId => Callback,
      setImmediate: js.Function0[Unit] => TTimerId,
      setInterval: (js.Function0[Unit], Double, /* repeated */ Any) => TTimerId,
      setTimeout: (js.Function0[Unit], Double, /* repeated */ Any) => TTimerId
    ): GlobalTimers[TTimerId] = {
      val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], clearImmediate = js.Any.fromFunction1((t0: TTimerId) => clearImmediate(t0).runNow()), clearInterval = js.Any.fromFunction1((t0: TTimerId) => clearInterval(t0).runNow()), clearTimeout = js.Any.fromFunction1((t0: TimerId) => clearTimeout(t0).runNow()), setImmediate = js.Any.fromFunction1(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout))
      __obj.asInstanceOf[GlobalTimers[TTimerId]]
    }
    
    extension [Self <: GlobalTimers[?], TTimerId /* <: TimerId */](x: Self & GlobalTimers[TTimerId]) {
      
      inline def setClearImmediate(value: TTimerId => Callback): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1((t0: TTimerId) => value(t0).runNow()))
      
      inline def setClearInterval(value: TTimerId => Callback): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1((t0: TTimerId) => value(t0).runNow()))
      
      inline def setClearTimeout(value: TimerId => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: TimerId) => value(t0).runNow()))
      
      inline def setDate(value: DateConstructor): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setSetImmediate(value: js.Function0[Unit] => TTimerId): Self = StObject.set(x, "setImmediate", js.Any.fromFunction1(value))
      
      inline def setSetInterval(value: (js.Function0[Unit], Double, /* repeated */ Any) => TTimerId): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(value: (js.Function0[Unit], Double, /* repeated */ Any) => TTimerId): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: Clock */] = TClock & InstalledMethods
  
  /**
    * Additional methods that installed clock have.
    */
  trait InstalledMethods extends StObject {
    
    var methods: js.Array[FakeMethod]
    
    /**
      * Restores the original methods on the context that was passed to lolex.install,
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
  trait LolexClock[TTimerId /* <: TimerId */]
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
      */
    def next(): Unit = js.native
    
    /**
      * Advances the clock to the the moment of the first scheduled timer, firing it.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def nextAsync(): js.Promise[Unit] = js.native
    
    /**
      * Current clock time.
      */
    var now: Double = js.native
    
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
      */
    def runAll(): Unit = js.native
    
    /**
      * Runs all pending timers until there are none remaining.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @remarks  If new timers are added while it is executing they will be run as well.
      */
    def runAllAsync(): js.Promise[Unit] = js.native
    
    /**
      * Advanced the clock to the next animation frame while firing all scheduled callbacks.
      */
    def runToFrame(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      */
    def runToLast(): Unit = js.native
    
    /**
      * Takes note of the last scheduled timer when it is run, and advances the clock to
      * that time firing callbacks as necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      */
    def runToLastAsync(): js.Promise[Unit] = js.native
    
    /**
      * Simulates a user changing the system clock.
      *
      * @param now   New system time.
      * @remarks This affects the current time but it does not in itself cause timers to fire.
      */
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: js.Date): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    
    def tick(time: String): Unit = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * @param time   How many ticks to advance by.
      */
    def tick(time: Double): Unit = js.native
    
    def tickAsync(time: String): js.Promise[Unit] = js.native
    /**
      * Advance the clock, firing callbacks if necessary.
      *
      * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
      *
      * @param time   How many ticks to advance by.
      */
    def tickAsync(time: Double): js.Promise[Unit] = js.native
  }
  
  trait LolexInstallOpts extends StObject {
    
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
      * Installs lolex with the specified unix epoch (default: 0)
      */
    var now: js.UndefOr[Double | js.Date] = js.undefined
    
    /**
      * Tells lolex to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
      * 20ms for every 20ms change in the real system time) (default: false)
      */
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Installs lolex onto the specified target context (default: global)
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /**
      * An array with explicit function names to hijack. When not set, lolex will automatically fake all methods except nextTick
      * e.g., lolex.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
      */
    var toFake: js.UndefOr[js.Array[FakeMethod]] = js.undefined
  }
  object LolexInstallOpts {
    
    inline def apply(): LolexInstallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LolexInstallOpts]
    }
    
    extension [Self <: LolexInstallOpts](x: Self) {
      
      inline def setAdvanceTimeDelta(value: Double): Self = StObject.set(x, "advanceTimeDelta", value.asInstanceOf[js.Any])
      
      inline def setAdvanceTimeDeltaUndefined: Self = StObject.set(x, "advanceTimeDelta", js.undefined)
      
      inline def setLoopLimit(value: Double): Self = StObject.set(x, "loopLimit", value.asInstanceOf[js.Any])
      
      inline def setLoopLimitUndefined: Self = StObject.set(x, "loopLimit", js.undefined)
      
      inline def setNow(value: Double | js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      inline def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setToFake(value: js.Array[FakeMethod]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      inline def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      inline def setToFakeVarargs(value: FakeMethod*): Self = StObject.set(x, "toFake", js.Array(value*))
    }
  }
  
  @js.native
  trait LolexWithContext extends StObject {
    
    def createClock[TClock /* <: Clock */](): TClock = js.native
    def createClock[TClock /* <: Clock */](now: js.Date): TClock = js.native
    def createClock[TClock /* <: Clock */](now: js.Date, loopLimit: Double): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Double): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = js.native
    def createClock[TClock /* <: Clock */](now: Unit, loopLimit: Double): TClock = js.native
    
    def install[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
    def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
    
    var timers: GlobalTimers[TimerId] = js.native
    
    def withGlobal(global: js.Object): LolexWithContext = js.native
  }
  
  /**
    * Lolex clock for a Node environment.
    */
  @js.native
  trait NodeClock
    extends StObject
       with LolexClock[NodeTimer]
       with Clock {
    
    /**
      * Mimicks process.hrtime().
      *
      * @param prevTime   Previous system time to calculate time elapsed.
      * @returns High resolution real time as [seconds, nanoseconds].
      */
    def hrtime(): js.Tuple2[Double, Double] = js.native
    def hrtime(prevTime: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
    
    /**
      * Simulates process.nextTick().
      */
    def nextTick(callback: js.Function0[Unit]): Unit = js.native
    
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
    def ref(): Unit
    
    /**
      * Stub method call. Does nothing.
      */
    def unref(): Unit
  }
  object NodeTimer {
    
    inline def apply(ref: Callback, unref: Callback): NodeTimer = {
      val __obj = js.Dynamic.literal(ref = ref.toJsFn, unref = unref.toJsFn)
      __obj.asInstanceOf[NodeTimer]
    }
    
    extension [Self <: NodeTimer](x: Self) {
      
      inline def setRef(value: Callback): Self = StObject.set(x, "ref", value.toJsFn)
      
      inline def setUnref(value: Callback): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
  
  type TimerId = Double | NodeTimer
}
