package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignaturePromptInfoMetadataBased extends StObject {
  
  def Clone(): ISignaturePromptInfoMetadataBased
  
  var IsReferencedBySignatureObject: Boolean
  
  var MeaningPropertyID: Double
  
  var PromptInfoLookupPropertyID: Double
  
  var ReasonPropertyID: Double
}
object ISignaturePromptInfoMetadataBased {
  
  inline def apply(
    Clone: CallbackTo[ISignaturePromptInfoMetadataBased],
    IsReferencedBySignatureObject: Boolean,
    MeaningPropertyID: Double,
    PromptInfoLookupPropertyID: Double,
    ReasonPropertyID: Double
  ): ISignaturePromptInfoMetadataBased = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, IsReferencedBySignatureObject = IsReferencedBySignatureObject.asInstanceOf[js.Any], MeaningPropertyID = MeaningPropertyID.asInstanceOf[js.Any], PromptInfoLookupPropertyID = PromptInfoLookupPropertyID.asInstanceOf[js.Any], ReasonPropertyID = ReasonPropertyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoMetadataBased]
  }
  
  extension [Self <: ISignaturePromptInfoMetadataBased](x: Self) {
    
    inline def setClone(value: CallbackTo[ISignaturePromptInfoMetadataBased]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setIsReferencedBySignatureObject(value: Boolean): Self = StObject.set(x, "IsReferencedBySignatureObject", value.asInstanceOf[js.Any])
    
    inline def setMeaningPropertyID(value: Double): Self = StObject.set(x, "MeaningPropertyID", value.asInstanceOf[js.Any])
    
    inline def setPromptInfoLookupPropertyID(value: Double): Self = StObject.set(x, "PromptInfoLookupPropertyID", value.asInstanceOf[js.Any])
    
    inline def setReasonPropertyID(value: Double): Self = StObject.set(x, "ReasonPropertyID", value.asInstanceOf[js.Any])
  }
}
