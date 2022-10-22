package typingsJapgolly.seamless

import typingsJapgolly.seamless.Seamless.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var seamless: Static
}
object JQueryStatic {
  
  inline def apply(seamless: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(seamless = seamless.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setSeamless(value: Static): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
  }
}
