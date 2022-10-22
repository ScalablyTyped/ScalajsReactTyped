package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
  */
trait NonResourceAttributesPatch extends StObject {
  
  /**
    * Path is the URL path of the request
    */
  var path: String
  
  /**
    * Verb is the standard HTTP verb
    */
  var verb: String
}
object NonResourceAttributesPatch {
  
  inline def apply(path: String, verb: String): NonResourceAttributesPatch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourceAttributesPatch]
  }
  
  extension [Self <: NonResourceAttributesPatch](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
