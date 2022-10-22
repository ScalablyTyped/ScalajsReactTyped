package typingsJapgolly.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefObject extends StObject {
  
  var current: Any
}
object RefObject {
  
  inline def apply(current: Any): RefObject = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefObject]
  }
  
  extension [Self <: RefObject](x: Self) {
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
