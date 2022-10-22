package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.boxBoxMod.BoxProps
import typingsJapgolly.materialUiCore.boxBoxMod.SystemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("@material-ui/core", "Box")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def clone_(value: Boolean): this.type = set("clone", value.asInstanceOf[js.Any])
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def css(value: SystemProps): this.type = set("css", value.asInstanceOf[js.Any])
    
    inline def sx(value: SystemProps): this.type = set("sx", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
