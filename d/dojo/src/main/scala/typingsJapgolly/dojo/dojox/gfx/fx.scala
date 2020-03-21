package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/fx.html
  *
  *
  */
trait fx extends js.Object {
  /**
    * Returns an animation which will change fill color over time.
    * Only solid fill color is supported at the moment
    *
    * @param args an object defining the animation setting.
    */
  def animateFill(args: js.Object): js.Any
  /**
    * Returns an animation which will change font properties over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateFont(args: js.Object): Unit
  /**
    * Returns an animation which will change stroke properties over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateStroke(args: js.Object): Unit
  /**
    * Returns an animation which will change transformation over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateTransform(args: js.Object): js.Any
}

object fx {
  @scala.inline
  def apply(
    animateFill: js.Object => CallbackTo[js.Any],
    animateFont: js.Object => Callback,
    animateStroke: js.Object => Callback,
    animateTransform: js.Object => CallbackTo[js.Any]
  ): fx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animateFill")(js.Any.fromFunction1((t0: js.Object) => animateFill(t0).runNow()))
    __obj.updateDynamic("animateFont")(js.Any.fromFunction1((t0: js.Object) => animateFont(t0).runNow()))
    __obj.updateDynamic("animateStroke")(js.Any.fromFunction1((t0: js.Object) => animateStroke(t0).runNow()))
    __obj.updateDynamic("animateTransform")(js.Any.fromFunction1((t0: js.Object) => animateTransform(t0).runNow()))
    __obj.asInstanceOf[fx]
  }
}

