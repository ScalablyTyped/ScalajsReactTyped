package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsTextMod.TextExtendedProps
import typingsJapgolly.grommet.es6ComponentsTipMod.TipProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.`2xl`
import typingsJapgolly.grommet.grommetStrings.`3xl`
import typingsJapgolly.grommet.grommetStrings.`4xl`
import typingsJapgolly.grommet.grommetStrings.`5xl`
import typingsJapgolly.grommet.grommetStrings.`6xl`
import typingsJapgolly.grommet.grommetStrings.`break-all`
import typingsJapgolly.grommet.grommetStrings.`break-word`
import typingsJapgolly.grommet.grommetStrings.`keep-all`
import typingsJapgolly.grommet.grommetStrings.bold
import typingsJapgolly.grommet.grommetStrings.bolder
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.lighter
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.normal
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.tip
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("grommet/es6", "Text")
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
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def size(
      value: xsmall | small | medium | large | xlarge | xxlarge | `2xl` | `3xl` | `4xl` | `5xl` | `6xl` | String
    ): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tag(value: PolymorphicType): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: TextAlignType): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def tip(value: TipProps | String): this.type = set("tip", value.asInstanceOf[js.Any])
    
    inline def truncate(value: Boolean | tip): this.type = set("truncate", value.asInstanceOf[js.Any])
    
    inline def weight(value: normal | bold | bolder | lighter | Double): this.type = set("weight", value.asInstanceOf[js.Any])
    
    inline def wordBreak(value: normal | `break-all` | `keep-all` | `break-word`): this.type = set("wordBreak", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
