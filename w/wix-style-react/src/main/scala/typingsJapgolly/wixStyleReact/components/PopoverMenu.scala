package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixStyleReact.distTypesCommonMod.MoveByOffset
import typingsJapgolly.wixStyleReact.distTypesPopoverMenuMod.PopoverMenuProps
import typingsJapgolly.wixStyleReact.distTypesPopoverMenuMod.PopoverTriggerElementProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverMenu {
  
  @JSImport("wix-style-react", "PopoverMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.PopoverMenu] {
    
    inline def appendTo(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ Any
    ): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
    ): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
    ): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: MoveByOffset): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def placement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def textSize(value: small | medium): this.type = set("textSize", value.asInstanceOf[js.Any])
    
    inline def triggerElement(value: Node | FC[PopoverTriggerElementProps]): this.type = set("triggerElement", value.asInstanceOf[js.Any])
    
    inline def triggerElementNull: this.type = set("triggerElement", null)
    
    inline def triggerElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("triggerElement", js.Array(value*))
    
    inline def triggerElementVdomElement(value: VdomElement): this.type = set("triggerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PopoverMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
