package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEventInit
  extends StObject
     with UIEventInit {
  
  /* standard dom */
  var relatedTarget: js.UndefOr[org.scalajs.dom.EventTarget | Null] = js.undefined
}
object FocusEventInit {
  
  inline def apply(): FocusEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusEventInit]
  }
  
  extension [Self <: FocusEventInit](x: Self) {
    
    inline def setRelatedTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
  }
}
