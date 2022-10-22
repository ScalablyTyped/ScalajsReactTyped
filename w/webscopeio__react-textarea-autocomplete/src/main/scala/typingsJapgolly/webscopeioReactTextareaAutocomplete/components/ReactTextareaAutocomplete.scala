package typingsJapgolly.webscopeioReactTextareaAutocomplete.components

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.TextareaProps
import typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.TextareaProps[TItem, CustomTextAreaProps] because: IArray(Could't extract props from CustomTextAreaProps because couldn't resolve ClassTree.) */
object ReactTextareaAutocomplete {
  
  def apply[TItem /* <: String | js.Object */, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */](p: TextareaProps[TItem, CustomTextAreaProps]): Builder[TItem, CustomTextAreaProps] = new Builder[TItem, CustomTextAreaProps](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@webscopeio/react-textarea-autocomplete", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TItem /* <: String | js.Object */, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[TItem, CustomTextAreaProps]]
  
  implicit def make[TItem /* <: String | js.Object */, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */](companion: ReactTextareaAutocomplete.type): Builder[TItem, CustomTextAreaProps] = new Builder[TItem, CustomTextAreaProps](js.Array(this.component, js.Dictionary.empty))()
}
