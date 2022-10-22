package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTypeahead.mod.AllTypeaheadOwnAndInjectedProps
import typingsJapgolly.reactBootstrapTypeahead.mod.InputContainerPropsSingle
import typingsJapgolly.reactBootstrapTypeahead.mod.InputProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TokenProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadAlign
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadBsSizes
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadLabelKey
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadResult
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typeahead {
  
  inline def apply[T /* <: TypeaheadModel */](options: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TypeaheadProps[T]]))
  }
  
  @JSImport("react-bootstrap-typeahead", "Typeahead")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: TypeaheadModel */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTypeahead.mod.Typeahead[T]] {
    
    inline def align(value: TypeaheadAlign): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def allowNew(
      value: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): this.type = set("allowNew", value.asInstanceOf[js.Any])
    
    inline def allowNewFunction2(value: (/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): this.type = set("allowNew", js.Any.fromFunction2(value))
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* props */ Any, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ Any => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearButton(value: Boolean): this.type = set("clearButton", value.asInstanceOf[js.Any])
    
    inline def defaultInputValue(value: String): this.type = set("defaultInputValue", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def defaultSelected(value: js.Array[T]): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedVarargs(value: T*): this.type = set("defaultSelected", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    inline def emptyLabel(value: VdomNode): this.type = set("emptyLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def emptyLabelNull: this.type = set("emptyLabel", null)
    
    inline def emptyLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyLabel", js.Array(value*))
    
    inline def emptyLabelVdomElement(value: VdomElement): this.type = set("emptyLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterBy(
      value: js.Array[String] | (js.Function2[T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    inline def filterByFunction2(value: (T, /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): this.type = set("filterBy", js.Any.fromFunction2(value))
    
    inline def filterByVarargs(value: String*): this.type = set("filterBy", js.Array(value*))
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def highlightOnlyResult(value: Boolean): this.type = set("highlightOnlyResult", value.asInstanceOf[js.Any])
    
    inline def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def ignoreDiacritics(value: Boolean): this.type = set("ignoreDiacritics", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: InputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def isInvalid(value: Boolean): this.type = set("isInvalid", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def isValid(value: Boolean): this.type = set("isValid", value.asInstanceOf[js.Any])
    
    inline def labelKey(value: TypeaheadLabelKey[T]): this.type = set("labelKey", value.asInstanceOf[js.Any])
    
    inline def maxResults(value: Double): this.type = set("maxResults", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def newSelectionPrefix(value: typingsJapgolly.react.mod.global.JSX.Element | String): this.type = set("newSelectionPrefix", value.asInstanceOf[js.Any])
    
    inline def newSelectionPrefixVdomElement(value: VdomElement): this.type = set("newSelectionPrefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ Event => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onChange(value: /* selected */ js.Array[T] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* selected */ js.Array[T]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ Event => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onInputChange(value: (/* input */ String, /* e */ Event) => Callback): this.type = set("onInputChange", js.Any.fromFunction2((t0: /* input */ String, t1: /* e */ Event) => (value(t0, t1)).runNow()))
    
    inline def onKeyDown(value: /* e */ Event => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onMenuToggle(value: /* show */ Boolean => Callback): this.type = set("onMenuToggle", js.Any.fromFunction1((t0: /* show */ Boolean) => value(t0).runNow()))
    
    inline def onPaginate(value: (/* e */ Event, /* numResults */ Double) => Callback): this.type = set("onPaginate", js.Any.fromFunction2((t0: /* e */ Event, t1: /* numResults */ Double) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def paginate(value: Boolean): this.type = set("paginate", value.asInstanceOf[js.Any])
    
    inline def paginationText(value: String): this.type = set("paginationText", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def positionFixed(value: Boolean): this.type = set("positionFixed", value.asInstanceOf[js.Any])
    
    inline def renderInput(value: (/* inputProps */ InputContainerPropsSingle[T], /* state */ TypeaheadState[T]) => Node): this.type = set("renderInput", js.Any.fromFunction2(value))
    
    inline def renderMenu(
      value: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ TypeaheadMenuProps[T], /* state */ TypeaheadState[T]) => Node
    ): this.type = set("renderMenu", js.Any.fromFunction3(value))
    
    inline def renderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => Node
    ): this.type = set("renderMenuItemChildren", js.Any.fromFunction3(value))
    
    inline def renderToken(value: (T, /* props */ TokenProps, /* index */ Double) => Node): this.type = set("renderToken", js.Any.fromFunction3(value))
    
    inline def selectHintOnEnter(value: Boolean): this.type = set("selectHintOnEnter", value.asInstanceOf[js.Any])
    
    inline def selected(value: js.Array[T]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedVarargs(value: T*): this.type = set("selected", js.Array(value*))
    
    inline def size(value: TypeaheadBsSizes): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: TypeaheadModel */](p: TypeaheadProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
