package typingsJapgolly.connectBusboy.mod._Global_.Express

import typingsJapgolly.busboy.busboy.Busboy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var busboy: Busboy
}

object Request {
  @scala.inline
  def apply(busboy: Busboy): Request = {
    val __obj = js.Dynamic.literal(busboy = busboy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

