package typingsJapgolly.tstl

import typingsJapgolly.tstl.sharedLockMod.Closure
import typingsJapgolly.tstl.sharedLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object threadMod extends js.Object {
  @js.native
  class Barrier protected ()
    extends typingsJapgolly.tstl.barrierMod.Barrier {
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable ()
    extends typingsJapgolly.tstl.conditionVariableMod.ConditionVariable
  
  @js.native
  class FlexBarrier protected ()
    extends typingsJapgolly.tstl.flexBarrierMod.FlexBarrier {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
      */
    def this(size: Double) = this()
    def this(size: Double, complete: js.Function0[Double]) = this()
  }
  
  @js.native
  class Latch protected ()
    extends typingsJapgolly.tstl.latchMod.Latch {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class Mutex ()
    extends typingsJapgolly.tstl.mutexMod.Mutex
  
  @js.native
  class Semaphore[Max /* <: Double */] protected ()
    extends typingsJapgolly.tstl.semaphoreMod.Semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected ()
    extends typingsJapgolly.tstl.sharedLockMod.SharedLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends typingsJapgolly.tstl.sharedMutexMod.SharedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends typingsJapgolly.tstl.sharedTimedMutexMod.SharedTimedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex ()
    extends typingsJapgolly.tstl.timedMutexMod.TimedMutex
  
  @js.native
  class UniqueLock[Mutex /* <: typingsJapgolly.tstl.uniqueLockMod.IMutex */] protected ()
    extends typingsJapgolly.tstl.uniqueLockMod.UniqueLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  def lock(items: PickILockablelock*): js.Promise[Unit] = js.native
  @JSName("sleep_for")
  def sleepFor(ms: Double): js.Promise[Unit] = js.native
  @JSName("sleep_until")
  def sleepUntil(at: js.Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock(items: PickILockabletrylock*): js.Promise[Double] = js.native
  @js.native
  object SharedLock extends js.Object {
    def lock[Mutex /* <: PickISharedLockablelocksh */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickISharedLockabletryloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickISharedTimedLockablet */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickISharedTimedLockabletTrylockshareduntil */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: typingsJapgolly.tstl.uniqueLockMod.Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: typingsJapgolly.tstl.uniqueLockMod.Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: typingsJapgolly.tstl.uniqueLockMod.Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: js.Date, closure: typingsJapgolly.tstl.uniqueLockMod.Closure): js.Promise[Boolean] = js.native
  }
  
}

