package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedGenericResource
  extends StObject
     with GenericResource {
  
  var Kind: js.UndefOr[String] = js.undefined
  
  var Value: js.UndefOr[String] = js.undefined
}
object NamedGenericResource {
  
  inline def apply(): NamedGenericResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedGenericResource]
  }
  
  extension [Self <: NamedGenericResource](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "Kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "Kind", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
