package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libTableHooksUseSelectionMod.INTERNAL_SELECTION_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionItem
  extends StObject
     with INTERNAL_SELECTION_ITEM {
  
  var key: String
  
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
  
  var text: Node
}
object SelectionItem {
  
  inline def apply(key: String): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = null)
    __obj.asInstanceOf[SelectionItem]
  }
  
  extension [Self <: SelectionItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: /* currentRowKeys */ js.Array[Key] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* currentRowKeys */ js.Array[Key]) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
  }
}
