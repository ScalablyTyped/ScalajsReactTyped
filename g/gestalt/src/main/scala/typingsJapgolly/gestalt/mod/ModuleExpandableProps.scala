package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleExpandableProps extends StObject {
  
  var accessibilityCollapseLabel: String
  
  var accessibilityExpandLabel: String
  
  var expandedIndex: js.UndefOr[Double | Null] = js.undefined
  
  var id: String
  
  var items: js.Array[typingsJapgolly.gestalt.anon.Badge]
  
  var onExpandedChange: js.UndefOr[js.Function1[/* expandedIndex */ Double | Null, Unit]] = js.undefined
}
object ModuleExpandableProps {
  
  inline def apply(
    accessibilityCollapseLabel: String,
    accessibilityExpandLabel: String,
    id: String,
    items: js.Array[typingsJapgolly.gestalt.anon.Badge]
  ): ModuleExpandableProps = {
    val __obj = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExpandableProps]
  }
  
  extension [Self <: ModuleExpandableProps](x: Self) {
    
    inline def setAccessibilityCollapseLabel(value: String): Self = StObject.set(x, "accessibilityCollapseLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandLabel(value: String): Self = StObject.set(x, "accessibilityExpandLabel", value.asInstanceOf[js.Any])
    
    inline def setExpandedIndex(value: Double): Self = StObject.set(x, "expandedIndex", value.asInstanceOf[js.Any])
    
    inline def setExpandedIndexNull: Self = StObject.set(x, "expandedIndex", null)
    
    inline def setExpandedIndexUndefined: Self = StObject.set(x, "expandedIndex", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[typingsJapgolly.gestalt.anon.Badge]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: typingsJapgolly.gestalt.anon.Badge*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnExpandedChange(value: /* expandedIndex */ Double | Null => Callback): Self = StObject.set(x, "onExpandedChange", js.Any.fromFunction1((t0: /* expandedIndex */ Double | Null) => value(t0).runNow()))
    
    inline def setOnExpandedChangeUndefined: Self = StObject.set(x, "onExpandedChange", js.undefined)
  }
}
