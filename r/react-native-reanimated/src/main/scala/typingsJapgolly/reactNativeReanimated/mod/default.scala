package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeReanimated.anon.InputRange
import typingsJapgolly.reactNativeReanimated.mod.Animated.BackwardCompatibleWrapper
import typingsJapgolly.reactNativeReanimated.mod.Animated.BinaryOperator
import typingsJapgolly.reactNativeReanimated.mod.Animated.CodeProps
import typingsJapgolly.reactNativeReanimated.mod.Animated.DecayConfig
import typingsJapgolly.reactNativeReanimated.mod.Animated.DecayState
import typingsJapgolly.reactNativeReanimated.mod.Animated.InterpolationConfig
import typingsJapgolly.reactNativeReanimated.mod.Animated.MultiOperator
import typingsJapgolly.reactNativeReanimated.mod.Animated.Nullable
import typingsJapgolly.reactNativeReanimated.mod.Animated.Options
import typingsJapgolly.reactNativeReanimated.mod.Animated.SpringConfig
import typingsJapgolly.reactNativeReanimated.mod.Animated.SpringState
import typingsJapgolly.reactNativeReanimated.mod.Animated.TimingConfig
import typingsJapgolly.reactNativeReanimated.mod.Animated.TimingState
import typingsJapgolly.reactNativeReanimated.mod.Animated.UnaryOperator
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedBooleans.`true`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedInts.`0`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("react-native-reanimated", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated", "default.AnimatedClock")
  @js.native
  open class AnimatedClock ()
    extends StObject
       with typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] {
    
    /**
      * ' __value' is not available at runtime on AnimatedNode<T>. It is
      * necessary to have some discriminating property on a type to know that
      * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
      */
    /* CompleteClass */
    @JSName(" __value")
    var Space__value: Double = js.native
    
    /* CompleteClass */
    override def isNativelyInitialized(): Boolean = js.native
  }
  
  @JSImport("react-native-reanimated", "default.AnimatedNode")
  @js.native
  open class AnimatedNode[T] protected ()
    extends StObject
       with typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T] {
    def this(nodeConfig: js.Object) = this()
    def this(
      nodeConfig: js.Object,
      inputNodes: js.Array[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Any]]
    ) = this()
    
    /**
      * ' __value' is not available at runtime on AnimatedNode<T>. It is
      * necessary to have some discriminating property on a type to know that
      * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
      */
    /* CompleteClass */
    @JSName(" __value")
    var Space__value: T = js.native
    
    /* CompleteClass */
    override def isNativelyInitialized(): Boolean = js.native
  }
  
  @JSImport("react-native-reanimated", "default.AnimatedValue")
  @js.native
  open class AnimatedValue[T /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */] ()
    extends StObject
       with typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[T] {
    def this(value: T) = this()
    
    /**
      * ' __value' is not available at runtime on AnimatedNode<T>. It is
      * necessary to have some discriminating property on a type to know that
      * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
      */
    /* CompleteClass */
    @JSName(" __value")
    var Space__value: T = js.native
    
    /* CompleteClass */
    override def interpolate(config: InterpolationConfig): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = js.native
    
    /* CompleteClass */
    override def isNativelyInitialized(): Boolean = js.native
    
    /* CompleteClass */
    override def setValue(value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[T]): Unit = js.native
  }
  
  @JSImport("react-native-reanimated", "default.Code")
  @js.native
  open class Code ()
    extends Component[CodeProps, js.Object, Any]
  
  @JSImport("react-native-reanimated", "default.Extrapolate")
  @js.native
  object Extrapolate extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.reactNativeReanimated.mod.Animated.Extrapolate & String] = js.native
    
    /* "clamp" */ val CLAMP: typingsJapgolly.reactNativeReanimated.mod.Animated.Extrapolate.CLAMP & String = js.native
    
    /* "extend" */ val EXTEND: typingsJapgolly.reactNativeReanimated.mod.Animated.Extrapolate.EXTEND & String = js.native
    
    /* "identity" */ val IDENTITY: typingsJapgolly.reactNativeReanimated.mod.Animated.Extrapolate.IDENTITY & String = js.native
  }
  
  @JSImport("react-native-reanimated", "default.FlatList")
  @js.native
  open class FlatList[T] ()
    extends typingsJapgolly.reactNativeReanimated.mod.Animated.FlatList[T]
  
  @JSImport("react-native-reanimated", "default.Image")
  @js.native
  open class Image ()
    extends typingsJapgolly.reactNativeReanimated.mod.Animated.Image
  
  @JSImport("react-native-reanimated", "default.ScrollView")
  @js.native
  open class ScrollView ()
    extends typingsJapgolly.reactNativeReanimated.mod.Animated.ScrollView
  
  @JSImport("react-native-reanimated", "default.SpringUtils")
  @js.native
  val SpringUtils: typingsJapgolly.reactNativeReanimated.mod.Animated.SpringUtils = js.native
  
  @JSImport("react-native-reanimated", "default.Text")
  @js.native
  open class Text ()
    extends typingsJapgolly.reactNativeReanimated.mod.Animated.Text
  
  @JSImport("react-native-reanimated", "default.View")
  @js.native
  open class View ()
    extends typingsJapgolly.reactNativeReanimated.mod.Animated.View
  
  inline def abs(value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  inline def acc(value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("acc")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.acos")
  @js.native
  val acos: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.add")
  @js.native
  val add: MultiOperator[Double] = js.native
  
  inline def addWhitelistedNativeProps_true(props: StringDictionary[`true`]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedNativeProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addWhitelistedUIProps_true(props: StringDictionary[`true`]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedUIProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("react-native-reanimated", "default.and")
  @js.native
  val and: MultiOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.asin")
  @js.native
  val asin: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.atan")
  @js.native
  val atan: UnaryOperator = js.native
  
  inline def block[T1 /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */](items: js.Array[typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[T2]]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(items.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T1]]
  
  inline def call[T](
    args: js.Array[T | typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T]],
    callback: js.Function1[/* args */ js.Array[T], Unit]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0`]]
  
  @JSImport("react-native-reanimated", "default.ceil")
  @js.native
  val ceil: UnaryOperator = js.native
  
  inline def clockRunning(clock: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedClock): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("clockRunning")(clock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`]]
  
  inline def color(
    r: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    g: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    b: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double | String]]
  inline def color(
    r: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    g: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    b: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    a: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double | String]]
  
  inline def concat(args: (typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double | String])*): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[String]]
  
  inline def cond[T1 /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */](
    conditionNode: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    ifNode: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[T1]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(conditionNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2]]
  inline def cond[T1 /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */](
    conditionNode: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    ifNode: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[T1],
    elseNode: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[T2]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(conditionNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any], elseNode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2]]
  
  @JSImport("react-native-reanimated", "default.cos")
  @js.native
  val cos: UnaryOperator = js.native
  
  inline def createAnimatedComponent[P /* <: js.Object */](component: ComponentClassP[P & js.Object]): ComponentClassP[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P] & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P] & js.Object]]
  inline def createAnimatedComponent[P /* <: js.Object */](component: ComponentClassP[P & js.Object], options: Options[P]): ComponentClassP[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P] & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P] & js.Object]]
  inline def createAnimatedComponent[P /* <: js.Object */](component: FunctionComponent[P]): FunctionComponent[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P]]]
  inline def createAnimatedComponent[P /* <: js.Object */](component: FunctionComponent[P], options: Options[P]): FunctionComponent[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimateProps[P]]]
  
  inline def debug[T](message: String, value: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T]]
  
  inline def decay(
    clock: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedClock,
    state: DecayState,
    config: DecayConfig
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  inline def decay(node: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double], config: DecayConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]
  
  inline def defined(value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Any]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`]]
  
  inline def diff(value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  inline def diffClamp(
    value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    minVal: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    maxVal: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(value.asInstanceOf[js.Any], minVal.asInstanceOf[js.Any], maxVal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.divide")
  @js.native
  val divide: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.eq")
  @js.native
  val eq_ : BinaryOperator[`0` | `1`] = js.native
  
  inline def event[T](
    argMapping: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? std.ReadonlyArray<react-native-reanimated.react-native-reanimated.Animated.Mapping> : std.Readonly<react-native-reanimated.react-native-reanimated.Animated.EventMappingArray<T>> */ js.Any
  ): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def event[T](
    argMapping: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? std.ReadonlyArray<react-native-reanimated.react-native-reanimated.Animated.Mapping> : std.Readonly<react-native-reanimated.react-native-reanimated.Animated.EventMappingArray<T>> */ js.Any,
    config: js.Object
  ): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  @JSImport("react-native-reanimated", "default.exp")
  @js.native
  val exp: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.floor")
  @js.native
  val floor: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.greaterOrEq")
  @js.native
  val greaterOrEq: BinaryOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.greaterThan")
  @js.native
  val greaterThan: BinaryOperator[`0` | `1`] = js.native
  
  inline def interpolateColors[T /* <: String | Double */](
    animationValue: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    hasInputRangeOutputColorRange: InputRange[T]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColors")(animationValue.asInstanceOf[js.Any], hasInputRangeOutputColorRange.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T]]
  
  inline def interpolateNode(
    value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    config: InterpolationConfig
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNode")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.lessOrEq")
  @js.native
  val lessOrEq: BinaryOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.lessThan")
  @js.native
  val lessThan: BinaryOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.log")
  @js.native
  val log: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.max")
  @js.native
  val max: BinaryOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.min")
  @js.native
  val min: BinaryOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.modulo")
  @js.native
  val modulo: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.multiply")
  @js.native
  val multiply: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.neq")
  @js.native
  val neq: BinaryOperator[`0` | `1`] = js.native
  
  inline def not(value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Any]): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`]]
  
  inline def onChange(
    value: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double],
    action: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[Double]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(value.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.or")
  @js.native
  val or: MultiOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.pow")
  @js.native
  val pow: MultiOperator[Double] = js.native
  
  inline def proc[T /* <: js.Array[
    js.UndefOr[
      typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[typingsJapgolly.reactNativeReanimated.mod.Animated.Value]
    ]
  ] */](
    func: js.Function1[
      /* args */ T, 
      typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("proc")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("react-native-reanimated", "default.round")
  @js.native
  val round: UnaryOperator = js.native
  
  inline def set[T /* <: typingsJapgolly.reactNativeReanimated.mod.Animated.Value */](
    valueToBeUpdated: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[T],
    sourceNode: typingsJapgolly.reactNativeReanimated.mod.Animated.Adaptable[T]
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(valueToBeUpdated.asInstanceOf[js.Any], sourceNode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[T]]
  
  @JSImport("react-native-reanimated", "default.sin")
  @js.native
  val sin: UnaryOperator = js.native
  
  inline def spring(
    clock: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedClock,
    state: SpringState,
    config: SpringConfig
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  inline def spring(
    node: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double],
    config: SpringConfig
  ): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]
  
  @JSImport("react-native-reanimated", "default.sqrt")
  @js.native
  val sqrt: UnaryOperator = js.native
  
  inline def startClock(clock: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedClock): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("startClock")(clock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0`]]
  
  inline def stopClock(clock: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedClock): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopClock")(clock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[`0`]]
  
  @JSImport("react-native-reanimated", "default.sub")
  @js.native
  val sub: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.tan")
  @js.native
  val tan: UnaryOperator = js.native
  
  inline def timing(
    clock: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedClock,
    state: TimingState,
    config: TimingConfig
  ): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  inline def timing(
    node: typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double],
    config: TimingConfig
  ): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]
  
  inline def useCode(
    exec: js.Function0[
      (Nullable[
        js.Array[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]] | typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode[Double]
      ]) | Boolean
    ],
    deps: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useCode")(exec.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useValue(initialValue: String): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[String]]
  inline def useValue(initialValue: Boolean): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[Boolean]]
  inline def useValue(initialValue: Double): typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedValue[Double]]
}
