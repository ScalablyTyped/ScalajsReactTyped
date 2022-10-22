package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighligherProps extends StObject {
  
  /* Highlighter expects a string as the only child. */
  var children: Node
  
  /* Classname applied to the highlighted text. */
  var highlightClassName: js.UndefOr[String] = js.undefined
  
  /* he substring to look for. This value should correspond to the input text of the typeahead and can be obtained via the
    onInputChange prop or from the text property of props being passed down via renderMenu or renderMenuItemChildren. */
  var search: String
}
object HighligherProps {
  
  inline def apply(search: String): HighligherProps = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[HighligherProps]
  }
  
  extension [Self <: HighligherProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHighlightClassName(value: String): Self = StObject.set(x, "highlightClassName", value.asInstanceOf[js.Any])
    
    inline def setHighlightClassNameUndefined: Self = StObject.set(x, "highlightClassName", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
