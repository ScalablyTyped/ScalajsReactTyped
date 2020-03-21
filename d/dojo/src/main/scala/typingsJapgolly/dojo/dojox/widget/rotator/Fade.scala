package typingsJapgolly.dojo.dojox.widget.rotator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Fade.html
  *
  *
  */
trait Fade extends js.Object {
  /**
    * Returns a dojo.Animation that cross fades two rotator panes.
    *
    * @param args
    */
  def crossFade(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that fades out the current pane, then fades in
    * the next pane.
    *
    * @param args
    */
  def fade(args: js.Object): js.Any
}

object Fade {
  @scala.inline
  def apply(crossFade: js.Object => CallbackTo[js.Any], fade: js.Object => CallbackTo[js.Any]): Fade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("crossFade")(js.Any.fromFunction1((t0: js.Object) => crossFade(t0).runNow()))
    __obj.updateDynamic("fade")(js.Any.fromFunction1((t0: js.Object) => fade(t0).runNow()))
    __obj.asInstanceOf[Fade]
  }
}

