package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPanelProps extends StObject {
  
  /**
    * Default clear search field button component.
    */
  var clearBtn: Element
  
  /**
    * A callback to trigger the clear search field event.
    */
  def clearBtnClick(): Unit
  
  /**
    * The default search text.
    */
  var defaultValue: String
  
  /**
    * The placeholder text for the search field.
    */
  var placeholder: String
  
  /**
    * A callback to trigger a search, takes the search text as an input.
    */
  def search(searchText: String): Unit
  
  /**
    * Default search field component.
    */
  var searchField: Element
}
object SearchPanelProps {
  
  inline def apply(
    clearBtn: VdomElement,
    clearBtnClick: Callback,
    defaultValue: String,
    placeholder: String,
    search: String => Callback,
    searchField: VdomElement
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(clearBtn = clearBtn.rawElement.asInstanceOf[js.Any], clearBtnClick = clearBtnClick.toJsFn, defaultValue = defaultValue.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = js.Any.fromFunction1((t0: String) => search(t0).runNow()), searchField = searchField.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPanelProps]
  }
  
  extension [Self <: SearchPanelProps](x: Self) {
    
    inline def setClearBtn(value: VdomElement): Self = StObject.set(x, "clearBtn", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClearBtnClick(value: Callback): Self = StObject.set(x, "clearBtnClick", value.toJsFn)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String => Callback): Self = StObject.set(x, "search", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSearchField(value: VdomElement): Self = StObject.set(x, "searchField", value.rawElement.asInstanceOf[js.Any])
  }
}
