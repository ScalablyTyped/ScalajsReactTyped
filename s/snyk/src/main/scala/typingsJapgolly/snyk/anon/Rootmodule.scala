package typingsJapgolly.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rootmodule extends StObject {
  
  var root_module: Resources
}
object Rootmodule {
  
  inline def apply(root_module: Resources): Rootmodule = {
    val __obj = js.Dynamic.literal(root_module = root_module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rootmodule]
  }
  
  extension [Self <: Rootmodule](x: Self) {
    
    inline def setRoot_module(value: Resources): Self = StObject.set(x, "root_module", value.asInstanceOf[js.Any])
  }
}
