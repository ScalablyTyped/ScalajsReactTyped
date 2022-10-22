package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandlerEventPayload
import typingsJapgolly.reactTestRenderer.mod.ReactTestInstance
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptJestUtilsJestUtilsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/jestUtils/jestUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](componentOrGesture: GestureType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](
    componentOrGesture: GestureType,
    eventList: js.Array[Partial[GestureHandlerTestEvent[ExtractConfig[THandler]]]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any], eventList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](componentOrGesture: ReactTestInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](
    componentOrGesture: ReactTestInstance,
    eventList: js.Array[Partial[GestureHandlerTestEvent[ExtractConfig[THandler]]]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any], eventList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getByGestureTestId(testID: String): BaseGesture[
    ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByGestureTestId")(testID.asInstanceOf[js.Any]).asInstanceOf[BaseGesture[
    ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesTapGestureMod.TapGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesPanGestureMod.PanGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesLongPressGestureMod.LongPressGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesRotationGestureMod.RotationGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesPinchGestureMod.PinchGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesFlingGestureMod.FlingGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesForceTouchGestureMod.ForceTouchGesture
    - typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesNativeGestureMod.NativeGesture
  */
  trait AllGestures extends StObject
  
  type AllHandlers = TapGestureHandler | PanGestureHandler | LongPressGestureHandler | RotationGestureHandler | PinchGestureHandler | FlingGestureHandler | ForceTouchGestureHandler | NativeViewGestureHandler
  
  type ClassComponentConstructor[P] = Instantiable1[/* props */ P, Component[P & js.Object, js.Object]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestures/gesture.BaseGesture<infer TGesturePayload> ? TGesturePayload : T extends react-native-gesture-handler.react-native-gesture-handler/lib/typescript/jestUtils/jestUtils.ClassComponentConstructor<infer THandlerProps> ? react-native-gesture-handler.react-native-gesture-handler/lib/typescript/jestUtils/jestUtils.ExtractPayloadFromProps<THandlerProps> : std.Record<string, unknown>
    }}}
    */
  @js.native
  trait ExtractConfig[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.BaseGestureHandlerProps<infer TPayload> ? TPayload : never
    }}}
    */
  @js.native
  trait ExtractPayloadFromProps[T] extends StObject
  
  /* Inlined react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.GestureEvent<TEventPayload> | react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.HandlerStateChangeEvent<TEventPayload>['nativeEvent'] */
  type GestureHandlerTestEvent[TEventPayload /* <: Record[String, Any] */] = scala.Nothing
}
