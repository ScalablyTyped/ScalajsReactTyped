package typingsJapgolly.jqueryAlertable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var alertable: Alertable
}
object JQueryStatic {
  
  inline def apply(alertable: Alertable): JQueryStatic = {
    val __obj = js.Dynamic.literal(alertable = alertable.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setAlertable(value: Alertable): Self = StObject.set(x, "alertable", value.asInstanceOf[js.Any])
  }
}
