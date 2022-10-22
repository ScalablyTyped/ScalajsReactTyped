package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLFieldSetElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FieldsetHTMLAttributes
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFieldsetMod {
  
  @JSImport("@react-md/form/types/Fieldset", "Fieldset")
  @js.native
  val Fieldset: ForwardRefExoticComponent[FieldsetProps & RefAttributes[HTMLFieldSetElement]] = js.native
  
  trait FieldsetProps
    extends StObject
       with FieldsetHTMLAttributes[HTMLFieldSetElement] {
    
    /**
      * The legend to display. This is required since a fieldset loses most of its'
      * benefit for accessibility without a legend.
      */
    var legend: Node
    
    /**
      * An optional classname to apply to the legend.
      */
    var legendClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the legend should only be styled to be visible for screen
      * readers.
      */
    var legendSROnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional style to apply to the legend element.
      */
    var legendStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Boolean if the fieldset should remove the default browser styles of margin,
      * padding, and border.
      */
    var unstyled: js.UndefOr[Boolean] = js.undefined
  }
  object FieldsetProps {
    
    inline def apply(): FieldsetProps = {
      val __obj = js.Dynamic.literal(legend = null)
      __obj.asInstanceOf[FieldsetProps]
    }
    
    extension [Self <: FieldsetProps](x: Self) {
      
      inline def setLegend(value: VdomNode): Self = StObject.set(x, "legend", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLegendClassName(value: String): Self = StObject.set(x, "legendClassName", value.asInstanceOf[js.Any])
      
      inline def setLegendClassNameUndefined: Self = StObject.set(x, "legendClassName", js.undefined)
      
      inline def setLegendNull: Self = StObject.set(x, "legend", null)
      
      inline def setLegendSROnly(value: Boolean): Self = StObject.set(x, "legendSROnly", value.asInstanceOf[js.Any])
      
      inline def setLegendSROnlyUndefined: Self = StObject.set(x, "legendSROnly", js.undefined)
      
      inline def setLegendStyle(value: CSSProperties): Self = StObject.set(x, "legendStyle", value.asInstanceOf[js.Any])
      
      inline def setLegendStyleUndefined: Self = StObject.set(x, "legendStyle", js.undefined)
      
      inline def setLegendVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "legend", js.Array(value*))
      
      inline def setLegendVdomElement(value: VdomElement): Self = StObject.set(x, "legend", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUnstyled(value: Boolean): Self = StObject.set(x, "unstyled", value.asInstanceOf[js.Any])
      
      inline def setUnstyledUndefined: Self = StObject.set(x, "unstyled", js.undefined)
    }
  }
}
