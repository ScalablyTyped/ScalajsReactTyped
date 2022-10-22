package typingsJapgolly.emotionNative.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.anon.Typeof_View
import typingsJapgolly.reactNative.mod.Animated.Animated
import typingsJapgolly.reactNative.mod.Animated.AnimatedAddition
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponentOptions
import typingsJapgolly.reactNative.mod.Animated.AnimatedDiffClamp
import typingsJapgolly.reactNative.mod.Animated.AnimatedDivision
import typingsJapgolly.reactNative.mod.Animated.AnimatedModulo
import typingsJapgolly.reactNative.mod.Animated.AnimatedMultiplication
import typingsJapgolly.reactNative.mod.Animated.AnimatedSubtraction
import typingsJapgolly.reactNative.mod.Animated.AnimatedValue
import typingsJapgolly.reactNative.mod.Animated.AnimatedValueXY
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import typingsJapgolly.reactNative.mod.Animated.DecayAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.EventConfig
import typingsJapgolly.reactNative.mod.Animated.LoopAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.Mapping
import typingsJapgolly.reactNative.mod.Animated.ParallelConfig
import typingsJapgolly.reactNative.mod.Animated.SpringAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.TimingAnimationConfig
import typingsJapgolly.reactNative.mod._ScrollView
import typingsJapgolly.reactNative.mod._Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimated extends StObject {
  
  var Animated: Instantiable0[typingsJapgolly.reactNative.mod.Animated.Animated] = js.native
  
  var AnimatedAddition: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedAddition[Double | String]] = js.native
  
  var AnimatedColor: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedColor] = js.native
  
  var AnimatedDiffClamp: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedDiffClamp[Double | String]] = js.native
  
  var AnimatedDivision: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedDivision[Double | String]] = js.native
  
  var AnimatedInterpolation: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation[Double | String]] = js.native
  
  var AnimatedModulo: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedModulo[Double | String]] = js.native
  
  var AnimatedMultiplication: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedMultiplication[Double | String]] = js.native
  
  var AnimatedNode: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedNode] = js.native
  
  var AnimatedSubtraction: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedSubtraction[Double | String]] = js.native
  
  var AnimatedWithChildren: Instantiable0[typingsJapgolly.reactNative.mod.Animated.AnimatedWithChildren] = js.native
  
  var FlatList: Instantiable1[
    /* props */ ReadonlyAnimatedPropsFlat, 
    typingsJapgolly.reactNative.mod.Animated.FlatList[js.Object]
  ] = js.native
  
  val Image: AnimatedComponent[typingsJapgolly.reactNative.anon.TypeofImage] = js.native
  
  val ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = js.native
  
  var SectionList: Instantiable1[
    /* props */ ReadonlyAnimatedPropsSect, 
    typingsJapgolly.reactNative.mod.Animated.SectionList[js.Object, js.Object]
  ] = js.native
  
  val Text: AnimatedComponent[Instantiable0[_Text]] = js.native
  
  var Value: Instantiable1[/* value */ Double, typingsJapgolly.reactNative.mod.Animated.Value] = js.native
  
  var ValueXY: Instantiable0[typingsJapgolly.reactNative.mod.Animated.ValueXY] = js.native
  
  val View: AnimatedComponent[Typeof_View] = js.native
  
  def add[OutputT /* <: Double | String */](a: Animated, b: Animated): AnimatedAddition[OutputT] = js.native
  
  def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T): AnimatedComponent[T] = js.native
  def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T, options: AnimatedComponentOptions): AnimatedComponent[T] = js.native
  
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  
  def delay(time: Double): CompositeAnimation = js.native
  
  def diffClamp[OutputT /* <: Double | String */](a: Animated, min: Double, max: Double): AnimatedDiffClamp[OutputT] = js.native
  
  def divide[OutputT /* <: Double | String */](a: Animated, b: Animated): AnimatedDivision[OutputT] = js.native
  
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ Any, Unit] = js.native
  
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  
  def modulo[OutputT /* <: Double | String */](a: Animated, modulus: Double): AnimatedModulo[OutputT] = js.native
  
  def multiply[OutputT /* <: Double | String */](a: Animated, b: Animated): AnimatedMultiplication[OutputT] = js.native
  
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  
  def subtract[OutputT /* <: Double | String */](a: Animated, b: Animated): AnimatedSubtraction[OutputT] = js.native
  
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
}
