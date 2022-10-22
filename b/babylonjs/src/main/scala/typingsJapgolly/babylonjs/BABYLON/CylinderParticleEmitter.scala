package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CylinderParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /* private */ var _tempVector: Any
  
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double
  
  /**
    * The height of the emission cylinder.
    */
  var height: Double
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * The radius of the emission cylinder.
    */
  var radius: Double
  
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  var radiusRange: Double
}
object CylinderParticleEmitter {
  
  inline def apply(
    _tempVector: Any,
    applyToShader: UniformBufferEffectCommonAccessor => Callback,
    buildUniformLayout: UniformBuffer => Callback,
    directionRandomizer: Double,
    getClassName: CallbackTo[String],
    getEffectDefines: CallbackTo[String],
    height: Double,
    parse: Any => Callback,
    radius: Double,
    radiusRange: Double,
    serialize: CallbackTo[Any],
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean, Matrix) => Callback,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Callback
  ): CylinderParticleEmitter = {
    val __obj = js.Dynamic.literal(_tempVector = _tempVector.asInstanceOf[js.Any], applyToShader = js.Any.fromFunction1((t0: UniformBufferEffectCommonAccessor) => applyToShader(t0).runNow()), buildUniformLayout = js.Any.fromFunction1((t0: UniformBuffer) => buildUniformLayout(t0).runNow()), directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = getClassName.toJsFn, getEffectDefines = getEffectDefines.toJsFn, height = height.asInstanceOf[js.Any], parse = js.Any.fromFunction1((t0: Any) => parse(t0).runNow()), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = serialize.toJsFn, startDirectionFunction = js.Any.fromFunction5((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean, t4: Matrix) => (startDirectionFunction(t0, t1, t2, t3, t4)).runNow()), startPositionFunction = js.Any.fromFunction4((t0: Matrix, t1: Vector3, t2: Particle, t3: Boolean) => (startPositionFunction(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[CylinderParticleEmitter]
  }
  
  extension [Self <: CylinderParticleEmitter](x: Self) {
    
    inline def setDirectionRandomizer(value: Double): Self = StObject.set(x, "directionRandomizer", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusRange(value: Double): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
    
    inline def set_tempVector(value: Any): Self = StObject.set(x, "_tempVector", value.asInstanceOf[js.Any])
  }
}
