package typingsJapgolly.webcola.linklengthsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAccessor[Link] extends js.Object {
  def getSourceIndex(l: Link): Double
  def getTargetIndex(l: Link): Double
}

object LinkAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => CallbackTo[Double], getTargetIndex: Link => CallbackTo[Double]): LinkAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSourceIndex")(js.Any.fromFunction1((t0: Link) => getSourceIndex(t0).runNow()))
    __obj.updateDynamic("getTargetIndex")(js.Any.fromFunction1((t0: Link) => getTargetIndex(t0).runNow()))
    __obj.asInstanceOf[LinkAccessor[Link]]
  }
}

