package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
  */
trait NonResourceAttributes extends StObject {
  
  /**
    * Path is the URL path of the request
    */
  var path: String
  
  /**
    * Verb is the standard HTTP verb
    */
  var verb: String
}
object NonResourceAttributes {
  
  inline def apply(path: String, verb: String): NonResourceAttributes = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourceAttributes]
  }
  
  extension [Self <: NonResourceAttributes](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
