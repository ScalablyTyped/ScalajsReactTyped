package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.gridMod.BreakpointsType
import typingsJapgolly.cathoQuantum.gridMod.ColProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Col {
  
  @JSImport("@catho/quantum/Grid", "Col")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.cathoQuantum.gridMod.Col] {
    
    inline def hide(value: BreakpointsType | js.Array[BreakpointsType]): this.type = set("hide", value.asInstanceOf[js.Any])
    
    inline def hideVarargs(value: BreakpointsType*): this.type = set("hide", js.Array(value*))
    
    inline def large(value: Double): this.type = set("large", value.asInstanceOf[js.Any])
    
    inline def `large-offset`(value: Double): this.type = set("large-offset", value.asInstanceOf[js.Any])
    
    inline def medium(value: Double): this.type = set("medium", value.asInstanceOf[js.Any])
    
    inline def `medium-offset`(value: Double): this.type = set("medium-offset", value.asInstanceOf[js.Any])
    
    inline def `no-gutters`(value: Boolean): this.type = set("no-gutters", value.asInstanceOf[js.Any])
    
    inline def small(value: Double): this.type = set("small", value.asInstanceOf[js.Any])
    
    inline def `small-offset`(value: Double): this.type = set("small-offset", value.asInstanceOf[js.Any])
    
    inline def xsmall(value: Double): this.type = set("xsmall", value.asInstanceOf[js.Any])
    
    inline def `xsmall-offset`(value: Double): this.type = set("xsmall-offset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Col.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
