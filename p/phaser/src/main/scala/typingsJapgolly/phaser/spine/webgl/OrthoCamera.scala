package typingsJapgolly.phaser.spine.webgl

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrthoCamera extends StObject {
  
  var direction: Vector3
  
  var far: Double
  
  var inverseProjectionView: Matrix4
  
  var near: Double
  
  var position: Vector3
  
  var projection: Matrix4
  
  var projectionView: Matrix4
  
  def screenToWorld(screenCoords: Vector3, screenWidth: Double, screenHeight: Double): Vector3
  
  def setViewport(viewportWidth: Double, viewportHeight: Double): Unit
  
  /* private */ var tmp: Any
  
  var up: Vector3
  
  def update(): Unit
  
  var view: Matrix4
  
  var viewportHeight: Double
  
  var viewportWidth: Double
  
  var zoom: Double
}
object OrthoCamera {
  
  inline def apply(
    direction: Vector3,
    far: Double,
    inverseProjectionView: Matrix4,
    near: Double,
    position: Vector3,
    projection: Matrix4,
    projectionView: Matrix4,
    screenToWorld: (Vector3, Double, Double) => Vector3,
    setViewport: (Double, Double) => Callback,
    tmp: Any,
    up: Vector3,
    update: Callback,
    view: Matrix4,
    viewportHeight: Double,
    viewportWidth: Double,
    zoom: Double
  ): OrthoCamera = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], inverseProjectionView = inverseProjectionView.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], projectionView = projectionView.asInstanceOf[js.Any], screenToWorld = js.Any.fromFunction3(screenToWorld), setViewport = js.Any.fromFunction2((t0: Double, t1: Double) => (setViewport(t0, t1)).runNow()), tmp = tmp.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], update = update.toJsFn, view = view.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthoCamera]
  }
  
  extension [Self <: OrthoCamera](x: Self) {
    
    inline def setDirection(value: Vector3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setInverseProjectionView(value: Matrix4): Self = StObject.set(x, "inverseProjectionView", value.asInstanceOf[js.Any])
    
    inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: Matrix4): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionView(value: Matrix4): Self = StObject.set(x, "projectionView", value.asInstanceOf[js.Any])
    
    inline def setScreenToWorld(value: (Vector3, Double, Double) => Vector3): Self = StObject.set(x, "screenToWorld", js.Any.fromFunction3(value))
    
    inline def setSetViewport(value: (Double, Double) => Callback): Self = StObject.set(x, "setViewport", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setTmp(value: Any): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setView(value: Matrix4): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    
    inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
