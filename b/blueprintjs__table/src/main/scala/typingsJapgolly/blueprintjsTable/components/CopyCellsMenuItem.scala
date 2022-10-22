package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.anon.PartialIPopoverProps
import typingsJapgolly.blueprintjsCore.anon.PartialMenuProps
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.listoption
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.menuitem
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusCopyCellsMenuItemMod.ICopyCellsMenuItemProps
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CopyCellsMenuItem {
  
  inline def apply(context: IMenuContext, getCellData: (Double, Double) => Any): Builder = {
    val __props = js.Dynamic.literal(context = context.asInstanceOf[js.Any], getCellData = js.Any.fromFunction2(getCellData))
    new Builder(js.Array(this.component, __props.asInstanceOf[ICopyCellsMenuItemProps]))
  }
  
  @JSImport("@blueprintjs/table", "CopyCellsMenuItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.CopyCellsMenuItem] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def htmlTitle(value: String): this.type = set("htmlTitle", value.asInstanceOf[js.Any])
    
    inline def icon(value: BlueprintIcons16Id | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelClassName(value: String): this.type = set("labelClassName", value.asInstanceOf[js.Any])
    
    inline def labelElement(value: VdomNode): this.type = set("labelElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelElementNull: this.type = set("labelElement", null)
    
    inline def labelElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("labelElement", js.Array(value*))
    
    inline def labelElementVdomElement(value: VdomElement): this.type = set("labelElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onCopy(value: /* success */ Boolean => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: /* success */ Boolean) => value(t0).runNow()))
    
    inline def popoverProps(value: PartialIPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def roleStructure(value: menuitem | listoption): this.type = set("roleStructure", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def shouldDismissPopover(value: Boolean): this.type = set("shouldDismissPopover", value.asInstanceOf[js.Any])
    
    inline def submenuProps(value: PartialMenuProps): this.type = set("submenuProps", value.asInstanceOf[js.Any])
    
    inline def tagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.a, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.abbr, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.address */ Any
    ): this.type = set("tagName", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICopyCellsMenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
