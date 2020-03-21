package typingsJapgolly.activexDiskquota

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import typingsJapgolly.activexDiskquota.activexDiskquotaStrings.OnUserNameChanged
import typingsJapgolly.activexDiskquota.activexDiskquotaStrings.pUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DiskQuotaControl,
    event: OnUserNameChanged,
    argNames: js.Array[pUser],
    handler: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ AnonPUser, Unit]
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ AnonPUser, Unit]) => Callback
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction4((t0: typingsJapgolly.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl, t1: typingsJapgolly.activexDiskquota.activexDiskquotaStrings.OnUserNameChanged, t2: js.Array[typingsJapgolly.activexDiskquota.activexDiskquotaStrings.pUser], t3: js.ThisFunction1[
  /* this */ typingsJapgolly.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl, 
  /* parameter */ typingsJapgolly.activexDiskquota.AnonPUser, 
  scala.Unit]) => on(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
}

