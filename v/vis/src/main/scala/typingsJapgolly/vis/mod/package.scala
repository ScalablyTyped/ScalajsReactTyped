package typingsJapgolly.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataGroupCollectionType = js.Array[typingsJapgolly.vis.mod.DataGroup] | typingsJapgolly.vis.mod.DataSet[typingsJapgolly.vis.mod.DataGroup] | typingsJapgolly.vis.mod.DataView[typingsJapgolly.vis.mod.DataGroup]
  type DataItemCollectionType = js.Array[typingsJapgolly.vis.mod.DataItem] | typingsJapgolly.vis.mod.DataSet[typingsJapgolly.vis.mod.DataItem] | typingsJapgolly.vis.mod.DataView[typingsJapgolly.vis.mod.DataItem]
  type DateType = js.Date | scala.Double | java.lang.String
  type Graph2dLegendOption = scala.Boolean | typingsJapgolly.vis.mod.LegendOptions
  type Graph2dOptionBarChart = scala.Double | typingsJapgolly.vis.mod.Graph2dBarChartOption
  type Graph2dOptionDataAxis = scala.Boolean | typingsJapgolly.vis.mod.Graph2dDataAxisOption
  type Graph2dOptionDrawPoints = scala.Boolean | typingsJapgolly.vis.mod.Graph2dDrawPointsOption
  type HeightWidthType = typingsJapgolly.vis.mod.IdType
  type IdType = java.lang.String | scala.Double
  type MomentConstructor = typingsJapgolly.vis.mod.MomentConstructor1 | typingsJapgolly.vis.mod.MomentConstructor2
  type MomentConstructor1 = js.Function3[
    /* inp */ js.UndefOr[typingsJapgolly.moment.mod.MomentInput], 
    /* format */ js.UndefOr[typingsJapgolly.moment.mod.MomentFormatSpecification], 
    /* strict */ js.UndefOr[scala.Boolean], 
    typingsJapgolly.moment.mod.Moment
  ]
  type MomentConstructor2 = js.Function4[
    /* inp */ js.UndefOr[typingsJapgolly.moment.mod.MomentInput], 
    /* format */ js.UndefOr[typingsJapgolly.moment.mod.MomentFormatSpecification], 
    /* language */ js.UndefOr[java.lang.String], 
    /* strict */ js.UndefOr[scala.Boolean], 
    typingsJapgolly.moment.mod.Moment
  ]
  type SubGroupStackOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type SubgroupType = typingsJapgolly.vis.mod.IdType
  type TimelineAnimationType = scala.Boolean | typingsJapgolly.vis.mod.AnimationOptions
  type TimelineFormatLabelsFunction = js.Function3[
    /* date */ js.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    java.lang.String
  ]
  type TimelineItemEditableType = scala.Boolean | typingsJapgolly.vis.mod.TimelineItemEditableOption
  type TimelineMarginItemType = scala.Double | typingsJapgolly.vis.mod.TimelineMarginItem
  type TimelineOptionsComparisonFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  type TimelineOptionsConfigureFunction = js.Function2[/* option */ java.lang.String, /* path */ js.Array[java.lang.String], scala.Boolean]
  type TimelineOptionsConfigureType = scala.Boolean | typingsJapgolly.vis.mod.TimelineOptionsConfigureFunction
  type TimelineOptionsDataAttributesType = scala.Boolean | java.lang.String | js.Array[java.lang.String]
  type TimelineOptionsEditableType = scala.Boolean | typingsJapgolly.vis.mod.TimelineEditableOption
  type TimelineOptionsGroupCallbackFunction = js.Function2[
    /* group */ typingsJapgolly.vis.mod.TimelineGroup, 
    /* callback */ js.Function1[/* group */ typingsJapgolly.vis.mod.TimelineGroup | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsGroupEditableType = scala.Boolean | typingsJapgolly.vis.mod.TimelineGroupEditableOption
  type TimelineOptionsGroupOrderSwapFunction = js.Function3[
    /* fromGroup */ js.Any, 
    /* toGroup */ js.Any, 
    /* groups */ typingsJapgolly.vis.mod.DataSet[typingsJapgolly.vis.mod.DataGroup], 
    scala.Unit
  ]
  type TimelineOptionsGroupOrderType = java.lang.String | typingsJapgolly.vis.mod.TimelineOptionsComparisonFunction
  type TimelineOptionsHiddenDatesType = typingsJapgolly.vis.mod.TimelineHiddenDateOption | js.Array[typingsJapgolly.vis.mod.TimelineHiddenDateOption]
  type TimelineOptionsItemCallbackFunction = js.Function2[
    /* item */ typingsJapgolly.vis.mod.TimelineItem, 
    /* callback */ js.Function1[/* item */ typingsJapgolly.vis.mod.TimelineItem | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsItemsAlwaysDraggableType = scala.Boolean | typingsJapgolly.vis.mod.TimelineItemsAlwaysDraggableOption
  type TimelineOptionsMarginType = scala.Double | typingsJapgolly.vis.mod.TimelineMarginOption
  type TimelineOptionsOrientationType = java.lang.String | typingsJapgolly.vis.mod.TimelineOrientationOption
  type TimelineOptionsSnapFunction = js.Function3[
    /* date */ js.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    js.Date | scala.Double
  ]
  type TimelineOptionsTemplateFunction = js.Function3[
    /* item */ js.UndefOr[js.Any], 
    /* element */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    java.lang.String
  ]
}
