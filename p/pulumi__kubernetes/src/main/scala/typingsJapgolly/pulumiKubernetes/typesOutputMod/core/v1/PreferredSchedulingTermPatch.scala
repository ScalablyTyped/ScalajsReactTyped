package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
  */
trait PreferredSchedulingTermPatch extends StObject {
  
  /**
    * A node selector term, associated with the corresponding weight.
    */
  var preference: NodeSelectorTermPatch
  
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  var weight: Double
}
object PreferredSchedulingTermPatch {
  
  inline def apply(preference: NodeSelectorTermPatch, weight: Double): PreferredSchedulingTermPatch = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredSchedulingTermPatch]
  }
  
  extension [Self <: PreferredSchedulingTermPatch](x: Self) {
    
    inline def setPreference(value: NodeSelectorTermPatch): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
