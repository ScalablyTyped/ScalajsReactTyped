package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.active
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.butt
import typingsJapgolly.antd.antdStrings.exception
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.normal
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.antdStrings.round
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressProgressMod extends Shortcut {
  
  @JSImport("antd/lib/progress/progress", JSImport.Default)
  @js.native
  val default: FC[ProgressProps] = js.native
  
  trait FromToGradients extends StObject {
    
    var from: String
    
    var to: String
  }
  object FromToGradients {
    
    inline def apply(from: String, to: String): FromToGradients = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromToGradients]
    }
    
    extension [Self <: FromToGradients](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.anon.StringGradientsdirections
    - typingsJapgolly.antd.anon.FromToGradientsdirections
  */
  trait ProgressGradient extends StObject
  object ProgressGradient {
    
    inline def FromToGradientsdirections(from: String, to: String): typingsJapgolly.antd.anon.FromToGradientsdirections = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.antd.anon.FromToGradientsdirections]
    }
    
    inline def StringGradientsdirections(): typingsJapgolly.antd.anon.StringGradientsdirections = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.antd.anon.StringGradientsdirections]
    }
  }
  
  trait ProgressProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[
        js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], Node]
      ] = js.undefined
    
    var gapDegree: js.UndefOr[Double] = js.undefined
    
    var gapPosition: js.UndefOr[top | bottom | left | right] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showInfo: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ProgressSize] = js.undefined
    
    var status: js.UndefOr[normal | exception | active | success] = js.undefined
    
    var steps: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String | js.Array[String] | ProgressGradient] = js.undefined
    
    var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var success: js.UndefOr[SuccessProps] = js.undefined
    
    /** @deprecated Use `success` instead */
    var successPercent: js.UndefOr[Double] = js.undefined
    
    var trailColor: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ProgressType] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    extension [Self <: ProgressProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => Node): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      inline def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      inline def setGapPosition(value: top | bottom | left | right): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      inline def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
      
      inline def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
      
      inline def setSize(value: ProgressSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: normal | exception | active | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStrokeColor(value: String | js.Array[String] | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value*))
      
      inline def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuccess(value: SuccessProps): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
      
      inline def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      inline def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      inline def setType(value: ProgressType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.default
    - typingsJapgolly.antd.antdStrings.small
  */
  trait ProgressSize extends StObject
  object ProgressSize {
    
    inline def default: typingsJapgolly.antd.antdStrings.default = "default".asInstanceOf[typingsJapgolly.antd.antdStrings.default]
    
    inline def small: typingsJapgolly.antd.antdStrings.small = "small".asInstanceOf[typingsJapgolly.antd.antdStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.line
    - typingsJapgolly.antd.antdStrings.circle
    - typingsJapgolly.antd.antdStrings.dashboard
  */
  trait ProgressType extends StObject
  
  type StringGradients = StringDictionary[String]
  
  trait SuccessProps extends StObject {
    
    var percent: js.UndefOr[Double] = js.undefined
    
    /** @deprecated Use `percent` instead */
    var progress: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
  }
  object SuccessProps {
    
    inline def apply(): SuccessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessProps]
    }
    
    extension [Self <: SuccessProps](x: Self) {
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
  
  type _To = FC[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `libProgressProgressMod.foo` */
  override def _to: FC[ProgressProps] = default
}
