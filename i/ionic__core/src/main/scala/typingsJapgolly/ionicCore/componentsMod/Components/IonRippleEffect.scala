package typingsJapgolly.ionicCore.componentsMod.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.ionicCoreStrings.bounded
import typingsJapgolly.ionicCore.ionicCoreStrings.unbounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRippleEffect extends js.Object {
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  var `type`: bounded | unbounded
  /**
    * Adds the ripple effect to the parent element.
    * @param x The horizontal coordinate of where the ripple should start.
    * @param y The vertical coordinate of where the ripple should start.
    */
  def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]]
}

object IonRippleEffect {
  @scala.inline
  def apply(
    addRipple: (Double, Double) => CallbackTo[js.Promise[js.Function0[Unit]]],
    `type`: bounded | unbounded
  ): IonRippleEffect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addRipple")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => addRipple(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRippleEffect]
  }
}

