package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsUniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typingsJapgolly.babylonjs.materialsUniformBufferMod.UniformBuffer
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.particlesEmitterTypesIparticleemittertypeMod.IParticleEmitterType
import typingsJapgolly.babylonjs.particlesParticleMod.Particle
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesEmitterTypesMeshParticleEmitterMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/meshParticleEmitter", "MeshParticleEmitter")
  @js.native
  /**
    * Creates a new instance MeshParticleEmitter
    * @param mesh defines the mesh to use as source
    */
  open class MeshParticleEmitter ()
    extends StObject
       with IParticleEmitterType {
    def this(mesh: Nullable[AbstractMesh]) = this()
    
    /* private */ var _indices: Any = js.native
    
    /* private */ var _mesh: Any = js.native
    
    /* private */ var _normals: Any = js.native
    
    /* private */ var _positions: Any = js.native
    
    /* private */ var _storedNormal: Any = js.native
    
    /**
      * Called by the GPUParticleSystem to setup the update shader
      * @param uboOrEffect defines the update shader
      */
    /* CompleteClass */
    override def applyToShader(uboOrEffect: UniformBufferEffectCommonAccessor): Unit = js.native
    
    /**
      * Creates the structure of the ubo for this particle emitter
      * @param ubo ubo to create the structure for
      */
    /* CompleteClass */
    override def buildUniformLayout(ubo: UniformBuffer): Unit = js.native
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction1: Vector3 = js.native
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction2: Vector3 = js.native
    
    /**
      * Returns a string representing the class name
      * @returns a string containing the class name
      */
    /* CompleteClass */
    override def getClassName(): String = js.native
    
    /**
      * Returns a string to use to update the GPU particles update shader
      * @returns the effect defines string
      */
    /* CompleteClass */
    override def getEffectDefines(): String = js.native
    
    /** Defines the mesh to use as source */
    def mesh: Nullable[AbstractMesh] = js.native
    def mesh_=(value: Nullable[AbstractMesh]): Unit = js.native
    
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      * @param scene defines the hosting scene
      */
    /* CompleteClass */
    override def parse(serializationObject: Any, scene: Nullable[Scene]): Unit = js.native
    
    /**
      * Serializes the particle system to a JSON object.
      * @returns the JSON object
      */
    /* CompleteClass */
    override def serialize(): Any = js.native
    
    /**
      * Called by the particle System when the direction is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param directionToUpdate is the direction vector to update with the result
      * @param particle is the particle we are computed the direction for
      * @param isLocal defines if the direction should be set in local space
      */
    def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
    /**
      * Called by the particle System when the direction is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param directionToUpdate is the direction vector to update with the result
      * @param particle is the particle we are computed the direction for
      * @param isLocal defines if the direction should be set in local space
      * @param inverseWorldMatrix defines the inverted world matrix to use if isLocal is false
      */
    /* CompleteClass */
    override def startDirectionFunction(
      worldMatrix: Matrix,
      directionToUpdate: Vector3,
      particle: Particle,
      isLocal: Boolean,
      inverseWorldMatrix: Matrix
    ): Unit = js.native
    
    /**
      * Called by the particle System when the position is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param positionToUpdate is the position vector to update with the result
      * @param particle is the particle we are computed the position for
      * @param isLocal defines if the position should be set in local space
      */
    /* CompleteClass */
    override def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that particle directions must be built from mesh face normals
      */
    var useMeshNormalsForDirection: Boolean = js.native
  }
}
