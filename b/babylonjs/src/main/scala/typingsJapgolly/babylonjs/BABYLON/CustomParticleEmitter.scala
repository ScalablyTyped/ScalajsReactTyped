package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * Gets or sets the destination generator that will create the final destination of each particle.
    *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particleDestinationGenerator(index: Double, particle: Nullable[Particle], outDestination: Vector3): Unit
  
  /**
    * Gets or sets the position generator that will create the initial position of each particle.
    * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particlePositionGenerator(index: Double, particle: Nullable[Particle], outPosition: Vector3): Unit
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object CustomParticleEmitter {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Callback,
    buildUniformLayout: UniformBuffer => Callback,
    getClassName: CallbackTo[String],
    getEffectDefines: CallbackTo[String],
    parse: Any => Callback,
    particleDestinationGenerator: (Double, Nullable[Particle], Vector3) => Callback,
    particlePositionGenerator: (Double, Nullable[Particle], Vector3) => Callback,
    serialize: CallbackTo[Any],
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Callback,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Callback
  ): CustomParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => applyToShader(t0).runNow()), buildUniformLayout = js.Any.fromFunction1((t0: UniformBuffer) => buildUniformLayout(t0).runNow()), getClassName = getClassName.toJsFn, getEffectDefines = getEffectDefines.toJsFn, parse = js.Any.fromFunction1((t0: Any) => parse(t0).runNow()), particleDestinationGenerator = js.Any.fromFunction3((t0: Double, t1: Nullable[Particle], t2: Vector3) => (particleDestinationGenerator(t0, t1, t2)).runNow()), particlePositionGenerator = js.Any.fromFunction3((t0: Double, t1: Nullable[Particle], t2: Vector3) => (particlePositionGenerator(t0, t1, t2)).runNow()), serialize = serialize.toJsFn, startDirectionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startDirectionFunction(t0, t1, t2, t3)).runNow()), startPositionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startPositionFunction(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[CustomParticleEmitter]
  }
  
  extension [Self <: CustomParticleEmitter](x: Self) {
    
    inline def setParse(value: Any => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setParticleDestinationGenerator(value: (Double, Nullable[Particle], Vector3) => Callback): Self = StObject.set(x, "particleDestinationGenerator", js.Any.fromFunction3((t0: Double, t1: Nullable[Particle], t2: Vector3) => (value(t0, t1, t2)).runNow()))
    
    inline def setParticlePositionGenerator(value: (Double, Nullable[Particle], Vector3) => Callback): Self = StObject.set(x, "particlePositionGenerator", js.Any.fromFunction3((t0: Double, t1: Nullable[Particle], t2: Vector3) => (value(t0, t1, t2)).runNow()))
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean) => Callback): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
  }
}
