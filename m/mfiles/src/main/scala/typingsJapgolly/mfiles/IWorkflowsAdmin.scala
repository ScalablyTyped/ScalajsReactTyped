package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflowsAdmin extends StObject {
  
  def Add(Index: Double, WorkflowAdmin: IWorkflowAdmin): Unit
  
  val Count: Double
  
  def Item(Index: Double): IWorkflowAdmin
  
  def Remove(Index: Double): Unit
}
object IWorkflowsAdmin {
  
  inline def apply(
    Add: (Double, IWorkflowAdmin) => Callback,
    Count: Double,
    Item: Double => IWorkflowAdmin,
    Remove: Double => Callback
  ): IWorkflowsAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IWorkflowAdmin) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IWorkflowsAdmin]
  }
  
  extension [Self <: IWorkflowsAdmin](x: Self) {
    
    inline def setAdd(value: (Double, IWorkflowAdmin) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IWorkflowAdmin) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IWorkflowAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
