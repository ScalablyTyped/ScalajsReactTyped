package typingsJapgolly.reactNativeReanimated

import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AdapterWorkletFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.BasicWorkletFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NativeEvent
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Context
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedStyleMod.AnimatedStyleResult
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUtilsMod.Handlers
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUtilsMod.UseHandlerContext
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookHooksMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/Hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit]): MutableRefObject[default[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String]): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String], rebuild: Boolean): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: Unit, rebuild: Boolean): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  
  inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext]): UseHandlerContext[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[UseHandlerContext[TContext]]
  inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext], dependencies: DependencyList): UseHandlerContext[TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseHandlerContext[TContext]]
  
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
