package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IApprovalAssignmentClassInfo extends StObject {
  
  var AnyAssigneeApproves: Boolean
  
  def Clone(): IApprovalAssignmentClassInfo
  
  var SignatureForApproval: ISignatureSettings
  
  var SignatureForRejection: ISignatureSettings
}
object IApprovalAssignmentClassInfo {
  
  inline def apply(
    AnyAssigneeApproves: Boolean,
    Clone: CallbackTo[IApprovalAssignmentClassInfo],
    SignatureForApproval: ISignatureSettings,
    SignatureForRejection: ISignatureSettings
  ): IApprovalAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeApproves = AnyAssigneeApproves.asInstanceOf[js.Any], Clone = Clone.toJsFn, SignatureForApproval = SignatureForApproval.asInstanceOf[js.Any], SignatureForRejection = SignatureForRejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApprovalAssignmentClassInfo]
  }
  
  extension [Self <: IApprovalAssignmentClassInfo](x: Self) {
    
    inline def setAnyAssigneeApproves(value: Boolean): Self = StObject.set(x, "AnyAssigneeApproves", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IApprovalAssignmentClassInfo]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setSignatureForApproval(value: ISignatureSettings): Self = StObject.set(x, "SignatureForApproval", value.asInstanceOf[js.Any])
    
    inline def setSignatureForRejection(value: ISignatureSettings): Self = StObject.set(x, "SignatureForRejection", value.asInstanceOf[js.Any])
  }
}
