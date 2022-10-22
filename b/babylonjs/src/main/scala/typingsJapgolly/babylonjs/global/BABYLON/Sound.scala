package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.ISoundOptions
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Sound")
@js.native
open class Sound protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Sound {
  /**
    * Create a sound and attach it to a scene
    * @param name Name of your sound
    * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams and AudioBuffers
    * @param scene defines the scene the sound belongs to
    * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
    * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
    */
  def this(name: String, urlOrArrayBuffer: Any) = this()
  def this(name: String, urlOrArrayBuffer: Any, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]) = this()
  def this(
    name: String,
    urlOrArrayBuffer: Any,
    scene: Unit,
    readyToPlayCallback: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    name: String,
    urlOrArrayBuffer: Any,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    readyToPlayCallback: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    name: String,
    urlOrArrayBuffer: Any,
    scene: Unit,
    readyToPlayCallback: Unit,
    options: ISoundOptions
  ) = this()
  def this(
    name: String,
    urlOrArrayBuffer: Any,
    scene: Unit,
    readyToPlayCallback: Nullable[js.Function0[Unit]],
    options: ISoundOptions
  ) = this()
  def this(
    name: String,
    urlOrArrayBuffer: Any,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    readyToPlayCallback: Unit,
    options: ISoundOptions
  ) = this()
  def this(
    name: String,
    urlOrArrayBuffer: Any,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    readyToPlayCallback: Nullable[js.Function0[Unit]],
    options: ISoundOptions
  ) = this()
}
/* static members */
object Sound {
  
  @JSGlobal("BABYLON.Sound")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a JSON representation of a sound to instantiate in a given scene
    * @param parsedSound Define the JSON representation of the sound (usually coming from the serialize method)
    * @param scene Define the scene the new parsed sound should be created in
    * @param rootUrl Define the rooturl of the load in case we need to fetch relative dependencies
    * @param sourceSound Define a sound place holder if do not need to instantiate a new one
    * @returns the newly parsed sound
    */
  inline def Parse(parsedSound: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.Sound = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSound.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Sound]
  inline def Parse(
    parsedSound: Any,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    rootUrl: String,
    sourceSound: typingsJapgolly.babylonjs.BABYLON.Sound
  ): typingsJapgolly.babylonjs.BABYLON.Sound = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSound.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sourceSound.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Sound]
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typingsJapgolly.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
