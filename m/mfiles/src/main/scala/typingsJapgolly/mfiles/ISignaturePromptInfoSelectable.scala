package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignaturePromptInfoSelectable extends StObject {
  
  def Clone(): ISignaturePromptInfoSelectable
  
  var PromptInfos: ISignaturePromptInfos
}
object ISignaturePromptInfoSelectable {
  
  inline def apply(Clone: CallbackTo[ISignaturePromptInfoSelectable], PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, PromptInfos = PromptInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
  
  extension [Self <: ISignaturePromptInfoSelectable](x: Self) {
    
    inline def setClone(value: CallbackTo[ISignaturePromptInfoSelectable]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setPromptInfos(value: ISignaturePromptInfos): Self = StObject.set(x, "PromptInfos", value.asInstanceOf[js.Any])
  }
}
