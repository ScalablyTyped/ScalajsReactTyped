package typingsJapgolly.oracleOraclejet.ojganttMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttRowSettableProperties
  extends StObject
     with JetSettableProperties {
  
  var label: String
  
  var labelStyle: js.Object
}
object ojGanttRowSettableProperties {
  
  inline def apply(label: String, labelStyle: js.Object): ojGanttRowSettableProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttRowSettableProperties]
  }
  
  extension [Self <: ojGanttRowSettableProperties](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
  }
}
