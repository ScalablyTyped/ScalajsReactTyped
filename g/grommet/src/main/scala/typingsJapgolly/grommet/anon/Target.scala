package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var target: Files
}
object Target {
  
  inline def apply(target: Files): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setTarget(value: Files): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
