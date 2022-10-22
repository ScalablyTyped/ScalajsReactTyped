package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BreakpointsComponents
import typingsJapgolly.cathoQuantum.gridMod.BreakpointsType
import typingsJapgolly.cathoQuantum.gridMod.ContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  @JSImport("@catho/quantum/Grid", "Container")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.cathoQuantum.gridMod.Container] {
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def hide(value: BreakpointsType | js.Array[String]): this.type = set("hide", value.asInstanceOf[js.Any])
    
    inline def hideVarargs(value: String*): this.type = set("hide", js.Array(value*))
    
    inline def `no-gutters`(value: Boolean): this.type = set("no-gutters", value.asInstanceOf[js.Any])
    
    inline def theme(value: BreakpointsComponents): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def withBreakpoints(value: Boolean): this.type = set("withBreakpoints", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Container.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
