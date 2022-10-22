package typingsJapgolly.reactNativeWindows.rntypesMod.Animated

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactNativeWindows.anon.TypeofImage
import typingsJapgolly.reactNativeWindows.anon.Typeof_View
import typingsJapgolly.reactNativeWindows.anon.X
import typingsJapgolly.reactNativeWindows.rntypesMod.Animated.^
import typingsJapgolly.reactNativeWindows.rntypesMod._ScrollView
import typingsJapgolly.reactNativeWindows.rntypesMod._Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Image: AnimatedComponent[TypeofImage] = ^.asInstanceOf[js.Dynamic].selectDynamic("Image").asInstanceOf[AnimatedComponent[TypeofImage]]

inline def ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[AnimatedComponent[Instantiable0[_ScrollView]]]

inline def Text: AnimatedComponent[Instantiable0[_Text]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Text").asInstanceOf[AnimatedComponent[Instantiable0[_Text]]]

inline def View: AnimatedComponent[Typeof_View] = ^.asInstanceOf[js.Dynamic].selectDynamic("View").asInstanceOf[AnimatedComponent[Typeof_View]]

inline def add(
  a: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated,
  b: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated
): AnimatedAddition = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedAddition]

inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T): AnimatedComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[AnimatedComponent[T]]
inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T, options: AnimatedComponentOptions): AnimatedComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimatedComponent[T]]

inline def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
inline def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def delay(time: Double): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]

inline def diffClamp(a: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated, min: Double, max: Double): AnimatedDiffClamp = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[AnimatedDiffClamp]

inline def divide(
  a: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated,
  b: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated
): AnimatedDivision = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedDivision]

inline def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
inline def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]

inline def loop(animation: CompositeAnimation): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
inline def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def modulo(a: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated, modulus: Double): AnimatedModulo = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[AnimatedModulo]

inline def multiply(
  a: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated,
  b: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated
): AnimatedMultiplication = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedMultiplication]

inline def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
inline def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]

inline def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
inline def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def subtract(
  a: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated,
  b: typingsJapgolly.reactNativeWindows.rntypesMod.Animated.Animated
): AnimatedSubtraction = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedSubtraction]

inline def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
inline def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

type AnimatedComponent[T /* <: ComponentType[Any] */] = FC[AnimatedProps[ComponentPropsWithRef[T]]]

type AnimatedValue = Value

type AnimatedValueXY = ValueXY

type Builtin = js.Function | js.Date | js.Error | js.RegExp

type EndCallback = js.Function1[/* result */ EndResult, Unit]

type Mapping = StringDictionary[Any] | AnimatedValue

type Nullable = js.UndefOr[Null]

type Primitive = String | Double | Boolean | js.Symbol

type ValueListenerCallback = js.Function1[/* state */ typingsJapgolly.reactNativeWindows.anon.Value, Unit]

type ValueXYListenerCallback = js.Function1[/* value */ X, Unit]

type WithAnimatedArray[P] = js.Array[WithAnimatedValue[P]]
