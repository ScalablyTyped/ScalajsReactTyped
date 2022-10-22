package typingsJapgolly.jqueryFinger

import typingsJapgolly.jqueryFinger.JQueryFinger.JQueryFingerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var Finger: JQueryFingerOptions
}
object JQueryStatic {
  
  inline def apply(Finger: JQueryFingerOptions): JQueryStatic = {
    val __obj = js.Dynamic.literal(Finger = Finger.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setFinger(value: JQueryFingerOptions): Self = StObject.set(x, "Finger", value.asInstanceOf[js.Any])
  }
}
