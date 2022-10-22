package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.Callback
import typingsJapgolly.figma.figmaStrings.CENTER
import typingsJapgolly.figma.figmaStrings.MAX
import typingsJapgolly.figma.figmaStrings.MIN
import typingsJapgolly.figma.figmaStrings.STRETCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutMixin extends StObject {
  
  val absoluteTransform: Transform
  
  var constrainProportions: Boolean
  
  val height: Double
  
  var layoutAlign: MIN | CENTER | MAX | STRETCH
  
  var relativeTransform: Transform
  
  // applicable only inside auto-layout frames
  def resize(width: Double, height: Double): Unit
  
  def resizeWithoutConstraints(width: Double, height: Double): Unit
  
  var rotation: Double
  
  // In degrees
  val width: Double
  
  var x: Double
  
  var y: Double
}
object LayoutMixin {
  
  inline def apply(
    absoluteTransform: Transform,
    constrainProportions: Boolean,
    height: Double,
    layoutAlign: MIN | CENTER | MAX | STRETCH,
    relativeTransform: Transform,
    resize: (Double, Double) => Callback,
    resizeWithoutConstraints: (Double, Double) => Callback,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutMixin = {
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layoutAlign = layoutAlign.asInstanceOf[js.Any], relativeTransform = relativeTransform.asInstanceOf[js.Any], resize = js.Any.fromFunction2((t0: Double, t1: Double) => (resize(t0, t1)).runNow()), resizeWithoutConstraints = js.Any.fromFunction2((t0: Double, t1: Double) => (resizeWithoutConstraints(t0, t1)).runNow()), rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutMixin]
  }
  
  extension [Self <: LayoutMixin](x: Self) {
    
    inline def setAbsoluteTransform(value: Transform): Self = StObject.set(x, "absoluteTransform", value.asInstanceOf[js.Any])
    
    inline def setConstrainProportions(value: Boolean): Self = StObject.set(x, "constrainProportions", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayoutAlign(value: MIN | CENTER | MAX | STRETCH): Self = StObject.set(x, "layoutAlign", value.asInstanceOf[js.Any])
    
    inline def setRelativeTransform(value: Transform): Self = StObject.set(x, "relativeTransform", value.asInstanceOf[js.Any])
    
    inline def setResize(value: (Double, Double) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setResizeWithoutConstraints(value: (Double, Double) => Callback): Self = StObject.set(x, "resizeWithoutConstraints", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
