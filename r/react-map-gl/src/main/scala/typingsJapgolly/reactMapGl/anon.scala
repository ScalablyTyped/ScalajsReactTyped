package typingsJapgolly.reactMapGl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactMapGl.mod.InteractiveState
import typingsJapgolly.reactMapGl.mod.MapState
import typingsJapgolly.reactMapGl.mod.MapStateProps
import typingsJapgolly.reactMapGl.mod.PositionInput
import typingsJapgolly.reactMapGl.mod.ViewportProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DeltaScaleX extends StObject {
    
    var deltaScaleX: js.UndefOr[Double] = js.undefined
    
    var deltaScaleY: js.UndefOr[Double] = js.undefined
  }
  object DeltaScaleX {
    
    inline def apply(): DeltaScaleX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeltaScaleX]
    }
    
    extension [Self <: DeltaScaleX](x: Self) {
      
      inline def setDeltaScaleX(value: Double): Self = StObject.set(x, "deltaScaleX", value.asInstanceOf[js.Any])
      
      inline def setDeltaScaleXUndefined: Self = StObject.set(x, "deltaScaleX", js.undefined)
      
      inline def setDeltaScaleY(value: Double): Self = StObject.set(x, "deltaScaleY", value.asInstanceOf[js.Any])
      
      inline def setDeltaScaleYUndefined: Self = StObject.set(x, "deltaScaleY", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxPitch extends StObject {
    
    var maxPitch: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minPitch: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
  }
  object MaxPitch {
    
    inline def apply(): MaxPitch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxPitch]
    }
    
    extension [Self <: MaxPitch](x: Self) {
      
      inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
      
      inline def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
      
      inline def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var status: Double
  }
  object Message {
    
    inline def apply(message: String, status: Double): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-map-gl.react-map-gl.MapState> */
  trait PartialMapState extends StObject {
    
    var constructor: js.UndefOr[js.Function1[/* props */ MapStateProps, Any]] = js.undefined
    
    var getInteractiveState: js.UndefOr[js.Function0[InteractiveState]] = js.undefined
    
    var getViewportProps: js.UndefOr[js.Function0[ViewportProps]] = js.undefined
    
    var pan: js.UndefOr[js.Function1[/* input */ PositionInputstartPosnumb, MapState]] = js.undefined
    
    var panEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
    
    var panStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
    
    var rotate: js.UndefOr[js.Function1[/* input */ DeltaScaleX, MapState]] = js.undefined
    
    var rotateEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
    
    var rotateStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
    
    var zoom: js.UndefOr[js.Function1[/* input */ PositionInputscalenumbers, MapState]] = js.undefined
    
    var zoomEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
    
    var zoomStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
  }
  object PartialMapState {
    
    inline def apply(): PartialMapState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMapState]
    }
    
    extension [Self <: PartialMapState](x: Self) {
      
      inline def setConstructor(value: /* props */ MapStateProps => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setGetInteractiveState(value: CallbackTo[InteractiveState]): Self = StObject.set(x, "getInteractiveState", value.toJsFn)
      
      inline def setGetInteractiveStateUndefined: Self = StObject.set(x, "getInteractiveState", js.undefined)
      
      inline def setGetViewportProps(value: CallbackTo[ViewportProps]): Self = StObject.set(x, "getViewportProps", value.toJsFn)
      
      inline def setGetViewportPropsUndefined: Self = StObject.set(x, "getViewportProps", js.undefined)
      
      inline def setPan(value: /* input */ PositionInputstartPosnumb => MapState): Self = StObject.set(x, "pan", js.Any.fromFunction1(value))
      
      inline def setPanEnd(value: CallbackTo[MapState]): Self = StObject.set(x, "panEnd", value.toJsFn)
      
      inline def setPanEndUndefined: Self = StObject.set(x, "panEnd", js.undefined)
      
      inline def setPanStart(value: /* input */ PositionInput => MapState): Self = StObject.set(x, "panStart", js.Any.fromFunction1(value))
      
      inline def setPanStartUndefined: Self = StObject.set(x, "panStart", js.undefined)
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setRotate(value: /* input */ DeltaScaleX => MapState): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateEnd(value: CallbackTo[MapState]): Self = StObject.set(x, "rotateEnd", value.toJsFn)
      
      inline def setRotateEndUndefined: Self = StObject.set(x, "rotateEnd", js.undefined)
      
      inline def setRotateStart(value: /* input */ PositionInput => MapState): Self = StObject.set(x, "rotateStart", js.Any.fromFunction1(value))
      
      inline def setRotateStartUndefined: Self = StObject.set(x, "rotateStart", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setZoom(value: /* input */ PositionInputscalenumbers => MapState): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      inline def setZoomEnd(value: CallbackTo[MapState]): Self = StObject.set(x, "zoomEnd", value.toJsFn)
      
      inline def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
      
      inline def setZoomStart(value: /* input */ PositionInput => MapState): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
      
      inline def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined react-map-gl.react-map-gl.PositionInput & {  scale :number,   startPos :[number, number] | undefined} */
  trait PositionInputscalenumbers extends StObject {
    
    var pos: js.Tuple2[Double, Double]
    
    var scale: Double
    
    var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object PositionInputscalenumbers {
    
    inline def apply(pos: js.Tuple2[Double, Double], scale: Double): PositionInputscalenumbers = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInputscalenumbers]
    }
    
    extension [Self <: PositionInputscalenumbers](x: Self) {
      
      inline def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStartPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      inline def setStartPosUndefined: Self = StObject.set(x, "startPos", js.undefined)
    }
  }
  
  /* Inlined react-map-gl.react-map-gl.PositionInput & {  startPos :[number, number] | undefined} */
  trait PositionInputstartPosnumb extends StObject {
    
    var pos: js.Tuple2[Double, Double]
    
    var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object PositionInputstartPosnumb {
    
    inline def apply(pos: js.Tuple2[Double, Double]): PositionInputstartPosnumb = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInputstartPosnumb]
    }
    
    extension [Self <: PositionInputstartPosnumb](x: Self) {
      
      inline def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setStartPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      inline def setStartPosUndefined: Self = StObject.set(x, "startPos", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
