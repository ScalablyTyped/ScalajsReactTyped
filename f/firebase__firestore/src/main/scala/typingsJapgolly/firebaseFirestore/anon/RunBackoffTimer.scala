package typingsJapgolly.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunBackoffTimer extends StObject {
  
  var runBackoffTimer: Boolean
}
object RunBackoffTimer {
  
  inline def apply(runBackoffTimer: Boolean): RunBackoffTimer = {
    val __obj = js.Dynamic.literal(runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunBackoffTimer]
  }
  
  extension [Self <: RunBackoffTimer](x: Self) {
    
    inline def setRunBackoffTimer(value: Boolean): Self = StObject.set(x, "runBackoffTimer", value.asInstanceOf[js.Any])
  }
}
