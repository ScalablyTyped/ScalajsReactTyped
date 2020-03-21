package typingsJapgolly.tstl.ilockableMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockable extends js.Object {
  /**
    * Lock until be unlocked.
    */
  def lock(): js.Promise[Unit]
  /**
    * Try {@link lock}.
    *
    * @return Whether succeeded to lock or not.
    */
  def try_lock(): js.Promise[Boolean]
  /**
    * Unlock.
    */
  def unlock(): js.Promise[Unit]
}

object ILockable {
  @scala.inline
  def apply(
    lock: CallbackTo[js.Promise[Unit]],
    try_lock: CallbackTo[js.Promise[Boolean]],
    unlock: CallbackTo[js.Promise[Unit]]
  ): ILockable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lock")(lock.toJsFn)
    __obj.updateDynamic("try_lock")(try_lock.toJsFn)
    __obj.updateDynamic("unlock")(unlock.toJsFn)
    __obj.asInstanceOf[ILockable]
  }
}

