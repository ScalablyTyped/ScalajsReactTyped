package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.wixStyleReact.distTypesSelectorListContentMod.SelectorListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderList extends StObject {
  
  def renderList(): Node
  
  def renderToggleAllCheckbox(): Node
  
  var selectedItems: js.Array[SelectorListItem]
}
object RenderList {
  
  inline def apply(
    renderList: CallbackTo[Node],
    renderToggleAllCheckbox: CallbackTo[Node],
    selectedItems: js.Array[SelectorListItem]
  ): RenderList = {
    val __obj = js.Dynamic.literal(renderList = renderList.toJsFn, renderToggleAllCheckbox = renderToggleAllCheckbox.toJsFn, selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderList]
  }
  
  extension [Self <: RenderList](x: Self) {
    
    inline def setRenderList(value: CallbackTo[Node]): Self = StObject.set(x, "renderList", value.toJsFn)
    
    inline def setRenderToggleAllCheckbox(value: CallbackTo[Node]): Self = StObject.set(x, "renderToggleAllCheckbox", value.toJsFn)
    
    inline def setSelectedItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
