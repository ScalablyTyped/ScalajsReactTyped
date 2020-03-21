package typingsJapgolly.webcola.powergraphMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webcola.linklengthsMod.LinkAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTypeAccessor[Link] extends LinkAccessor[Link] {
  def getType(l: Link): Double
}

object LinkTypeAccessor {
  @scala.inline
  def apply[Link](
    getSourceIndex: Link => CallbackTo[Double],
    getTargetIndex: Link => CallbackTo[Double],
    getType: Link => CallbackTo[Double]
  ): LinkTypeAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSourceIndex")(js.Any.fromFunction1((t0: Link) => getSourceIndex(t0).runNow()))
    __obj.updateDynamic("getTargetIndex")(js.Any.fromFunction1((t0: Link) => getTargetIndex(t0).runNow()))
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: Link) => getType(t0).runNow()))
    __obj.asInstanceOf[LinkTypeAccessor[Link]]
  }
}

