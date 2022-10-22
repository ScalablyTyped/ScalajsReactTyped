package typingsJapgolly.babylonjs.particlesIndexMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.particlesIparticlesystemMod.IParticleSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
