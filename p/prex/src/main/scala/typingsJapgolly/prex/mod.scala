package typingsJapgolly.prex

import typingsJapgolly.esfxCancelable.distMod.Cancelable
import typingsJapgolly.prex.cancellationMod.AbortSignalLike
import typingsJapgolly.prex.cancellationMod.VSCodeCancellationTokenLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Initializes a new instance of the AsyncProducerConsumerQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncBoundedQueue[T] ()
    extends typingsJapgolly.prex.boundedQueueMod.AsyncBoundedQueue[T] {
    def this(iterable: js.Iterable[T | js.Thenable[T]]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the AsyncQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncQueue[T] ()
    extends typingsJapgolly.prex.queueMod.AsyncQueue[T] {
    def this(iterable: js.Iterable[T | js.Thenable[T]]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the AsyncStack class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncStack[T] ()
    extends typingsJapgolly.prex.stackMod.AsyncStack[T] {
    def this(iterable: js.Iterable[T | js.Thenable[T]]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the AutoResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class AutoResetEvent ()
    extends typingsJapgolly.prex.autoreseteventMod.AutoResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @js.native
  class Barrier protected ()
    extends typingsJapgolly.prex.barrierMod.Barrier {
    /**
      * Initializes a new instance of the Barrier class.
      *
      * @param participantCount The initial number of participants for the barrier.
      * @param postPhaseAction An action to execute between each phase.
      */
    def this(participantCount: Double) = this()
    def this(
      participantCount: Double,
      postPhaseAction: js.Function1[/* barrier */ typingsJapgolly.prex.barrierMod.Barrier, Unit | js.Thenable[Unit]]
    ) = this()
  }
  
  @js.native
  class CancelError ()
    extends typingsJapgolly.prex.cancellationMod.CancelError {
    def this(message: String) = this()
  }
  
  @js.native
  class CancellationToken ()
    extends typingsJapgolly.prex.cancellationMod.CancellationToken
  
  @js.native
  class CancellationTokenCountdown ()
    extends typingsJapgolly.prex.cancellationMod.CancellationTokenCountdown {
    def this(iterable: js.Iterable[typingsJapgolly.prex.cancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of a CancellationTokenSource.
    *
    * @param linkedTokens An optional iterable of tokens to which to link this source.
    */
  class CancellationTokenSource ()
    extends typingsJapgolly.prex.cancellationMod.CancellationTokenSource {
    def this(linkedTokens: js.Iterable[typingsJapgolly.prex.cancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @js.native
  class CountdownEvent protected ()
    extends typingsJapgolly.prex.countdownMod.CountdownEvent {
    /**
      * Initializes a new instance of the CountdownEvent class.
      *
      * @param initialCount The initial participant count.
      */
    def this(initialCount: Double) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  class Deferred[T] ()
    extends typingsJapgolly.prex.deferredMod.Deferred[T]
  
  @js.native
  /**
    * Initializes a new instance of the ManualResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class ManualResetEvent ()
    extends typingsJapgolly.prex.manualreseteventMod.ManualResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @js.native
  class Pulsar ()
    extends typingsJapgolly.prex.pulsarMod.Pulsar
  
  @js.native
  class ReaderWriterLock ()
    extends typingsJapgolly.prex.readerwriterlockMod.ReaderWriterLock
  
  @js.native
  class Semaphore protected ()
    extends typingsJapgolly.prex.semaphoreMod.Semaphore {
    /**
      * Initializes a new instance of the Semaphore class.
      *
      * @param initialCount The initial number of entries.
      * @param maxCount The maximum number of entries.
      */
    def this(initialCount: Double) = this()
    def this(initialCount: Double, maxCount: Double) = this()
  }
  
  def delay(msec: Double): js.Promise[Unit] = js.native
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = js.native
  def delay(token: typingsJapgolly.prex.cancellationMod.CancellationToken, msec: Double): js.Promise[Unit] = js.native
  def delay[T](msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: typingsJapgolly.prex.cancellationMod.CancellationToken, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: typingsJapgolly.prex.cancellationMod.CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  /* static members */
  @js.native
  object CancellationToken extends js.Object {
    /**
      * A token that is already canceled.
      */
    val canceled: typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    /**
      * A token which will never be canceled.
      */
    val none: typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    /**
      * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    def all(tokens: js.Iterable[typingsJapgolly.prex.cancellationMod.CancellationToken | Cancelable]): typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    def from(cancelable: Cancelable): typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    def from(cancelable: AbortSignalLike): typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    /**
      * Adapts a CancellationToken-like primitive from a different library.
      */
    def from(cancelable: typingsJapgolly.prex.cancellationMod.CancellationToken): typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    def from(cancelable: VSCodeCancellationTokenLike): typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
    /**
      * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    def race(tokens: js.Iterable[typingsJapgolly.prex.cancellationMod.CancellationToken | Cancelable]): typingsJapgolly.prex.cancellationMod.CancellationToken = js.native
  }
  
}

