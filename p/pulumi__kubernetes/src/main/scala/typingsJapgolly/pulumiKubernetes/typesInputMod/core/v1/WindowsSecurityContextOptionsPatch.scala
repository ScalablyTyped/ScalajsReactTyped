package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var gmsaCredentialSpec: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use.
    */
  var gmsaCredentialSpecName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
    */
  var hostProcess: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUserName: js.UndefOr[Input[String]] = js.undefined
}
object WindowsSecurityContextOptionsPatch {
  
  inline def apply(): WindowsSecurityContextOptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsSecurityContextOptionsPatch]
  }
  
  extension [Self <: WindowsSecurityContextOptionsPatch](x: Self) {
    
    inline def setGmsaCredentialSpec(value: Input[String]): Self = StObject.set(x, "gmsaCredentialSpec", value.asInstanceOf[js.Any])
    
    inline def setGmsaCredentialSpecName(value: Input[String]): Self = StObject.set(x, "gmsaCredentialSpecName", value.asInstanceOf[js.Any])
    
    inline def setGmsaCredentialSpecNameUndefined: Self = StObject.set(x, "gmsaCredentialSpecName", js.undefined)
    
    inline def setGmsaCredentialSpecUndefined: Self = StObject.set(x, "gmsaCredentialSpec", js.undefined)
    
    inline def setHostProcess(value: Input[Boolean]): Self = StObject.set(x, "hostProcess", value.asInstanceOf[js.Any])
    
    inline def setHostProcessUndefined: Self = StObject.set(x, "hostProcess", js.undefined)
    
    inline def setRunAsUserName(value: Input[String]): Self = StObject.set(x, "runAsUserName", value.asInstanceOf[js.Any])
    
    inline def setRunAsUserNameUndefined: Self = StObject.set(x, "runAsUserName", js.undefined)
  }
}
