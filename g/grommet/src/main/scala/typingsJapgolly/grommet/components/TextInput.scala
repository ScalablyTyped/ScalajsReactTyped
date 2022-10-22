package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Bottom
import typingsJapgolly.grommet.anon.EnterSelect
import typingsJapgolly.grommet.anon.LabelValue
import typingsJapgolly.grommet.anon.Suggestion
import typingsJapgolly.grommet.es6ComponentsDropMod.DropProps
import typingsJapgolly.grommet.es6ComponentsTextInputMod.TextInputProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.PlaceHolderType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInput {
  
  @JSImport("grommet/es6", "TextInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def defaultSuggestion(value: Double): this.type = set("defaultSuggestion", value.asInstanceOf[js.Any])
    
    inline def dropAlign(value: Bottom): this.type = set("dropAlign", value.asInstanceOf[js.Any])
    
    inline def dropHeight(value: xsmall | small | medium | large | xlarge | String): this.type = set("dropHeight", value.asInstanceOf[js.Any])
    
    inline def dropProps(value: DropProps): this.type = set("dropProps", value.asInstanceOf[js.Any])
    
    inline def dropTarget(value: js.Object): this.type = set("dropTarget", value.asInstanceOf[js.Any])
    
    inline def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def messages(value: EnterSelect): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: /* x */ Suggestion => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* x */ Suggestion) => value(t0).runNow()))
    
    inline def onSuggestionSelect(value: /* x */ Suggestion => Callback): this.type = set("onSuggestionSelect", js.Any.fromFunction1((t0: /* x */ Suggestion) => value(t0).runNow()))
    
    inline def onSuggestionsClose(value: Callback): this.type = set("onSuggestionsClose", value.toJsFn)
    
    inline def onSuggestionsOpen(value: Callback): this.type = set("onSuggestionsOpen", value.toJsFn)
    
    inline def placeholder(value: PlaceHolderType): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def plain(value: Boolean | full): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def suggestions(value: js.Array[LabelValue | String]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    
    inline def suggestionsVarargs(value: (LabelValue | String)*): this.type = set("suggestions", js.Array(value*))
    
    inline def textAlign(value: TextAlignType): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
