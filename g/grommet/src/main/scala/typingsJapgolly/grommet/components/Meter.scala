package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Highlight
import typingsJapgolly.grommet.anon.`1`
import typingsJapgolly.grommet.es6ComponentsMeterMod.MeterProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetStrings.bar
import typingsJapgolly.grommet.grommetStrings.circle
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.pie
import typingsJapgolly.grommet.grommetStrings.semicircle
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Meter {
  
  @JSImport("grommet/es6", "Meter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.grommet.es6Mod.Meter] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def background(value: String | `1`): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    
    inline def size(value: xsmall | small | medium | large | xlarge | full | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def thickness(value: xsmall | small | medium | large | xlarge | String): this.type = set("thickness", value.asInstanceOf[js.Any])
    
    inline def `type`(value: bar | circle | pie | semicircle): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def values(value: js.Array[Highlight]): this.type = set("values", value.asInstanceOf[js.Any])
    
    inline def valuesVarargs(value: Highlight*): this.type = set("values", js.Array(value*))
  }
  
  implicit def make(companion: Meter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MeterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
