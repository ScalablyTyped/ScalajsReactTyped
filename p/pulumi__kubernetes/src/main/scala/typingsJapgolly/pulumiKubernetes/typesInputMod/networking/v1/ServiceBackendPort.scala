package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceBackendPort is the service port being referenced.
  */
trait ServiceBackendPort extends StObject {
  
  /**
    * Name is the name of the port on the Service. This is a mutually exclusive setting with "Number".
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
    */
  var number: js.UndefOr[Input[Double]] = js.undefined
}
object ServiceBackendPort {
  
  inline def apply(): ServiceBackendPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceBackendPort]
  }
  
  extension [Self <: ServiceBackendPort](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Input[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
