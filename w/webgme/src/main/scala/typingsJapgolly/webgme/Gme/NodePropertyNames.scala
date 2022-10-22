package typingsJapgolly.webgme.Gme

import typingsJapgolly.webgme.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePropertyNames extends StObject {
  
  var Attributes: Name
}
object NodePropertyNames {
  
  inline def apply(Attributes: Name): NodePropertyNames = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyNames]
  }
  
  extension [Self <: NodePropertyNames](x: Self) {
    
    inline def setAttributes(value: Name): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
  }
}
