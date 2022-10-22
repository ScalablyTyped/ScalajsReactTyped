package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileBroadbandAccountWatcher
  extends StObject
     with IMobileBroadbandAccountWatcher
object MobileBroadbandAccountWatcher {
  
  inline def apply(
    onaccountadded: Any,
    onaccountremoved: Any,
    onaccountupdated: Any,
    onenumerationcompleted: Any,
    onstopped: Any,
    start: Callback,
    status: MobileBroadbandAccountWatcherStatus,
    stop: Callback
  ): MobileBroadbandAccountWatcher = {
    val __obj = js.Dynamic.literal(onaccountadded = onaccountadded.asInstanceOf[js.Any], onaccountremoved = onaccountremoved.asInstanceOf[js.Any], onaccountupdated = onaccountupdated.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], start = start.toJsFn, status = status.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.asInstanceOf[MobileBroadbandAccountWatcher]
  }
}
