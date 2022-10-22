package typingsJapgolly.babylonjs.particlesIndexMod

import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "ParticleSystem")
@js.native
open class ParticleSystem protected ()
  extends typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem {
  def this(name: String, capacity: Double, sceneOrEngine: ThinEngine) = this()
  /**
    * Instantiates a particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param capacity The max number of particles alive at the same time
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param customEffect a custom effect used to change the way particles are rendered by default
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param epsilon Offset used to render the particles
    */
  def this(name: String, capacity: Double, sceneOrEngine: Scene) = this()
  def this(name: String, capacity: Double, sceneOrEngine: ThinEngine, customEffect: Nullable[Effect]) = this()
  def this(name: String, capacity: Double, sceneOrEngine: Scene, customEffect: Nullable[Effect]) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: Nullable[Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
}
/* static members */
object ParticleSystem {
  
  @JSImport("babylonjs/Particles/index", "ParticleSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Billboard mode will apply to all axes
    */
  @JSImport("babylonjs/Particles/index", "ParticleSystem.BILLBOARDMODE_ALL")
  @js.native
  val BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  @JSImport("babylonjs/Particles/index", "ParticleSystem.BILLBOARDMODE_STRETCHED")
  @js.native
  val BILLBOARDMODE_STRETCHED: Double = js.native
  
  /**
    * Billboard mode will only apply to Y axis
    */
  @JSImport("babylonjs/Particles/index", "ParticleSystem.BILLBOARDMODE_Y")
  @js.native
  val BILLBOARDMODE_Y: Double = js.native
  
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: ThinEngine, rootUrl: String): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: ThinEngine,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: ThinEngine,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns the Parsed particle system
    */
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: Scene, rootUrl: String): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: Scene,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: Scene,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem]
  
  /**
    * @internal
    */
  inline def _GetAttributeNamesOrOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")().asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * @internal
    */
  inline def _GetEffectCreationOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")().asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Unit, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def _Parse(
    parsedParticleSystem: Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: ThinEngine,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @internal
    */
  inline def _Parse(parsedParticleSystem: Any, particleSystem: IParticleSystem, sceneOrEngine: Scene, rootUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _Serialize(serializationObject: Any, particleSystem: IParticleSystem, serializeTexture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Serialize")(serializationObject.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], serializeTexture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
