package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsParagraphMod.ParagraphExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xxlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("grommet/es6", "Paragraph")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorType): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | xlarge | xxlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: TextAlignType): this.type = set("textAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Paragraph.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ParagraphExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
