package typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
  */
trait StatusDetailsPatch extends StObject {
  
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
    */
  var causes: js.UndefOr[Input[js.Array[Input[StatusCausePatch]]]] = js.undefined
  
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  var group: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
    */
  var retryAfterSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}
object StatusDetailsPatch {
  
  inline def apply(): StatusDetailsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetailsPatch]
  }
  
  extension [Self <: StatusDetailsPatch](x: Self) {
    
    inline def setCauses(value: Input[js.Array[Input[StatusCausePatch]]]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
    
    inline def setCausesVarargs(value: Input[StatusCausePatch]*): Self = StObject.set(x, "causes", js.Array(value*))
    
    inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRetryAfterSeconds(value: Input[Double]): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setRetryAfterSecondsUndefined: Self = StObject.set(x, "retryAfterSeconds", js.undefined)
    
    inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
