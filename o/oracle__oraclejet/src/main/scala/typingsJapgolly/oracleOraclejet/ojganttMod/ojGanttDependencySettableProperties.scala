package typingsJapgolly.oracleOraclejet.ojganttMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.finishStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startFinish
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttDependencySettableProperties
  extends StObject
     with JetSettableProperties {
  
  var predecessorTaskId: Any
  
  var shortDesc: String | Null
  
  var successorTaskId: Any
  
  var svgClassName: String
  
  var svgStyle: js.Object
  
  var `type`: finishStart | finishFinish | startStart | startFinish
}
object ojGanttDependencySettableProperties {
  
  inline def apply(
    predecessorTaskId: Any,
    successorTaskId: Any,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: finishStart | finishFinish | startStart | startFinish
  ): ojGanttDependencySettableProperties = {
    val __obj = js.Dynamic.literal(predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], shortDesc = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttDependencySettableProperties]
  }
  
  extension [Self <: ojGanttDependencySettableProperties](x: Self) {
    
    inline def setPredecessorTaskId(value: Any): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    inline def setSuccessorTaskId(value: Any): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setType(value: finishStart | finishFinish | startStart | startFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
