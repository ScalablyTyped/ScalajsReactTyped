package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurEventTarget extends StObject {
  
  var curEventTarget: org.scalajs.dom.EventTarget
  
  var `type`: cancel
}
object CurEventTarget {
  
  inline def apply(curEventTarget: org.scalajs.dom.EventTarget): CurEventTarget = {
    val __obj = js.Dynamic.literal(curEventTarget = curEventTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cancel")
    __obj.asInstanceOf[CurEventTarget]
  }
  
  extension [Self <: CurEventTarget](x: Self) {
    
    inline def setCurEventTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "curEventTarget", value.asInstanceOf[js.Any])
    
    inline def setType(value: cancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
