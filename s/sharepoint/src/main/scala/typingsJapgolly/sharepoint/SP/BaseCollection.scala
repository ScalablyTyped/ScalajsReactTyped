package typingsJapgolly.sharepoint.SP

import typingsJapgolly.sharepoint.IEnumerable
import typingsJapgolly.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BaseCollection")
@js.native
class BaseCollection[T] () extends IEnumerable[T] {
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  def get_count(): Double = js.native
  def itemAtIndex(index: Double): T = js.native
}

