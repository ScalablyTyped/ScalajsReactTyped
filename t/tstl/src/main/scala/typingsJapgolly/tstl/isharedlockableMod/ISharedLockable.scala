package typingsJapgolly.tstl.isharedlockableMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedLockable extends js.Object {
  /**
    * Lock shared until be unlock shared.
    */
  def lock_shared(): js.Promise[Unit]
  /**
    * Try lock shared.
    */
  def try_lock_shared(): js.Promise[Boolean]
  /**
    * Unlock shared.
    */
  def unlock_shared(): js.Promise[Unit]
}

object ISharedLockable {
  @scala.inline
  def apply(
    lock_shared: CallbackTo[js.Promise[Unit]],
    try_lock_shared: CallbackTo[js.Promise[Boolean]],
    unlock_shared: CallbackTo[js.Promise[Unit]]
  ): ISharedLockable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lock_shared")(lock_shared.toJsFn)
    __obj.updateDynamic("try_lock_shared")(try_lock_shared.toJsFn)
    __obj.updateDynamic("unlock_shared")(unlock_shared.toJsFn)
    __obj.asInstanceOf[ISharedLockable]
  }
}

