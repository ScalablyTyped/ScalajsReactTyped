package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodOS defines the OS parameters of a pod.
  */
trait PodOSPatch extends StObject {
  
  /**
    * Name is the name of the operating system. The currently supported values are linux and windows. Additional value may be defined in future and can be one of: https://github.com/opencontainers/runtime-spec/blob/master/config.md#platform-specific-configuration Clients should expect to handle additional values and treat unrecognized values in this field as os: null
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object PodOSPatch {
  
  inline def apply(): PodOSPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodOSPatch]
  }
  
  extension [Self <: PodOSPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
