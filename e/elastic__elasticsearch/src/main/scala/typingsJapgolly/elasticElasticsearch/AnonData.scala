package typingsJapgolly.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Boolean
  var ingest: Boolean
  var master: Boolean
  var ml: Boolean
}

object AnonData {
  @scala.inline
  def apply(data: Boolean, ingest: Boolean, master: Boolean, ml: Boolean): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

