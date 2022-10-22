package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperClosablePopoverMod.ClosablePopoverProps
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperClosablePopoverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClosablePopover {
  
  inline def apply(content: js.Function): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClosablePopoverProps]))
  }
  
  @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeOnMouseLeave(value: Boolean): this.type = set("closeOnMouseLeave", value.asInstanceOf[js.Any])
    
    inline def initiallyOpened(value: Boolean): this.type = set("initiallyOpened", value.asInstanceOf[js.Any])
    
    inline def onClose(value: js.Function): this.type = set("onClose", value.asInstanceOf[js.Any])
    
    inline def onOpen(value: js.Function): this.type = set("onOpen", value.asInstanceOf[js.Any])
    
    inline def opened(value: Boolean): this.type = set("opened", value.asInstanceOf[js.Any])
    
    inline def target(value: VdomNode): this.type = set("target", value.rawNode.asInstanceOf[js.Any])
    
    inline def targetNull: this.type = set("target", null)
    
    inline def targetVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("target", js.Array(value*))
    
    inline def targetVdomElement(value: VdomElement): this.type = set("target", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClosablePopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
