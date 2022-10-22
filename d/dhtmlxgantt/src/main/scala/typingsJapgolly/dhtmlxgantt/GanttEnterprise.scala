package typingsJapgolly.dhtmlxgantt

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttEnterprise extends StObject {
  
  def getGanttInstance(): GanttStatic
}
object GanttEnterprise {
  
  inline def apply(getGanttInstance: CallbackTo[GanttStatic]): GanttEnterprise = {
    val __obj = js.Dynamic.literal(getGanttInstance = getGanttInstance.toJsFn)
    __obj.asInstanceOf[GanttEnterprise]
  }
  
  extension [Self <: GanttEnterprise](x: Self) {
    
    inline def setGetGanttInstance(value: CallbackTo[GanttStatic]): Self = StObject.set(x, "getGanttInstance", value.toJsFn)
  }
}
