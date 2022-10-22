package typingsJapgolly.winrtUwp.Windows.Media.Protection

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Protected Media Path (PMP) server to enable playback of protected content using digital rights management (DRM). */
trait MediaProtectionPMPServer extends StObject {
  
  /** Gets the property set for the MediaProtectionPMPServer . */
  var properties: IPropertySet
}
object MediaProtectionPMPServer {
  
  inline def apply(properties: IPropertySet): MediaProtectionPMPServer = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProtectionPMPServer]
  }
  
  extension [Self <: MediaProtectionPMPServer](x: Self) {
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
