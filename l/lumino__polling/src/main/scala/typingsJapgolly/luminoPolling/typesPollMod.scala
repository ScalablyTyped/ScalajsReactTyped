package typingsJapgolly.luminoPolling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.luminoDisposable.mod.IObservableDisposable
import typingsJapgolly.luminoPolling.anon.Cancel
import typingsJapgolly.luminoPolling.anon.PartialFrequency
import typingsJapgolly.luminoPolling.mod.IPoll
import typingsJapgolly.luminoPolling.mod.IPoll.Frequency
import typingsJapgolly.luminoPolling.mod.IPoll.State
import typingsJapgolly.luminoPolling.typesPollMod.Poll.IOptions
import typingsJapgolly.luminoPolling.typesPollMod.Poll.Standby
import typingsJapgolly.luminoSignaling.mod.ISignal
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPollMod {
  
  @JSImport("@lumino/polling/types/poll", "Poll")
  @js.native
  open class Poll[T, U, V /* <: String */] protected ()
    extends StObject
       with IObservableDisposable
       with IPoll[T, U, V] {
    /**
      * Instantiate a new poll with exponential backoff in case of failure.
      *
      * @param options - The poll instantiation options.
      */
    def this(options: IOptions[T, U, V]) = this()
    
    /* private */ var _disposed: Any = js.native
    
    /**
      * Execute a new poll factory promise or stand by if necessary.
      */
    /* private */ var _execute: Any = js.native
    
    /* private */ var _factory: Any = js.native
    
    /* private */ var _frequency: Any = js.native
    
    /* private */ var _standby: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _tick: Any = js.native
    
    /* private */ var _ticked: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * A signal emitted when the poll is disposed.
      */
    /* InferMemberOverrides */
    override val disposed: ISignal[this.type, Unit] = js.native
    
    /**
      * The polling frequency data.
      */
    /* CompleteClass */
    override val frequency: Frequency = js.native
    
    /**
      * Whether the poll is disposed.
      */
    /* InferMemberOverrides */
    override val isDisposed: Boolean = js.native
    
    /**
      * The name of the poll.
      */
    /* CompleteClass */
    override val name: String = js.native
    
    /**
      * Refreshes the poll. Schedules `refreshed` tick if necessary.
      *
      * @returns A promise that resolves after tick is scheduled and never rejects.
      *
      * #### Notes
      * The returned promise resolves after the tick is scheduled, but before
      * the polling action is run. To wait until after the poll action executes,
      * await the `poll.tick` promise: `await poll.refresh(); await poll.tick;`
      */
    def refresh(): js.Promise[Unit] = js.native
    
    /**
      * Schedule the next poll tick.
      *
      * @param next - The next poll state data to schedule. Defaults to standby.
      *
      * @param next.cancel - Cancels state transition if function returns `true`.
      *
      * @returns A promise that resolves when the next poll state is active.
      *
      * #### Notes
      * This method is not meant to be invoked by user code typically. It is public
      * to allow poll instances to be composed into classes that schedule ticks.
      */
    def schedule(): js.Promise[Unit] = js.native
    def schedule(next: Partial[(State[T, U, V]) & (Cancel[T, U, V])]): js.Promise[Unit] = js.native
    
    /**
      * Indicates when the poll switches to standby.
      */
    var standby: Standby | (js.Function0[Boolean | Standby]) = js.native
    
    /**
      * Starts the poll. Schedules `started` tick if necessary.
      *
      * @returns A promise that resolves after tick is scheduled and never rejects.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * The poll state, which is the content of the currently-scheduled poll tick.
      */
    /* CompleteClass */
    override val state: State[T, U, V] = js.native
    
    /**
      * Stops the poll. Schedules `stopped` tick if necessary.
      *
      * @returns A promise that resolves after tick is scheduled and never rejects.
      */
    def stop(): js.Promise[Unit] = js.native
    
    /**
      * A promise that resolves when the currently-scheduled tick completes.
      *
      * #### Notes
      * Usually this will resolve after `state.interval` milliseconds from
      * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
      * poll, etc.
      */
    /* CompleteClass */
    override val tick: js.Promise[IPoll[T, U, V]] = js.native
    /**
      * A promise that resolves when the poll next ticks.
      */
    @JSName("tick")
    val tick_Poll: js.Promise[this.type] = js.native
    
    /**
      * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
      */
    /* CompleteClass */
    override val ticked: ISignal[IPoll[T, U, V], State[T, U, V]] = js.native
    /**
      * A signal emitted when the poll ticks and fires off a new request.
      */
    @JSName("ticked")
    val ticked_Poll: ISignal[this.type, State[T, U, V]] = js.native
  }
  object Poll {
    
    /**
      * An interval value that indicates the poll should tick immediately.
      */
    @JSImport("@lumino/polling/types/poll", "Poll.IMMEDIATE")
    @js.native
    val IMMEDIATE: /* 0 */ Double = js.native
    
    /**
      * Delays are 32-bit integers in many browsers so intervals need to be capped.
      *
      * #### Notes
      * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
      */
    @JSImport("@lumino/polling/types/poll", "Poll.MAX_INTERVAL")
    @js.native
    val MAX_INTERVAL: /* 2147483647 */ Double = js.native
    
    /**
      * An interval value that indicates the poll should never tick.
      */
    @JSImport("@lumino/polling/types/poll", "Poll.NEVER")
    @js.native
    val NEVER: Double = js.native
    
    /**
      * A promise factory that returns an individual poll request.
      *
      * @typeparam T - The resolved type of the factory's promises.
      *
      * @typeparam U - The rejected type of the factory's promises.
      *
      * @typeparam V - The type to extend the phases supported by a poll.
      */
    type Factory[T, U, V /* <: String */] = js.Function1[/* state */ State[T, U, V], js.Promise[T]]
    
    /**
      * Instantiation options for polls.
      *
      * @typeparam T - The resolved type of the factory's promises.
      *
      * @typeparam U - The rejected type of the factory's promises.
      *
      * @typeparam V - The type to extend the phases supported by a poll.
      */
    trait IOptions[T, U, V /* <: String */] extends StObject {
      
      /**
        * Whether to begin polling automatically; defaults to `true`.
        */
      var auto: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A factory function that is passed a poll tick and returns a poll promise.
        */
      def factory(state: State[T, U, V]): js.Promise[T]
      /**
        * A factory function that is passed a poll tick and returns a poll promise.
        */
      @JSName("factory")
      var factory_Original: Factory[T, U, V]
      
      /**
        * The polling frequency parameters.
        */
      var frequency: js.UndefOr[PartialFrequency] = js.undefined
      
      /**
        * The name of the poll.
        * Defaults to `'unknown'`.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Indicates when the poll switches to standby or a function that returns
        * a boolean or a `Poll.Standby` value to indicate whether to stand by.
        * Defaults to `'when-hidden'`.
        *
        * #### Notes
        * If a function is passed in, for any given context, it should be
        * idempotent and safe to call multiple times. It will be called before each
        * tick execution, but may be called by clients as well.
        */
      var standby: js.UndefOr[Standby | (js.Function0[Boolean | Standby])] = js.undefined
    }
    object IOptions {
      
      inline def apply[T, U, V /* <: String */](factory: /* state */ State[T, U, V] => js.Promise[T]): IOptions[T, U, V] = {
        val __obj = js.Dynamic.literal(factory = js.Any.fromFunction1(factory))
        __obj.asInstanceOf[IOptions[T, U, V]]
      }
      
      extension [Self <: IOptions[?, ?, ?], T, U, V /* <: String */](x: Self & (IOptions[T, U, V])) {
        
        inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
        
        inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
        
        inline def setFactory(value: /* state */ State[T, U, V] => js.Promise[T]): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
        
        inline def setFrequency(value: PartialFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
        
        inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setStandby(value: Standby | (js.Function0[Boolean | Standby])): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        inline def setStandbyCallbackTo(value: CallbackTo[Boolean | Standby]): Self = StObject.set(x, "standby", value.toJsFn)
        
        inline def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
    
    /**
      * Indicates when the poll switches to standby.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoPolling.luminoPollingStrings.never
      - typingsJapgolly.luminoPolling.luminoPollingStrings.`when-hidden`
    */
    trait Standby extends StObject
    object Standby {
      
      inline def never: typingsJapgolly.luminoPolling.luminoPollingStrings.never = "never".asInstanceOf[typingsJapgolly.luminoPolling.luminoPollingStrings.never]
      
      inline def `when-hidden`: typingsJapgolly.luminoPolling.luminoPollingStrings.`when-hidden` = "when-hidden".asInstanceOf[typingsJapgolly.luminoPolling.luminoPollingStrings.`when-hidden`]
    }
  }
}
