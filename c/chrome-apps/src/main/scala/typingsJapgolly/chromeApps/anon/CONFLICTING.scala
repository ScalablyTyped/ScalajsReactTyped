package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.conflicting_
import typingsJapgolly.chromeApps.chromeAppsStrings.pending_
import typingsJapgolly.chromeApps.chromeAppsStrings.synced_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONFLICTING extends StObject {
  
  var CONFLICTING: conflicting_
  
  var PENDING: pending_
  
  var SYNCED: synced_
}
object CONFLICTING {
  
  inline def apply(): CONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = "conflicting", PENDING = "pending", SYNCED = "synced")
    __obj.asInstanceOf[CONFLICTING]
  }
  
  extension [Self <: CONFLICTING](x: Self) {
    
    inline def setCONFLICTING(value: conflicting_): Self = StObject.set(x, "CONFLICTING", value.asInstanceOf[js.Any])
    
    inline def setPENDING(value: pending_): Self = StObject.set(x, "PENDING", value.asInstanceOf[js.Any])
    
    inline def setSYNCED(value: synced_): Self = StObject.set(x, "SYNCED", value.asInstanceOf[js.Any])
  }
}
