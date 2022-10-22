package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.reactCalendarTimeline.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def defaultHeaderFormats: LabelFormat = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultHeaderFormats").asInstanceOf[LabelFormat]

inline def defaultKeys: TimelineKeys = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultKeys").asInstanceOf[TimelineKeys]

inline def defaultTimeSteps: TimelineTimeSteps = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTimeSteps").asInstanceOf[TimelineTimeSteps]

type Id = Double | String

type ReactCalendarTimeline[CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */] = Component[(ReactCalendarTimelineProps[CustomItem, CustomGroup]) & js.Object, js.Object]

type TimelineGroup[CustomGroupFields] = TimelineGroupBase & CustomGroupFields

type TimelineHeaderProps = TimelineHeadersProps

type TimelineItem[CustomItemFields, DateType] = TimelineItemBase[DateType] & CustomItemFields
