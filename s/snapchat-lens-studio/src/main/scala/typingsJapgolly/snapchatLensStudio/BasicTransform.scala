package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides basic information about a transformation. See also: DeviceTracking */
trait BasicTransform
  extends StObject
     with ScriptObject {
  
  /** Returns the inverted world matrix of the BasicTransform. */
  def getInvertedMatrix(): mat4
  
  /** Returns the world matrix of the BasicTransform. */
  def getMatrix(): mat4
  
  /** Returns the world position of the BasicTransform. */
  def getPosition(): vec3
  
  /** Returns the world rotation of the BasicTransform. */
  def getRotation(): quat
  
  /** Returns the world scale of the BasicTransform. */
  def getScale(): vec3
}
object BasicTransform {
  
  inline def apply(
    getInvertedMatrix: CallbackTo[mat4],
    getMatrix: CallbackTo[mat4],
    getPosition: CallbackTo[vec3],
    getRotation: CallbackTo[quat],
    getScale: CallbackTo[vec3],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): BasicTransform = {
    val __obj = js.Dynamic.literal(getInvertedMatrix = getInvertedMatrix.toJsFn, getMatrix = getMatrix.toJsFn, getPosition = getPosition.toJsFn, getRotation = getRotation.toJsFn, getScale = getScale.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[BasicTransform]
  }
  
  extension [Self <: BasicTransform](x: Self) {
    
    inline def setGetInvertedMatrix(value: CallbackTo[mat4]): Self = StObject.set(x, "getInvertedMatrix", value.toJsFn)
    
    inline def setGetMatrix(value: CallbackTo[mat4]): Self = StObject.set(x, "getMatrix", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[vec3]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetRotation(value: CallbackTo[quat]): Self = StObject.set(x, "getRotation", value.toJsFn)
    
    inline def setGetScale(value: CallbackTo[vec3]): Self = StObject.set(x, "getScale", value.toJsFn)
  }
}
