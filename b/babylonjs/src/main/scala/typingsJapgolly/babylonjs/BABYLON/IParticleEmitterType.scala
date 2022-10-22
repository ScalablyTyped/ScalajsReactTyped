package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParticleEmitterType extends StObject {
  
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param uboOrEffect defines the update shader
    */
  def applyToShader(uboOrEffect: UniformBufferEffectCommonAccessor): Unit
  
  /**
    * Creates the structure of the ubo for this particle emitter
    * @param ubo ubo to create the structure for
    */
  def buildUniformLayout(ubo: UniformBuffer): Unit
  
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  def getClassName(): String
  
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  def getEffectDefines(): String
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  def parse(serializationObject: Any, scene: Nullable[Scene]): Unit
  
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  def serialize(): Any
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    * @param inverseWorldMatrix defines the inverted world matrix to use if isLocal is false
    */
  def startDirectionFunction(
    worldMatrix: Matrix,
    directionToUpdate: Vector3,
    particle: Particle,
    isLocal: Boolean,
    inverseWorldMatrix: Matrix
  ): Unit
  
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object IParticleEmitterType {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Callback,
    buildUniformLayout: UniformBuffer => Callback,
    getClassName: CallbackTo[String],
    getEffectDefines: CallbackTo[String],
    parse: (Any, Nullable[Scene]) => Callback,
    serialize: CallbackTo[Any],
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean, Matrix) => Callback,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Callback
  ): IParticleEmitterType = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => applyToShader(t0).runNow()), buildUniformLayout = js.Any.fromFunction1((t0: UniformBuffer) => buildUniformLayout(t0).runNow()), getClassName = getClassName.toJsFn, getEffectDefines = getEffectDefines.toJsFn, parse = js.Any.fromFunction2((t0: Any, t1: Nullable[Scene]) => (parse(t0, t1)).runNow()), serialize = serialize.toJsFn, startDirectionFunction = js.Any.fromFunction5((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean, t4: Matrix) => (startDirectionFunction(t0, t1, t2, t3, t4)).runNow()), startPositionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startPositionFunction(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[IParticleEmitterType]
  }
  
  extension [Self <: IParticleEmitterType](x: Self) {
    
    inline def setApplyToShader(value: UniformBufferEffectCommonAccessor => Callback): Self = StObject.set(x, "applyToShader", js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => value(t0).runNow()))
    
    inline def setBuildUniformLayout(value: UniformBuffer => Callback): Self = StObject.set(x, "buildUniformLayout", js.Any.fromFunction1((t0: UniformBuffer) => value(t0).runNow()))
    
    inline def setGetClassName(value: CallbackTo[String]): Self = StObject.set(x, "getClassName", value.toJsFn)
    
    inline def setGetEffectDefines(value: CallbackTo[String]): Self = StObject.set(x, "getEffectDefines", value.toJsFn)
    
    inline def setParse(value: (Any, Nullable[Scene]) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction2((t0: Any, t1: Nullable[Scene]) => (value(t0, t1)).runNow()))
    
    inline def setSerialize(value: CallbackTo[Any]): Self = StObject.set(x, "serialize", value.toJsFn)
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean, Matrix) => Callback): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction5((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean, t4: Matrix) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setStartPositionFunction(value: (Matrix, Vector3, Particle, Boolean) => Callback): Self = StObject.set(x, "startPositionFunction", js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
  }
}
