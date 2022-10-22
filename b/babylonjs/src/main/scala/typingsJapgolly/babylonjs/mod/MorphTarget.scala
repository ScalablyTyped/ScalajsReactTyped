package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MorphTarget")
@js.native
open class MorphTarget protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.MorphTarget {
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
  def this(
    /** defines the name of the target */
  name: String,
    influence: Double,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ) = this()
  def this(
    /** defines the name of the target */
  name: String,
    influence: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ) = this()
}
/* static members */
object MorphTarget {
  
  @JSImport("babylonjs", "MorphTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  inline def FromMesh(mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
  inline def FromMesh(mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh, name: String): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
  inline def FromMesh(
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    name: String,
    influence: Double
  ): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
  inline def FromMesh(mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh, name: Unit, influence: Double): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
  
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @param scene defines the hosting scene
    * @returns a new MorphTarget
    */
  inline def Parse(serializationObject: Any): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
  inline def Parse(serializationObject: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetMod.MorphTarget]
}
