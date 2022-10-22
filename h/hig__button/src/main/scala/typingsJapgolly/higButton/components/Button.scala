package typingsJapgolly.higButton.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.higButton.mod.AvailableTargets_
import typingsJapgolly.higButton.mod.AvailableTypes_
import typingsJapgolly.higButton.mod.AvailableWidths_
import typingsJapgolly.higButton.mod.Props
import typingsJapgolly.higButton.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  inline def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@hig/button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def link(value: String): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onHover(value: Callback): this.type = set("onHover", value.toJsFn)
    
    inline def onMouseDown(value: Callback): this.type = set("onMouseDown", value.toJsFn)
    
    inline def onMouseEnter(value: Callback): this.type = set("onMouseEnter", value.toJsFn)
    
    inline def onMouseLeave(value: Callback): this.type = set("onMouseLeave", value.toJsFn)
    
    inline def onMouseUp(value: Callback): this.type = set("onMouseUp", value.toJsFn)
    
    inline def stylesheet(value: Any): this.type = set("stylesheet", value.asInstanceOf[js.Any])
    
    inline def target(value: AvailableTargets_): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def `type`(value: AvailableTypes_): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def width(value: AvailableWidths_): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
