package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection.ReportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection.UserActivityCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Cohort
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.CohortGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DateRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Dimension
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilterClause
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DynamicSegment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Metric
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilterClause
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrFiltersForSegment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrderBy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Pivot
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.ReportRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Segment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDefinition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDimensionFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilterClause
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentMetricFilter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentSequenceStep
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SequenceSegment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SimpleSegment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyticsreporting_ extends js.Object {
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  var UserActivity: js.UndefOr[UserActivityCollection] = js.undefined
  // Create a new instance of Cohort
  def newCohort(): Cohort
  // Create a new instance of CohortGroup
  def newCohortGroup(): CohortGroup
  // Create a new instance of DateRange
  def newDateRange(): DateRange
  // Create a new instance of Dimension
  def newDimension(): Dimension
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): DimensionFilter
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): DimensionFilterClause
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): DynamicSegment
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): GetReportsRequest
  // Create a new instance of Metric
  def newMetric(): Metric
  // Create a new instance of MetricFilter
  def newMetricFilter(): MetricFilter
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): MetricFilterClause
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): OrFiltersForSegment
  // Create a new instance of OrderBy
  def newOrderBy(): OrderBy
  // Create a new instance of Pivot
  def newPivot(): Pivot
  // Create a new instance of ReportRequest
  def newReportRequest(): ReportRequest
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): SearchUserActivityRequest
  // Create a new instance of Segment
  def newSegment(): Segment
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): SegmentDefinition
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): SegmentDimensionFilter
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): SegmentFilter
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): SegmentFilterClause
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): SegmentMetricFilter
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): SegmentSequenceStep
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): SequenceSegment
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): SimpleSegment
  // Create a new instance of User
  def newUser(): User
}

object Analyticsreporting_ {
  @scala.inline
  def apply(
    newCohort: CallbackTo[Cohort],
    newCohortGroup: CallbackTo[CohortGroup],
    newDateRange: CallbackTo[DateRange],
    newDimension: CallbackTo[Dimension],
    newDimensionFilter: CallbackTo[DimensionFilter],
    newDimensionFilterClause: CallbackTo[DimensionFilterClause],
    newDynamicSegment: CallbackTo[DynamicSegment],
    newGetReportsRequest: CallbackTo[GetReportsRequest],
    newMetric: CallbackTo[Metric],
    newMetricFilter: CallbackTo[MetricFilter],
    newMetricFilterClause: CallbackTo[MetricFilterClause],
    newOrFiltersForSegment: CallbackTo[OrFiltersForSegment],
    newOrderBy: CallbackTo[OrderBy],
    newPivot: CallbackTo[Pivot],
    newReportRequest: CallbackTo[ReportRequest],
    newSearchUserActivityRequest: CallbackTo[SearchUserActivityRequest],
    newSegment: CallbackTo[Segment],
    newSegmentDefinition: CallbackTo[SegmentDefinition],
    newSegmentDimensionFilter: CallbackTo[SegmentDimensionFilter],
    newSegmentFilter: CallbackTo[SegmentFilter],
    newSegmentFilterClause: CallbackTo[SegmentFilterClause],
    newSegmentMetricFilter: CallbackTo[SegmentMetricFilter],
    newSegmentSequenceStep: CallbackTo[SegmentSequenceStep],
    newSequenceSegment: CallbackTo[SequenceSegment],
    newSimpleSegment: CallbackTo[SimpleSegment],
    newUser: CallbackTo[User],
    Reports: ReportsCollection = null,
    UserActivity: UserActivityCollection = null
  ): Analyticsreporting_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newCohort")(newCohort.toJsFn)
    __obj.updateDynamic("newCohortGroup")(newCohortGroup.toJsFn)
    __obj.updateDynamic("newDateRange")(newDateRange.toJsFn)
    __obj.updateDynamic("newDimension")(newDimension.toJsFn)
    __obj.updateDynamic("newDimensionFilter")(newDimensionFilter.toJsFn)
    __obj.updateDynamic("newDimensionFilterClause")(newDimensionFilterClause.toJsFn)
    __obj.updateDynamic("newDynamicSegment")(newDynamicSegment.toJsFn)
    __obj.updateDynamic("newGetReportsRequest")(newGetReportsRequest.toJsFn)
    __obj.updateDynamic("newMetric")(newMetric.toJsFn)
    __obj.updateDynamic("newMetricFilter")(newMetricFilter.toJsFn)
    __obj.updateDynamic("newMetricFilterClause")(newMetricFilterClause.toJsFn)
    __obj.updateDynamic("newOrFiltersForSegment")(newOrFiltersForSegment.toJsFn)
    __obj.updateDynamic("newOrderBy")(newOrderBy.toJsFn)
    __obj.updateDynamic("newPivot")(newPivot.toJsFn)
    __obj.updateDynamic("newReportRequest")(newReportRequest.toJsFn)
    __obj.updateDynamic("newSearchUserActivityRequest")(newSearchUserActivityRequest.toJsFn)
    __obj.updateDynamic("newSegment")(newSegment.toJsFn)
    __obj.updateDynamic("newSegmentDefinition")(newSegmentDefinition.toJsFn)
    __obj.updateDynamic("newSegmentDimensionFilter")(newSegmentDimensionFilter.toJsFn)
    __obj.updateDynamic("newSegmentFilter")(newSegmentFilter.toJsFn)
    __obj.updateDynamic("newSegmentFilterClause")(newSegmentFilterClause.toJsFn)
    __obj.updateDynamic("newSegmentMetricFilter")(newSegmentMetricFilter.toJsFn)
    __obj.updateDynamic("newSegmentSequenceStep")(newSegmentSequenceStep.toJsFn)
    __obj.updateDynamic("newSequenceSegment")(newSequenceSegment.toJsFn)
    __obj.updateDynamic("newSimpleSegment")(newSimpleSegment.toJsFn)
    __obj.updateDynamic("newUser")(newUser.toJsFn)
    if (Reports != null) __obj.updateDynamic("Reports")(Reports.asInstanceOf[js.Any])
    if (UserActivity != null) __obj.updateDynamic("UserActivity")(UserActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyticsreporting_]
  }
}

