package typingsJapgolly.reactTagAutocomplete.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactTagAutocomplete.mod.ClassNames
import typingsJapgolly.reactTagAutocomplete.mod.ReactTagsProps
import typingsJapgolly.reactTagAutocomplete.mod.SuggestionComponentProps
import typingsJapgolly.reactTagAutocomplete.mod.Tag
import typingsJapgolly.reactTagAutocomplete.mod.TagComponentProps
import typingsJapgolly.reactTagAutocomplete.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagAutocomplete {
  
  inline def apply(onAddition: Tag => Callback, onDelete: Double => Callback): Builder = {
    val __props = js.Dynamic.literal(onAddition = js.Any.fromFunction1((t0: Tag) => onAddition(t0).runNow()), onDelete = js.Any.fromFunction1((t0: Double) => onDelete(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
  
  @JSImport("react-tag-autocomplete", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def addOnBlur(value: Boolean): this.type = set("addOnBlur", value.asInstanceOf[js.Any])
    
    inline def allowBackspace(value: Boolean): this.type = set("allowBackspace", value.asInstanceOf[js.Any])
    
    inline def allowNew(value: Boolean): this.type = set("allowNew", value.asInstanceOf[js.Any])
    
    inline def ariaLabelText(value: String): this.type = set("ariaLabelText", value.asInstanceOf[js.Any])
    
    inline def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
    
    inline def autoresize(value: Boolean): this.type = set("autoresize", value.asInstanceOf[js.Any])
    
    inline def classNames(value: ClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    inline def clearInputOnDelete(value: Boolean): this.type = set("clearInputOnDelete", value.asInstanceOf[js.Any])
    
    inline def delimiters(value: js.Array[String]): this.type = set("delimiters", value.asInstanceOf[js.Any])
    
    inline def delimitersVarargs(value: String*): this.type = set("delimiters", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxSuggestionsLength(value: Double): this.type = set("maxSuggestionsLength", value.asInstanceOf[js.Any])
    
    inline def minQueryLength(value: Double): this.type = set("minQueryLength", value.asInstanceOf[js.Any])
    
    inline def newTagText(value: String): this.type = set("newTagText", value.asInstanceOf[js.Any])
    
    inline def noSuggestionsText(value: String): this.type = set("noSuggestionsText", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onInput(value: /* input */ String => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: /* input */ String) => value(t0).runNow()))
    
    inline def onValidate(value: /* tag */ Tag => Boolean): this.type = set("onValidate", js.Any.fromFunction1(value))
    
    inline def placeholderText(value: String): this.type = set("placeholderText", value.asInstanceOf[js.Any])
    
    inline def removeButtonText(value: String): this.type = set("removeButtonText", value.asInstanceOf[js.Any])
    
    inline def suggestionComponent(value: FC[SuggestionComponentProps]): this.type = set("suggestionComponent", value.asInstanceOf[js.Any])
    
    inline def suggestions(value: js.Array[Tag]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    
    inline def suggestionsFilter(value: (/* suggestion */ Tag, /* query */ String) => Boolean): this.type = set("suggestionsFilter", js.Any.fromFunction2(value))
    
    inline def suggestionsTransform(value: (/* query */ String, /* suggestions */ js.Array[Tag]) => js.Array[Tag]): this.type = set("suggestionsTransform", js.Any.fromFunction2(value))
    
    inline def suggestionsVarargs(value: Tag*): this.type = set("suggestions", js.Array(value*))
    
    inline def tagComponent(value: FC[TagComponentProps]): this.type = set("tagComponent", value.asInstanceOf[js.Any])
    
    inline def tags(value: js.Array[Tag]): this.type = set("tags", value.asInstanceOf[js.Any])
    
    inline def tagsVarargs(value: Tag*): this.type = set("tags", js.Array(value*))
  }
  
  def withProps(p: ReactTagsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
