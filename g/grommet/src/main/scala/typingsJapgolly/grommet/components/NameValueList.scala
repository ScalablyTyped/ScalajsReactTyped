package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Align
import typingsJapgolly.grommet.anon.ColorError
import typingsJapgolly.grommet.anon.End
import typingsJapgolly.grommet.anon.`2`
import typingsJapgolly.grommet.es6ComponentsGridMod.AreasType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridColumnsType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridGapType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridSizeType
import typingsJapgolly.grommet.es6ComponentsNameValueListMod.NameValueListExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignContentType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.AlignType
import typingsJapgolly.grommet.es6UtilsMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.HeightType
import typingsJapgolly.grommet.es6UtilsMod.JustifyContentType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.WidthType
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.column
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.grid
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NameValueList {
  
  @JSImport("grommet/es6", "NameValueList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alignContent(value: AlignContentType): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def areas(value: AreasType): this.type = set("areas", value.asInstanceOf[js.Any])
    
    inline def areasVarargs(value: (js.Array[String] | End)*): this.type = set("areas", js.Array(value*))
    
    inline def as(value: PolymorphicType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def border(value: BorderType): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderVarargs(value: ColorError*): this.type = set("border", js.Array(value*))
    
    inline def columns(value: GridColumnsType): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: String*): this.type = set("columns", js.Array(value*))
    
    inline def fill(value: FillType): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def gap(value: GridGapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def height(value: HeightType): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def justify(value: start | center | end | stretch): this.type = set("justify", value.asInstanceOf[js.Any])
    
    inline def justifyContent(value: JustifyContentType): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def layout(value: column | grid): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def nameProps(value: Align): this.type = set("nameProps", value.asInstanceOf[js.Any])
    
    inline def pad(value: PadType): this.type = set("pad", value.asInstanceOf[js.Any])
    
    inline def pairProps(value: `2`): this.type = set("pairProps", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def rows(value: GridSizeType | js.Array[GridSizeType]): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def rowsVarargs(value: (GridSizeType | String)*): this.type = set("rows", js.Array(value*))
    
    inline def tag(value: PolymorphicType): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def valueProps(value: Align): this.type = set("valueProps", value.asInstanceOf[js.Any])
    
    inline def width(value: WidthType): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NameValueList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NameValueListExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
