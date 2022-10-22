package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var name: js.UndefOr[Input[String]] = js.undefined
}
object AllowedCSIDriverPatch {
  
  inline def apply(): AllowedCSIDriverPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedCSIDriverPatch]
  }
  
  extension [Self <: AllowedCSIDriverPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
