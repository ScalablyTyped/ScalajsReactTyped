package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
trait SelfSubjectAccessReviewSpec extends StObject {
  
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: NonResourceAttributes
  
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: ResourceAttributes
}
object SelfSubjectAccessReviewSpec {
  
  inline def apply(nonResourceAttributes: NonResourceAttributes, resourceAttributes: ResourceAttributes): SelfSubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
  
  extension [Self <: SelfSubjectAccessReviewSpec](x: Self) {
    
    inline def setNonResourceAttributes(value: NonResourceAttributes): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributes(value: ResourceAttributes): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
  }
}
