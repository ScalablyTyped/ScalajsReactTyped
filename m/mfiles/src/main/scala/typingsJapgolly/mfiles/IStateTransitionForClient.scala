package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateTransitionForClient extends StObject {
  
  def Clone(): IStateTransitionForClient
  
  var FromState: Double
  
  def GetAsLookup(): ILookup
  
  def GetAsTypedValue(): ITypedValue
  
  val ID: Double
  
  var Name: String
  
  var Selectable: Boolean
  
  var SelectableFlagAffectedByPseudoUsers: Boolean
  
  var ToState: Double
}
object IStateTransitionForClient {
  
  inline def apply(
    Clone: CallbackTo[IStateTransitionForClient],
    FromState: Double,
    GetAsLookup: CallbackTo[ILookup],
    GetAsTypedValue: CallbackTo[ITypedValue],
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean,
    ToState: Double
  ): IStateTransitionForClient = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, FromState = FromState.asInstanceOf[js.Any], GetAsLookup = GetAsLookup.toJsFn, GetAsTypedValue = GetAsTypedValue.toJsFn, ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateTransitionForClient]
  }
  
  extension [Self <: IStateTransitionForClient](x: Self) {
    
    inline def setClone(value: CallbackTo[IStateTransitionForClient]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFromState(value: Double): Self = StObject.set(x, "FromState", value.asInstanceOf[js.Any])
    
    inline def setGetAsLookup(value: CallbackTo[ILookup]): Self = StObject.set(x, "GetAsLookup", value.toJsFn)
    
    inline def setGetAsTypedValue(value: CallbackTo[ITypedValue]): Self = StObject.set(x, "GetAsTypedValue", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "Selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFlagAffectedByPseudoUsers(value: Boolean): Self = StObject.set(x, "SelectableFlagAffectedByPseudoUsers", value.asInstanceOf[js.Any])
    
    inline def setToState(value: Double): Self = StObject.set(x, "ToState", value.asInstanceOf[js.Any])
  }
}
