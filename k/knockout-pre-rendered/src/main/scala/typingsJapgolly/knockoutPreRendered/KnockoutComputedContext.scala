package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedContext extends js.Object {
  var isSleeping: Boolean
  def getDependenciesCount(): Double
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

