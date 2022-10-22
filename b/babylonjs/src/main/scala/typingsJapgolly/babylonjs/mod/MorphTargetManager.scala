package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
open class MorphTargetManager ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.MorphTargetManager {
  def this(scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object MorphTargetManager {
  
  @JSImport("babylonjs", "MorphTargetManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** Enable storing morph target data into textures when set to true (true by default) */
  @JSImport("babylonjs", "MorphTargetManager.EnableTextureStorage")
  @js.native
  def EnableTextureStorage: Boolean = js.native
  inline def EnableTextureStorage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnableTextureStorage")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  inline def Parse(serializationObject: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.morphMorphTargetManagerMod.MorphTargetManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.morphMorphTargetManagerMod.MorphTargetManager]
}
