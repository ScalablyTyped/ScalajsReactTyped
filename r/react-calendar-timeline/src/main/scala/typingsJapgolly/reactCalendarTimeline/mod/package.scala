package typingsJapgolly.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Id = scala.Double | java.lang.String
  type ReactCalendarTimeline[CustomItem /* <: typingsJapgolly.reactCalendarTimeline.mod.TimelineItemBase[_] */, CustomGroup /* <: typingsJapgolly.reactCalendarTimeline.mod.TimelineGroupBase */] = japgolly.scalajs.react.raw.React.Component[
    (typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup]) with js.Object, 
    js.Object
  ]
  type TimelineGroup[CustomGroupFields] = typingsJapgolly.reactCalendarTimeline.mod.TimelineGroupBase with CustomGroupFields
  type TimelineItem[CustomItemFields, DateType] = typingsJapgolly.reactCalendarTimeline.mod.TimelineItemBase[DateType] with CustomItemFields
}
