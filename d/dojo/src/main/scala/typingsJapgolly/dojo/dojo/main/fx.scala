package typingsJapgolly.dojo.dojo.main

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojo.base.fx.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.fx.html
  *
  * Effects library on top of Base animations
  *
  */
trait fx extends js.Object {
  /**
    * Collection of easing functions to use beyond the default
    * dojo._defaultEasing function.
    *
    */
  var easing: js.Object
  /**
    *
    */
  def Toggler(): Unit
  /**
    * Chain a list of dojo/_base/fx.Animations to run in sequence
    * Return a dojo/_base/fx.Animation which will play all passed
    * dojo/_base/fx.Animation instances in sequence, firing its own
    * synthesized events simulating a single animation. (eg:
    * onEnd of this animation means the end of the chain,
    * not the individual animations within)
    *
    * @param animations
    */
  def chain(animations: js.Array[Animation]): js.Any
  /**
    * Combine a list of dojo/_base/fx.Animations to run in parallel
    * Combine an array of dojo/_base/fx.Animations to run in parallel,
    * providing a new dojo/_base/fx.Animation instance encompasing each
    * animation, firing standard animation events.
    *
    * @param animations
    */
  def combine(animations: js.Array[Animation]): js.Any
  /**
    * Slide a node to a new top/left position
    * Returns an animation that will slide "node"
    * defined in args Object from its current position to
    * the position defined by (args.left, args.top).
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on). Special args membersare top and left, which indicate the new position to slide to.
    */
  def slideTo(args: js.Object): js.Any
  /**
    * Expand a node to it's natural height.
    * Returns an animation that will expand the
    * node defined in 'args' object from it's current height to
    * it's natural height (with no scrollbar).
    * Node must have no margin/border/padding.
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on)
    */
  def wipeIn(args: js.Object): js.Any
  /**
    * Shrink a node to nothing and hide it.
    * Returns an animation that will shrink node defined in "args"
    * from it's current height to 1px, and then hide it.
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on)
    */
  def wipeOut(args: js.Object): js.Any
}

object fx {
  @scala.inline
  def apply(
    Toggler: Callback,
    chain: js.Array[Animation] => CallbackTo[js.Any],
    combine: js.Array[Animation] => CallbackTo[js.Any],
    easing: js.Object,
    slideTo: js.Object => CallbackTo[js.Any],
    wipeIn: js.Object => CallbackTo[js.Any],
    wipeOut: js.Object => CallbackTo[js.Any]
  ): fx = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("Toggler")(Toggler.toJsFn)
    __obj.updateDynamic("chain")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.dojo.dojo.base.fx.Animation]) => chain(t0).runNow()))
    __obj.updateDynamic("combine")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.dojo.dojo.base.fx.Animation]) => combine(t0).runNow()))
    __obj.updateDynamic("slideTo")(js.Any.fromFunction1((t0: js.Object) => slideTo(t0).runNow()))
    __obj.updateDynamic("wipeIn")(js.Any.fromFunction1((t0: js.Object) => wipeIn(t0).runNow()))
    __obj.updateDynamic("wipeOut")(js.Any.fromFunction1((t0: js.Object) => wipeOut(t0).runNow()))
    __obj.asInstanceOf[fx]
  }
}

