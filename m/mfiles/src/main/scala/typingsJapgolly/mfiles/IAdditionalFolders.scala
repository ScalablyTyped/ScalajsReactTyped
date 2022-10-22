package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdditionalFolders extends StObject {
  
  def Add(Index: Double, AdditionalFolder: IAdditionalFolder): Unit
  
  def Clone(): IAdditionalFolders
  
  val Count: Double
  
  def Item(Index: Double): IAdditionalFolder
  
  def Remove(Index: Double): Unit
}
object IAdditionalFolders {
  
  inline def apply(
    Add: (Double, IAdditionalFolder) => Callback,
    Clone: CallbackTo[IAdditionalFolders],
    Count: Double,
    Item: Double => IAdditionalFolder,
    Remove: Double => Callback
  ): IAdditionalFolders = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IAdditionalFolder) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IAdditionalFolders]
  }
  
  extension [Self <: IAdditionalFolders](x: Self) {
    
    inline def setAdd(value: (Double, IAdditionalFolder) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IAdditionalFolder) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IAdditionalFolders]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAdditionalFolder): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
