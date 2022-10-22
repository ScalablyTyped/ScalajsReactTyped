package typingsJapgolly.babylonjs.meshesIndexMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesAbstractMeshAugmentingMod {
  
  trait AbstractMesh extends StObject {
    
    /**
      * Object used to store instanced buffers defined by user
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      */
    var instancedBuffers: StringDictionary[Any]
  }
  object AbstractMesh {
    
    inline def apply(instancedBuffers: StringDictionary[Any]): typingsJapgolly.babylonjs.meshesIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
      val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.babylonjs.meshesIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.meshesIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh](x: Self) {
      
      inline def setInstancedBuffers(value: StringDictionary[Any]): Self = StObject.set(x, "instancedBuffers", value.asInstanceOf[js.Any])
    }
  }
}
