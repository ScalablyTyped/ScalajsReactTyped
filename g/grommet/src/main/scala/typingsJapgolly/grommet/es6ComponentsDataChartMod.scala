package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.anon.Dash
import typingsJapgolly.grommet.anon.Gap
import typingsJapgolly.grommet.anon.Height
import typingsJapgolly.grommet.anon.Prefix
import typingsJapgolly.grommet.anon.Side
import typingsJapgolly.grommet.anon.X
import typingsJapgolly.grommet.anon.XY
import typingsJapgolly.grommet.anon.Y
import typingsJapgolly.grommet.es6ComponentsGridMod.GridGapType
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.grommet.grommetStrings.align
import typingsJapgolly.grommet.grommetStrings.fill
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsDataChartMod {
  
  @JSImport("grommet/es6/components/DataChart", "DataChart")
  @js.native
  val DataChart: FC[DataChartProps] = js.native
  
  type ChartType = String | Dash
  
  trait DataChartProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    // axis - when true, {
    //   x: { property: 'date' <if any>, granularity: 'coarse' },
    //   y: { property: property[0].property, granularity: 'coarse' },
    // }
    var axis: js.UndefOr[Boolean | X] = js.undefined
    
    var bounds: js.UndefOr[align | Y] = js.undefined
    
    // chart - if undefined, { type: 'bar', property: <first series property> }
    var chart: js.UndefOr[ChartType | js.Array[ChartType]] = js.undefined
    
    // data - an array of objects containing data values
    var data: js.Array[js.Object]
    
    // detail - whether to show details via hover/touch interaction
    var detail: js.UndefOr[Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, Node])] = js.undefined
    
    var gap: js.UndefOr[GridGapType] = js.undefined
    
    // between axes and guides/visuals
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    // generic
    // guide - when true, {
    //   x: { granularity: 'coarse' },
    //   y: { granularity: 'coarse' },
    // }
    var guide: js.UndefOr[Boolean | XY] = js.undefined
    
    // legend - when true, { side: 'bottom' }
    var legend: js.UndefOr[Boolean | Side] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    // offset - whether to shift the charts to reveal them all, mostly useful
    // for bar charts
    var offset: js.UndefOr[Boolean | Gap] = js.undefined
    
    // pad - padding around the guides/visuals
    // defaults to what's needed based on axis and chart types
    var pad: js.UndefOr[PadType] = js.undefined
    
    var placeholder: js.UndefOr[String | Node] = js.undefined
    
    // series - the data item properties and any
    var series: SeriesType | js.Array[SeriesType]
    
    // generic
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
      ] = js.undefined
  }
  object DataChartProps {
    
    inline def apply(data: js.Array[js.Object], series: SeriesType | js.Array[SeriesType]): DataChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataChartProps]
    }
    
    extension [Self <: DataChartProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAxis(value: Boolean | X): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setBounds(value: align | Y): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setChart(value: ChartType | js.Array[ChartType]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      inline def setChartVarargs(value: ChartType*): Self = StObject.set(x, "chart", js.Array(value*))
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDetail(value: Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, Node])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailFunction2(value: (/* datum */ js.Object, /* index */ Double) => Node): Self = StObject.set(x, "detail", js.Any.fromFunction2(value))
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setGap(value: GridGapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGuide(value: Boolean | XY): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setLegend(value: Boolean | Side): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOffset(value: Boolean | Gap): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPlaceholder(value: String | Node): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSeries(value: SeriesType | js.Array[SeriesType]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesVarargs(value: SeriesType*): Self = StObject.set(x, "series", js.Array(value*))
      
      inline def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.coarse
    - typingsJapgolly.grommet.grommetStrings.medium
    - typingsJapgolly.grommet.grommetStrings.fine
  */
  trait GranularityType extends StObject
  object GranularityType {
    
    inline def coarse: typingsJapgolly.grommet.grommetStrings.coarse = "coarse".asInstanceOf[typingsJapgolly.grommet.grommetStrings.coarse]
    
    inline def fine: typingsJapgolly.grommet.grommetStrings.fine = "fine".asInstanceOf[typingsJapgolly.grommet.grommetStrings.fine]
    
    inline def medium: typingsJapgolly.grommet.grommetStrings.medium = "medium".asInstanceOf[typingsJapgolly.grommet.grommetStrings.medium]
  }
  
  type SeriesType = String | Prefix
}
