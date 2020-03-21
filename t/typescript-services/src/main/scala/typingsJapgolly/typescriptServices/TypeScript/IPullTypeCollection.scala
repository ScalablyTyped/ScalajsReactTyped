package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPullTypeCollection extends js.Object {
  def getLength(): Double
  def getTypeAtIndex(index: Double): PullTypeSymbol
}

object IPullTypeCollection {
  @scala.inline
  def apply(getLength: CallbackTo[Double], getTypeAtIndex: Double => CallbackTo[PullTypeSymbol]): IPullTypeCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getTypeAtIndex")(js.Any.fromFunction1((t0: scala.Double) => getTypeAtIndex(t0).runNow()))
    __obj.asInstanceOf[IPullTypeCollection]
  }
}

