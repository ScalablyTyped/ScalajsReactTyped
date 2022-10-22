package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackActionType
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.POP_TO_TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTargetType
  extends StObject
     with StackActionType {
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: POP_TO_TOP
}
object SourceTargetType {
  
  inline def apply(): SourceTargetType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("POP_TO_TOP")
    __obj.asInstanceOf[SourceTargetType]
  }
  
  extension [Self <: SourceTargetType](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: POP_TO_TOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
