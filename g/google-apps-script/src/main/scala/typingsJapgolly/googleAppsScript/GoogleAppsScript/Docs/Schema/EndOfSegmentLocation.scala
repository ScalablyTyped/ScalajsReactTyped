package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndOfSegmentLocation extends js.Object {
  var segmentId: js.UndefOr[String] = js.undefined
}

object EndOfSegmentLocation {
  @scala.inline
  def apply(segmentId: String = null): EndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOfSegmentLocation]
  }
}

