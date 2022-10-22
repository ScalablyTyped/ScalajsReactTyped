package typingsJapgolly.babylonjs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.materialsEffectFallbacksMod.EffectFallbacks
import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.particlesIparticlesystemMod.IParticleSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesParticleSystemComponentMod {
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /**
        * Create an effect to use with particle systems.
        * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration, except if you pass
        * the particle system for which you want to create a custom effect in the last parameter
        * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
        * @param uniformsNames defines a list of attribute names
        * @param samplers defines an array of string used to represent textures
        * @param defines defines the string containing the defines to use to compile the shaders
        * @param fallbacks defines the list of potential fallbacks to use if shader compilation fails
        * @param onCompiled defines a function to call when the effect creation is successful
        * @param onError defines a function to call when the effect creation has failed
        * @param particleSystem the particle system you want to create the effect for
        * @returns the new Effect
        */
      def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: js.Function1[/* effect */ Effect, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: Unit,
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: Unit,
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: Unit,
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: Unit,
        onCompiled: Unit,
        onError: Unit,
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: Unit,
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: Unit,
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: Unit,
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: Unit,
        onError: Unit,
        particleSystem: IParticleSystem
      ): Effect = js.native
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    trait Mesh extends StObject {
      
      /**
        * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
        * @returns an array of IParticleSystem
        */
      def getEmittedParticleSystems(): js.Array[IParticleSystem]
      
      /**
        * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
        * @returns an array of IParticleSystem
        */
      def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem]
    }
    object Mesh {
      
      inline def apply(
        getEmittedParticleSystems: CallbackTo[js.Array[IParticleSystem]],
        getHierarchyEmittedParticleSystems: CallbackTo[js.Array[IParticleSystem]]
      ): Mesh = {
        val __obj = js.Dynamic.literal(getEmittedParticleSystems = getEmittedParticleSystems.toJsFn, getHierarchyEmittedParticleSystems = getHierarchyEmittedParticleSystems.toJsFn)
        __obj.asInstanceOf[Mesh]
      }
      
      extension [Self <: Mesh](x: Self) {
        
        inline def setGetEmittedParticleSystems(value: CallbackTo[js.Array[IParticleSystem]]): Self = StObject.set(x, "getEmittedParticleSystems", value.toJsFn)
        
        inline def setGetHierarchyEmittedParticleSystems(value: CallbackTo[js.Array[IParticleSystem]]): Self = StObject.set(x, "getHierarchyEmittedParticleSystems", value.toJsFn)
      }
    }
  }
}
