package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointParticleEmitter")
@js.native
/**
  * Creates a new instance PointParticleEmitter
  */
open class PointParticleEmitter ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PointParticleEmitter {
  
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param uboOrEffect defines the update shader
    */
  /* CompleteClass */
  override def applyToShader(uboOrEffect: typingsJapgolly.babylonjs.BABYLON.UniformBufferEffectCommonAccessor): Unit = js.native
  
  /**
    * Creates the structure of the ubo for this particle emitter
    * @param ubo ubo to create the structure for
    */
  /* CompleteClass */
  override def buildUniformLayout(ubo: typingsJapgolly.babylonjs.BABYLON.UniformBuffer): Unit = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  /* CompleteClass */
  var direction1: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  /* CompleteClass */
  var direction2: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
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
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  /* CompleteClass */
  override def parse(serializationObject: Any): Unit = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  /* CompleteClass */
  override def parse(serializationObject: Any, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): Unit = js.native
  
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
  /* CompleteClass */
  override def startDirectionFunction(
    worldMatrix: typingsJapgolly.babylonjs.BABYLON.Matrix,
    directionToUpdate: typingsJapgolly.babylonjs.BABYLON.Vector3,
    particle: typingsJapgolly.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
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
    worldMatrix: typingsJapgolly.babylonjs.BABYLON.Matrix,
    directionToUpdate: typingsJapgolly.babylonjs.BABYLON.Vector3,
    particle: typingsJapgolly.babylonjs.BABYLON.Particle,
    isLocal: Boolean,
    inverseWorldMatrix: typingsJapgolly.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  /* CompleteClass */
  override def startPositionFunction(
    worldMatrix: typingsJapgolly.babylonjs.BABYLON.Matrix,
    positionToUpdate: typingsJapgolly.babylonjs.BABYLON.Vector3,
    particle: typingsJapgolly.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
}
