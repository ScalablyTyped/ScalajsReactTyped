package typingsJapgolly.ink.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
  	 * Manually unmount the whole Ink app.
  	 */
  var unmount: Unmount
  /**
  	 * Replace previous root node with a new one or update props of the current root node.
  	 */
  def rerender[Props](tree: Element): Unit
  /**
  	 * Returns a promise, which resolves when app is unmounted.
  	 */
  def waitUntilExit(): js.Promise[Unit]
}

object Instance {
  @scala.inline
  def apply(rerender: Element => Callback, unmount: Callback, waitUntilExit: CallbackTo[js.Promise[Unit]]): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rerender")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Element) => rerender(t0).runNow()))
    __obj.updateDynamic("unmount")(unmount.toJsFn)
    __obj.updateDynamic("waitUntilExit")(waitUntilExit.toJsFn)
    __obj.asInstanceOf[Instance]
  }
}

