package typingsJapgolly.basicscroll

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.basicscroll.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("basicscroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(opts: Data): BasicScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[BasicScroll]
  
  type AnimatedType = Double | String | Null
  
  trait BasicScroll extends StObject {
    
    /**
      * Converts the start and stop position of the instance to absolute values. basicScroll relies on those values to start and stop the animation at the right position.
      * It runs the calculation once during the instance creation. .calculate() should be called when elements have altered their position or when the size of the site/viewport has changed.
      */
    def calculate(): Unit
    
    /**
      * Destroys the instance.
      * Should be called when the instance is no longer needed. All props of the instance will keep their last value
      */
    def destroy(): Unit
    
    /**
      * Returns calculated data.
      * More or less a parsed version of the data used for the instance creation. The data might change when calling the calculate function.
      */
    def getData(): Data
    
    /**
      * Returns true when the instance is started and false when the instance is stopped.
      */
    def isActive(): Boolean
    
    /**
      * Starts to animate the instance. basicScroll will track the scroll position and adjust the props of the instance accordingly.
      * An update will be performed only when the scroll position has changed.
      */
    def start(): Unit
    
    /**
      * Stops to animate the instance. All props of the instance will keep their last value.
      */
    def stop(): Unit
    
    /**
      * Triggers an update of an instance, even when the instance is currently stopped.
      */
    def update(): Props
  }
  object BasicScroll {
    
    inline def apply(
      calculate: Callback,
      destroy: Callback,
      getData: CallbackTo[Data],
      isActive: CallbackTo[Boolean],
      start: Callback,
      stop: Callback,
      update: CallbackTo[Props]
    ): BasicScroll = {
      val __obj = js.Dynamic.literal(calculate = calculate.toJsFn, destroy = destroy.toJsFn, getData = getData.toJsFn, isActive = isActive.toJsFn, start = start.toJsFn, stop = stop.toJsFn, update = update.toJsFn)
      __obj.asInstanceOf[BasicScroll]
    }
    
    extension [Self <: BasicScroll](x: Self) {
      
      inline def setCalculate(value: Callback): Self = StObject.set(x, "calculate", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetData(value: CallbackTo[Data]): Self = StObject.set(x, "getData", value.toJsFn)
      
      inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setUpdate(value: CallbackTo[Props]): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  type CallbackFunction = js.Function3[/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props, Unit]
  
  trait Data extends StObject {
    
    /**
      * Direct mode.
      * @default false
      */
    var direct: js.UndefOr[Boolean | Element] = js.undefined
    
    /**
      * DOM element/node.
      * @default null
      */
    var elem: js.UndefOr[Element | Null] = js.undefined
    
    /**
      * Start position.
      * @default null
      */
    var from: AnimatedType
    
    /**
      * Executes when the user scrolls and the viewport is within the given start and stop position
      */
    var inside: js.UndefOr[CallbackFunction] = js.undefined
    
    /**
      * Executes when the user scrolls and the viewport is outside the given start and stop position
      */
    var outside: js.UndefOr[CallbackFunction] = js.undefined
    
    var props: js.UndefOr[Props] = js.undefined
    
    /**
      * Stop position.
      * @default null
      */
    var to: AnimatedType
    
    /**
      * Track window size changes.
      * @default true
      */
    var track: js.UndefOr[Boolean] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal(from = null, to = null)
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setDirect(value: Boolean | Element): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      inline def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
      
      inline def setElem(value: Element): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
      
      inline def setElemNull: Self = StObject.set(x, "elem", null)
      
      inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
      
      inline def setFrom(value: AnimatedType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setInside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Callback): Self = StObject.set(x, "inside", js.Any.fromFunction3((t0: /* instance */ BasicScroll, t1: /* percentage */ Double, t2: /* props */ Props) => (value(t0, t1, t2)).runNow()))
      
      inline def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
      
      inline def setOutside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Callback): Self = StObject.set(x, "outside", js.Any.fromFunction3((t0: /* instance */ BasicScroll, t1: /* percentage */ Double, t2: /* props */ Props) => (value(t0, t1, t2)).runNow()))
      
      inline def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setTo(value: AnimatedType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.basicscroll.basicscrollStrings.backInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.backIn
    - typingsJapgolly.basicscroll.basicscrollStrings.backOut
    - typingsJapgolly.basicscroll.basicscrollStrings.bounceInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.bounceIn
    - typingsJapgolly.basicscroll.basicscrollStrings.bounceOut
    - typingsJapgolly.basicscroll.basicscrollStrings.circInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.circIn
    - typingsJapgolly.basicscroll.basicscrollStrings.circOut
    - typingsJapgolly.basicscroll.basicscrollStrings.cubicInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.cubicIn
    - typingsJapgolly.basicscroll.basicscrollStrings.cubicOut
    - typingsJapgolly.basicscroll.basicscrollStrings.elasticInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.elasticIn
    - typingsJapgolly.basicscroll.basicscrollStrings.elasticOut
    - typingsJapgolly.basicscroll.basicscrollStrings.expoInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.expoIn
    - typingsJapgolly.basicscroll.basicscrollStrings.expoOut
    - typingsJapgolly.basicscroll.basicscrollStrings.linear
    - typingsJapgolly.basicscroll.basicscrollStrings.quadInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.quadIn
    - typingsJapgolly.basicscroll.basicscrollStrings.quadOut
    - typingsJapgolly.basicscroll.basicscrollStrings.quartInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.quartIn
    - typingsJapgolly.basicscroll.basicscrollStrings.quartOut
    - typingsJapgolly.basicscroll.basicscrollStrings.quintInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.quintIn
    - typingsJapgolly.basicscroll.basicscrollStrings.quintOut
    - typingsJapgolly.basicscroll.basicscrollStrings.sineInOut
    - typingsJapgolly.basicscroll.basicscrollStrings.sineIn
    - typingsJapgolly.basicscroll.basicscrollStrings.sineOut
  */
  trait KnownTimings extends StObject
  object KnownTimings {
    
    inline def backIn: typingsJapgolly.basicscroll.basicscrollStrings.backIn = "backIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.backIn]
    
    inline def backInOut: typingsJapgolly.basicscroll.basicscrollStrings.backInOut = "backInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.backInOut]
    
    inline def backOut: typingsJapgolly.basicscroll.basicscrollStrings.backOut = "backOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.backOut]
    
    inline def bounceIn: typingsJapgolly.basicscroll.basicscrollStrings.bounceIn = "bounceIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.bounceIn]
    
    inline def bounceInOut: typingsJapgolly.basicscroll.basicscrollStrings.bounceInOut = "bounceInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.bounceInOut]
    
    inline def bounceOut: typingsJapgolly.basicscroll.basicscrollStrings.bounceOut = "bounceOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.bounceOut]
    
    inline def circIn: typingsJapgolly.basicscroll.basicscrollStrings.circIn = "circIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.circIn]
    
    inline def circInOut: typingsJapgolly.basicscroll.basicscrollStrings.circInOut = "circInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.circInOut]
    
    inline def circOut: typingsJapgolly.basicscroll.basicscrollStrings.circOut = "circOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.circOut]
    
    inline def cubicIn: typingsJapgolly.basicscroll.basicscrollStrings.cubicIn = "cubicIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.cubicIn]
    
    inline def cubicInOut: typingsJapgolly.basicscroll.basicscrollStrings.cubicInOut = "cubicInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.cubicInOut]
    
    inline def cubicOut: typingsJapgolly.basicscroll.basicscrollStrings.cubicOut = "cubicOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.cubicOut]
    
    inline def elasticIn: typingsJapgolly.basicscroll.basicscrollStrings.elasticIn = "elasticIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.elasticIn]
    
    inline def elasticInOut: typingsJapgolly.basicscroll.basicscrollStrings.elasticInOut = "elasticInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.elasticInOut]
    
    inline def elasticOut: typingsJapgolly.basicscroll.basicscrollStrings.elasticOut = "elasticOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.elasticOut]
    
    inline def expoIn: typingsJapgolly.basicscroll.basicscrollStrings.expoIn = "expoIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.expoIn]
    
    inline def expoInOut: typingsJapgolly.basicscroll.basicscrollStrings.expoInOut = "expoInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.expoInOut]
    
    inline def expoOut: typingsJapgolly.basicscroll.basicscrollStrings.expoOut = "expoOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.expoOut]
    
    inline def linear: typingsJapgolly.basicscroll.basicscrollStrings.linear = "linear".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.linear]
    
    inline def quadIn: typingsJapgolly.basicscroll.basicscrollStrings.quadIn = "quadIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quadIn]
    
    inline def quadInOut: typingsJapgolly.basicscroll.basicscrollStrings.quadInOut = "quadInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quadInOut]
    
    inline def quadOut: typingsJapgolly.basicscroll.basicscrollStrings.quadOut = "quadOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quadOut]
    
    inline def quartIn: typingsJapgolly.basicscroll.basicscrollStrings.quartIn = "quartIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quartIn]
    
    inline def quartInOut: typingsJapgolly.basicscroll.basicscrollStrings.quartInOut = "quartInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quartInOut]
    
    inline def quartOut: typingsJapgolly.basicscroll.basicscrollStrings.quartOut = "quartOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quartOut]
    
    inline def quintIn: typingsJapgolly.basicscroll.basicscrollStrings.quintIn = "quintIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quintIn]
    
    inline def quintInOut: typingsJapgolly.basicscroll.basicscrollStrings.quintInOut = "quintInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quintInOut]
    
    inline def quintOut: typingsJapgolly.basicscroll.basicscrollStrings.quintOut = "quintOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.quintOut]
    
    inline def sineIn: typingsJapgolly.basicscroll.basicscrollStrings.sineIn = "sineIn".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.sineIn]
    
    inline def sineInOut: typingsJapgolly.basicscroll.basicscrollStrings.sineInOut = "sineInOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.sineInOut]
    
    inline def sineOut: typingsJapgolly.basicscroll.basicscrollStrings.sineOut = "sineOut".asInstanceOf[typingsJapgolly.basicscroll.basicscrollStrings.sineOut]
  }
  
  type Props = StringDictionary[From]
  
  type TimingFunction = js.Function1[/* t */ Double, Double]
}
