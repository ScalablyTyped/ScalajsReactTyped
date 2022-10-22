package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sysctl defines a kernel parameter to be set
  */
trait SysctlPatch extends StObject {
  
  /**
    * Name of a property to set
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Value of a property to set
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object SysctlPatch {
  
  inline def apply(): SysctlPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SysctlPatch]
  }
  
  extension [Self <: SysctlPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
