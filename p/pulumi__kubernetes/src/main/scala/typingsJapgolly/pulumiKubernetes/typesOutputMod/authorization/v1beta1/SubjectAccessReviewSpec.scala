package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
trait SubjectAccessReviewSpec extends StObject {
  
  /**
    * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
    */
  var extra: StringDictionary[js.Array[String]]
  
  /**
    * Groups is the groups you're testing for.
    */
  var group: js.Array[String]
  
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: NonResourceAttributes
  
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: ResourceAttributes
  
  /**
    * UID information about the requesting user.
    */
  var uid: String
  
  /**
    * User is the user you're testing for. If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
    */
  var user: String
}
object SubjectAccessReviewSpec {
  
  inline def apply(
    extra: StringDictionary[js.Array[String]],
    group: js.Array[String],
    nonResourceAttributes: NonResourceAttributes,
    resourceAttributes: ResourceAttributes,
    uid: String,
    user: String
  ): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewSpec]
  }
  
  extension [Self <: SubjectAccessReviewSpec](x: Self) {
    
    inline def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setNonResourceAttributes(value: NonResourceAttributes): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributes(value: ResourceAttributes): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
