package typingsJapgolly.leafletRotate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  trait Map extends StObject {
    
    def getBearing(): Double
    
    def mapPanePointToRotatedPoint(point: Point): Point
    
    def rotatedPointToMapPanePoint(point: Point): Point
    
    def setBearing(theta: Double): Unit
  }
  object Map {
    
    inline def apply(
      getBearing: CallbackTo[Double],
      mapPanePointToRotatedPoint: Point => Point,
      rotatedPointToMapPanePoint: Point => Point,
      setBearing: Double => Callback
    ): Map = {
      val __obj = js.Dynamic.literal(getBearing = getBearing.toJsFn, mapPanePointToRotatedPoint = js.Any.fromFunction1(mapPanePointToRotatedPoint), rotatedPointToMapPanePoint = js.Any.fromFunction1(rotatedPointToMapPanePoint), setBearing = js.Any.fromFunction1((t0: Double) => setBearing(t0).runNow()))
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setGetBearing(value: CallbackTo[Double]): Self = StObject.set(x, "getBearing", value.toJsFn)
      
      inline def setMapPanePointToRotatedPoint(value: Point => Point): Self = StObject.set(x, "mapPanePointToRotatedPoint", js.Any.fromFunction1(value))
      
      inline def setRotatedPointToMapPanePoint(value: Point => Point): Self = StObject.set(x, "rotatedPointToMapPanePoint", js.Any.fromFunction1(value))
      
      inline def setSetBearing(value: Double => Callback): Self = StObject.set(x, "setBearing", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait MapOptions extends StObject {
    
    var bearing: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    var rotateControl: js.UndefOr[Boolean] = js.undefined
    
    var shiftKeyRotate: js.UndefOr[Boolean | String] = js.undefined
    
    var touchRotate: js.UndefOr[Boolean | String] = js.undefined
    
    var trackContainerMutation: js.UndefOr[Boolean] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    extension [Self <: MapOptions](x: Self) {
      
      inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
      
      inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateControl(value: Boolean): Self = StObject.set(x, "rotateControl", value.asInstanceOf[js.Any])
      
      inline def setRotateControlUndefined: Self = StObject.set(x, "rotateControl", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setShiftKeyRotate(value: Boolean | String): Self = StObject.set(x, "shiftKeyRotate", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyRotateUndefined: Self = StObject.set(x, "shiftKeyRotate", js.undefined)
      
      inline def setTouchRotate(value: Boolean | String): Self = StObject.set(x, "touchRotate", value.asInstanceOf[js.Any])
      
      inline def setTouchRotateUndefined: Self = StObject.set(x, "touchRotate", js.undefined)
      
      inline def setTrackContainerMutation(value: Boolean): Self = StObject.set(x, "trackContainerMutation", value.asInstanceOf[js.Any])
      
      inline def setTrackContainerMutationUndefined: Self = StObject.set(x, "trackContainerMutation", js.undefined)
    }
  }
  
  trait Marker extends StObject {
    
    def setRotation(rotation: Double): Unit
  }
  object Marker {
    
    inline def apply(setRotation: Double => Callback): Marker = {
      val __obj = js.Dynamic.literal(setRotation = js.Any.fromFunction1((t0: Double) => setRotation(t0).runNow()))
      __obj.asInstanceOf[Marker]
    }
    
    extension [Self <: Marker](x: Self) {
      
      inline def setSetRotation(value: Double => Callback): Self = StObject.set(x, "setRotation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait MarkerOptions extends StObject {
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
  }
  object MarkerOptions {
    
    inline def apply(): MarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerOptions]
    }
    
    extension [Self <: MarkerOptions](x: Self) {
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  trait Point extends StObject {
    
    def rotate(theta: Double): Point
    
    def rotateFrom(theta: Double, pivot: Point): Point
  }
  object Point {
    
    inline def apply(rotate: Double => Point, rotateFrom: (Double, Point) => Point): Point = {
      val __obj = js.Dynamic.literal(rotate = js.Any.fromFunction1(rotate), rotateFrom = js.Any.fromFunction2(rotateFrom))
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setRotate(value: Double => Point): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateFrom(value: (Double, Point) => Point): Self = StObject.set(x, "rotateFrom", js.Any.fromFunction2(value))
    }
  }
}
