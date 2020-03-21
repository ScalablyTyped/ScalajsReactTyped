package typingsJapgolly.jsreportCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStore extends js.Object {
  def collection(name: String): Collection
}

object DocumentStore {
  @scala.inline
  def apply(collection: String => CallbackTo[Collection]): DocumentStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(js.Any.fromFunction1((t0: java.lang.String) => collection(t0).runNow()))
    __obj.asInstanceOf[DocumentStore]
  }
}

