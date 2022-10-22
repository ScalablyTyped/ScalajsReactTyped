package typingsJapgolly.extjs.Ext.util

import typingsJapgolly.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent
  extends StObject
     with IBase {
  
  /** [Property] (Boolean) */
  var isEvent: js.UndefOr[Boolean] = js.undefined
}
object IEvent {
  
  inline def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  
  extension [Self <: IEvent](x: Self) {
    
    inline def setIsEvent(value: Boolean): Self = StObject.set(x, "isEvent", value.asInstanceOf[js.Any])
    
    inline def setIsEventUndefined: Self = StObject.set(x, "isEvent", js.undefined)
  }
}
