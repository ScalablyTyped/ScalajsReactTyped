package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadLabelKey
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeaheadMenu {
  
  inline def apply[T /* <: TypeaheadModel */](id: String, options: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TypeaheadMenuProps[T]]))
  }
  
  @JSImport("react-bootstrap-typeahead", "TypeaheadMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: TypeaheadModel */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenu[T]] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def emptyLabel(value: VdomNode): this.type = set("emptyLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def emptyLabelNull: this.type = set("emptyLabel", null)
    
    inline def emptyLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyLabel", js.Array(value*))
    
    inline def emptyLabelVdomElement(value: VdomElement): this.type = set("emptyLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def innerRef(value: LegacyRef[HTMLUListElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: HTMLUListElement | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: HTMLUListElement | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def inputHeight(value: Double): this.type = set("inputHeight", value.asInstanceOf[js.Any])
    
    inline def labelKey(value: TypeaheadLabelKey[T]): this.type = set("labelKey", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def newSelectionPrefix(value: VdomNode): this.type = set("newSelectionPrefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def newSelectionPrefixNull: this.type = set("newSelectionPrefix", null)
    
    inline def newSelectionPrefixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("newSelectionPrefix", js.Array(value*))
    
    inline def newSelectionPrefixVdomElement(value: VdomElement): this.type = set("newSelectionPrefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def paginationText(value: String): this.type = set("paginationText", value.asInstanceOf[js.Any])
    
    inline def renderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => Node
    ): this.type = set("renderMenuItemChildren", js.Any.fromFunction3(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: TypeaheadModel */](p: TypeaheadMenuProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
