package typingsJapgolly.amapJsApi.AMap.event

import typingsJapgolly.amapJsApi.amapJsApiNumbers.`0`
import typingsJapgolly.amapJsApi.amapJsApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener[T /* <: `0` | `1` */] extends js.Object {
  var `type`: T
}

object EventListener {
  @scala.inline
  def apply[T /* <: `0` | `1` */](`type`: T): EventListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener[T]]
  }
}

