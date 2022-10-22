package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupIDExs extends StObject {
  
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit
  
  def Clone(): IUserOrUserGroupIDExs
  
  val Count: Double
  
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx
  
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  
  def Item(Index: Double): IUserOrUserGroupIDEx
  
  def Remove(Index: Double): Unit
}
object IUserOrUserGroupIDExs {
  
  inline def apply(
    Add: (Double, IUserOrUserGroupIDEx) => Callback,
    Clone: CallbackTo[IUserOrUserGroupIDExs],
    Count: Double,
    GetUserOrUserGroupIDEx: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx,
    GetUserOrUserGroupIDExIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupIDEx,
    Remove: Double => Callback
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IUserOrUserGroupIDEx) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupIDEx = js.Any.fromFunction2(GetUserOrUserGroupIDEx), GetUserOrUserGroupIDExIndex = js.Any.fromFunction2(GetUserOrUserGroupIDExIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
  
  extension [Self <: IUserOrUserGroupIDExs](x: Self) {
    
    inline def setAdd(value: (Double, IUserOrUserGroupIDEx) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IUserOrUserGroupIDEx) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IUserOrUserGroupIDExs]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetUserOrUserGroupIDEx(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx): Self = StObject.set(x, "GetUserOrUserGroupIDEx", js.Any.fromFunction2(value))
    
    inline def setGetUserOrUserGroupIDExIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = StObject.set(x, "GetUserOrUserGroupIDExIndex", js.Any.fromFunction2(value))
    
    inline def setItem(value: Double => IUserOrUserGroupIDEx): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
