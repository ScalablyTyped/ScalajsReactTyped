package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
  */
trait PriorityLevelConfigurationReferencePatch extends StObject {
  
  /**
    * `name` is the name of the priority level configuration being referenced Required.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object PriorityLevelConfigurationReferencePatch {
  
  inline def apply(): PriorityLevelConfigurationReferencePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityLevelConfigurationReferencePatch]
  }
  
  extension [Self <: PriorityLevelConfigurationReferencePatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
