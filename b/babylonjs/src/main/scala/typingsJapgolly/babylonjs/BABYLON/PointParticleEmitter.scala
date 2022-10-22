package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction1: Vector3
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction2: Vector3
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object PointParticleEmitter {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Callback,
    buildUniformLayout: UniformBuffer => Callback,
    direction1: Vector3,
    direction2: Vector3,
    getClassName: CallbackTo[String],
    getEffectDefines: CallbackTo[String],
    parse: Any => Callback,
    serialize: CallbackTo[Any],
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Callback,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Callback
  ): PointParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => applyToShader(t0).runNow()), buildUniformLayout = js.Any.fromFunction1((t0: UniformBuffer) => buildUniformLayout(t0).runNow()), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], getClassName = getClassName.toJsFn, getEffectDefines = getEffectDefines.toJsFn, parse = js.Any.fromFunction1((t0: Any) => parse(t0).runNow()), serialize = serialize.toJsFn, startDirectionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startDirectionFunction(t0, t1, t2, t3)).runNow()), startPositionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startPositionFunction(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[PointParticleEmitter]
  }
  
  extension [Self <: PointParticleEmitter](x: Self) {
    
    inline def setDirection1(value: Vector3): Self = StObject.set(x, "direction1", value.asInstanceOf[js.Any])
    
    inline def setDirection2(value: Vector3): Self = StObject.set(x, "direction2", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean) => Callback): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
  }
}
