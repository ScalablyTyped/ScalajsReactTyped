package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.GO_BACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source
  extends StObject
     with typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersCommonActionsMod`.Action {
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: GO_BACK
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("GO_BACK")
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: GO_BACK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
