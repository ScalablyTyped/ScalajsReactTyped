package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElement[K2] extends StObject {
  
  var componentElement: org.scalajs.dom.Element
  
  var rowData: typingsJapgolly.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
}
object ComponentElement {
  
  inline def apply[K2](
    componentElement: org.scalajs.dom.Element,
    rowData: typingsJapgolly.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
  ): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
  
  extension [Self <: ComponentElement[?], K2](x: Self & ComponentElement[K2]) {
    
    inline def setComponentElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: typingsJapgolly.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
