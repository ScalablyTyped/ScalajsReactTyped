package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AudioSceneComponent")
@js.native
/**
  * Creates a new instance of the component for the given scene
  * @param scene Defines the scene to register the component in
  */
open class AudioSceneComponent ()
  extends typingsJapgolly.babylonjs.audioIndexMod.AudioSceneComponent {
  def this(scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object AudioSceneComponent {
  
  @JSImport("babylonjs/index", "AudioSceneComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "AudioSceneComponent._CameraDirection")
  @js.native
  def _CameraDirection: Any = js.native
  inline def _CameraDirection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirection")(x.asInstanceOf[js.Any])
}
