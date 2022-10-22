package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackActionType
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.PUSH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTarget
  extends StObject
     with StackActionType {
  
  var payload: Params
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: PUSH
}
object SourceTarget {
  
  inline def apply(payload: Params): SourceTarget = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PUSH")
    __obj.asInstanceOf[SourceTarget]
  }
  
  extension [Self <: SourceTarget](x: Self) {
    
    inline def setPayload(value: Params): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: PUSH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
