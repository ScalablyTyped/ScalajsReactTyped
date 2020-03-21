package typingsJapgolly.sharepoint

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEnumerable[T] extends js.Object {
  def getEnumerator(): IEnumerator[T]
}

object IEnumerable {
  @scala.inline
  def apply[T](getEnumerator: CallbackTo[IEnumerator[T]]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnumerator")(getEnumerator.toJsFn)
    __obj.asInstanceOf[IEnumerable[T]]
  }
}

