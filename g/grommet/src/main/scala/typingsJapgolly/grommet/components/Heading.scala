package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsHeadingMod.HeadingExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.`1`
import typingsJapgolly.grommet.grommetStrings.`2`
import typingsJapgolly.grommet.grommetStrings.`3`
import typingsJapgolly.grommet.grommetStrings.`4`
import typingsJapgolly.grommet.grommetStrings.`5`
import typingsJapgolly.grommet.grommetStrings.`6`
import typingsJapgolly.grommet.grommetStrings.`break-word`
import typingsJapgolly.grommet.grommetStrings.anywhere
import typingsJapgolly.grommet.grommetStrings.bold
import typingsJapgolly.grommet.grommetStrings.bolder
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.lighter
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.normal
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Heading {
  
  @JSImport("grommet/es6", "Heading")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def as(value: PolymorphicType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorType): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def level(
      value: `1` | `2` | `3` | `4` | `5` | `6` | typingsJapgolly.grommet.grommetInts.`1` | typingsJapgolly.grommet.grommetInts.`2` | typingsJapgolly.grommet.grommetInts.`3` | typingsJapgolly.grommet.grommetInts.`4` | typingsJapgolly.grommet.grommetInts.`5` | typingsJapgolly.grommet.grommetInts.`6`
    ): this.type = set("level", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def overflowWrap(value: normal | `break-word` | anywhere | String): this.type = set("overflowWrap", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: TextAlignType): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def truncate(value: Boolean): this.type = set("truncate", value.asInstanceOf[js.Any])
    
    inline def weight(value: normal | bold | lighter | bolder | Double | String): this.type = set("weight", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Heading.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeadingExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
