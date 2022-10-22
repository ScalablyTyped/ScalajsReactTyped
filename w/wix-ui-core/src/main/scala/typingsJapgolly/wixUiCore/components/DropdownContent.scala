package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentMod.DropdownContentProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentMod.IDOMid
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownContent {
  
  inline def apply(
    onOptionClick: js.UndefOr[Option] => Callback,
    options: js.Array[Option],
    selectedIds: js.Array[String | Double]
  ): Builder = {
    val __props = js.Dynamic.literal(onOptionClick = js.Any.fromFunction1((t0: js.UndefOr[Option]) => onOptionClick(t0).runNow()), options = options.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownContentProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "DropdownContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.DropdownContent] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedFooterNull: this.type = set("fixedFooter", null)
    
    inline def fixedFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedFooter", js.Array(value*))
    
    inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: VdomNode): this.type = set("fixedHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedHeaderNull: this.type = set("fixedHeader", null)
    
    inline def fixedHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedHeader", js.Array(value*))
    
    inline def fixedHeaderVdomElement(value: VdomElement): this.type = set("fixedHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onOptionHover(value: /* option */ (Option & IDOMid) | Null => Callback): this.type = set("onOptionHover", js.Any.fromFunction1((t0: /* option */ (Option & IDOMid) | Null) => value(t0).runNow()))
    
    inline def optionsContainerId(value: String): this.type = set("optionsContainerId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
