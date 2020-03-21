package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/magellan.html#javascript-reference
trait Magellan extends js.Object {
  def calcPoints(): Unit
  def destroy(): Unit
  def reflow(): Unit
  def scrollToLoc(location: String): Unit
}

object Magellan {
  @scala.inline
  def apply(calcPoints: Callback, destroy: Callback, reflow: Callback, scrollToLoc: String => Callback): Magellan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calcPoints")(calcPoints.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("reflow")(reflow.toJsFn)
    __obj.updateDynamic("scrollToLoc")(js.Any.fromFunction1((t0: java.lang.String) => scrollToLoc(t0).runNow()))
    __obj.asInstanceOf[Magellan]
  }
}

