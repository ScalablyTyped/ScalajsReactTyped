package typingsJapgolly.wordExtractor.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordExtractor extends js.Object {
  def extract(documentPath: String): js.Promise[Document]
}

object WordExtractor {
  @scala.inline
  def apply(extract: String => CallbackTo[js.Promise[Document]]): WordExtractor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extract")(js.Any.fromFunction1((t0: java.lang.String) => extract(t0).runNow()))
    __obj.asInstanceOf[WordExtractor]
  }
}

