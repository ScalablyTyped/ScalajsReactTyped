package typingsJapgolly.rcProgress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.rcProgress.anon.Count
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type BaseStrokeColorType = String | (Record[String, String])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcProgress.rcProgressStrings.top
    - typingsJapgolly.rcProgress.rcProgressStrings.right
    - typingsJapgolly.rcProgress.rcProgressStrings.bottom
    - typingsJapgolly.rcProgress.rcProgressStrings.left
  */
  trait GapPositionType extends StObject
  object GapPositionType {
    
    inline def bottom: typingsJapgolly.rcProgress.rcProgressStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.bottom]
    
    inline def left: typingsJapgolly.rcProgress.rcProgressStrings.left = "left".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.left]
    
    inline def right: typingsJapgolly.rcProgress.rcProgressStrings.right = "right".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.right]
    
    inline def top: typingsJapgolly.rcProgress.rcProgressStrings.top = "top".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.top]
  }
  
  trait ProgressProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var gapDegree: js.UndefOr[Double] = js.undefined
    
    var gapPosition: js.UndefOr[GapPositionType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var percent: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var steps: js.UndefOr[Double | Count] = js.undefined
    
    var strokeColor: js.UndefOr[StrokeColorType] = js.undefined
    
    var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var trailColor: js.UndefOr[String] = js.undefined
    
    var trailWidth: js.UndefOr[Double] = js.undefined
    
    var transition: js.UndefOr[String] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    extension [Self <: ProgressProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      inline def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      inline def setGapPosition(value: GapPositionType): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      inline def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPercent(value: Double | js.Array[Double]): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPercentVarargs(value: Double*): Self = StObject.set(x, "percent", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSteps(value: Double | Count): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStrokeColor(value: StrokeColorType): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeColorVarargs(value: BaseStrokeColorType*): Self = StObject.set(x, "strokeColor", js.Array(value*))
      
      inline def setStrokeLinecap(value: StrokeLinecapType): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      inline def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      inline def setTrailWidth(value: Double): Self = StObject.set(x, "trailWidth", value.asInstanceOf[js.Any])
      
      inline def setTrailWidthUndefined: Self = StObject.set(x, "trailWidth", js.undefined)
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type StrokeColorType = BaseStrokeColorType | js.Array[BaseStrokeColorType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcProgress.rcProgressStrings.round
    - typingsJapgolly.rcProgress.rcProgressStrings.butt
    - typingsJapgolly.rcProgress.rcProgressStrings.square
  */
  trait StrokeLinecapType extends StObject
  object StrokeLinecapType {
    
    inline def butt: typingsJapgolly.rcProgress.rcProgressStrings.butt = "butt".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.butt]
    
    inline def round: typingsJapgolly.rcProgress.rcProgressStrings.round = "round".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.round]
    
    inline def square: typingsJapgolly.rcProgress.rcProgressStrings.square = "square".asInstanceOf[typingsJapgolly.rcProgress.rcProgressStrings.square]
  }
}
