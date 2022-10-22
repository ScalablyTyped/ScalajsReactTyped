package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAutoStateTransitionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateTransition extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def Clone(): IStateTransition
  
  var Description: String
  
  var EvaluationOrderNumber: Double
  
  var FromState: Double
  
  var ID: Double
  
  var Name: String
  
  var SemanticAliases: ISemanticAliases
  
  var SignatureSettings: ISignatureSettings
  
  var ToState: Double
  
  var TriggerAllowedByVBScript: String
  
  var TriggerCriteria: ISearchConditions
  
  var TriggerInDays: Double
  
  var TriggerMode: MFAutoStateTransitionMode
}
object IStateTransition {
  
  inline def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[IStateTransition],
    Description: String,
    EvaluationOrderNumber: Double,
    FromState: Double,
    ID: Double,
    Name: String,
    SemanticAliases: ISemanticAliases,
    SignatureSettings: ISignatureSettings,
    ToState: Double,
    TriggerAllowedByVBScript: String,
    TriggerCriteria: ISearchConditions,
    TriggerInDays: Double,
    TriggerMode: MFAutoStateTransitionMode
  ): IStateTransition = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = Clone.toJsFn, Description = Description.asInstanceOf[js.Any], EvaluationOrderNumber = EvaluationOrderNumber.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], SignatureSettings = SignatureSettings.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any], TriggerAllowedByVBScript = TriggerAllowedByVBScript.asInstanceOf[js.Any], TriggerCriteria = TriggerCriteria.asInstanceOf[js.Any], TriggerInDays = TriggerInDays.asInstanceOf[js.Any], TriggerMode = TriggerMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateTransition]
  }
  
  extension [Self <: IStateTransition](x: Self) {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IStateTransition]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setEvaluationOrderNumber(value: Double): Self = StObject.set(x, "EvaluationOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setFromState(value: Double): Self = StObject.set(x, "FromState", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    inline def setSignatureSettings(value: ISignatureSettings): Self = StObject.set(x, "SignatureSettings", value.asInstanceOf[js.Any])
    
    inline def setToState(value: Double): Self = StObject.set(x, "ToState", value.asInstanceOf[js.Any])
    
    inline def setTriggerAllowedByVBScript(value: String): Self = StObject.set(x, "TriggerAllowedByVBScript", value.asInstanceOf[js.Any])
    
    inline def setTriggerCriteria(value: ISearchConditions): Self = StObject.set(x, "TriggerCriteria", value.asInstanceOf[js.Any])
    
    inline def setTriggerInDays(value: Double): Self = StObject.set(x, "TriggerInDays", value.asInstanceOf[js.Any])
    
    inline def setTriggerMode(value: MFAutoStateTransitionMode): Self = StObject.set(x, "TriggerMode", value.asInstanceOf[js.Any])
  }
}
