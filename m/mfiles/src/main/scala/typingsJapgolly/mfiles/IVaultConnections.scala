package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultConnections extends js.Object {
  val Count: Double
  def Add(Index: Double, VaultConnection: IVaultConnection): Unit
  def GetVaultConnectionByName(VaultConnectionName: String): IVaultConnection
  def GetVaultConnectionIndexByName(VaultConnectionName: String): Double
  def Item(Index: Double): IVaultConnection
  def Remove(Index: Double): Unit
}

object IVaultConnections {
  @scala.inline
  def apply(
    Add: (Double, IVaultConnection) => Callback,
    Count: Double,
    GetVaultConnectionByName: String => CallbackTo[IVaultConnection],
    GetVaultConnectionIndexByName: String => CallbackTo[Double],
    Item: Double => CallbackTo[IVaultConnection],
    Remove: Double => Callback
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IVaultConnection) => Add(t0, t1).runNow()))
    __obj.updateDynamic("GetVaultConnectionByName")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultConnectionByName(t0).runNow()))
    __obj.updateDynamic("GetVaultConnectionIndexByName")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultConnectionIndexByName(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IVaultConnections]
  }
}

