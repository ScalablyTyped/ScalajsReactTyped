package typingsJapgolly.dojo.dojox.css3

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/css3/fx.html
  *
  * Utilities for animation effects.
  *
  */
trait fx extends js.Object {
  /**
    * Returns an animation that does a "bounce" effect on args.node.
    * Vertical bounce animation. The scaleX, scaleY deformation and the
    * jump height (args.jumpHeight) can be specified.
    *
    * @param args
    */
  def bounce(args: js.Object): js.Any
  /**
    * Returns an animation that expands args.node.
    * Scales an element to args.endScale.
    *
    * @param args
    */
  def expand(args: js.Object): js.Any
  /**
    * Returns an animation that flips an element around its y axis.
    * Flips an element around its y axis. The default is a 360deg flip
    * but it is possible to run a partial flip using args.whichAnims.
    *
    * @param args
    */
  def flip(args: js.Object): js.Any
  /**
    * Returns an animation that will do a "puff" effect on the given node.
    * Fades out an element and scales it to args.endScale.
    *
    * @param args
    */
  def puff(args: js.Object): js.Any
  /**
    * Returns an animation that rotates an element.
    * Rotates an element from args.startAngle to args.endAngle.
    *
    * @param args
    */
  def rotate(args: js.Object): js.Any
  /**
    * Returns an animation that shrinks args.node.
    * Shrinks an element, same as expand({ node: node, endScale: .01 });
    *
    * @param args
    */
  def shrink(args: js.Object): js.Any
}

object fx {
  @scala.inline
  def apply(
    bounce: js.Object => CallbackTo[js.Any],
    expand: js.Object => CallbackTo[js.Any],
    flip: js.Object => CallbackTo[js.Any],
    puff: js.Object => CallbackTo[js.Any],
    rotate: js.Object => CallbackTo[js.Any],
    shrink: js.Object => CallbackTo[js.Any]
  ): fx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounce")(js.Any.fromFunction1((t0: js.Object) => bounce(t0).runNow()))
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: js.Object) => expand(t0).runNow()))
    __obj.updateDynamic("flip")(js.Any.fromFunction1((t0: js.Object) => flip(t0).runNow()))
    __obj.updateDynamic("puff")(js.Any.fromFunction1((t0: js.Object) => puff(t0).runNow()))
    __obj.updateDynamic("rotate")(js.Any.fromFunction1((t0: js.Object) => rotate(t0).runNow()))
    __obj.updateDynamic("shrink")(js.Any.fromFunction1((t0: js.Object) => shrink(t0).runNow()))
    __obj.asInstanceOf[fx]
  }
}

