package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trajectory extends StObject {
  
  /* private */ var _points: Any
  
  /* private */ val _segmentLength: Any
  
  /**
    * Append a new point to the Trajectory.
    * NOTE: This implementation has many allocations.
    * @param point point to append to the Trajectory
    */
  def add(point: DeepImmutable[Vector3]): Unit
  
  /**
    * Get the length of the Trajectory.
    * @returns length of the Trajectory
    */
  def getLength(): Double
  
  /**
    * Create a new Trajectory with a segment length chosen to make it
    * probable that the new Trajectory will have a specified number of
    * segments. This operation is imprecise.
    * @param targetResolution number of segments desired
    * @returns new Trajectory with approximately the requested number of segments
    */
  def resampleAtTargetResolution(targetResolution: Double): Trajectory
  
  /**
    * Serialize to JSON.
    * @returns serialized JSON string
    */
  def serialize(): String
  
  /**
    * Convert Trajectory segments into tokenized representation. This
    * representation is an array of numbers where each nth number is the
    * index of the token which is most similar to the nth segment of the
    * Trajectory.
    * @param tokens list of vectors which serve as discrete tokens
    * @returns list of indices of most similar token per segment
    */
  def tokenize(tokens: DeepImmutable[js.Array[Vector3]]): js.Array[Double]
}
object Trajectory {
  
  inline def apply(
    _points: Any,
    _segmentLength: Any,
    add: DeepImmutable[Vector3] => Callback,
    getLength: CallbackTo[Double],
    resampleAtTargetResolution: Double => Trajectory,
    serialize: CallbackTo[String],
    tokenize: DeepImmutable[js.Array[Vector3]] => js.Array[Double]
  ): Trajectory = {
    val __obj = js.Dynamic.literal(_points = _points.asInstanceOf[js.Any], _segmentLength = _segmentLength.asInstanceOf[js.Any], add = js.Any.fromFunction1((t0: DeepImmutable[Vector3]) => add(t0).runNow()), getLength = getLength.toJsFn, resampleAtTargetResolution = js.Any.fromFunction1(resampleAtTargetResolution), serialize = serialize.toJsFn, tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[Trajectory]
  }
  
  extension [Self <: Trajectory](x: Self) {
    
    inline def setAdd(value: DeepImmutable[Vector3] => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: DeepImmutable[Vector3]) => value(t0).runNow()))
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setResampleAtTargetResolution(value: Double => Trajectory): Self = StObject.set(x, "resampleAtTargetResolution", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: CallbackTo[String]): Self = StObject.set(x, "serialize", value.toJsFn)
    
    inline def setTokenize(value: DeepImmutable[js.Array[Vector3]] => js.Array[Double]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    
    inline def set_points(value: Any): Self = StObject.set(x, "_points", value.asInstanceOf[js.Any])
    
    inline def set_segmentLength(value: Any): Self = StObject.set(x, "_segmentLength", value.asInstanceOf[js.Any])
  }
}
