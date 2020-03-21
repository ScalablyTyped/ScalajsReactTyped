package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.PickILockablelockunlock
import typingsJapgolly.tstl.PickILockabletrylockunloc
import typingsJapgolly.tstl.PickITimedLockabletrylock
import typingsJapgolly.tstl.PickITimedLockabletrylockTrylockuntil
import typingsJapgolly.tstl.uniqueLockMod.Closure
import typingsJapgolly.tstl.uniqueLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "UniqueLock")
@js.native
class UniqueLock[Mutex /* <: IMutex */] protected ()
  extends typingsJapgolly.tstl.threadMod.UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "UniqueLock")
@js.native
object UniqueLock extends js.Object {
  def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_for")
  def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_until")
  def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
}

