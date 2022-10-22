package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactToolbox.componentsAutocompleteAutocompleteMod.AutocompleteProps
import typingsJapgolly.reactToolbox.componentsAutocompleteAutocompleteMod.AutocompleteTheme
import typingsJapgolly.reactToolbox.componentsAutocompleteMod.default
import typingsJapgolly.reactToolbox.componentsInputInputMod.InputTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.above
import typingsJapgolly.reactToolbox.reactToolboxStrings.anywhere
import typingsJapgolly.reactToolbox.reactToolboxStrings.auto
import typingsJapgolly.reactToolbox.reactToolboxStrings.below
import typingsJapgolly.reactToolbox.reactToolboxStrings.disabled
import typingsJapgolly.reactToolbox.reactToolboxStrings.down
import typingsJapgolly.reactToolbox.reactToolboxStrings.none
import typingsJapgolly.reactToolbox.reactToolboxStrings.start
import typingsJapgolly.reactToolbox.reactToolboxStrings.up
import typingsJapgolly.reactToolbox.reactToolboxStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autocomplete {
  
  @JSImport("react-toolbox/components/autocomplete", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowCreate(value: Boolean): this.type = set("allowCreate", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def direction(value: auto | up | down): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: VdomNode): this.type = set("error", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorNull: this.type = set("error", null)
    
    inline def errorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("error", js.Array(value*))
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
    
    inline def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    
    inline def hint(value: VdomNode): this.type = set("hint", value.rawNode.asInstanceOf[js.Any])
    
    inline def hintNull: this.type = set("hint", null)
    
    inline def hintVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("hint", js.Array(value*))
    
    inline def hintVdomElement(value: VdomElement): this.type = set("hint", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def keepFocusOnChange(value: Boolean): this.type = set("keepFocusOnChange", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: js.Function): this.type = set("onBlur", value.asInstanceOf[js.Any])
    
    inline def onChange(value: js.Function): this.type = set("onChange", value.asInstanceOf[js.Any])
    
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
    
    inline def onFocus(value: js.Function): this.type = set("onFocus", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: js.Function): this.type = set("onKeyDown", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: js.Function): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: js.Function): this.type = set("onKeyUp", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def onQueryChange(value: js.Function): this.type = set("onQueryChange", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def selectedPosition(value: above | below | none): this.type = set("selectedPosition", value.asInstanceOf[js.Any])
    
    inline def showSelectedWhenNotInSource(value: Boolean): this.type = set("showSelectedWhenNotInSource", value.asInstanceOf[js.Any])
    
    inline def showSuggestionsWhenValueIsSet(value: Boolean): this.type = set("showSuggestionsWhenValueIsSet", value.asInstanceOf[js.Any])
    
    inline def source(value: Any): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suggestionMatch(value: disabled | start | anywhere | word): this.type = set("suggestionMatch", value.asInstanceOf[js.Any])
    
    inline def theme(value: AutocompleteTheme & InputTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Autocomplete.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AutocompleteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
