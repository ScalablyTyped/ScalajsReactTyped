package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactToolbox.componentsSnackbarMod.default
import typingsJapgolly.reactToolbox.componentsSnackbarSnackbarMod.SnackbarProps
import typingsJapgolly.reactToolbox.componentsSnackbarSnackbarMod.SnackbarTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.accept
import typingsJapgolly.reactToolbox.reactToolboxStrings.cancel
import typingsJapgolly.reactToolbox.reactToolboxStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  @JSImport("react-toolbox/components/snackbar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def label(value: String | Element): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    inline def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def onTimeout(value: js.Function): this.type = set("onTimeout", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(value: SnackbarTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def `type`(value: accept | cancel | warning): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Snackbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SnackbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
