package typingsJapgolly.babylonjs.miscIndexMod

import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SceneRecorder")
@js.native
open class SceneRecorder ()
  extends typingsJapgolly.babylonjs.miscSceneRecorderMod.SceneRecorder
/* static members */
object SceneRecorder {
  
  @JSImport("babylonjs/Misc/index", "SceneRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ApplyDelta(deltaJSON: String, scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Apply a given delta to a given scene
    * @param deltaJSON defines the JSON containing the delta
    * @param scene defines the scene to apply the delta to
    */
  inline def ApplyDelta(deltaJSON: Any, scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyDelta")(deltaJSON.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("babylonjs/Misc/index", "SceneRecorder.GetShadowGeneratorById")
  @js.native
  def GetShadowGeneratorById: Any = js.native
  inline def GetShadowGeneratorById_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShadowGeneratorById")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "SceneRecorder._ApplyDeltaForEntity")
  @js.native
  def _ApplyDeltaForEntity: Any = js.native
  inline def _ApplyDeltaForEntity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyDeltaForEntity")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "SceneRecorder._ApplyPropertiesToEntity")
  @js.native
  def _ApplyPropertiesToEntity: Any = js.native
  inline def _ApplyPropertiesToEntity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyPropertiesToEntity")(x.asInstanceOf[js.Any])
}
