package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsFieldMod {
  
  @JSImport("ant-design-pro/lib/Charts/Field", JSImport.Default)
  @js.native
  open class default () extends Component[IFieldProps, Any, Any]
  
  type Field = japgolly.scalajs.react.facade.React.Component[IFieldProps & js.Object, js.Object]
  
  trait IFieldProps extends StObject {
    
    var label: Node
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: Node
  }
  object IFieldProps {
    
    inline def apply(): IFieldProps = {
      val __obj = js.Dynamic.literal(label = null, value = null)
      __obj.asInstanceOf[IFieldProps]
    }
    
    extension [Self <: IFieldProps](x: Self) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: VdomNode): Self = StObject.set(x, "value", value.rawNode.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
