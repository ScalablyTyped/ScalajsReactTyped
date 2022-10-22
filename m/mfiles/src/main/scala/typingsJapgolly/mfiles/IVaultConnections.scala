package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultConnections extends StObject {
  
  def Add(Index: Double, VaultConnection: IVaultConnection): Unit
  
  val Count: Double
  
  def GetVaultConnectionByName(VaultConnectionName: String): IVaultConnection
  
  def GetVaultConnectionIndexByName(VaultConnectionName: String): Double
  
  def Item(Index: Double): IVaultConnection
  
  def Remove(Index: Double): Unit
}
object IVaultConnections {
  
  inline def apply(
    Add: (Double, IVaultConnection) => Callback,
    Count: Double,
    GetVaultConnectionByName: String => IVaultConnection,
    GetVaultConnectionIndexByName: String => Double,
    Item: Double => IVaultConnection,
    Remove: Double => Callback
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IVaultConnection) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], GetVaultConnectionByName = js.Any.fromFunction1(GetVaultConnectionByName), GetVaultConnectionIndexByName = js.Any.fromFunction1(GetVaultConnectionIndexByName), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IVaultConnections]
  }
  
  extension [Self <: IVaultConnections](x: Self) {
    
    inline def setAdd(value: (Double, IVaultConnection) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IVaultConnection) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetVaultConnectionByName(value: String => IVaultConnection): Self = StObject.set(x, "GetVaultConnectionByName", js.Any.fromFunction1(value))
    
    inline def setGetVaultConnectionIndexByName(value: String => Double): Self = StObject.set(x, "GetVaultConnectionIndexByName", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IVaultConnection): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
