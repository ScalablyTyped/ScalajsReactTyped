package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "LensFlareSystem")
@js.native
open class LensFlareSystem protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.LensFlareSystem {
  /**
    * Instantiates a lens flare system.
    * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
    * It is usually composed of several `lensFlare`.
    * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param name Define the name of the lens flare system in the scene
    * @param emitter Define the source (the emitter) of the lens flares (it can be a camera, a light or a mesh).
    * @param scene Define the scene the lens flare system belongs to
    */
  def this(
    /**
    * Define the name of the lens flare system
    */
  name: String,
    emitter: Any,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object LensFlareSystem {
  
  @JSImport("babylonjs", "LensFlareSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a lens flare system from a JSON representation
    * @param parsedLensFlareSystem Define the JSON to parse
    * @param scene Define the scene the parsed system should be instantiated in
    * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
    * @returns the parsed system
    */
  inline def Parse(parsedLensFlareSystem: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedLensFlareSystem.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typingsJapgolly.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
