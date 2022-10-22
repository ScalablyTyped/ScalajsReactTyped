package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Color
import typingsJapgolly.grommet.anon.Height
import typingsJapgolly.grommet.anon.Label
import typingsJapgolly.grommet.anon.Opacity
import typingsJapgolly.grommet.anon.Vertical
import typingsJapgolly.grommet.es6ComponentsChartMod.ChartExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.EdgeSizeType
import typingsJapgolly.grommet.es6UtilsMod.GapType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.ThicknessType
import typingsJapgolly.grommet.grommetStrings.area
import typingsJapgolly.grommet.grommetStrings.bar
import typingsJapgolly.grommet.grommetStrings.circle
import typingsJapgolly.grommet.grommetStrings.circles
import typingsJapgolly.grommet.grommetStrings.diamond
import typingsJapgolly.grommet.grommetStrings.fill
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.line
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.point
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.square
import typingsJapgolly.grommet.grommetStrings.squares
import typingsJapgolly.grommet.grommetStrings.star
import typingsJapgolly.grommet.grommetStrings.stripesDiagonalDown
import typingsJapgolly.grommet.grommetStrings.stripesDiagonalUp
import typingsJapgolly.grommet.grommetStrings.stripesHorizontal
import typingsJapgolly.grommet.grommetStrings.stripesVertical
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.triangle
import typingsJapgolly.grommet.grommetStrings.triangleDown
import typingsJapgolly.grommet.grommetStrings.weak
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chart {
  
  inline def apply(values: js.Array[Double | js.Array[Double] | Label]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChartExtendedProps]))
  }
  
  @JSImport("grommet/es6", "Chart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def bounds(value: js.Array[js.Array[Double]]): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def boundsVarargs(value: js.Array[Double]*): this.type = set("bounds", js.Array(value*))
    
    inline def color(value: ColorType | js.Array[Color] | Opacity): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorVarargs(value: Color*): this.type = set("color", js.Array(value*))
    
    inline def dash(value: Boolean): this.type = set("dash", value.asInstanceOf[js.Any])
    
    inline def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* repeated */ Any => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onHover(value: /* repeated */ Any => Any): this.type = set("onHover", js.Any.fromFunction1(value))
    
    inline def opacity(value: weak | medium | strong | Boolean | Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def pad(value: EdgeSizeType | Vertical): this.type = set("pad", value.asInstanceOf[js.Any])
    
    inline def pattern(
      value: squares | circles | stripesHorizontal | stripesVertical | stripesDiagonalDown | stripesDiagonalUp
    ): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def point(value: circle | diamond | square | star | triangle | triangleDown): this.type = set("point", value.asInstanceOf[js.Any])
    
    inline def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    
    inline def size(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def thickness(value: ThicknessType): this.type = set("thickness", value.asInstanceOf[js.Any])
    
    inline def `type`(value: bar | line | area | point): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChartExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
