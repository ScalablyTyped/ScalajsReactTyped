package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
trait ServiceReferencePatch extends StObject {
  
  /**
    * name is the name of the service. Required
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * namespace is the namespace of the service. Required
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * path is an optional URL path at which the webhook will be contacted.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
}
object ServiceReferencePatch {
  
  inline def apply(): ServiceReferencePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceReferencePatch]
  }
  
  extension [Self <: ServiceReferencePatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
