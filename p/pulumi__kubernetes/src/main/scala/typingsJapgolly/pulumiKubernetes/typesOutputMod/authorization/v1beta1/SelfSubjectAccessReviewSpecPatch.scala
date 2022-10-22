package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
trait SelfSubjectAccessReviewSpecPatch extends StObject {
  
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: NonResourceAttributesPatch
  
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: ResourceAttributesPatch
}
object SelfSubjectAccessReviewSpecPatch {
  
  inline def apply(nonResourceAttributes: NonResourceAttributesPatch, resourceAttributes: ResourceAttributesPatch): SelfSubjectAccessReviewSpecPatch = {
    val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReviewSpecPatch]
  }
  
  extension [Self <: SelfSubjectAccessReviewSpecPatch](x: Self) {
    
    inline def setNonResourceAttributes(value: NonResourceAttributesPatch): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributes(value: ResourceAttributesPatch): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
  }
}
