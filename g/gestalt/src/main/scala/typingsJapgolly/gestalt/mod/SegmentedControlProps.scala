package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.gestalt.anon.ActiveIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentedControlProps extends StObject {
  
  var items: js.Array[Node]
  
  def onChange(args: ActiveIndex): Unit
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var selectedItemIndex: Double
}
object SegmentedControlProps {
  
  inline def apply(items: js.Array[Node], onChange: ActiveIndex => Callback, selectedItemIndex: Double): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ActiveIndex) => onChange(t0).runNow()), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
  
  extension [Self <: SegmentedControlProps](x: Self) {
    
    inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnChange(value: ActiveIndex => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ActiveIndex) => value(t0).runNow()))
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
  }
}
