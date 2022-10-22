package typingsJapgolly.reactRanger

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.reactRanger.anon.GetPercentageForValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ranger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRanger(options: RangerOptions): Ranger = ^.asInstanceOf[js.Dynamic].applyDynamic("useRanger")(options.asInstanceOf[js.Any]).asInstanceOf[Ranger]
  
  trait HandleProps extends StObject {
    
    var key: Key
    
    def onMouseDown(event: ReactMouseEventFrom[Element]): Unit
    
    def onTouchStart(event: ReactTouchEventFrom[Element]): Unit
    
    var style: CSSProperties
    
    var tabIndex: Double
  }
  object HandleProps {
    
    inline def apply(
      key: Key,
      onMouseDown: ReactMouseEventFrom[Element] => Callback,
      onTouchStart: ReactTouchEventFrom[Element] => Callback,
      style: CSSProperties,
      tabIndex: Double
    ): HandleProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => onMouseDown(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element]) => onTouchStart(t0).runNow()), style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleProps]
    }
    
    extension [Self <: HandleProps](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element]) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ranger extends StObject {
    
    var activeHandleIndex: Double | Null = js.native
    
    def getTrackProps[T](): T & TrackProps = js.native
    def getTrackProps[T](props: T): T & TrackProps = js.native
    
    var handles: js.Array[RangerHandle] = js.native
    
    var segments: js.Array[RangerSegment] = js.native
    
    var ticks: js.Array[RangerTick] = js.native
  }
  
  @js.native
  trait RangerHandle extends StObject {
    
    var active: Boolean = js.native
    
    def getHandleProps[T](): T & HandleProps = js.native
    def getHandleProps[T](props: T): T & HandleProps = js.native
    
    var value: Double = js.native
  }
  
  trait RangerOptions extends StObject {
    
    var interpolator: js.UndefOr[GetPercentageForValue] = js.undefined
    
    var max: Double
    
    var min: Double
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
    
    var onDrag: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
    
    var stepSize: Double
    
    var steps: js.UndefOr[js.Array[Double]] = js.undefined
    
    var tickSize: js.UndefOr[Double] = js.undefined
    
    var ticks: js.UndefOr[js.Array[Double]] = js.undefined
    
    var values: js.Array[Double]
  }
  object RangerOptions {
    
    inline def apply(max: Double, min: Double, stepSize: Double, values: js.Array[Double]): RangerOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangerOptions]
    }
    
    extension [Self <: RangerOptions](x: Self) {
      
      inline def setInterpolator(value: GetPercentageForValue): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
      
      inline def setInterpolatorUndefined: Self = StObject.set(x, "interpolator", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* values */ js.Array[Double] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDrag(value: /* values */ js.Array[Double] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value*))
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  @js.native
  trait RangerSegment extends StObject {
    
    def getSegmentProps[T](): T & SegmentProps = js.native
    def getSegmentProps[T](props: T): T & SegmentProps = js.native
    
    var value: Double = js.native
  }
  
  @js.native
  trait RangerTick extends StObject {
    
    def getTickProps[T](): T & TickProps = js.native
    def getTickProps[T](props: T): T & TickProps = js.native
    
    var value: Double = js.native
  }
  
  trait SegmentProps extends StObject {
    
    var key: Key
    
    var style: CSSProperties
  }
  object SegmentProps {
    
    inline def apply(key: Key, style: CSSProperties): SegmentProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentProps]
    }
    
    extension [Self <: SegmentProps](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait TickProps extends StObject {
    
    var key: Key
    
    var style: CSSProperties
  }
  object TickProps {
    
    inline def apply(key: Key, style: CSSProperties): TickProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TickProps]
    }
    
    extension [Self <: TickProps](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackProps extends StObject {
    
    var key: Key
    
    var style: CSSProperties
  }
  object TrackProps {
    
    inline def apply(key: Key, style: CSSProperties): TrackProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    extension [Self <: TrackProps](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
