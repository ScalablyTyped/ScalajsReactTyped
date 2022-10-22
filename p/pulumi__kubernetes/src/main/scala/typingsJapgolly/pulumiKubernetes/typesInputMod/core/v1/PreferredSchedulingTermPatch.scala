package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var preference: js.UndefOr[Input[NodeSelectorTermPatch]] = js.undefined
  
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  var weight: js.UndefOr[Input[Double]] = js.undefined
}
object PreferredSchedulingTermPatch {
  
  inline def apply(): PreferredSchedulingTermPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferredSchedulingTermPatch]
  }
  
  extension [Self <: PreferredSchedulingTermPatch](x: Self) {
    
    inline def setPreference(value: Input[NodeSelectorTermPatch]): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
