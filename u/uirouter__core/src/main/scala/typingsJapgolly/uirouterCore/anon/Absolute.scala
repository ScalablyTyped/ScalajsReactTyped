package typingsJapgolly.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  var absolute: Boolean
}
object Absolute {
  
  inline def apply(absolute: Boolean): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  
  extension [Self <: Absolute](x: Self) {
    
    inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
  }
}
