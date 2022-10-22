package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.typesMod.IndicesArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesSubMeshAugmentingMod {
  
  trait SubMesh extends StObject {
    
    /** @internal */
    def _projectOnTrianglesToRef(
      vector: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      positions: js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
      indices: IndicesArray,
      step: Double,
      checkStopper: Boolean,
      ref: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
    ): Double
    
    /** @internal */
    def _projectOnUnIndexedTrianglesToRef(
      vector: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      positions: js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
      indices: IndicesArray,
      ref: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
    ): Double
    
    /**
      * Projects a point on this submesh and stores the result in "ref"
      *
      * @param vector point to project
      * @param positions defines mesh's positions array
      * @param indices defines mesh's indices array
      * @param ref vector that will store the result
      * @returns distance from the point and the submesh, or -1 if the mesh rendering mode doesn't support projections
      */
    def projectToRef(
      vector: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      positions: js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
      indices: IndicesArray,
      ref: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
    ): Double
  }
  object SubMesh {
    
    inline def apply(
      _projectOnTrianglesToRef: (typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3, js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3], IndicesArray, Double, Boolean, typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) => Double,
      _projectOnUnIndexedTrianglesToRef: (typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3, js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3], IndicesArray, typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) => Double,
      projectToRef: (typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3, js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3], IndicesArray, typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) => Double
    ): typingsJapgolly.babylonjs.mod.babylonjsMeshesSubMeshAugmentingMod.SubMesh = {
      val __obj = js.Dynamic.literal(_projectOnTrianglesToRef = js.Any.fromFunction6(_projectOnTrianglesToRef), _projectOnUnIndexedTrianglesToRef = js.Any.fromFunction4(_projectOnUnIndexedTrianglesToRef), projectToRef = js.Any.fromFunction4(projectToRef))
      __obj.asInstanceOf[typingsJapgolly.babylonjs.mod.babylonjsMeshesSubMeshAugmentingMod.SubMesh]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.mod.babylonjsMeshesSubMeshAugmentingMod.SubMesh](x: Self) {
      
      inline def setProjectToRef(
        value: (typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3, js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3], IndicesArray, typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) => Double
      ): Self = StObject.set(x, "projectToRef", js.Any.fromFunction4(value))
      
      inline def set_projectOnTrianglesToRef(
        value: (typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3, js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3], IndicesArray, Double, Boolean, typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) => Double
      ): Self = StObject.set(x, "_projectOnTrianglesToRef", js.Any.fromFunction6(value))
      
      inline def set_projectOnUnIndexedTrianglesToRef(
        value: (typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3, js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3], IndicesArray, typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) => Double
      ): Self = StObject.set(x, "_projectOnUnIndexedTrianglesToRef", js.Any.fromFunction4(value))
    }
  }
}
