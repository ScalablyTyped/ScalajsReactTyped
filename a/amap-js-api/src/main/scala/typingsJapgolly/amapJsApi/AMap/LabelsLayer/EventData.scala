package typingsJapgolly.amapJsApi.AMap.LabelsLayer

import typingsJapgolly.amapJsApi.AnonIcon
import typingsJapgolly.amapJsApi.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var data: AnonId
  var opts: AnonIcon
}

object EventData {
  @scala.inline
  def apply(data: AnonId, opts: AnonIcon): EventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventData]
  }
}

