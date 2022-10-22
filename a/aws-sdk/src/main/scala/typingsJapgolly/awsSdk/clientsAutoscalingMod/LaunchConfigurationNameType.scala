package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationNameType extends StObject {
  
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: XmlStringMaxLen255
}
object LaunchConfigurationNameType {
  
  inline def apply(LaunchConfigurationName: XmlStringMaxLen255): LaunchConfigurationNameType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationNameType]
  }
  
  extension [Self <: LaunchConfigurationNameType](x: Self) {
    
    inline def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
  }
}
