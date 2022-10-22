package typingsJapgolly.chromeApps.chrome.networking.onc

import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings._empty
import typingsJapgolly.chromeApps.chromeAppsStrings.`sim-pin`
import typingsJapgolly.chromeApps.chromeAppsStrings.`sim-puk`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SIMLockStatus extends StObject {
  
  /** Whether SIM lock is enabled. */
  var LockEnabled: Boolean
  
  /** The status of SIM lock - possible values are 'sim-pin', 'sim-puk' and ''. */
  var LockType: `sim-pin` | `sim-puk` | _empty
  
  /** Number of PIN lock tries allowed before PUK is required to unlock the SIM. */
  var RetriesLeft: js.UndefOr[integer] = js.undefined
}
object SIMLockStatus {
  
  inline def apply(LockEnabled: Boolean, LockType: `sim-pin` | `sim-puk` | _empty): SIMLockStatus = {
    val __obj = js.Dynamic.literal(LockEnabled = LockEnabled.asInstanceOf[js.Any], LockType = LockType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIMLockStatus]
  }
  
  extension [Self <: SIMLockStatus](x: Self) {
    
    inline def setLockEnabled(value: Boolean): Self = StObject.set(x, "LockEnabled", value.asInstanceOf[js.Any])
    
    inline def setLockType(value: `sim-pin` | `sim-puk` | _empty): Self = StObject.set(x, "LockType", value.asInstanceOf[js.Any])
    
    inline def setRetriesLeft(value: integer): Self = StObject.set(x, "RetriesLeft", value.asInstanceOf[js.Any])
    
    inline def setRetriesLeftUndefined: Self = StObject.set(x, "RetriesLeft", js.undefined)
  }
}
