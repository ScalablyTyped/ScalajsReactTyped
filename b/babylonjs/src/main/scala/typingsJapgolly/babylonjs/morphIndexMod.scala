package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morphIndexMod {
  
  @JSImport("babylonjs/Morph/index", "MorphTarget")
  @js.native
  open class MorphTarget protected ()
    extends typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget {
    /**
      * Creates a new MorphTarget
      * @param name defines the name of the target
      * @param influence defines the influence to use
      * @param scene defines the scene the morphtarget belongs to
      */
    def this(/** defines the name of the target */
    name: String) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double, scene: Nullable[Scene]) = this()
    def this(/** defines the name of the target */
    name: String, influence: Unit, scene: Nullable[Scene]) = this()
  }
  /* static members */
  object MorphTarget {
    
    @JSImport("babylonjs/Morph/index", "MorphTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    inline def FromMesh(mesh: AbstractMesh): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: String): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: String, influence: Double): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: Unit, influence: Double): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
    
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @param scene defines the hosting scene
      * @returns a new MorphTarget
      */
    inline def Parse(serializationObject: Any): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
    inline def Parse(serializationObject: Any, scene: Scene): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
  }
  
  @JSImport("babylonjs/Morph/index", "MorphTargetManager")
  @js.native
  /**
    * Creates a new MorphTargetManager
    * @param scene defines the current scene
    */
  open class MorphTargetManager ()
    extends typingsJapgolly.babylonjs.morphMorphTargetManagerMod.MorphTargetManager {
    def this(scene: Nullable[Scene]) = this()
  }
  /* static members */
  object MorphTargetManager {
    
    @JSImport("babylonjs/Morph/index", "MorphTargetManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** Enable storing morph target data into textures when set to true (true by default) */
    @JSImport("babylonjs/Morph/index", "MorphTargetManager.EnableTextureStorage")
    @js.native
    def EnableTextureStorage: Boolean = js.native
    inline def EnableTextureStorage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnableTextureStorage")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new MorphTargetManager from serialized data
      * @param serializationObject defines the serialized data
      * @param scene defines the hosting scene
      * @returns the new MorphTargetManager
      */
    inline def Parse(serializationObject: Any, scene: Scene): typingsJapgolly.babylonjs.morphMorphTargetManagerMod.MorphTargetManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetManagerMod.MorphTargetManager]
  }
}
