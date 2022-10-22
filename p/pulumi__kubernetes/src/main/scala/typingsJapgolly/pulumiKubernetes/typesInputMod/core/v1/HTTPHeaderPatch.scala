package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
trait HTTPHeaderPatch extends StObject {
  
  /**
    * The header field name
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The header field value
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object HTTPHeaderPatch {
  
  inline def apply(): HTTPHeaderPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPHeaderPatch]
  }
  
  extension [Self <: HTTPHeaderPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
