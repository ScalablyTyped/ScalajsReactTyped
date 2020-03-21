package typingsJapgolly.urijs.mod._Global_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.urijs.mod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def uri(): URI
}

object JQuery {
  @scala.inline
  def apply(uri: CallbackTo[URI]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uri")(uri.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
}

