package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfidentialNodes extends StObject {
  
  /** Whether Confidential Nodes feature is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ConfidentialNodes {
  
  inline def apply(): ConfidentialNodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfidentialNodes]
  }
  
  extension [Self <: ConfidentialNodes](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
