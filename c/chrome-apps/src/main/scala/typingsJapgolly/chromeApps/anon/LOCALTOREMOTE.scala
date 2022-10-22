package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.local_to_remote_
import typingsJapgolly.chromeApps.chromeAppsStrings.remote_to_local_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LOCALTOREMOTE extends StObject {
  
  var LOCAL_TO_REMOTE: local_to_remote_
  
  var REMOTE_TO_LOCAL: remote_to_local_
}
object LOCALTOREMOTE {
  
  inline def apply(): LOCALTOREMOTE = {
    val __obj = js.Dynamic.literal(LOCAL_TO_REMOTE = "local_to_remote", REMOTE_TO_LOCAL = "remote_to_local")
    __obj.asInstanceOf[LOCALTOREMOTE]
  }
  
  extension [Self <: LOCALTOREMOTE](x: Self) {
    
    inline def setLOCAL_TO_REMOTE(value: local_to_remote_): Self = StObject.set(x, "LOCAL_TO_REMOTE", value.asInstanceOf[js.Any])
    
    inline def setREMOTE_TO_LOCAL(value: remote_to_local_): Self = StObject.set(x, "REMOTE_TO_LOCAL", value.asInstanceOf[js.Any])
  }
}
