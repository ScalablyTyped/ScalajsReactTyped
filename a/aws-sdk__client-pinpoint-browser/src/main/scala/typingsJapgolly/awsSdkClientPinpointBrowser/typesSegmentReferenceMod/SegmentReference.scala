package typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentReference extends js.Object {
  /**
    * A unique identifier for the segment.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * If specified contains a specific version of the segment included.
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object SegmentReference {
  @scala.inline
  def apply(Id: String = null, Version: Int | Double = null): SegmentReference = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentReference]
  }
}

