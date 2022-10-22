package typingsJapgolly.styledComponents.components

import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.styledComponents.nativeDistModelsStyleSheetManagerMod.Props
import typingsJapgolly.styledComponents.nativeDistSheetMod.default
import typingsJapgolly.stylis.mod.Middleware_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheetManager {
  
  @JSImport("styled-components/native/dist", "StyleSheetManager")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: ReactChild): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def disableCSSOMInjection(value: Boolean): this.type = set("disableCSSOMInjection", value.asInstanceOf[js.Any])
    
    inline def disableVendorPrefixes(value: Boolean): this.type = set("disableVendorPrefixes", value.asInstanceOf[js.Any])
    
    inline def sheet(value: default): this.type = set("sheet", value.asInstanceOf[js.Any])
    
    inline def stylisPlugins(value: js.Array[Middleware_]): this.type = set("stylisPlugins", value.asInstanceOf[js.Any])
    
    inline def stylisPluginsVarargs(value: Middleware_ *): this.type = set("stylisPlugins", js.Array(value*))
    
    inline def target(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StyleSheetManager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
