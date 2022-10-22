package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An axis aligned rectangle. Used by anchors and offsets in ScreenTransform to represent screen boundaries. */
trait Rect
  extends StObject
     with ScriptObject {
  
  /** The y position of the rectangle’s bottom side. */
  var bottom: Double
  
  /** Returns the rectangle’s center position as (x, y). */
  def getCenter(): vec2
  
  /** Returns the size of the rectangle as (width, height). */
  def getSize(): vec2
  
  /** The x position of the rectangle’s left side. */
  var left: Double
  
  /** The x position of the rectangle’s right side. */
  var right: Double
  
  /** Sets the rectangle’s center position while maintaining its size. */
  def setCenter(value: vec2): Unit
  
  /** Sets the rectangle’s size while maintaining its center position. */
  def setSize(value: vec2): Unit
  
  /** The y position of the rectangle’s top side. */
  var top: Double
}
object Rect {
  
  inline def apply(
    bottom: Double,
    getCenter: CallbackTo[vec2],
    getSize: CallbackTo[vec2],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    left: Double,
    right: Double,
    setCenter: vec2 => Callback,
    setSize: vec2 => Callback,
    top: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], getCenter = getCenter.toJsFn, getSize = getSize.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setCenter = js.Any.fromFunction1((t0: vec2) => setCenter(t0).runNow()), setSize = js.Any.fromFunction1((t0: vec2) => setSize(t0).runNow()), top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setGetCenter(value: CallbackTo[vec2]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[vec2]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSetCenter(value: vec2 => Callback): Self = StObject.set(x, "setCenter", js.Any.fromFunction1((t0: vec2) => value(t0).runNow()))
    
    inline def setSetSize(value: vec2 => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: vec2) => value(t0).runNow()))
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
