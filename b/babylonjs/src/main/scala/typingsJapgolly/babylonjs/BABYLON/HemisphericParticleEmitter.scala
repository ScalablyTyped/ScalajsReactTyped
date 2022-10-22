package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HemisphericParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * The radius of the emission hemisphere.
    */
  var radius: Double
  
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  var radiusRange: Double
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object HemisphericParticleEmitter {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Callback,
    buildUniformLayout: UniformBuffer => Callback,
    directionRandomizer: Double,
    getClassName: CallbackTo[String],
    getEffectDefines: CallbackTo[String],
    parse: Any => Callback,
    radius: Double,
    radiusRange: Double,
    serialize: CallbackTo[Any],
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Callback,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Callback
  ): HemisphericParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => applyToShader(t0).runNow()), buildUniformLayout = js.Any.fromFunction1((t0: UniformBuffer) => buildUniformLayout(t0).runNow()), directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = getClassName.toJsFn, getEffectDefines = getEffectDefines.toJsFn, parse = js.Any.fromFunction1((t0: Any) => parse(t0).runNow()), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = serialize.toJsFn, startDirectionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startDirectionFunction(t0, t1, t2, t3)).runNow()), startPositionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startPositionFunction(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[HemisphericParticleEmitter]
  }
  
  extension [Self <: HemisphericParticleEmitter](x: Self) {
    
    inline def setDirectionRandomizer(value: Double): Self = StObject.set(x, "directionRandomizer", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusRange(value: Double): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean) => Callback): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
  }
}
