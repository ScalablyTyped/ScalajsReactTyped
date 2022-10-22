package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AdapterWorkletFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedKeyboardInfo
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.BasicWorkletFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NativeEvent
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2FrameCallbackFrameCallbackRegistryUIMod.FrameInfo
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Context
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.RefObjectFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.GestureHandlerEvent
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.GestureHandlers
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedReactionMod.AnimatedReactionWorkletFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedScrollHandlerMod.ScrollEvent
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedScrollHandlerMod.ScrollHandler
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedScrollHandlerMod.ScrollHandlers
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.AnimatedSensor
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorConfig
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedStyleMod.AnimatedStyleResult
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseDerivedValueMod.DerivedValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseFrameCallbackMod.FrameCallback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUtilsMod.Handlers
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUtilsMod.UseHandlerContext
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default
import typingsJapgolly.reactNativeReanimated.mod.Animated.ScrollView
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook", "SensorType")
  @js.native
  object SensorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType & Double
      ] = js.native
    
    /* 1 */ val ACCELEROMETER: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.ACCELEROMETER & Double = js.native
    
    /* 3 */ val GRAVITY: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.GRAVITY & Double = js.native
    
    /* 2 */ val GYROSCOPE: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.GYROSCOPE & Double = js.native
    
    /* 4 */ val MAGNETIC_FIELD: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.MAGNETIC_FIELD & Double = js.native
    
    /* 5 */ val ROTATION: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.ROTATION & Double = js.native
  }
  
  inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext]): (MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[(MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit])]
  inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext], dependencies: DependencyList): (MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[(MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit])]
  
  inline def useAnimatedKeyboard(): AnimatedKeyboardInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedKeyboard")().asInstanceOf[AnimatedKeyboardInfo]
  
  inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T]): AnimatedStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any]).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: js.Array[AdapterWorkletFunction]): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedProps[T /* <: AnimatedStyle */](
    updater: BasicWorkletFunction[T],
    dependencies: DependencyList,
    adapters: js.Array[AdapterWorkletFunction]
  ): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  
  inline def useAnimatedReaction[T](
    prepare: BasicWorkletFunction[T],
    react: AnimatedReactionWorkletFunction[T],
    dependencies: DependencyList
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedReaction")(prepare.asInstanceOf[js.Any], react.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAnimatedRef[T /* <: Component[js.Object, js.Object] */](): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedRef")().asInstanceOf[RefObjectFunction[T]]
  
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext]): RefHandle[default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefHandle[default[ScrollEvent]]]
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext], dependencies: DependencyList): RefHandle[default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefHandle[default[ScrollEvent]]]
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext]): RefHandle[default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefHandle[default[ScrollEvent]]]
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext], dependencies: DependencyList): RefHandle[default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefHandle[default[ScrollEvent]]]
  
  inline def useAnimatedSensor(sensorType: SensorType): AnimatedSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor]
  inline def useAnimatedSensor(sensorType: SensorType, userConfig: SensorConfig): AnimatedSensor = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor]
  
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T]): AnimatedStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any]).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: js.Array[AdapterWorkletFunction]): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](
    updater: BasicWorkletFunction[T],
    dependencies: DependencyList,
    adapters: js.Array[AdapterWorkletFunction]
  ): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  
  inline def useDerivedValue[T](processor: BasicWorkletFunction[T], dependencies: DependencyList): DerivedValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDerivedValue")(processor.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[DerivedValue[T]]
  
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit]): MutableRefObject[default[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String]): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String], rebuild: Boolean): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: Unit, rebuild: Boolean): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  
  inline def useFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit]): FrameCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[FrameCallback]
  inline def useFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit], autostart: Boolean): FrameCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any], autostart.asInstanceOf[js.Any])).asInstanceOf[FrameCallback]
  
  inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext]): UseHandlerContext[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[UseHandlerContext[TContext]]
  inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext], dependencies: DependencyList): UseHandlerContext[TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseHandlerContext[TContext]]
  
  inline def useScrollViewOffset(aref: RefHandle[ScrollView]): SharedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollViewOffset")(aref.asInstanceOf[js.Any]).asInstanceOf[SharedValue[Double]]
  
  inline def useSharedValue[T](init: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedValue")(init.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]
  
  inline def useWorkletCallback[A /* <: js.Array[Any] */, R](fun: js.Function1[/* args */ A, R]): js.Function1[
    /* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
    R
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWorkletCallback")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
    R
  ]]
  inline def useWorkletCallback[A /* <: js.Array[Any] */, R](fun: js.Function1[/* args */ A, R], deps: DependencyList): js.Function1[
    /* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
    R
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWorkletCallback")(fun.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
    R
  ]]
}
