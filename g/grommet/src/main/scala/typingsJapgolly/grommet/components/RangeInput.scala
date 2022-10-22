package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsRangeInputMod.ColorInterface
import typingsJapgolly.grommet.es6ComponentsRangeInputMod.RangeInputExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangeInput {
  
  @JSImport("grommet/es6", "RangeInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorType | js.Array[ColorInterface]): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorVarargs(value: ColorInterface*): this.type = set("color", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RangeInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RangeInputExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
