package typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentGroupMod

import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.SegmentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentGroup extends js.Object {
  /**
    * List of dimensions to include or exclude.
    */
  var Dimensions: js.UndefOr[js.Array[SegmentDimensions] | js.Iterable[SegmentDimensions]] = js.undefined
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[js.Array[SegmentReference] | js.Iterable[SegmentReference]] = js.undefined
  /**
    * Specify how to handle multiple source segments. For example, if you specify three source segments, should the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
    */
  var SourceType: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
  /**
    * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values: ALL, ANY, or NONE.
    */
  var Type: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
}

object SegmentGroup {
  @scala.inline
  def apply(
    Dimensions: js.Array[SegmentDimensions] | js.Iterable[SegmentDimensions] = null,
    SourceSegments: js.Array[SegmentReference] | js.Iterable[SegmentReference] = null,
    SourceType: ALL | ANY | NONE | String = null,
    Type: ALL | ANY | NONE | String = null
  ): SegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (SourceSegments != null) __obj.updateDynamic("SourceSegments")(SourceSegments.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentGroup]
  }
}

