package typingsJapgolly.nivoTooltip

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBasicTooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/BasicTooltip", "BasicTooltip")
  @js.native
  val BasicTooltip: NamedExoticComponent[BasicTooltipProps] = js.native
  
  trait BasicTooltipProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var enableChip: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueFormat<number | string | Date> */ Any
      ] = js.undefined
    
    var id: Node
    
    /**
      * @deprecated This should be replaced by custom tooltip components.
      */
    var renderContent: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var value: js.UndefOr[Double | String | js.Date] = js.undefined
  }
  object BasicTooltipProps {
    
    inline def apply(): BasicTooltipProps = {
      val __obj = js.Dynamic.literal(id = null)
      __obj.asInstanceOf[BasicTooltipProps]
    }
    
    extension [Self <: BasicTooltipProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnableChip(value: Boolean): Self = StObject.set(x, "enableChip", value.asInstanceOf[js.Any])
      
      inline def setEnableChipUndefined: Self = StObject.set(x, "enableChip", js.undefined)
      
      inline def setFormat(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueFormat<number | string | Date> */ Any
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: VdomNode): Self = StObject.set(x, "id", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "id", js.Array(value*))
      
      inline def setIdVdomElement(value: VdomElement): Self = StObject.set(x, "id", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderContent(value: CallbackTo[Element]): Self = StObject.set(x, "renderContent", value.toJsFn)
      
      inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      inline def setValue(value: Double | String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
