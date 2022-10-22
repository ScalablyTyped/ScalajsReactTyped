package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardUserSettings extends StObject {
  
  var autoRefreshState: Boolean
}
object BoardUserSettings {
  
  inline def apply(autoRefreshState: Boolean): BoardUserSettings = {
    val __obj = js.Dynamic.literal(autoRefreshState = autoRefreshState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardUserSettings]
  }
  
  extension [Self <: BoardUserSettings](x: Self) {
    
    inline def setAutoRefreshState(value: Boolean): Self = StObject.set(x, "autoRefreshState", value.asInstanceOf[js.Any])
  }
}
