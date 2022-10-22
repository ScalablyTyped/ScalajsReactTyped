package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.ComplexWorkletFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2CoreMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPluginState(throwError: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPluginState")(throwError.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def configureProps(uiProps: js.Array[String], nativeProps: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureProps")(uiProps.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLayoutAnimations(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableLayoutAnimations(flag: Boolean, isCallByUser: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any], isCallByUser.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTimestamp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimestamp")().asInstanceOf[Double]
  
  inline def getViewProp[T](viewTag: String, propName: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewProp")(viewTag.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def isConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigured")().asInstanceOf[Boolean]
  inline def isConfigured(throwError: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigured")(throwError.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConfiguredCheck(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfiguredCheck")().asInstanceOf[Unit]
  
  inline def jestResetJsReanimatedModule(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jestResetJsReanimatedModule")().asInstanceOf[Unit]
  
  inline def makeMutable[T](value: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMutable")(value.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]
  
  inline def makeRemote[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")().asInstanceOf[T]
  inline def makeRemote[T](`object`: js.Object): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def makeShareable[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeShareable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def requestFrame(frame: js.Function1[/* timestamp */ Timestamp, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runOnJS[A /* <: js.Array[Any] */, R](fun: RunOnJSFunction[A, R]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnJS")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def runOnUI[A /* <: js.Array[Any] */, R](worklet: ComplexWorkletFunction[A, R]): js.Function1[/* args */ A, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnUI")(worklet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ A, Unit]]
  
  inline def startMapper(mapper: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any], outputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: js.Function0[Unit]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any], outputs: Unit, updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: js.Array[Any], updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: Unit, updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stopMapper(mapperId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopMapper")(mapperId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Inlined std.Pick<std.Console, 'debug' | 'log' | 'warn' | 'info' | 'error'> */
  trait ReanimatedConsole extends StObject {
    
    var debug: js.Function1[/* repeated */ Any, Unit]
    
    var error: js.Function1[/* repeated */ Any, Unit]
    
    var info: js.Function1[/* repeated */ Any, Unit]
    
    var log: js.Function1[/* repeated */ Any, Unit]
    
    var warn: js.Function1[/* repeated */ Any, Unit]
  }
  object ReanimatedConsole {
    
    inline def apply(
      debug: /* repeated */ Any => Callback,
      error: /* repeated */ Any => Callback,
      info: /* repeated */ Any => Callback,
      log: /* repeated */ Any => Callback,
      warn: /* repeated */ Any => Callback
    ): ReanimatedConsole = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[ReanimatedConsole]
    }
    
    extension [Self <: ReanimatedConsole](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait RunOnJSFunction[A /* <: js.Array[Any] */, R] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): R = js.native
    
    var __callAsync: js.UndefOr[js.Function1[/* args */ A, Unit]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Function0[
  typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject]
    - typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
    - typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
    - typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor
  */
  type WorkletValue = _WorkletValue | js.Function0[AnimationObject] | AnimatableValue
  
  trait _WorkletValue extends StObject
  object _WorkletValue {
    
    inline def AnimationObject(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Callback,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (Any, Any, Timestamp, Any) => Callback
    ): typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* finished */ js.UndefOr[Boolean], t1: /* current */ js.UndefOr[AnimatableValue]) => (callback(t0, t1)).runNow()), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4((t0: Any, t1: Any, t2: Timestamp, t3: Any) => (onStart(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject]
    }
    
    inline def Descriptor(name: String, tag: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor]
    }
  }
}
