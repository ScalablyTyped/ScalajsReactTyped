package typingsJapgolly.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: Boolean
}
object Full {
  
  inline def apply(full: Boolean): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  extension [Self <: Full](x: Self) {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
  }
}
