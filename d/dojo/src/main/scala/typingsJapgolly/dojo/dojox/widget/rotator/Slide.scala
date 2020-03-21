package typingsJapgolly.dojo.dojox.widget.rotator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Slide.html
  *
  *
  */
trait Slide extends js.Object {
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the top.
    *
    * @param args
    */
  def slideDown(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the left.
    *
    * @param args
    */
  def slideLeft(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the right.
    *
    * @param args
    */
  def slideRight(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the bottom.
    *
    * @param args
    */
  def slideUp(args: js.Object): js.Any
}

object Slide {
  @scala.inline
  def apply(
    slideDown: js.Object => CallbackTo[js.Any],
    slideLeft: js.Object => CallbackTo[js.Any],
    slideRight: js.Object => CallbackTo[js.Any],
    slideUp: js.Object => CallbackTo[js.Any]
  ): Slide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("slideDown")(js.Any.fromFunction1((t0: js.Object) => slideDown(t0).runNow()))
    __obj.updateDynamic("slideLeft")(js.Any.fromFunction1((t0: js.Object) => slideLeft(t0).runNow()))
    __obj.updateDynamic("slideRight")(js.Any.fromFunction1((t0: js.Object) => slideRight(t0).runNow()))
    __obj.updateDynamic("slideUp")(js.Any.fromFunction1((t0: js.Object) => slideUp(t0).runNow()))
    __obj.asInstanceOf[Slide]
  }
}

