package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
  */
trait PriorityLevelConfigurationSpecPatch extends StObject {
  
  /**
    * `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `"Limited"`.
    */
  var limited: js.UndefOr[Input[LimitedPriorityLevelConfigurationPatch]] = js.undefined
  
  /**
    * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `"Exempt"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `"Limited"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object PriorityLevelConfigurationSpecPatch {
  
  inline def apply(): PriorityLevelConfigurationSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityLevelConfigurationSpecPatch]
  }
  
  extension [Self <: PriorityLevelConfigurationSpecPatch](x: Self) {
    
    inline def setLimited(value: Input[LimitedPriorityLevelConfigurationPatch]): Self = StObject.set(x, "limited", value.asInstanceOf[js.Any])
    
    inline def setLimitedUndefined: Self = StObject.set(x, "limited", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
