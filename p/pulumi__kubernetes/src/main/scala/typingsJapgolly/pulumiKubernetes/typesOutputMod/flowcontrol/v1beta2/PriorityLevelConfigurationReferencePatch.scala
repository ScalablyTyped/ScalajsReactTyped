package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta2

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
  var name: String
}
object PriorityLevelConfigurationReferencePatch {
  
  inline def apply(name: String): PriorityLevelConfigurationReferencePatch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReferencePatch]
  }
  
  extension [Self <: PriorityLevelConfigurationReferencePatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
