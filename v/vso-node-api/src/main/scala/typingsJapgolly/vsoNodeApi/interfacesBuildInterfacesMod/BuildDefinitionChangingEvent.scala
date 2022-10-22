package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinitionChangingEvent extends StObject {
  
  var changeType: AuditAction
  
  var newDefinition: BuildDefinition
  
  var originalDefinition: BuildDefinition
}
object BuildDefinitionChangingEvent {
  
  inline def apply(changeType: AuditAction, newDefinition: BuildDefinition, originalDefinition: BuildDefinition): BuildDefinitionChangingEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], newDefinition = newDefinition.asInstanceOf[js.Any], originalDefinition = originalDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangingEvent]
  }
  
  extension [Self <: BuildDefinitionChangingEvent](x: Self) {
    
    inline def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setNewDefinition(value: BuildDefinition): Self = StObject.set(x, "newDefinition", value.asInstanceOf[js.Any])
    
    inline def setOriginalDefinition(value: BuildDefinition): Self = StObject.set(x, "originalDefinition", value.asInstanceOf[js.Any])
  }
}
