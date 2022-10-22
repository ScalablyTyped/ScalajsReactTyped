package typingsJapgolly.antd.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemUnit extends StObject {
  
  var itemUnit: String
  
  var itemsUnit: String
  
  var notFoundContent: Node
  
  var remove: js.UndefOr[String] = js.undefined
  
  var removeAll: js.UndefOr[String] = js.undefined
  
  var removeCurrent: js.UndefOr[String] = js.undefined
  
  var searchPlaceholder: String
  
  var selectAll: js.UndefOr[String] = js.undefined
  
  var selectCurrent: js.UndefOr[String] = js.undefined
  
  var selectInvert: js.UndefOr[String] = js.undefined
  
  var titles: js.UndefOr[js.Array[Node]] = js.undefined
}
object ItemUnit {
  
  inline def apply(itemUnit: String, itemsUnit: String, searchPlaceholder: String): ItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], notFoundContent = null)
    __obj.asInstanceOf[ItemUnit]
  }
  
  extension [Self <: ItemUnit](x: Self) {
    
    inline def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
    
    inline def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
    
    inline def setNotFoundContent(value: VdomNode): Self = StObject.set(x, "notFoundContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNotFoundContentNull: Self = StObject.set(x, "notFoundContent", null)
    
    inline def setNotFoundContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "notFoundContent", js.Array(value*))
    
    inline def setNotFoundContentVdomElement(value: VdomElement): Self = StObject.set(x, "notFoundContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
    
    inline def setRemoveCurrentUndefined: Self = StObject.set(x, "removeCurrent", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
    
    inline def setSelectCurrentUndefined: Self = StObject.set(x, "selectCurrent", js.undefined)
    
    inline def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
    
    inline def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
    
    inline def setTitles(value: js.Array[Node]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    
    inline def setTitlesVarargs(value: Node*): Self = StObject.set(x, "titles", js.Array(value*))
  }
}
