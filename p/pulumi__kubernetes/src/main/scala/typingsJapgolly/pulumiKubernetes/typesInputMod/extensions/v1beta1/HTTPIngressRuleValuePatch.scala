package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var paths: js.UndefOr[Input[js.Array[Input[HTTPIngressPathPatch]]]] = js.undefined
}
object HTTPIngressRuleValuePatch {
  
  inline def apply(): HTTPIngressRuleValuePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPIngressRuleValuePatch]
  }
  
  extension [Self <: HTTPIngressRuleValuePatch](x: Self) {
    
    inline def setPaths(value: Input[js.Array[Input[HTTPIngressPathPatch]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: Input[HTTPIngressPathPatch]*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
