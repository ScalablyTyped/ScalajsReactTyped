package typingsJapgolly.reactToolbox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToolbox.componentsLayoutNavDrawerMod.NavDrawerProps
import typingsJapgolly.reactToolbox.componentsLayoutNavDrawerMod.NavDrawerTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.left
import typingsJapgolly.reactToolbox.reactToolboxStrings.lg
import typingsJapgolly.reactToolbox.reactToolboxStrings.lgTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.md
import typingsJapgolly.reactToolbox.reactToolboxStrings.right
import typingsJapgolly.reactToolbox.reactToolboxStrings.sm
import typingsJapgolly.reactToolbox.reactToolboxStrings.smTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.xl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxxl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavDrawer {
  
  @JSImport("react-toolbox/components/layout", "NavDrawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactToolbox.componentsLayoutMod.NavDrawer] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def clipped(value: Boolean): this.type = set("clipped", value.asInstanceOf[js.Any])
    
    inline def insideTree(value: Boolean): this.type = set("insideTree", value.asInstanceOf[js.Any])
    
    inline def onOverlayClick(value: js.Function): this.type = set("onOverlayClick", value.asInstanceOf[js.Any])
    
    inline def permanentAt(value: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl): this.type = set("permanentAt", value.asInstanceOf[js.Any])
    
    inline def pinned(value: Boolean): this.type = set("pinned", value.asInstanceOf[js.Any])
    
    inline def theme(value: NavDrawerTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: left | right): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def withOverlay(value: Boolean): this.type = set("withOverlay", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NavDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavDrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
