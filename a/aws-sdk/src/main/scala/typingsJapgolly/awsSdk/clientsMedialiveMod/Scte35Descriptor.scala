package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35Descriptor extends StObject {
  
  /**
    * SCTE-35 Descriptor Settings.
    */
  var Scte35DescriptorSettings: typingsJapgolly.awsSdk.clientsMedialiveMod.Scte35DescriptorSettings
}
object Scte35Descriptor {
  
  inline def apply(Scte35DescriptorSettings: Scte35DescriptorSettings): Scte35Descriptor = {
    val __obj = js.Dynamic.literal(Scte35DescriptorSettings = Scte35DescriptorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35Descriptor]
  }
  
  extension [Self <: Scte35Descriptor](x: Self) {
    
    inline def setScte35DescriptorSettings(value: Scte35DescriptorSettings): Self = StObject.set(x, "Scte35DescriptorSettings", value.asInstanceOf[js.Any])
  }
}
