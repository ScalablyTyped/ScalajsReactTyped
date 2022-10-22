package typingsJapgolly.reactNativeMaps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNativeMaps.anon.ActionCoordinate
import typingsJapgolly.reactNativeMaps.anon.CoordinateId
import typingsJapgolly.reactNativeMaps.anon.CoordinatePosition
import typingsJapgolly.reactNativeMaps.anon.`2`
import typingsJapgolly.reactNativeMaps.anon.coordinateLatLngpositionP
import typingsJapgolly.reactNativeMaps.anon.coordinateLatLngpositionPAction
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSharedTypesMod {
  
  type CalloutPressEvent = NativeSyntheticEvent[typingsJapgolly.reactNativeMaps.anon.Point]
  
  type ClickEvent[T] = NativeSyntheticEvent[CoordinatePosition & T]
  
  trait Frame
    extends StObject
       with Point {
    
    var height: Double
    
    var width: Double
  }
  object Frame {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Frame = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait LatLng extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object LatLng {
    
    inline def apply(latitude: Double, longitude: Double): LatLng = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatLng]
    }
    
    extension [Self <: LatLng](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.butt
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.round
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.square
  */
  trait LineCapType extends StObject
  object LineCapType {
    
    inline def butt: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.butt = "butt".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.butt]
    
    inline def round: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.round = "round".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.round]
    
    inline def square: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.square = "square".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.miter
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.round
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.bevel
  */
  trait LineJoinType extends StObject
  object LineJoinType {
    
    inline def bevel: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.bevel = "bevel".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.bevel]
    
    inline def miter: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.miter = "miter".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.miter]
    
    inline def round: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.round = "round".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.round]
  }
  
  /* Inlined std.Omit<react-native-maps.react-native-maps/lib/sharedTypes.ClickEvent<{  action :'marker-deselect',   id :string}>, 'position'> */
  trait MarkerDeselectEvent extends StObject {
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: NodeHandle
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    var isDefaultPrevented: js.Function0[Boolean]
    
    var isPropagationStopped: js.Function0[Boolean]
    
    var isTrusted: Boolean
    
    var nativeEvent: coordinateLatLngpositionP
    
    var persist: js.Function0[Unit]
    
    var preventDefault: js.Function0[Unit]
    
    var stopPropagation: js.Function0[Unit]
    
    var target: NodeHandle
    
    var timeStamp: Double
    
    var `type`: String
  }
  object MarkerDeselectEvent {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: NodeHandle,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      nativeEvent: coordinateLatLngpositionP,
      persist: Callback,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: NodeHandle,
      timeStamp: Double,
      `type`: String
    ): MarkerDeselectEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerDeselectEvent]
    }
    
    extension [Self <: MarkerDeselectEvent](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: NodeHandle): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
      
      inline def setIsPropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPropagationStopped", value.toJsFn)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: coordinateLatLngpositionP): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: Callback): Self = StObject.set(x, "persist", value.toJsFn)
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: NodeHandle): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerDragEvent = ClickEvent[`2`]
  
  type MarkerDragStartEndEvent = NativeSyntheticEvent[CoordinateId]
  
  type MarkerPressEvent = NativeSyntheticEvent[ActionCoordinate]
  
  /* Inlined std.Omit<react-native-maps.react-native-maps/lib/sharedTypes.ClickEvent<{  id :string,   action :'marker-select'}>, 'position'> */
  trait MarkerSelectEvent extends StObject {
    
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: NodeHandle
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    var isDefaultPrevented: js.Function0[Boolean]
    
    var isPropagationStopped: js.Function0[Boolean]
    
    var isTrusted: Boolean
    
    var nativeEvent: coordinateLatLngpositionPAction
    
    var persist: js.Function0[Unit]
    
    var preventDefault: js.Function0[Unit]
    
    var stopPropagation: js.Function0[Unit]
    
    var target: NodeHandle
    
    var timeStamp: Double
    
    var `type`: String
  }
  object MarkerSelectEvent {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: NodeHandle,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      nativeEvent: coordinateLatLngpositionPAction,
      persist: Callback,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: NodeHandle,
      timeStamp: Double,
      `type`: String
    ): MarkerSelectEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerSelectEvent]
    }
    
    extension [Self <: MarkerSelectEvent](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: NodeHandle): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
      
      inline def setIsPropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPropagationStopped", value.toJsFn)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNativeEvent(value: coordinateLatLngpositionPAction): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: Callback): Self = StObject.set(x, "persist", value.toJsFn)
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: NodeHandle): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Provider = js.UndefOr[google]
  
  trait Region
    extends StObject
       with LatLng {
    
    var latitudeDelta: Double
    
    var longitudeDelta: Double
  }
  object Region {
    
    inline def apply(latitude: Double, latitudeDelta: Double, longitude: Double, longitudeDelta: Double): Region = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    extension [Self <: Region](x: Self) {
      
      inline def setLatitudeDelta(value: Double): Self = StObject.set(x, "latitudeDelta", value.asInstanceOf[js.Any])
      
      inline def setLongitudeDelta(value: Double): Self = StObject.set(x, "longitudeDelta", value.asInstanceOf[js.Any])
    }
  }
}
