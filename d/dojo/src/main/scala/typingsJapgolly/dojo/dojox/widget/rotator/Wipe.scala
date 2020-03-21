package typingsJapgolly.dojo.dojox.widget.rotator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Wipe.html
  *
  *
  */
trait Wipe extends js.Object {
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the top.
    *
    * @param args
    */
  def wipeDown(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the left.
    *
    * @param args
    */
  def wipeLeft(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the right.
    *
    * @param args
    */
  def wipeRight(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the bottom.
    *
    * @param args
    */
  def wipeUp(args: js.Object): js.Any
}

object Wipe {
  @scala.inline
  def apply(
    wipeDown: js.Object => CallbackTo[js.Any],
    wipeLeft: js.Object => CallbackTo[js.Any],
    wipeRight: js.Object => CallbackTo[js.Any],
    wipeUp: js.Object => CallbackTo[js.Any]
  ): Wipe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wipeDown")(js.Any.fromFunction1((t0: js.Object) => wipeDown(t0).runNow()))
    __obj.updateDynamic("wipeLeft")(js.Any.fromFunction1((t0: js.Object) => wipeLeft(t0).runNow()))
    __obj.updateDynamic("wipeRight")(js.Any.fromFunction1((t0: js.Object) => wipeRight(t0).runNow()))
    __obj.updateDynamic("wipeUp")(js.Any.fromFunction1((t0: js.Object) => wipeUp(t0).runNow()))
    __obj.asInstanceOf[Wipe]
  }
}

