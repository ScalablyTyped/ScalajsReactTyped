package typingsJapgolly.wordpressApiFetch.mod.Schema

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressApiFetch.AnonDictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var _links: Record[String, js.Array[AnonDictk]]
}

object BaseResponse {
  @scala.inline
  def apply(_links: Record[String, js.Array[AnonDictk]], _embedded: Record[String, js.Array[_]] = null): BaseResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
}

