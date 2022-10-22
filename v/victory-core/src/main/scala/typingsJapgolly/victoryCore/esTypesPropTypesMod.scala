package typingsJapgolly.victoryCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.d3Scale.mod.ScaleLinear_
import typingsJapgolly.d3Scale.mod.ScaleLogarithmic
import typingsJapgolly.d3Scale.mod.ScalePower
import typingsJapgolly.d3Scale.mod.ScaleTime_
import typingsJapgolly.victoryCore.anon.After
import typingsJapgolly.victoryCore.anon.Before
import typingsJapgolly.victoryCore.anon.ValueOf
import typingsJapgolly.victoryCore.anon.`3`
import typingsJapgolly.victoryCore.esTypesCallbacksMod.StringOrNumberOrCallback
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.AnimationEasing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesPropTypesMod {
  
  trait AnimatePropTypeInterface extends StObject {
    
    var animationWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[AnimationEasing] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEnter: js.UndefOr[After] = js.undefined
    
    var onExit: js.UndefOr[Before] = js.undefined
    
    var onLoad: js.UndefOr[After] = js.undefined
  }
  object AnimatePropTypeInterface {
    
    inline def apply(): AnimatePropTypeInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatePropTypeInterface]
    }
    
    extension [Self <: AnimatePropTypeInterface](x: Self) {
      
      inline def setAnimationWhitelist(value: js.Array[String]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
      
      inline def setAnimationWhitelistUndefined: Self = StObject.set(x, "animationWhitelist", js.undefined)
      
      inline def setAnimationWhitelistVarargs(value: String*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: AnimationEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnEnter(value: After): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: Before): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnLoad(value: After): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.x
    - typingsJapgolly.victoryCore.victoryCoreStrings.y
  */
  trait AxisType extends StObject
  object AxisType {
    
    inline def x: typingsJapgolly.victoryCore.victoryCoreStrings.x = "x".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.x]
    
    inline def y: typingsJapgolly.victoryCore.victoryCoreStrings.y = "y".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.y]
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - typingsJapgolly.victoryCore.anon.`1`
    - typingsJapgolly.victoryCore.anon.`2`
    - typingsJapgolly.victoryCore.anon.XArrayYArray
  */
  type CategoryPropType = _CategoryPropType | js.Array[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.grayscale
    - typingsJapgolly.victoryCore.victoryCoreStrings.qualitative
    - typingsJapgolly.victoryCore.victoryCoreStrings.heatmap
    - typingsJapgolly.victoryCore.victoryCoreStrings.warm
    - typingsJapgolly.victoryCore.victoryCoreStrings.cool
    - typingsJapgolly.victoryCore.victoryCoreStrings.red
    - typingsJapgolly.victoryCore.victoryCoreStrings.green
    - typingsJapgolly.victoryCore.victoryCoreStrings.blue
    - js.Array[java.lang.String]
  */
  type ColorScalePropType = _ColorScalePropType | js.Array[String]
  
  trait CoordinatesPropType extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object CoordinatesPropType {
    
    inline def apply(x: Double, y: Double): CoordinatesPropType = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinatesPropType]
    }
    
    extension [Self <: CoordinatesPropType](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait D3Scale[TRange] extends StObject {
    
    def apply(numberValue: NumberValue): Double = js.native
    
    var base: js.UndefOr[js.Function0[Double]] = js.native
    
    def copy(): this.type = js.native
    
    def domain(): js.Array[Double] = js.native
    def domain(domain: js.Array[NumberValue]): D3Scale[TRange] = js.native
    
    def invert(value: Double): Double = js.native
    
    def range(): js.Array[TRange] = js.native
    def range(range: TRange): D3Scale[TRange] = js.native
    
    def tickFormat(): js.Function1[/* d */ Double, String] = js.native
    def tickFormat(count: Double): js.Function1[/* d */ Double, String] = js.native
    
    def ticks(): js.Array[Double] = js.native
    def ticks(count: Double): js.Array[Double] = js.native
  }
  
  type D3ScaleFn[TRange, TOutput] = js.Function0[
    (ScaleLinear_[TRange, TOutput, Any]) | (ScaleLogarithmic[TRange, TOutput, Any]) | (ScaleTime_[TRange, TOutput, Any]) | (ScalePower[TRange, TOutput, Any])
  ]
  
  type DataGetterPropType = ValueOrAccessor[String | (js.Array[Double | String]) | Double, Any]
  
  type Datum = Any
  
  type DatumValue = js.UndefOr[Double | String | js.Date | Null]
  
  type DomainPaddingPropType = ValueOrAxes[PaddingType]
  
  type DomainPropType = ValueOrAxes[DomainTuple]
  
  type DomainTuple = Tuple[js.Date | Double]
  
  type DomainValue = Double | js.Date
  
  trait EventCallbackInterface[TTarget, TEventKey] extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* props */ Any, Any]] = js.undefined
    
    var childName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var eventKey: js.UndefOr[TEventKey] = js.undefined
    
    def mutation(props: Any): Any
    
    var target: js.UndefOr[TTarget] = js.undefined
  }
  object EventCallbackInterface {
    
    inline def apply[TTarget, TEventKey](mutation: Any => Any): EventCallbackInterface[TTarget, TEventKey] = {
      val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction1(mutation))
      __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
    }
    
    extension [Self <: EventCallbackInterface[?, ?], TTarget, TEventKey](x: Self & (EventCallbackInterface[TTarget, TEventKey])) {
      
      inline def setCallback(value: /* props */ Any => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChildName(value: String | js.Array[String]): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
      
      inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
      
      inline def setChildNameVarargs(value: String*): Self = StObject.set(x, "childName", js.Array(value*))
      
      inline def setEventKey(value: TEventKey): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setMutation(value: Any => Any): Self = StObject.set(x, "mutation", js.Any.fromFunction1(value))
      
      inline def setTarget(value: TTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait EventPropTypeInterface[TTarget, TEventKey] extends StObject {
    
    var childName: js.UndefOr[String | js.Array[StringOrNumberOrCallback]] = js.undefined
    
    var eventHandlers: StringDictionary[
        js.Function2[
          /* event */ ReactEventFrom[Any & Element], 
          js.UndefOr[Any], 
          (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey]) | Unit
        ]
      ]
    
    var eventKey: js.UndefOr[TEventKey] = js.undefined
    
    var target: TTarget
  }
  object EventPropTypeInterface {
    
    inline def apply[TTarget, TEventKey](
      eventHandlers: StringDictionary[
          js.Function2[
            /* event */ ReactEventFrom[Any & Element], 
            js.UndefOr[Any], 
            (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey]) | Unit
          ]
        ],
      target: TTarget
    ): EventPropTypeInterface[TTarget, TEventKey] = {
      val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
    }
    
    extension [Self <: EventPropTypeInterface[?, ?], TTarget, TEventKey](x: Self & (EventPropTypeInterface[TTarget, TEventKey])) {
      
      inline def setChildName(value: String | js.Array[StringOrNumberOrCallback]): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
      
      inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
      
      inline def setChildNameVarargs(value: StringOrNumberOrCallback*): Self = StObject.set(x, "childName", js.Array(value*))
      
      inline def setEventHandlers(
        value: StringDictionary[
              js.Function2[
                /* event */ ReactEventFrom[Any & Element], 
                js.UndefOr[Any], 
                (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey]) | Unit
              ]
            ]
      ): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventKey(value: TEventKey): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setTarget(value: TTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type ForAxes[T] = T | `3`[T]
  
  type ID = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.basis
    - typingsJapgolly.victoryCore.victoryCoreStrings.basisClosed
    - typingsJapgolly.victoryCore.victoryCoreStrings.basisOpen
    - typingsJapgolly.victoryCore.victoryCoreStrings.bundle
    - typingsJapgolly.victoryCore.victoryCoreStrings.cardinal
    - typingsJapgolly.victoryCore.victoryCoreStrings.cardinalClosed
    - typingsJapgolly.victoryCore.victoryCoreStrings.cardinalOpen
    - typingsJapgolly.victoryCore.victoryCoreStrings.catmullRom
    - typingsJapgolly.victoryCore.victoryCoreStrings.catmullRomClosed
    - typingsJapgolly.victoryCore.victoryCoreStrings.catmullRomOpen
    - typingsJapgolly.victoryCore.victoryCoreStrings.linear
    - typingsJapgolly.victoryCore.victoryCoreStrings.linearClosed
    - typingsJapgolly.victoryCore.victoryCoreStrings.monotoneX
    - typingsJapgolly.victoryCore.victoryCoreStrings.monotoneY
    - typingsJapgolly.victoryCore.victoryCoreStrings.natural
    - typingsJapgolly.victoryCore.victoryCoreStrings.radial
    - typingsJapgolly.victoryCore.victoryCoreStrings.step
    - typingsJapgolly.victoryCore.victoryCoreStrings.stepAfter
    - typingsJapgolly.victoryCore.victoryCoreStrings.stepBefore
  */
  trait InterpolationPropType extends StObject
  object InterpolationPropType {
    
    inline def basis: typingsJapgolly.victoryCore.victoryCoreStrings.basis = "basis".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.basis]
    
    inline def basisClosed: typingsJapgolly.victoryCore.victoryCoreStrings.basisClosed = "basisClosed".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.basisClosed]
    
    inline def basisOpen: typingsJapgolly.victoryCore.victoryCoreStrings.basisOpen = "basisOpen".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.basisOpen]
    
    inline def bundle: typingsJapgolly.victoryCore.victoryCoreStrings.bundle = "bundle".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bundle]
    
    inline def cardinal: typingsJapgolly.victoryCore.victoryCoreStrings.cardinal = "cardinal".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cardinal]
    
    inline def cardinalClosed: typingsJapgolly.victoryCore.victoryCoreStrings.cardinalClosed = "cardinalClosed".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cardinalClosed]
    
    inline def cardinalOpen: typingsJapgolly.victoryCore.victoryCoreStrings.cardinalOpen = "cardinalOpen".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cardinalOpen]
    
    inline def catmullRom: typingsJapgolly.victoryCore.victoryCoreStrings.catmullRom = "catmullRom".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.catmullRom]
    
    inline def catmullRomClosed: typingsJapgolly.victoryCore.victoryCoreStrings.catmullRomClosed = "catmullRomClosed".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.catmullRomClosed]
    
    inline def catmullRomOpen: typingsJapgolly.victoryCore.victoryCoreStrings.catmullRomOpen = "catmullRomOpen".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.catmullRomOpen]
    
    inline def linear: typingsJapgolly.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linear]
    
    inline def linearClosed: typingsJapgolly.victoryCore.victoryCoreStrings.linearClosed = "linearClosed".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linearClosed]
    
    inline def monotoneX: typingsJapgolly.victoryCore.victoryCoreStrings.monotoneX = "monotoneX".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.monotoneX]
    
    inline def monotoneY: typingsJapgolly.victoryCore.victoryCoreStrings.monotoneY = "monotoneY".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.monotoneY]
    
    inline def natural: typingsJapgolly.victoryCore.victoryCoreStrings.natural = "natural".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.natural]
    
    inline def radial: typingsJapgolly.victoryCore.victoryCoreStrings.radial = "radial".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.radial]
    
    inline def step: typingsJapgolly.victoryCore.victoryCoreStrings.step = "step".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.step]
    
    inline def stepAfter: typingsJapgolly.victoryCore.victoryCoreStrings.stepAfter = "stepAfter".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.stepAfter]
    
    inline def stepBefore: typingsJapgolly.victoryCore.victoryCoreStrings.stepBefore = "stepBefore".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.stepBefore]
  }
  
  type NumberValue = Double | ValueOf
  
  trait Padding extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Padding {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    extension [Self <: Padding](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type PaddingType = Double | Tuple[Double]
  
  type RangePropType = ValueOrAxes[RangeTuple]
  
  type RangeTuple = js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.linear
    - typingsJapgolly.victoryCore.victoryCoreStrings.time
    - typingsJapgolly.victoryCore.victoryCoreStrings.log
    - typingsJapgolly.victoryCore.victoryCoreStrings.sqrt
  */
  trait ScaleName extends StObject
  object ScaleName {
    
    inline def linear: typingsJapgolly.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linear]
    
    inline def log: typingsJapgolly.victoryCore.victoryCoreStrings.log = "log".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.log]
    
    inline def sqrt: typingsJapgolly.victoryCore.victoryCoreStrings.sqrt = "sqrt".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.sqrt]
    
    inline def time: typingsJapgolly.victoryCore.victoryCoreStrings.time = "time".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.time]
  }
  
  type ScalePropType = ScaleName
  
  trait ScaleXYPropType extends StObject {
    
    var x: D3Scale[Any]
    
    var y: D3Scale[Any]
  }
  object ScaleXYPropType {
    
    inline def apply(x: D3Scale[Any], y: D3Scale[Any]): ScaleXYPropType = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleXYPropType]
    }
    
    extension [Self <: ScaleXYPropType](x: Self) {
      
      inline def setX(value: D3Scale[Any]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: D3Scale[Any]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.ascending
    - typingsJapgolly.victoryCore.victoryCoreStrings.descending
  */
  trait SortOrderPropType extends StObject
  object SortOrderPropType {
    
    inline def ascending: typingsJapgolly.victoryCore.victoryCoreStrings.ascending = "ascending".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.ascending]
    
    inline def descending: typingsJapgolly.victoryCore.victoryCoreStrings.descending = "descending".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.descending]
  }
  
  type StringOrNumberOrList = String | Double | (js.Array[String | Double])
  
  type Tuple[T] = js.Tuple2[T, T]
  
  type ValueOrAccessor[ValueType, PropsType] = ValueType | (js.Function1[/* props */ PropsType, ValueType])
  
  type ValueOrAxes[T] = T | ForAxes[T]
  
  trait VictoryLabelableProps extends StObject {
    
    var labelComponent: js.UndefOr[japgolly.scalajs.react.facade.React.Element] = js.undefined
  }
  object VictoryLabelableProps {
    
    inline def apply(): VictoryLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryLabelableProps]
    }
    
    extension [Self <: VictoryLabelableProps](x: Self) {
      
      inline def setLabelComponent(value: VdomElement): Self = StObject.set(x, "labelComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
    }
  }
  
  trait VictoryMultiLabelableProps
    extends StObject
       with VictoryLabelableProps {
    
    var labels: js.UndefOr[
        (js.Array[Double | String]) | (js.Function1[/* data */ Any, String | (js.Array[Double | String]) | Double | Null])
      ] = js.undefined
  }
  object VictoryMultiLabelableProps {
    
    inline def apply(): VictoryMultiLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryMultiLabelableProps]
    }
    
    extension [Self <: VictoryMultiLabelableProps](x: Self) {
      
      inline def setLabels(
        value: (js.Array[Double | String]) | (js.Function1[/* data */ Any, String | (js.Array[Double | String]) | Double | Null])
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsFunction1(value: /* data */ Any => String | (js.Array[Double | String]) | Double | Null): Self = StObject.set(x, "labels", js.Any.fromFunction1(value))
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: (Double | String)*): Self = StObject.set(x, "labels", js.Array(value*))
    }
  }
  
  trait VictorySingleLabelableProps
    extends StObject
       with VictoryLabelableProps {
    
    var label: js.UndefOr[String | (js.Function1[/* data */ Any, String | Double | Null])] = js.undefined
  }
  object VictorySingleLabelableProps {
    
    inline def apply(): VictorySingleLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictorySingleLabelableProps]
    }
    
    extension [Self <: VictorySingleLabelableProps](x: Self) {
      
      inline def setLabel(value: String | (js.Function1[/* data */ Any, String | Double | Null])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: /* data */ Any => String | Double | Null): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait _CategoryPropType extends StObject
  object _CategoryPropType {
    
    inline def `1`(x: js.Array[String]): typingsJapgolly.victoryCore.anon.`1` = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.victoryCore.anon.`1`]
    }
    
    inline def `2`(y: js.Array[String]): typingsJapgolly.victoryCore.anon.`2` = {
      val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.victoryCore.anon.`2`]
    }
    
    inline def XArrayYArray(x: js.Array[String], y: js.Array[String]): typingsJapgolly.victoryCore.anon.XArrayYArray = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.victoryCore.anon.XArrayYArray]
    }
  }
  
  trait _ColorScalePropType extends StObject
}
