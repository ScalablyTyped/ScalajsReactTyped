package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CylinderDirectedParticleEmitter
  extends StObject
     with CylinderParticleEmitter {
  
  /**
    * The min limit of the emission direction.
    */
  var direction1: Vector3
  
  /**
    * The max limit of the emission direction.
    */
  var direction2: Vector3
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3): Unit
}
object CylinderDirectedParticleEmitter {
  
  inline def apply(
    _tempVector: Any,
    applyToShader: UniformBufferEffectCommonAccessor => Callback,
    buildUniformLayout: UniformBuffer => Callback,
    direction1: Vector3,
    direction2: Vector3,
    directionRandomizer: Double,
    getClassName: CallbackTo[String],
    getEffectDefines: CallbackTo[String],
    height: Double,
    parse: Any => Callback,
    radius: Double,
    radiusRange: Double,
    serialize: CallbackTo[Any],
    startDirectionFunction: (Matrix, Vector3) => Callback,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Callback
  ): CylinderDirectedParticleEmitter = {
    val __obj = js.Dynamic.literal(_tempVector = _tempVector.asInstanceOf[js.Any], applyToShader = js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => applyToShader(t0).runNow()), buildUniformLayout = js.Any.fromFunction1((t0: UniformBuffer) => buildUniformLayout(t0).runNow()), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = getClassName.toJsFn, getEffectDefines = getEffectDefines.toJsFn, height = height.asInstanceOf[js.Any], parse = js.Any.fromFunction1((t0: Any) => parse(t0).runNow()), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = serialize.toJsFn, startDirectionFunction = js.Any.fromFunction2((t0: Matrix, t1: Vector3) => (startDirectionFunction(t0, t1)).runNow()), startPositionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startPositionFunction(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[CylinderDirectedParticleEmitter]
  }
  
  extension [Self <: CylinderDirectedParticleEmitter](x: Self) {
    
    inline def setDirection1(value: Vector3): Self = StObject.set(x, "direction1", value.asInstanceOf[js.Any])
    
    inline def setDirection2(value: Vector3): Self = StObject.set(x, "direction2", value.asInstanceOf[js.Any])
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3) => Callback): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction2((t0: Matrix, t1: Vector3) => (value(t0, t1)).runNow()))
  }
}
