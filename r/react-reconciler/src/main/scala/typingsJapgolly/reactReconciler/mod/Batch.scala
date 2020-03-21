package typingsJapgolly.reactReconciler.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiberRoot
// TODO: This should be lifted into the renderer.
trait Batch extends js.Object {
  var _defer: Boolean
  var _expirationTime: ExpirationTime
  var _next: Batch | Null
  def _onComplete(): js.Any
}

object Batch {
  @scala.inline
  def apply(
    _defer: Boolean,
    _expirationTime: ExpirationTime,
    _onComplete: CallbackTo[js.Any],
    _next: Batch = null
  ): Batch = {
    val __obj = js.Dynamic.literal(_defer = _defer.asInstanceOf[js.Any], _expirationTime = _expirationTime.asInstanceOf[js.Any])
    __obj.updateDynamic("_onComplete")(_onComplete.toJsFn)
    if (_next != null) __obj.updateDynamic("_next")(_next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
}

