package typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveConnectorSinkConfiguration extends StObject {
  
  /**
    * The sink configuration's RTMP configuration setttings.
    */
  var RTMPConfiguration: LiveConnectorRTMPConfiguration
  
  /**
    * The sink configuration's sink type.
    */
  var SinkType: LiveConnectorSinkType
}
object LiveConnectorSinkConfiguration {
  
  inline def apply(RTMPConfiguration: LiveConnectorRTMPConfiguration, SinkType: LiveConnectorSinkType): LiveConnectorSinkConfiguration = {
    val __obj = js.Dynamic.literal(RTMPConfiguration = RTMPConfiguration.asInstanceOf[js.Any], SinkType = SinkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveConnectorSinkConfiguration]
  }
  
  extension [Self <: LiveConnectorSinkConfiguration](x: Self) {
    
    inline def setRTMPConfiguration(value: LiveConnectorRTMPConfiguration): Self = StObject.set(x, "RTMPConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSinkType(value: LiveConnectorSinkType): Self = StObject.set(x, "SinkType", value.asInstanceOf[js.Any])
  }
}
