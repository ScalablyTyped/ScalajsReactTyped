package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a scene analysis video effect. */
trait SceneAnalysisEffectDefinition extends StObject {
  
  /** Gets a string containing the activatable class ID of the scene analysis effect definition. */
  var activatableClassId: String
  
  /** Gets the set of properties for configuring the SceneAnalysisEffectDefinition object. */
  var properties: IPropertySet
}
object SceneAnalysisEffectDefinition {
  
  inline def apply(activatableClassId: String, properties: IPropertySet): SceneAnalysisEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalysisEffectDefinition]
  }
  
  extension [Self <: SceneAnalysisEffectDefinition](x: Self) {
    
    inline def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
