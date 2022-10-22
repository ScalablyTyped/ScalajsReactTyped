package typingsJapgolly.firebaseAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  var reason: js.Error
}
object Reason {
  
  inline def apply(reason: js.Error): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setReason(value: js.Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
