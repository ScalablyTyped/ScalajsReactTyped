package typingsJapgolly.reactVirtualized.esInfiniteLoaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactVirtualized.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderChildProps extends js.Object {
  def onRowsRendered(params: AnonStartIndex): Unit
  def registerChild(registeredChild: js.Any): Unit
}

object InfiniteLoaderChildProps {
  @scala.inline
  def apply(onRowsRendered: AnonStartIndex => Callback, registerChild: js.Any => Callback): InfiniteLoaderChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.AnonStartIndex) => onRowsRendered(t0).runNow()))
    __obj.updateDynamic("registerChild")(js.Any.fromFunction1((t0: js.Any) => registerChild(t0).runNow()))
    __obj.asInstanceOf[InfiniteLoaderChildProps]
  }
}

