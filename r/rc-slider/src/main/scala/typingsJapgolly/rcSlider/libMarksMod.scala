package typingsJapgolly.rcSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMarksMod {
  
  @JSImport("rc-slider/lib/Marks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MarksProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait InternalMarkObj
    extends StObject
       with MarkObj {
    
    var value: Double
  }
  object InternalMarkObj {
    
    inline def apply(value: Double): InternalMarkObj = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalMarkObj]
    }
    
    extension [Self <: InternalMarkObj](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkObj extends StObject {
    
    var label: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object MarkObj {
    
    inline def apply(): MarkObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkObj]
    }
    
    extension [Self <: MarkObj](x: Self) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait MarksProps extends StObject {
    
    var marks: js.UndefOr[js.Array[InternalMarkObj]] = js.undefined
    
    def onClick(value: Double): Unit
    
    var prefixCls: String
  }
  object MarksProps {
    
    inline def apply(onClick: Double => Callback, prefixCls: String): MarksProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: Double) => onClick(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarksProps]
    }
    
    extension [Self <: MarksProps](x: Self) {
      
      inline def setMarks(value: js.Array[InternalMarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMarksVarargs(value: InternalMarkObj*): Self = StObject.set(x, "marks", js.Array(value*))
      
      inline def setOnClick(value: Double => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
