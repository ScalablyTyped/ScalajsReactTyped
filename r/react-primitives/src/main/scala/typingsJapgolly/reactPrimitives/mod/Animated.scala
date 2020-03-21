package typingsJapgolly.reactPrimitives.mod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.AnonY
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedValue
import typingsJapgolly.reactNative.mod.Animated.AnimatedValueXY
import typingsJapgolly.reactNative.mod.Animated.ComponentProps
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import typingsJapgolly.reactNative.mod.Animated.DecayAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.EventConfig
import typingsJapgolly.reactNative.mod.Animated.LoopAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.Mapping
import typingsJapgolly.reactNative.mod.Animated.ParallelConfig
import typingsJapgolly.reactNative.mod.Animated.SpringAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.TimingAnimationConfig
import typingsJapgolly.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "Animated")
@js.native
object Animated extends js.Object {
  @js.native
  class Animated ()
    extends typingsJapgolly.reactNative.mod.Animated.Animated
  
  @js.native
  class AnimatedAddition ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDiffClamp ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDivision ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedInterpolation ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedModulo ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedMultiplication ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedSubtraction ()
    extends typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedWithChildren ()
    extends typingsJapgolly.reactNative.mod.Animated.Animated
  
  @js.native
  class Value protected ()
    extends typingsJapgolly.reactNative.mod.Animated.Value {
    def this(value: Double) = this()
  }
  
  @js.native
  class ValueXY ()
    extends typingsJapgolly.reactNative.mod.Animated.ValueXY {
    def this(valueIn: AnonY) = this()
  }
  
  val FlatList: AnimatedComponent[typingsJapgolly.reactNative.mod.FlatList[js.Any]] = js.native
  val Image: AnimatedComponent[typingsJapgolly.reactNative.mod.Image] = js.native
  val ScrollView: AnimatedComponent[typingsJapgolly.reactNative.mod.ScrollView] = js.native
  val SectionList: AnimatedComponent[typingsJapgolly.reactNative.mod.SectionList[js.Any]] = js.native
  val Text: AnimatedComponent[typingsJapgolly.reactNative.mod.Text] = js.native
  val View: AnimatedComponent[typingsJapgolly.reactNative.mod.View] = js.native
  def add(
    a: typingsJapgolly.reactNative.mod.Animated.Animated,
    b: typingsJapgolly.reactNative.mod.Animated.Animated
  ): typingsJapgolly.reactNative.mod.Animated.AnimatedAddition = js.native
  def createAnimatedComponent(component: ComponentClass[ComponentProps[_], ComponentState]): AnimatedComponent[
    (ComponentClassP[ComponentProps[_] with js.Object]) | (InstanceType[ComponentClassP[ComponentProps[_] with js.Object]])
  ] = js.native
  def createAnimatedComponent(component: FunctionComponent[ComponentProps[_]]): AnimatedComponent[
    FunctionComponent[ComponentProps[_]] | InstanceType[FunctionComponent[ComponentProps[_]]]
  ] = js.native
  def createAnimatedComponent[T /* <: Component[ComponentProps[T] with js.Object, js.Object] */](component: T): AnimatedComponent[T | InstanceType[T]] = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: Double): CompositeAnimation = js.native
  def diffClamp(a: typingsJapgolly.reactNative.mod.Animated.Animated, min: Double, max: Double): typingsJapgolly.reactNative.mod.Animated.AnimatedDiffClamp = js.native
  def divide(
    a: typingsJapgolly.reactNative.mod.Animated.Animated,
    b: typingsJapgolly.reactNative.mod.Animated.Animated
  ): typingsJapgolly.reactNative.mod.Animated.AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: typingsJapgolly.reactNative.mod.Animated.Animated, modulus: Double): typingsJapgolly.reactNative.mod.Animated.AnimatedModulo = js.native
  def multiply(
    a: typingsJapgolly.reactNative.mod.Animated.Animated,
    b: typingsJapgolly.reactNative.mod.Animated.Animated
  ): typingsJapgolly.reactNative.mod.Animated.AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(
    a: typingsJapgolly.reactNative.mod.Animated.Animated,
    b: typingsJapgolly.reactNative.mod.Animated.Animated
  ): typingsJapgolly.reactNative.mod.Animated.AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
}

