package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.
  */
trait HTTPIngressPathPatch extends StObject {
  
  /**
    * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
    */
  var backend: js.UndefOr[Input[IngressBackendPatch]] = js.undefined
  
  /**
    * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
    *   done on a path element by element basis. A path element refers is the
    *   list of labels in the path split by the '/' separator. A request is a
    *   match for path p if every p is an element-wise prefix of p of the
    *   request path. Note that if the last element of the path is a substring
    *   of the last element in request path, it is not a match (e.g. /foo/bar
    *   matches /foo/bar/baz, but does not match /foo/barbaz).
    * * ImplementationSpecific: Interpretation of the Path matching is up to
    *   the IngressClass. Implementations can treat this as a separate PathType
    *   or treat it identically to Prefix or Exact path types.
    * Implementations are required to support all path types. Defaults to ImplementationSpecific.
    */
  var pathType: js.UndefOr[Input[String]] = js.undefined
}
object HTTPIngressPathPatch {
  
  inline def apply(): HTTPIngressPathPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPIngressPathPatch]
  }
  
  extension [Self <: HTTPIngressPathPatch](x: Self) {
    
    inline def setBackend(value: Input[IngressBackendPatch]): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathType(value: Input[String]): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
    
    inline def setPathTypeUndefined: Self = StObject.set(x, "pathType", js.undefined)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
