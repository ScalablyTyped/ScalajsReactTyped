package typingsJapgolly.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtensionRequest extends StObject {
  
  /**
    * The name of the extension.
    */
  var Name: ExtensionName
  
  /**
    * The namespace (qualifier) of the extension.
    */
  var Namespace: ExtensionNamespace
}
object GetExtensionRequest {
  
  inline def apply(Name: ExtensionName, Namespace: ExtensionNamespace): GetExtensionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtensionRequest]
  }
  
  extension [Self <: GetExtensionRequest](x: Self) {
    
    inline def setName(value: ExtensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: ExtensionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
