package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClassGroup extends StObject {
  
  def AddMember(Member: Double): Unit
  
  def Clone(): IClassGroup
  
  var ID: Double
  
  var Members: IIDs
  
  var Name: String
  
  var ObjectType: MFBuiltInObjectType | Double
  
  def RemoveMember(Member: Double): Unit
}
object IClassGroup {
  
  inline def apply(
    AddMember: Double => Callback,
    Clone: CallbackTo[IClassGroup],
    ID: Double,
    Members: IIDs,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    RemoveMember: Double => Callback
  ): IClassGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1((t0: Double) => AddMember(t0).runNow()), Clone = Clone.toJsFn, ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1((t0: Double) => RemoveMember(t0).runNow()))
    __obj.asInstanceOf[IClassGroup]
  }
  
  extension [Self <: IClassGroup](x: Self) {
    
    inline def setAddMember(value: Double => Callback): Self = StObject.set(x, "AddMember", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClone(value: CallbackTo[IClassGroup]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: IIDs): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setRemoveMember(value: Double => Callback): Self = StObject.set(x, "RemoveMember", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
