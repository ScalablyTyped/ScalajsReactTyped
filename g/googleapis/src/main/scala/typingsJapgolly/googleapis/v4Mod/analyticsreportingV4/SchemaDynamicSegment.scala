package typingsJapgolly.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic segment definition for defining the segment within the request. A
  * segment can select users, sessions or both.
  */
@js.native
trait SchemaDynamicSegment extends js.Object {
  /**
    * The name of the dynamic segment.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Session Segment to select sessions to include in the segment.
    */
  var sessionSegment: js.UndefOr[SchemaSegmentDefinition] = js.native
  /**
    * User Segment to select users to include in the segment.
    */
  var userSegment: js.UndefOr[SchemaSegmentDefinition] = js.native
}

object SchemaDynamicSegment {
  @scala.inline
  def apply(
    name: String = null,
    sessionSegment: SchemaSegmentDefinition = null,
    userSegment: SchemaSegmentDefinition = null
  ): SchemaDynamicSegment = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sessionSegment != null) __obj.updateDynamic("sessionSegment")(sessionSegment.asInstanceOf[js.Any])
    if (userSegment != null) __obj.updateDynamic("userSegment")(userSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDynamicSegment]
  }
}

