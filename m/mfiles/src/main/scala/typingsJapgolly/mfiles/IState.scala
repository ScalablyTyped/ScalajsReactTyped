package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IState extends StObject {
  
  def GetAsLookup(): ILookup
  
  def GetAsTypedValue(): ITypedValue
  
  val ID: Double
  
  var Name: String
  
  var Selectable: Boolean
  
  var SelectableFlagAffectedByPseudoUsers: Boolean
}
object IState {
  
  inline def apply(
    GetAsLookup: CallbackTo[ILookup],
    GetAsTypedValue: CallbackTo[ITypedValue],
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean
  ): IState = {
    val __obj = js.Dynamic.literal(GetAsLookup = GetAsLookup.toJsFn, GetAsTypedValue = GetAsTypedValue.toJsFn, ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
  
  extension [Self <: IState](x: Self) {
    
    inline def setGetAsLookup(value: CallbackTo[ILookup]): Self = StObject.set(x, "GetAsLookup", value.toJsFn)
    
    inline def setGetAsTypedValue(value: CallbackTo[ITypedValue]): Self = StObject.set(x, "GetAsTypedValue", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "Selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFlagAffectedByPseudoUsers(value: Boolean): Self = StObject.set(x, "SelectableFlagAffectedByPseudoUsers", value.asInstanceOf[js.Any])
  }
}
