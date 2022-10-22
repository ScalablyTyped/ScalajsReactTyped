package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsMaterialAugmentingMod {
  
  trait Material extends StObject {
    
    /**
      * Plugin manager for this material
      */
    var pluginManager: js.UndefOr[
        typingsJapgolly.babylonjs.materialsMaterialPluginManagerMod.MaterialPluginManager
      ] = js.undefined
  }
  object Material {
    
    inline def apply(): typingsJapgolly.babylonjs.indexMod.babylonjsMaterialsMaterialAugmentingMod.Material = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.babylonjs.indexMod.babylonjsMaterialsMaterialAugmentingMod.Material]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.indexMod.babylonjsMaterialsMaterialAugmentingMod.Material](x: Self) {
      
      inline def setPluginManager(value: typingsJapgolly.babylonjs.materialsMaterialPluginManagerMod.MaterialPluginManager): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
      
      inline def setPluginManagerUndefined: Self = StObject.set(x, "pluginManager", js.undefined)
    }
  }
}
