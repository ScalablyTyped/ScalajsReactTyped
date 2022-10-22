package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersDrawerRouterMod`.DrawerActionType
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`
  extends StObject
     with DrawerActionType {
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER
}
object `5` {
  
  inline def apply(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
