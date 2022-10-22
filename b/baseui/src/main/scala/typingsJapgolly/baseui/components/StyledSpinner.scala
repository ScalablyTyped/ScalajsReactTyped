package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.heightnumberwidthnumberSp
import typingsJapgolly.baseui.baseuiStrings.scale0
import typingsJapgolly.baseui.baseuiStrings.scale100
import typingsJapgolly.baseui.baseuiStrings.scale1000
import typingsJapgolly.baseui.baseuiStrings.scale1200
import typingsJapgolly.baseui.baseuiStrings.scale1400
import typingsJapgolly.baseui.baseuiStrings.scale1600
import typingsJapgolly.baseui.baseuiStrings.scale200
import typingsJapgolly.baseui.baseuiStrings.scale2400
import typingsJapgolly.baseui.baseuiStrings.scale300
import typingsJapgolly.baseui.baseuiStrings.scale3200
import typingsJapgolly.baseui.baseuiStrings.scale400
import typingsJapgolly.baseui.baseuiStrings.scale4800
import typingsJapgolly.baseui.baseuiStrings.scale500
import typingsJapgolly.baseui.baseuiStrings.scale550
import typingsJapgolly.baseui.baseuiStrings.scale600
import typingsJapgolly.baseui.baseuiStrings.scale650
import typingsJapgolly.baseui.baseuiStrings.scale700
import typingsJapgolly.baseui.baseuiStrings.scale750
import typingsJapgolly.baseui.baseuiStrings.scale800
import typingsJapgolly.baseui.baseuiStrings.scale850
import typingsJapgolly.baseui.baseuiStrings.scale900
import typingsJapgolly.baseui.baseuiStrings.scale950
import typingsJapgolly.baseui.spinnerTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledSpinner {
  
  inline def apply[C /* <: ElementType */]($height: Double, $width: Double): Builder[C] = {
    val __props = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, heightnumberwidthnumberSp])]))
  }
  
  @JSImport("baseui/snackbar", "StyledSpinner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $borderWidth(
      value: Double | String | scale0 | scale100 | scale200 | scale300 | scale400 | scale500 | scale550 | scale600 | scale650 | scale700 | scale750 | scale800 | scale850 | scale900 | scale950 | scale1000 | scale1200 | scale1400 | scale1600 | scale2400 | scale3200 | scale4800 | Size
    ): this.type = set("$borderWidth", value.asInstanceOf[js.Any])
    
    inline def $color(value: String): this.type = set("$color", value.asInstanceOf[js.Any])
    
    inline def $size(
      value: Double | String | scale0 | scale100 | scale200 | scale300 | scale400 | scale500 | scale550 | scale600 | scale650 | scale700 | scale750 | scale800 | scale850 | scale900 | scale950 | scale1000 | scale1200 | scale1400 | scale1600 | scale2400 | scale3200 | scale4800 | Size
    ): this.type = set("$size", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[heightnumberwidthnumberSp, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: heightnumberwidthnumberSp => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, heightnumberwidthnumberSp])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
