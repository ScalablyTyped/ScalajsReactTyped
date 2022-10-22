package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
  */
trait WindowsSecurityContextOptionsPatch extends StObject {
  
  /**
    * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
    */
  var gmsaCredentialSpec: String
  
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use.
    */
  var gmsaCredentialSpecName: String
  
  /**
    * HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
    */
  var hostProcess: Boolean
  
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUserName: String
}
object WindowsSecurityContextOptionsPatch {
  
  inline def apply(
    gmsaCredentialSpec: String,
    gmsaCredentialSpecName: String,
    hostProcess: Boolean,
    runAsUserName: String
  ): WindowsSecurityContextOptionsPatch = {
    val __obj = js.Dynamic.literal(gmsaCredentialSpec = gmsaCredentialSpec.asInstanceOf[js.Any], gmsaCredentialSpecName = gmsaCredentialSpecName.asInstanceOf[js.Any], hostProcess = hostProcess.asInstanceOf[js.Any], runAsUserName = runAsUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSecurityContextOptionsPatch]
  }
  
  extension [Self <: WindowsSecurityContextOptionsPatch](x: Self) {
    
    inline def setGmsaCredentialSpec(value: String): Self = StObject.set(x, "gmsaCredentialSpec", value.asInstanceOf[js.Any])
    
    inline def setGmsaCredentialSpecName(value: String): Self = StObject.set(x, "gmsaCredentialSpecName", value.asInstanceOf[js.Any])
    
    inline def setHostProcess(value: Boolean): Self = StObject.set(x, "hostProcess", value.asInstanceOf[js.Any])
    
    inline def setRunAsUserName(value: String): Self = StObject.set(x, "runAsUserName", value.asInstanceOf[js.Any])
  }
}
