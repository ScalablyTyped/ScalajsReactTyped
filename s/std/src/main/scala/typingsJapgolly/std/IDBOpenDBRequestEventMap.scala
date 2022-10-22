package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBOpenDBRequestEventMap
  extends StObject
     with IDBRequestEventMap {
  
  /* standard dom */
  var blocked: org.scalajs.dom.Event
  
  /* standard dom */
  var upgradeneeded: org.scalajs.dom.IDBVersionChangeEvent
}
object IDBOpenDBRequestEventMap {
  
  inline def apply(
    blocked: org.scalajs.dom.Event,
    error: org.scalajs.dom.Event,
    success: org.scalajs.dom.Event,
    upgradeneeded: org.scalajs.dom.IDBVersionChangeEvent
  ): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
  
  extension [Self <: IDBOpenDBRequestEventMap](x: Self) {
    
    inline def setBlocked(value: org.scalajs.dom.Event): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setUpgradeneeded(value: org.scalajs.dom.IDBVersionChangeEvent): Self = StObject.set(x, "upgradeneeded", value.asInstanceOf[js.Any])
  }
}
