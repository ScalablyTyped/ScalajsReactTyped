package typingsJapgolly.dexie

import org.scalajs.dom.raw.IDBFactory
import typingsJapgolly.dexie.mod.Dexie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddons extends js.Object {
  var IDBKeyRange: js.UndefOr[AnonInstantiable] = js.undefined
  var addons: js.UndefOr[js.Array[js.Function1[/* db */ Dexie, Unit]]] = js.undefined
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var indexedDB: js.UndefOr[IDBFactory] = js.undefined
}

object AnonAddons {
  @scala.inline
  def apply(
    IDBKeyRange: AnonInstantiable = null,
    addons: js.Array[js.Function1[/* db */ Dexie, Unit]] = null,
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    indexedDB: IDBFactory = null
  ): AnonAddons = {
    val __obj = js.Dynamic.literal()
    if (IDBKeyRange != null) __obj.updateDynamic("IDBKeyRange")(IDBKeyRange.asInstanceOf[js.Any])
    if (addons != null) __obj.updateDynamic("addons")(addons.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (indexedDB != null) __obj.updateDynamic("indexedDB")(indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddons]
  }
}

