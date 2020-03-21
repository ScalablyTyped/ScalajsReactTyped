package typingsJapgolly.highcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationStepCallbackFunction = js.ThisFunction0[/* this */ typingsJapgolly.highcharts.mod.SVGElement, scala.Unit]
  type AxisEventCallbackFunction = js.ThisFunction0[/* this */ typingsJapgolly.highcharts.mod.Axis, scala.Unit]
  type AxisPointBreakEventCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Axis, 
    /* evt */ typingsJapgolly.highcharts.mod.AxisPointBreakEventObject, 
    scala.Unit
  ]
  type AxisSetExtremesEventCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Axis, 
    /* evt */ typingsJapgolly.highcharts.mod.AxisSetExtremesEventObject, 
    scala.Unit
  ]
  type AxisTickPositionerCallbackFunction = js.ThisFunction0[/* this */ typingsJapgolly.highcharts.mod.Axis, js.Array[scala.Double]]
  type ChartAddSeriesCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.highcharts.mod.ChartAddSeriesEventObject, 
    scala.Unit
  ]
  type ChartCallbackFunction = js.Function1[/* chart */ typingsJapgolly.highcharts.mod.Chart_, scala.Unit]
  type ChartClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.highcharts.mod.PointerEventObject, 
    scala.Unit
  ]
  type ChartLoadCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type ChartRedrawCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type ChartRenderCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type ChartSelectionCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.highcharts.mod.ChartSelectionContextObject, 
    js.UndefOr[scala.Boolean]
  ]
  type ClipRectElement = typingsJapgolly.highcharts.mod.SVGElement
  type ColorString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.highcharts.mod.ColorString
    - typingsJapgolly.highcharts.mod.GradientColorObject
    - typingsJapgolly.highcharts.mod.PatternObject
  */
  type ColorType = typingsJapgolly.highcharts.mod._ColorType | typingsJapgolly.highcharts.mod.ColorString
  type DataBeforeParseCallbackFunction = js.Function1[/* csv */ java.lang.String, java.lang.String]
  type DataCompleteCallbackFunction = js.Function1[/* chartOptions */ typingsJapgolly.highcharts.mod.Options, scala.Unit]
  /**
    * Callback function that returns the correspondig Date object to a match.
    */
  type DataDateFormatCallbackFunction = js.Function1[/* match */ js.Array[scala.Double], scala.Double]
  type DataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsJapgolly.highcharts.mod.DataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  type DataParseDateCallbackFunction = js.Function1[/* dateValue */ java.lang.String, scala.Double]
  type DataParsedCallbackFunction = js.Function1[/* columns */ js.Array[js.Array[js.Any]], js.UndefOr[scala.Boolean]]
  type DataValueType = scala.Double | java.lang.String | scala.Null
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type DrilldownCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* e */ typingsJapgolly.highcharts.mod.DrilldownEventObject, 
    scala.Unit
  ]
  type DrillupAllCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* e */ typingsJapgolly.highcharts.mod.DrillupAllEventObject, 
    scala.Unit
  ]
  type DrillupCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* e */ typingsJapgolly.highcharts.mod.DrillupEventObject, 
    scala.Unit
  ]
  type EventCallbackFunction[T] = js.ThisFunction1[
    /* this */ T, 
    /* eventArguments */ js.UndefOr[typingsJapgolly.std.Event_ | typingsJapgolly.highcharts.mod.Dictionary[js.Any]], 
    scala.Boolean | scala.Unit
  ]
  type ExportDataCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.highcharts.mod.ExportDataEventObject, 
    scala.Unit
  ]
  type ExportingAfterPrintCallbackFunction = js.Function2[
    /* chart */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type ExportingBeforePrintCallbackFunction = js.Function2[
    /* chart */ typingsJapgolly.highcharts.mod.Chart_, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type ExportingErrorCallbackFunction = js.Function2[
    /* options */ typingsJapgolly.highcharts.mod.ExportingOptions, 
    /* err */ js.Error, 
    scala.Unit
  ]
  type FormatterCallbackFunction[T] = js.ThisFunction0[/* this */ T, java.lang.String]
  type HTMLAttributes = typingsJapgolly.highcharts.mod.Dictionary[scala.Boolean | scala.Double | java.lang.String | js.Function]
  type HTMLDOMElement = org.scalajs.dom.raw.HTMLElement
  type ObjectEachCallbackFunction[T] = js.ThisFunction3[
    /* this */ T, 
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* obj */ js.Any, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.highcharts.highchartsStrings.straight
    - typingsJapgolly.highcharts.highchartsStrings.fastAvoid
    - typingsJapgolly.highcharts.highchartsStrings.simpleConnect
    - java.lang.String
  */
  type PathfinderTypeValue = typingsJapgolly.highcharts.mod._PathfinderTypeValue | java.lang.String
  type PointClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointClickEventObject, 
    scala.Unit
  ]
  type PointDragCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointDragEventObject, 
    scala.Unit
  ]
  type PointDragStartCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointDragStartEventObject, 
    scala.Unit
  ]
  type PointDropCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointDropEventObject, 
    scala.Unit
  ]
  type PointLegendItemClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointLegendItemClickEventObject, 
    scala.Unit
  ]
  type PointMouseOutCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ org.scalajs.dom.raw.PointerEvent, 
    scala.Unit
  ]
  type PointMouseOverCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type PointOptionsType = scala.Double | java.lang.String | typingsJapgolly.highcharts.mod.PointOptionsObject | (js.Array[scala.Double | java.lang.String]) | scala.Null
  type PointRemoveCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type PointSelectCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointInteractionEventObject, 
    scala.Unit
  ]
  type PointUnselectCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointInteractionEventObject, 
    scala.Unit
  ]
  type PointUpdateCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Point, 
    /* event */ typingsJapgolly.highcharts.mod.PointUpdateEventObject, 
    scala.Unit
  ]
  type RangeSelectorClickCallbackFunction = js.Function2[
    /* e */ typingsJapgolly.std.Event_, 
    /* Return */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RangeSelectorParseCallbackFunction = js.Function1[/* value */ java.lang.String, scala.Double]
  type RelativeSize = scala.Double | java.lang.String
  type ResponsiveCallbackFunction = js.ThisFunction0[/* this */ typingsJapgolly.highcharts.mod.Chart_, scala.Boolean]
  type SVGDOMElement = org.scalajs.dom.raw.SVGElement
  type SVGPathArray = js.Array[scala.Double | typingsJapgolly.highcharts.mod.SVGPathCommand]
  type ScreenReaderClickCallbackFunction = js.Function1[/* evt */ org.scalajs.dom.raw.MouseEvent, scala.Unit]
  type ScreenReaderFormatterCallbackFunction[T] = js.Function1[/* context */ T, java.lang.String]
  type SeriesAfterAnimateCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ typingsJapgolly.highcharts.mod.SeriesAfterAnimateEventObject, 
    scala.Unit
  ]
  type SeriesCheckboxClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ typingsJapgolly.highcharts.mod.SeriesCheckboxClickEventObject, 
    scala.Unit
  ]
  type SeriesClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ typingsJapgolly.highcharts.mod.SeriesClickEventObject, 
    scala.Unit
  ]
  type SeriesHideCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type SeriesLegendItemClickCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ typingsJapgolly.highcharts.mod.SeriesLegendItemClickEventObject, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.highcharts.highchartsStrings.butt
    - typingsJapgolly.highcharts.highchartsStrings.round
    - typingsJapgolly.highcharts.highchartsStrings.square
    - java.lang.String
  */
  type SeriesLinecapValue = typingsJapgolly.highcharts.mod._SeriesLinecapValue | java.lang.String
  type SeriesMouseOutCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.PointerEvent, 
    scala.Unit
  ]
  type SeriesMouseOverCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ org.scalajs.dom.raw.PointerEvent, 
    scala.Unit
  ]
  type SeriesNetworkgraphDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsJapgolly.highcharts.mod.DataLabelsFormatterContextObject | typingsJapgolly.highcharts.mod.SeriesNetworkgraphDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  type SeriesPackedBubbleDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsJapgolly.highcharts.mod.DataLabelsFormatterContextObject | typingsJapgolly.highcharts.mod.SeriesPackedBubbleDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  type SeriesSankeyDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsJapgolly.highcharts.mod.DataLabelsFormatterContextObject | typingsJapgolly.highcharts.mod.SeriesSankeyDataLabelsFormatterContextObject, 
    js.UndefOr[java.lang.String]
  ]
  type SeriesShowCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Series, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  type TimeFormatCallbackFunction = js.Function1[/* timestamp */ scala.Double, java.lang.String]
  type TimelineDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typingsJapgolly.highcharts.mod.DataLabelsFormatterContextObject | typingsJapgolly.highcharts.mod.TimelineDataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  type TooltipFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.TooltipFormatterContextObject, 
    /* tooltip */ typingsJapgolly.highcharts.mod.Tooltip, 
    js.UndefOr[
      typingsJapgolly.highcharts.highchartsBooleans.`false` | java.lang.String | (js.Array[js.UndefOr[java.lang.String | scala.Null]]) | scala.Null
    ]
  ]
  type TooltipPositionerCallbackFunction = js.Function3[
    /* labelWidth */ scala.Double, 
    /* labelHeight */ scala.Double, 
    /* point */ typingsJapgolly.highcharts.mod.TooltipPositionerPointObject, 
    typingsJapgolly.highcharts.mod.PositionObject
  ]
  type WrapProceedFunction = js.Function3[
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    js.Any
  ]
  type XAxisCrosshairLabelFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typingsJapgolly.highcharts.mod.Axis, 
    /* value */ scala.Double, 
    java.lang.String
  ]
}
