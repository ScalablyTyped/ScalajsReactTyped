package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultsOnServer extends js.Object {
  val Count: Double
  def GetVaultByGUID(GUID: String): IVaultOnServer
  def GetVaultByName(Name: String): IVaultOnServer
  def GetVaultIndexByGUID(GUID: String): Double
  def GetVaultIndexByName(Name: String): Double
  def Item(Index: Double): IVaultOnServer
}

object IVaultsOnServer {
  @scala.inline
  def apply(
    Count: Double,
    GetVaultByGUID: String => CallbackTo[IVaultOnServer],
    GetVaultByName: String => CallbackTo[IVaultOnServer],
    GetVaultIndexByGUID: String => CallbackTo[Double],
    GetVaultIndexByName: String => CallbackTo[Double],
    Item: Double => CallbackTo[IVaultOnServer]
  ): IVaultsOnServer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("GetVaultByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultByGUID(t0).runNow()))
    __obj.updateDynamic("GetVaultByName")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultByName(t0).runNow()))
    __obj.updateDynamic("GetVaultIndexByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultIndexByGUID(t0).runNow()))
    __obj.updateDynamic("GetVaultIndexByName")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultIndexByName(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IVaultsOnServer]
  }
}

