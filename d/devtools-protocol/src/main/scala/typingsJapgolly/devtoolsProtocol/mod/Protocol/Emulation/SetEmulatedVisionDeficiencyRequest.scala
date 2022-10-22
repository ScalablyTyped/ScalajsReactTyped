package typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.achromatopsia
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.blurredVision
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.deuteranopia
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.none_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.protanopia
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.tritanopia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEmulatedVisionDeficiencyRequest extends StObject {
  
  /**
    * Vision deficiency to emulate. (SetEmulatedVisionDeficiencyRequestType enum)
    */
  var `type`: none_ | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia
}
object SetEmulatedVisionDeficiencyRequest {
  
  inline def apply(`type`: none_ | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia): SetEmulatedVisionDeficiencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEmulatedVisionDeficiencyRequest]
  }
  
  extension [Self <: SetEmulatedVisionDeficiencyRequest](x: Self) {
    
    inline def setType(value: none_ | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
