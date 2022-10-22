package typingsJapgolly.reactTagInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactTagInput.anon.ActiveSuggestion
import typingsJapgolly.reactTagInput.anon.Id
import typingsJapgolly.reactTagInput.mod.Tag
import typingsJapgolly.reactTagInput.reactTagInputInts.`1`
import typingsJapgolly.reactTagInput.reactTagInputStrings.`inline`
import typingsJapgolly.reactTagInput.reactTagInputStrings.bottom
import typingsJapgolly.reactTagInput.reactTagInputStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ReactTagsProps1929081976[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def allowAdditionFromPaste(value: Boolean): this.type = set("allowAdditionFromPaste", value.asInstanceOf[js.Any])
  
  inline def allowDeleteFromEmptyInput(value: Boolean): this.type = set("allowDeleteFromEmptyInput", value.asInstanceOf[js.Any])
  
  inline def allowDragDrop(value: Boolean): this.type = set("allowDragDrop", value.asInstanceOf[js.Any])
  
  inline def allowUnique(value: Boolean): this.type = set("allowUnique", value.asInstanceOf[js.Any])
  
  inline def autocomplete(value: Boolean | `1`): this.type = set("autocomplete", value.asInstanceOf[js.Any])
  
  inline def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
  
  inline def classNames(value: ActiveSuggestion): this.type = set("classNames", value.asInstanceOf[js.Any])
  
  inline def delimiters(value: js.Array[Double]): this.type = set("delimiters", value.asInstanceOf[js.Any])
  
  inline def delimitersVarargs(value: Double*): this.type = set("delimiters", js.Array(value*))
  
  inline def handleDrag(value: (/* tag */ Id, /* currPos */ Double, /* newPos */ Double) => Callback): this.type = set("handleDrag", js.Any.fromFunction3((t0: /* tag */ Id, t1: /* currPos */ Double, t2: /* newPos */ Double) => (value(t0, t1, t2)).runNow()))
  
  inline def handleFilterSuggestions(
    value: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag]
  ): this.type = set("handleFilterSuggestions", js.Any.fromFunction2(value))
  
  inline def handleInputBlur(value: /* textInputValue */ String => Callback): this.type = set("handleInputBlur", js.Any.fromFunction1((t0: /* textInputValue */ String) => value(t0).runNow()))
  
  inline def handleInputChange(value: /* value */ String => Callback): this.type = set("handleInputChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  
  inline def handleInputFocus(value: /* value */ String => Callback): this.type = set("handleInputFocus", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  
  inline def handleTagClick(value: /* i */ Double => Callback): this.type = set("handleTagClick", js.Any.fromFunction1((t0: /* i */ Double) => value(t0).runNow()))
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
  
  inline def inputFieldPosition(value: top | bottom | `inline`): this.type = set("inputFieldPosition", value.asInstanceOf[js.Any])
  
  inline def inputProps(value: InputHTMLAttributes[HTMLInputElement]): this.type = set("inputProps", value.asInstanceOf[js.Any])
  
  inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
  
  inline def labelField(value: String): this.type = set("labelField", value.asInstanceOf[js.Any])
  
  inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  
  inline def minQueryLength(value: Double): this.type = set("minQueryLength", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  inline def removeComponent(value: Component[Any & js.Object, js.Object]): this.type = set("removeComponent", value.asInstanceOf[js.Any])
  
  inline def renderSuggestion(value: (/* tag */ Tag, /* query */ String) => ReactChild | Unit): this.type = set("renderSuggestion", js.Any.fromFunction2(value))
  
  inline def shouldRenderSuggestions(value: /* query */ String => Boolean): this.type = set("shouldRenderSuggestions", js.Any.fromFunction1(value))
  
  inline def suggestions(value: js.Array[Tag]): this.type = set("suggestions", value.asInstanceOf[js.Any])
  
  inline def suggestionsVarargs(value: Tag*): this.type = set("suggestions", js.Array(value*))
  
  inline def tags(value: js.Array[Tag]): this.type = set("tags", value.asInstanceOf[js.Any])
  
  inline def tagsVarargs(value: Tag*): this.type = set("tags", js.Array(value*))
}
