package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownConstantsMod.OPEN_TRIGGER_TYPE
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsInputInputMod.InputProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsInputWithOptionsInputWithOptionsMod.InputWithOptionsProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.AppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputWithOptions {
  
  inline def apply(options: js.Array[Option]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InputWithOptionsProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "InputWithOptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.InputWithOptions] {
    
    inline def allowReselect(value: Boolean): this.type = set("allowReselect", value.asInstanceOf[js.Any])
    
    inline def appendTo(value: AppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToFunction1(value: /* s */ Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def emptyStateMessage(value: String): this.type = set("emptyStateMessage", value.asInstanceOf[js.Any])
    
    inline def emptyStateStyle(value: CSSProperties): this.type = set("emptyStateStyle", value.asInstanceOf[js.Any])
    
    inline def filterPredicate(value: (/* inputValue */ String, /* optionValue */ String) => Boolean): this.type = set("filterPredicate", js.Any.fromFunction2(value))
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedFooterNull: this.type = set("fixedFooter", null)
    
    inline def fixedFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("fixedFooter", js.Array(value*))
    
    inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: VdomNode): this.type = set("fixedHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedHeaderNull: this.type = set("fixedHeader", null)
    
    inline def fixedHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("fixedHeader", js.Array(value*))
    
    inline def fixedHeaderVdomElement(value: VdomElement): this.type = set("fixedHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def forceContentElementVisibility(value: Boolean): this.type = set("forceContentElementVisibility", value.asInstanceOf[js.Any])
    
    inline def highlightMatches(value: Boolean): this.type = set("highlightMatches", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def initialSelectedIds(value: js.Array[String | Double]): this.type = set("initialSelectedIds", value.asInstanceOf[js.Any])
    
    inline def initialSelectedIdsVarargs(value: (String | Double)*): this.type = set("initialSelectedIds", js.Array(value*))
    
    inline def inputProps(value: InputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: MoveBy): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def multi(value: Boolean): this.type = set("multi", value.asInstanceOf[js.Any])
    
    inline def onContentMouseDown(value: /* e */ ReactMouseEventFrom[Element] => Callback): this.type = set("onContentMouseDown", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def onDeselect(value: /* option */ Option => Callback): this.type = set("onDeselect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
    
    inline def onInitialSelectedOptionsSet(value: /* options */ js.Array[Option] => Callback): this.type = set("onInitialSelectedOptionsSet", js.Any.fromFunction1((t0: /* options */ js.Array[Option]) => value(t0).runNow()))
    
    inline def onManualInput(value: /* value */ String => Callback): this.type = set("onManualInput", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onSelect(value: /* option */ Option => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
    
    inline def openTrigger(value: OPEN_TRIGGER_TYPE): this.type = set("openTrigger", value.asInstanceOf[js.Any])
    
    inline def optionsContainerZIndex(value: Double): this.type = set("optionsContainerZIndex", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputWithOptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
