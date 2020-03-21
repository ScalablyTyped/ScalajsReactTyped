package typingsJapgolly.webcola.linklengthsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkSepAccessor[Link] extends LinkAccessor[Link] {
  def getMinSeparation(l: Link): Double
}

object LinkSepAccessor {
  @scala.inline
  def apply[Link](
    getMinSeparation: Link => CallbackTo[Double],
    getSourceIndex: Link => CallbackTo[Double],
    getTargetIndex: Link => CallbackTo[Double]
  ): LinkSepAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMinSeparation")(js.Any.fromFunction1((t0: Link) => getMinSeparation(t0).runNow()))
    __obj.updateDynamic("getSourceIndex")(js.Any.fromFunction1((t0: Link) => getSourceIndex(t0).runNow()))
    __obj.updateDynamic("getTargetIndex")(js.Any.fromFunction1((t0: Link) => getTargetIndex(t0).runNow()))
    __obj.asInstanceOf[LinkSepAccessor[Link]]
  }
}

