package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubEmitter")
@js.native
open class SubEmitter protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typingsJapgolly.babylonjs.BABYLON.ParticleSystem) = this()
}
/* static members */
object SubEmitter {
  
  @JSGlobal("BABYLON.SubEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  inline def Parse(serializationObject: Any, sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.SubEmitter]
  inline def Parse(
    serializationObject: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    rootUrl: String
  ): typingsJapgolly.babylonjs.BABYLON.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.SubEmitter]
  
  /**
    * @internal
    */
  inline def _ParseParticleSystem(system: Any, sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ParticleSystem]
  inline def _ParseParticleSystem(
    system: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ParticleSystem]
  inline def _ParseParticleSystem(system: Any, sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.ThinEngine, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ParticleSystem]
  inline def _ParseParticleSystem(
    system: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ParticleSystem]
}
