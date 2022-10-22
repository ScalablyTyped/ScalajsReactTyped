package typingsJapgolly.activexDiskquota

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import typingsJapgolly.activexDiskquota.activexDiskquotaStrings.OnUserNameChanged
import typingsJapgolly.activexDiskquota.activexDiskquotaStrings.pUser
import typingsJapgolly.activexDiskquota.anon.PUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  def on(
    obj: DiskQuotaControl,
    event: OnUserNameChanged,
    argNames: js.Array[pUser],
    handler: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]
  ): Unit
}
object ActiveXObject {
  
  inline def apply(
    on: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]) => Callback
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4((t0: DiskQuotaControl, t1: OnUserNameChanged, t2: js.Array[pUser], t3: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]) => (on(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setOn(
      value: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]) => Callback
    ): Self = StObject.set(x, "on", js.Any.fromFunction4((t0: DiskQuotaControl, t1: OnUserNameChanged, t2: js.Array[pUser], t3: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ PUser, Unit]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
