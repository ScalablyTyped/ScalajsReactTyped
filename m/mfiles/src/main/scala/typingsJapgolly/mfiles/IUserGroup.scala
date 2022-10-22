package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserGroup extends StObject {
  
  def AddMember(ID: Double): Unit
  
  def Clone(): IUserGroup
  
  def CloneFrom(UserGroup: IUserGroup): Unit
  
  var ID: Double
  
  var Members: IIDs
  
  var Name: String
  
  val Predefined: Boolean
  
  def RemoveMember(ID: Double): Unit
}
object IUserGroup {
  
  inline def apply(
    AddMember: Double => Callback,
    Clone: CallbackTo[IUserGroup],
    CloneFrom: IUserGroup => Callback,
    ID: Double,
    Members: IIDs,
    Name: String,
    Predefined: Boolean,
    RemoveMember: Double => Callback
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1((t0: Double) => AddMember(t0).runNow()), Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IUserGroup) => CloneFrom(t0).runNow()), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1((t0: Double) => RemoveMember(t0).runNow()))
    __obj.asInstanceOf[IUserGroup]
  }
  
  extension [Self <: IUserGroup](x: Self) {
    
    inline def setAddMember(value: Double => Callback): Self = StObject.set(x, "AddMember", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClone(value: CallbackTo[IUserGroup]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IUserGroup => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IUserGroup) => value(t0).runNow()))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: IIDs): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPredefined(value: Boolean): Self = StObject.set(x, "Predefined", value.asInstanceOf[js.Any])
    
    inline def setRemoveMember(value: Double => Callback): Self = StObject.set(x, "RemoveMember", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
