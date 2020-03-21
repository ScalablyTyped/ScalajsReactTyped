package typingsJapgolly.knockout

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedContext extends js.Object {
  var isSleeping: Boolean
  /**
    * Returns the number of dependencies of the computed observable detected so far during the current evaluation.
    */
  def getDependenciesCount(): Double
  /**
    * A function that returns true if called during the first ever evaluation of the current computed observable, or false otherwise.
    * For pure computed observables, isInitial() is always undefined.
    */
  def isInitial(): Boolean
}

object KnockoutComputedContext {
  @scala.inline
  def apply(getDependenciesCount: CallbackTo[Double], isInitial: CallbackTo[Boolean], isSleeping: Boolean): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(isSleeping = isSleeping.asInstanceOf[js.Any])
    __obj.updateDynamic("getDependenciesCount")(getDependenciesCount.toJsFn)
    __obj.updateDynamic("isInitial")(isInitial.toJsFn)
    __obj.asInstanceOf[KnockoutComputedContext]
  }
}

