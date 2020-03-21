package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineReference extends js.Object {
  /**
    * The change ID.
    */
  var changeId: Double
  /**
    * The ID of the timeline.
    */
  var id: String
  /**
    * The REST URL of the timeline.
    */
  var url: String
}

object TimelineReference {
  @scala.inline
  def apply(changeId: Double, id: String, url: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineReference]
  }
}

