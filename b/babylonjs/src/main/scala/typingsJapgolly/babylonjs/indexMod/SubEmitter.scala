package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SubEmitter")
@js.native
open class SubEmitter protected ()
  extends typingsJapgolly.babylonjs.particlesIndexMod.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem) = this()
}
/* static members */
object SubEmitter {
  
  @JSImport("babylonjs/index", "SubEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Parse(
    serializationObject: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String
  ): typingsJapgolly.babylonjs.particlesSubEmitterMod.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesSubEmitterMod.SubEmitter]
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  inline def Parse(serializationObject: Any, sceneOrEngine: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.particlesSubEmitterMod.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesSubEmitterMod.SubEmitter]
  
  inline def _ParseParticleSystem(
    system: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def _ParseParticleSystem(
    system: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  /**
    * @internal
    */
  inline def _ParseParticleSystem(system: Any, sceneOrEngine: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def _ParseParticleSystem(
    system: Any,
    sceneOrEngine: typingsJapgolly.babylonjs.sceneMod.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
}
