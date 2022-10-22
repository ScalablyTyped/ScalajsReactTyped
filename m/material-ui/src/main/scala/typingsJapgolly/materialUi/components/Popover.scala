package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("material-ui", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Popover] {
    
    inline def anchorEl(value: ReactInstance): this.type = set("anchorEl", value.asInstanceOf[js.Any])
    
    inline def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def animation(value: ComponentClassP[PopoverAnimationProps & js.Object]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def autoCloseWhenOffScreen(value: Boolean): this.type = set("autoCloseWhenOffScreen", value.asInstanceOf[js.Any])
    
    inline def canAutoPosition(value: Boolean): this.type = set("canAutoPosition", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onRequestClose(value: /* reason */ String => Callback): this.type = set("onRequestClose", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    inline def useLayerForClickAway(value: Boolean): this.type = set("useLayerForClickAway", value.asInstanceOf[js.Any])
    
    inline def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
