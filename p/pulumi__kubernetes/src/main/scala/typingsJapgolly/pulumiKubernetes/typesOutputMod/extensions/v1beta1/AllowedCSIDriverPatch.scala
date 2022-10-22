package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
  */
trait AllowedCSIDriverPatch extends StObject {
  
  /**
    * Name is the registered name of the CSI driver
    */
  var name: String
}
object AllowedCSIDriverPatch {
  
  inline def apply(name: String): AllowedCSIDriverPatch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedCSIDriverPatch]
  }
  
  extension [Self <: AllowedCSIDriverPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
