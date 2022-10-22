package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupIDs extends StObject {
  
  def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit
  
  def Clone(): IUserOrUserGroupIDs
  
  val Count: Double
  
  def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID
  
  def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  
  def Item(Index: Double): IUserOrUserGroupID
  
  def Remove(Index: Double): Unit
}
object IUserOrUserGroupIDs {
  
  inline def apply(
    Add: (Double, IUserOrUserGroupID) => Callback,
    Clone: CallbackTo[IUserOrUserGroupIDs],
    Count: Double,
    GetUserOrUserGroupID: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID,
    GetUserOrUserGroupIDIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupID,
    Remove: Double => Callback
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IUserOrUserGroupID) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupID = js.Any.fromFunction2(GetUserOrUserGroupID), GetUserOrUserGroupIDIndex = js.Any.fromFunction2(GetUserOrUserGroupIDIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
  
  extension [Self <: IUserOrUserGroupIDs](x: Self) {
    
    inline def setAdd(value: (Double, IUserOrUserGroupID) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IUserOrUserGroupID) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IUserOrUserGroupIDs]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetUserOrUserGroupID(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID): Self = StObject.set(x, "GetUserOrUserGroupID", js.Any.fromFunction2(value))
    
    inline def setGetUserOrUserGroupIDIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = StObject.set(x, "GetUserOrUserGroupIDIndex", js.Any.fromFunction2(value))
    
    inline def setItem(value: Double => IUserOrUserGroupID): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
