package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixUiCore.anon.PartialOption
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.AddressOutput
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Handler
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.MapsClientConstructor
import typingsJapgolly.wixUiCore.distEsSrcComponentsAddressInputAddressInputMod.AddressInputProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsAddressInputAddressInputMod.Converter
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.AppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddressInput {
  
  inline def apply(Client: MapsClientConstructor, onSelect: AddressOutput => Callback): Builder = {
    val __props = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: AddressOutput) => onSelect(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[AddressInputProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "AddressInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.AddressInput] {
    
    inline def apiKey(value: String): this.type = set("apiKey", value.asInstanceOf[js.Any])
    
    inline def appendTo(value: AppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToFunction1(value: /* s */ Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearSuggestionsOnBlur(value: Boolean): this.type = set("clearSuggestionsOnBlur", value.asInstanceOf[js.Any])
    
    inline def clientId(value: String): this.type = set("clientId", value.asInstanceOf[js.Any])
    
    inline def converterType(value: Converter): this.type = set("converterType", value.asInstanceOf[js.Any])
    
    inline def countryCode(value: String): this.type = set("countryCode", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dynamicWidth(value: Boolean): this.type = set("dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def emptyStateMessage(value: String): this.type = set("emptyStateMessage", value.asInstanceOf[js.Any])
    
    inline def externalBaseUrl(value: String): this.type = set("externalBaseUrl", value.asInstanceOf[js.Any])
    
    inline def fallbackToManual(value: Boolean): this.type = set("fallbackToManual", value.asInstanceOf[js.Any])
    
    inline def filterTypes(value: js.Array[String]): this.type = set("filterTypes", value.asInstanceOf[js.Any])
    
    inline def filterTypesVarargs(value: String*): this.type = set("filterTypes", js.Array(value*))
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedFooterNull: this.type = set("fixedFooter", null)
    
    inline def fixedFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("fixedFooter", js.Array(value*))
    
    inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def forceContentElementVisibility(value: Boolean): this.type = set("forceContentElementVisibility", value.asInstanceOf[js.Any])
    
    inline def forceOptions(value: js.Array[PartialOption]): this.type = set("forceOptions", value.asInstanceOf[js.Any])
    
    inline def forceOptionsVarargs(value: PartialOption*): this.type = set("forceOptions", js.Array(value*))
    
    inline def forceSelect(value: Boolean): this.type = set("forceSelect", value.asInstanceOf[js.Any])
    
    inline def handler(value: Handler): this.type = set("handler", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def instance(value: String): this.type = set("instance", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def locationIcon(value: VdomNode): this.type = set("locationIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def locationIconNull: this.type = set("locationIcon", null)
    
    inline def locationIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("locationIcon", js.Array(value*))
    
    inline def locationIconVdomElement(value: VdomElement): this.type = set("locationIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def moveBy(value: MoveBy): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def onDoubleClick(value: Callback): this.type = set("onDoubleClick", value.toJsFn)
    
    inline def onError(value: /* err */ js.Error => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onManualInput(value: /* value */ String => Callback): this.type = set("onManualInput", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onMouseEnter(value: Callback): this.type = set("onMouseEnter", value.toJsFn)
    
    inline def onMouseLeave(value: Callback): this.type = set("onMouseLeave", value.toJsFn)
    
    inline def optionStyle(value: CSSProperties): this.type = set("optionStyle", value.asInstanceOf[js.Any])
    
    inline def optionsContainerZIndex(value: Double): this.type = set("optionsContainerZIndex", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def prefix(value: VdomNode): this.type = set("prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prefixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("prefix", js.Array(value*))
    
    inline def prefixVdomElement(value: VdomElement): this.type = set("prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
    
    inline def throttleInterval(value: Double): this.type = set("throttleInterval", value.asInstanceOf[js.Any])
    
    inline def types(value: js.Array[String]): this.type = set("types", value.asInstanceOf[js.Any])
    
    inline def typesVarargs(value: String*): this.type = set("types", js.Array(value*))
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AddressInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
