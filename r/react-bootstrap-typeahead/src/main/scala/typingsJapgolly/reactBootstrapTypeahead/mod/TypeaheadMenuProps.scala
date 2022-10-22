package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.MenuProps */
/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick> */
trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var emptyLabel: js.UndefOr[Node] = js.undefined
  
  var id: String
  
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.undefined
  
  var inputHeight: js.UndefOr[Double] = js.undefined
  
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  
  var maxHeight: js.UndefOr[String] = js.undefined
  
  var newSelectionPrefix: js.UndefOr[Node] = js.undefined
  
  var options: js.Array[T]
  
  var paginationText: js.UndefOr[String] = js.undefined
  
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      Node
    ]
  ] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object TypeaheadMenuProps {
  
  inline def apply[T /* <: TypeaheadModel */](id: String, options: js.Array[T]): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
  
  extension [Self <: TypeaheadMenuProps[?], T /* <: TypeaheadModel */](x: Self & TypeaheadMenuProps[T]) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEmptyLabel(value: VdomNode): Self = StObject.set(x, "emptyLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEmptyLabelNull: Self = StObject.set(x, "emptyLabel", null)
    
    inline def setEmptyLabelUndefined: Self = StObject.set(x, "emptyLabel", js.undefined)
    
    inline def setEmptyLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyLabel", js.Array(value*))
    
    inline def setEmptyLabelVdomElement(value: VdomElement): Self = StObject.set(x, "emptyLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInnerRef(value: LegacyRef[HTMLUListElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: HTMLUListElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLUListElement | Null) => value(t0).runNow()))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setInputHeight(value: Double): Self = StObject.set(x, "inputHeight", value.asInstanceOf[js.Any])
    
    inline def setInputHeightUndefined: Self = StObject.set(x, "inputHeight", js.undefined)
    
    inline def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setNewSelectionPrefix(value: VdomNode): Self = StObject.set(x, "newSelectionPrefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNewSelectionPrefixNull: Self = StObject.set(x, "newSelectionPrefix", null)
    
    inline def setNewSelectionPrefixUndefined: Self = StObject.set(x, "newSelectionPrefix", js.undefined)
    
    inline def setNewSelectionPrefixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "newSelectionPrefix", js.Array(value*))
    
    inline def setNewSelectionPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "newSelectionPrefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPaginationText(value: String): Self = StObject.set(x, "paginationText", value.asInstanceOf[js.Any])
    
    inline def setPaginationTextUndefined: Self = StObject.set(x, "paginationText", js.undefined)
    
    inline def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => Node
    ): Self = StObject.set(x, "renderMenuItemChildren", js.Any.fromFunction3(value))
    
    inline def setRenderMenuItemChildrenUndefined: Self = StObject.set(x, "renderMenuItemChildren", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
