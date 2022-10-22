package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignaturePromptInfo extends StObject {
  
  def Clone(): ISignaturePromptInfo
  
  var Meaning: String
  
  var Reason: String
}
object ISignaturePromptInfo {
  
  inline def apply(Clone: CallbackTo[ISignaturePromptInfo], Meaning: String, Reason: String): ISignaturePromptInfo = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Meaning = Meaning.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfo]
  }
  
  extension [Self <: ISignaturePromptInfo](x: Self) {
    
    inline def setClone(value: CallbackTo[ISignaturePromptInfo]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setMeaning(value: String): Self = StObject.set(x, "Meaning", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
