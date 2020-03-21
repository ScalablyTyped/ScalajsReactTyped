package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEntry extends js.Object {
  val Events: IVaultEntryEvents
  val Vault: IVault
  val VaultCore: IVaultCore
  val VaultUI: IVaultUI
  def NotifyVaultEntry(ID: String, data1: js.Any, data2: js.Any): js.Any
}

object IVaultEntry {
  @scala.inline
  def apply(
    Events: IVaultEntryEvents,
    NotifyVaultEntry: (String, js.Any, js.Any) => CallbackTo[js.Any],
    Vault: IVault,
    VaultCore: IVaultCore,
    VaultUI: IVaultUI
  ): IVaultEntry = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], Vault = Vault.asInstanceOf[js.Any], VaultCore = VaultCore.asInstanceOf[js.Any], VaultUI = VaultUI.asInstanceOf[js.Any])
    __obj.updateDynamic("NotifyVaultEntry")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Any) => NotifyVaultEntry(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IVaultEntry]
  }
}

