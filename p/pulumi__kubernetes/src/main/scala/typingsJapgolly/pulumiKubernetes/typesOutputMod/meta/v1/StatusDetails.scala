package typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
  */
trait StatusDetails extends StObject {
  
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
    */
  var causes: js.Array[StatusCause]
  
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  var group: String
  
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: String
  
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
    */
  var name: String
  
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
    */
  var retryAfterSeconds: Double
  
  /**
    * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: String
}
object StatusDetails {
  
  inline def apply(
    causes: js.Array[StatusCause],
    group: String,
    kind: String,
    name: String,
    retryAfterSeconds: Double,
    uid: String
  ): StatusDetails = {
    val __obj = js.Dynamic.literal(causes = causes.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retryAfterSeconds = retryAfterSeconds.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusDetails]
  }
  
  extension [Self <: StatusDetails](x: Self) {
    
    inline def setCauses(value: js.Array[StatusCause]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesVarargs(value: StatusCause*): Self = StObject.set(x, "causes", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRetryAfterSeconds(value: Double): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
