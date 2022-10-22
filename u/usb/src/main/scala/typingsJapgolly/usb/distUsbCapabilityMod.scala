package typingsJapgolly.usb

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.usb.distUsbBindingsMod.Device
import typingsJapgolly.usb.distUsbDescriptorsMod.CapabilityDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUsbCapabilityMod {
  
  @JSImport("usb/dist/usb/capability", "Capability")
  @js.native
  open class Capability protected () extends StObject {
    def this(device: Device, id: Double) = this()
    
    /** Buffer capability data. */
    var data: Buffer = js.native
    
    /** Object with fields from the capability descriptor -- see libusb documentation or USB spec. */
    var descriptor: CapabilityDescriptor = js.native
    
    /* protected */ var device: Device = js.native
    
    /* protected */ var id: Double = js.native
    
    /** Integer capability type. */
    var `type`: Double = js.native
  }
}
