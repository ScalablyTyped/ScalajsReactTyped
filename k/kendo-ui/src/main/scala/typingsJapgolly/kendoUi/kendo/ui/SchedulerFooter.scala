package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerFooter extends StObject {
  
  var command: js.UndefOr[String | Boolean] = js.undefined
}
object SchedulerFooter {
  
  inline def apply(): SchedulerFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerFooter]
  }
  
  extension [Self <: SchedulerFooter](x: Self) {
    
    inline def setCommand(value: String | Boolean): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
  }
}
