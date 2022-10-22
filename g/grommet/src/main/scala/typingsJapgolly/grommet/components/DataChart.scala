package typingsJapgolly.grommet.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Gap
import typingsJapgolly.grommet.anon.Height
import typingsJapgolly.grommet.anon.Side
import typingsJapgolly.grommet.anon.X
import typingsJapgolly.grommet.anon.XY
import typingsJapgolly.grommet.anon.Y
import typingsJapgolly.grommet.es6ComponentsDataChartMod.ChartType
import typingsJapgolly.grommet.es6ComponentsDataChartMod.DataChartProps
import typingsJapgolly.grommet.es6ComponentsDataChartMod.SeriesType
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataChart {
  
  inline def apply(data: js.Array[js.Object], series: SeriesType | js.Array[SeriesType]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DataChartProps]))
  }
  
  @JSImport("grommet/es6", "DataChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def axis(value: Boolean | X): this.type = set("axis", value.asInstanceOf[js.Any])
    
    inline def bounds(value: align | Y): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def chart(value: ChartType | js.Array[ChartType]): this.type = set("chart", value.asInstanceOf[js.Any])
    
    inline def chartVarargs(value: ChartType*): this.type = set("chart", js.Array(value*))
    
    inline def detail(value: Boolean | (js.Function2[/* datum */ js.Object, /* index */ Double, Node])): this.type = set("detail", value.asInstanceOf[js.Any])
    
    inline def detailFunction2(value: (/* datum */ js.Object, /* index */ Double) => Node): this.type = set("detail", js.Any.fromFunction2(value))
    
    inline def gap(value: GridGapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def guide(value: Boolean | XY): this.type = set("guide", value.asInstanceOf[js.Any])
    
    inline def legend(value: Boolean | Side): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def offset(value: Boolean | Gap): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def pad(value: PadType): this.type = set("pad", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String | Node): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
