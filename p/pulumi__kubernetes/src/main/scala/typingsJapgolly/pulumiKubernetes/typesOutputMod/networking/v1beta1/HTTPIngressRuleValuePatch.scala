package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
  */
trait HTTPIngressRuleValuePatch extends StObject {
  
  /**
    * A collection of paths that map requests to backends.
    */
  var paths: js.Array[HTTPIngressPathPatch]
}
object HTTPIngressRuleValuePatch {
  
  inline def apply(paths: js.Array[HTTPIngressPathPatch]): HTTPIngressRuleValuePatch = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPIngressRuleValuePatch]
  }
  
  extension [Self <: HTTPIngressRuleValuePatch](x: Self) {
    
    inline def setPaths(value: js.Array[HTTPIngressPathPatch]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: HTTPIngressPathPatch*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
