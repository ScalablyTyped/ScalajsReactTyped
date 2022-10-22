package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITaskAssignmentClassInfo extends StObject {
  
  var AnyAssigneeCompletes: Boolean
  
  def Clone(): ITaskAssignmentClassInfo
  
  var SignatureForCompletion: ISignatureSettings
}
object ITaskAssignmentClassInfo {
  
  inline def apply(
    AnyAssigneeCompletes: Boolean,
    Clone: CallbackTo[ITaskAssignmentClassInfo],
    SignatureForCompletion: ISignatureSettings
  ): ITaskAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeCompletes = AnyAssigneeCompletes.asInstanceOf[js.Any], Clone = Clone.toJsFn, SignatureForCompletion = SignatureForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskAssignmentClassInfo]
  }
  
  extension [Self <: ITaskAssignmentClassInfo](x: Self) {
    
    inline def setAnyAssigneeCompletes(value: Boolean): Self = StObject.set(x, "AnyAssigneeCompletes", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[ITaskAssignmentClassInfo]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setSignatureForCompletion(value: ISignatureSettings): Self = StObject.set(x, "SignatureForCompletion", value.asInstanceOf[js.Any])
  }
}
