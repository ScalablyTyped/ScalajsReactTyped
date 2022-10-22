package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.dndListTypesMod.ListOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<baseui.baseui/dnd-list/types.ListProps, 'children'> */
trait OmitListPropschildren extends StObject {
  
  var items: js.Array[Node]
  
  var onChange: js.Function1[/* a */ NewIndex, Any]
  
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  
  var removable: js.UndefOr[Boolean] = js.undefined
  
  var removableByMove: js.UndefOr[Boolean] = js.undefined
}
object OmitListPropschildren {
  
  inline def apply(items: js.Array[Node], onChange: /* a */ NewIndex => Any): OmitListPropschildren = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OmitListPropschildren]
  }
  
  extension [Self <: OmitListPropschildren](x: Self) {
    
    inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnChange(value: /* a */ NewIndex => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
    
    inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
    
    inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
  }
}
