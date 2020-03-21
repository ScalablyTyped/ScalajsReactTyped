package typingsJapgolly.sharepoint.SP

import typingsJapgolly.sharepoint.IEnumerable
import typingsJapgolly.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientValueObjectCollection")
@js.native
class ClientValueObjectCollection[T] ()
  extends ClientValueObject
     with IEnumerable[T] {
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  def get_count(): Double = js.native
}

