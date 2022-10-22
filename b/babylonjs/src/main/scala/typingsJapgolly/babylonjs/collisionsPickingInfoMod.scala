package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.cullingRayMod.Ray
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector2
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.spritesSpriteMod.Sprite
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collisionsPickingInfoMod {
  
  @JSImport("babylonjs/Collisions/pickingInfo", "PickingInfo")
  @js.native
  open class PickingInfo () extends StObject {
    
    /** @internal */
    var _pickingUnavailable: Boolean = js.native
    
    /**
      * The aim-space transform of the input used for picking, if it is an XR input source.
      */
    var aimTransform: Nullable[TransformNode] = js.native
    
    /** (See getTextureCoordinates) The barycentric U coordinate that is used when calculating the texture coordinates of the collision.*/
    var bu: Double = js.native
    
    /** (See getTextureCoordinates) The barycentric V coordinate that is used when calculating the texture coordinates of the collision.*/
    var bv: Double = js.native
    
    /**
      * Distance away where the pick collided
      */
    var distance: Double = js.native
    
    /** The index of the face on the mesh that was picked, or the index of the Line if the picked Mesh is a LinesMesh */
    var faceId: Double = js.native
    
    /**
      * Gets the normal corresponding to the face the pick collided with
      * @param useWorldCoordinates If the resulting normal should be relative to the world (default: false)
      * @param useVerticesNormals If the vertices normals should be used to calculate the normal instead of the normal map
      * @returns The normal corresponding to the face the pick collided with
      */
    def getNormal(): Nullable[Vector3] = js.native
    def getNormal(useWorldCoordinates: Boolean): Nullable[Vector3] = js.native
    def getNormal(useWorldCoordinates: Boolean, useVerticesNormals: Boolean): Nullable[Vector3] = js.native
    def getNormal(useWorldCoordinates: Unit, useVerticesNormals: Boolean): Nullable[Vector3] = js.native
    
    /**
      * Gets the texture coordinates of where the pick occurred
      * @returns the vector containing the coordinates of the texture
      */
    def getTextureCoordinates(): Nullable[Vector2] = js.native
    
    /**
      * The grip-space transform of the input used for picking, if it is an XR input source.
      * Some XR sources, such as input coming from head mounted displays, do not have this.
      */
    var gripTransform: Nullable[TransformNode] = js.native
    
    /**
      * If the pick collided with an object
      */
    var hit: Boolean = js.native
    
    /**
      * If a mesh was used to do the picking (eg. 6dof controller) as a "near interaction", this will be populated.
      */
    var originMesh: Nullable[AbstractMesh] = js.native
    
    /**
      * The mesh corresponding the the pick collision
      */
    var pickedMesh: Nullable[AbstractMesh] = js.native
    
    /**
      * The location of pick collision
      */
    var pickedPoint: Nullable[Vector3] = js.native
    
    /** If a sprite was picked, this will be the sprite the pick collided with */
    var pickedSprite: Nullable[Sprite] = js.native
    
    /**
      * The ray that was used to perform the picking.
      */
    var ray: Nullable[Ray] = js.native
    
    /** The index of the face on the subMesh that was picked, or the index of the Line if the picked Mesh is a LinesMesh */
    var subMeshFaceId: Double = js.native
    
    /** Id of the the submesh that was picked */
    var subMeshId: Double = js.native
    
    /** If we are picking a mesh with thin instance, this will give you the picked thin instance */
    var thinInstanceIndex: Double = js.native
  }
}
