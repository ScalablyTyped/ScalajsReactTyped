package typingsJapgolly.xstyledStyledComponents.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.xstyledStyledComponents.mod.ColorModeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorModeProvider {
  
  @JSImport("@xstyled/styled-components", "ColorModeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.xstyledStyledComponents.mod.ColorModeProvider] {
    
    inline def target(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetSelector(value: String): this.type = set("targetSelector", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ColorModeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColorModeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
