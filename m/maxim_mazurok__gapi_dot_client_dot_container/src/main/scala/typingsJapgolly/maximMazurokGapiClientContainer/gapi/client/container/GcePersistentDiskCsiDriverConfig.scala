package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcePersistentDiskCsiDriverConfig extends StObject {
  
  /** Whether the Compute Engine PD CSI driver is enabled for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object GcePersistentDiskCsiDriverConfig {
  
  inline def apply(): GcePersistentDiskCsiDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcePersistentDiskCsiDriverConfig]
  }
  
  extension [Self <: GcePersistentDiskCsiDriverConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
