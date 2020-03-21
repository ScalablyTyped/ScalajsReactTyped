package typingsJapgolly.awsSdkClientXrayNode.typesEdgeMod

import typingsJapgolly.awsSdkClientXrayNode.typesAliasMod.UnmarshalledAlias
import typingsJapgolly.awsSdkClientXrayNode.typesEdgeStatisticsMod.UnmarshalledEdgeStatistics
import typingsJapgolly.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEdge extends Edge {
  /**
    * <p>Aliases for the edge.</p>
    */
  @JSName("Aliases")
  var Aliases_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledAlias]] = js.undefined
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  @JSName("EndTime")
  var EndTime_UnmarshalledEdge: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.undefined
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  @JSName("StartTime")
  var StartTime_UnmarshalledEdge: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics_UnmarshalledEdge: js.UndefOr[UnmarshalledEdgeStatistics] = js.undefined
}

object UnmarshalledEdge {
  @scala.inline
  def apply(
    Aliases: js.Array[UnmarshalledAlias] = null,
    EndTime: js.Date = null,
    ReferenceId: Int | Double = null,
    ResponseTimeHistogram: js.Array[UnmarshalledHistogramEntry] = null,
    StartTime: js.Date = null,
    SummaryStatistics: UnmarshalledEdgeStatistics = null
  ): UnmarshalledEdge = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ReferenceId != null) __obj.updateDynamic("ReferenceId")(ReferenceId.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEdge]
  }
}

