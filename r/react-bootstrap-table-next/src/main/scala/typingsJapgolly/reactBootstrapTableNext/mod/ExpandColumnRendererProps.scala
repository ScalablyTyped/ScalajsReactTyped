package typingsJapgolly.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandColumnRendererProps extends StObject {
  
  var expandable: Boolean
  
  var expanded: Boolean
  
  var rowKey: String
}
object ExpandColumnRendererProps {
  
  inline def apply(expandable: Boolean, expanded: Boolean, rowKey: String): ExpandColumnRendererProps = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandColumnRendererProps]
  }
  
  extension [Self <: ExpandColumnRendererProps](x: Self) {
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
  }
}
