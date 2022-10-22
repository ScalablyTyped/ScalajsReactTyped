package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
  */
trait ServiceAccountTokenProjectionPatch extends StObject {
  
  /**
    * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
    */
  var audience: String
  
  /**
    * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
    */
  var expirationSeconds: Double
  
  /**
    * path is the path relative to the mount point of the file to project the token into.
    */
  var path: String
}
object ServiceAccountTokenProjectionPatch {
  
  inline def apply(audience: String, expirationSeconds: Double, path: String): ServiceAccountTokenProjectionPatch = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountTokenProjectionPatch]
  }
  
  extension [Self <: ServiceAccountTokenProjectionPatch](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
