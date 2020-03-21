package typingsJapgolly.glidejs.JQueryGlide

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlideApi extends js.Object {
  /**
    * Append arrows to specifed target (eq. 'body', '.class', '#id')
    */
  def arrows(target: String): Unit
  /**
    * Returning current slide number
    */
  def current(): Double
  /**
    * Destroy and cleanup slider
    */
  def destroy(): Unit
  /**
    * Jump to current slide
    */
  def jump(distance: Double, callback: js.Function): Unit
  /**
    * Append navigation to specifed target (eq. 'body', '.class', '#id')
    */
  def nav(target: String): Unit
  /**
    * Slide one forward
    */
  def next(callback: js.Function): Unit
  /**
    * Stopping autoplay
    */
  def pause(): Unit
  /**
    * Starting autoplay
    */
  def play(): Unit
  /**
    * Slide one backward
    */
  def prev(callback: js.Function): Unit
  /**
    * Rebuild and recalculate dimensions of slider elements
    */
  def reinit(): Unit
}

object IGlideApi {
  @scala.inline
  def apply(
    arrows: String => Callback,
    current: CallbackTo[Double],
    destroy: Callback,
    jump: (Double, js.Function) => Callback,
    nav: String => Callback,
    next: js.Function => Callback,
    pause: Callback,
    play: Callback,
    prev: js.Function => Callback,
    reinit: Callback
  ): IGlideApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrows")(js.Any.fromFunction1((t0: java.lang.String) => arrows(t0).runNow()))
    __obj.updateDynamic("current")(current.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("jump")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function) => jump(t0, t1).runNow()))
    __obj.updateDynamic("nav")(js.Any.fromFunction1((t0: java.lang.String) => nav(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: js.Function) => next(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("prev")(js.Any.fromFunction1((t0: js.Function) => prev(t0).runNow()))
    __obj.updateDynamic("reinit")(reinit.toJsFn)
    __obj.asInstanceOf[IGlideApi]
  }
}

