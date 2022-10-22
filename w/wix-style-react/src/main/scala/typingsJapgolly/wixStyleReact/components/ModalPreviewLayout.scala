package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesModalPreviewLayoutMod.ModalPreviewLayoutProps
import typingsJapgolly.wixStyleReact.distTypesModalPreviewLayoutMod.NextButtonProps
import typingsJapgolly.wixStyleReact.distTypesModalPreviewLayoutMod.PrevButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalPreviewLayout {
  
  inline def apply(onClose: Callback): Builder = {
    val __props = js.Dynamic.literal(onClose = onClose.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalPreviewLayoutProps]))
  }
  
  @JSImport("wix-style-react", "ModalPreviewLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ModalPreviewLayout] {
    
    inline def actions(value: VdomNode): this.type = set("actions", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionsNull: this.type = set("actions", null)
    
    inline def actionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("actions", js.Array(value*))
    
    inline def actionsVdomElement(value: VdomElement): this.type = set("actions", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeButtonTooltipText(value: String): this.type = set("closeButtonTooltipText", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def nextButtonProps(value: NextButtonProps): this.type = set("nextButtonProps", value.asInstanceOf[js.Any])
    
    inline def prevButtonProps(value: PrevButtonProps): this.type = set("prevButtonProps", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnOverlayClick(value: Boolean): this.type = set("shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalPreviewLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
