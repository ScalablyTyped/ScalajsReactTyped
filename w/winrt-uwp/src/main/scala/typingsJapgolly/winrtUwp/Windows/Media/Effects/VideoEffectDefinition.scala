package typingsJapgolly.winrtUwp.Windows.Media.Effects

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video effect definition. */
trait VideoEffectDefinition extends StObject {
  
  /** Gets the activatable class ID of the video effect definition. */
  var activatableClassId: String
  
  /** Gets the set of properties for configuring the VideoEffectDefinition object. */
  var properties: IPropertySet
}
object VideoEffectDefinition {
  
  inline def apply(activatableClassId: String, properties: IPropertySet): VideoEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEffectDefinition]
  }
  
  extension [Self <: VideoEffectDefinition](x: Self) {
    
    inline def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
