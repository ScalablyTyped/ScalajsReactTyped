package typingsJapgolly.nivoTooltip

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/TableTooltip", "TableTooltip")
  @js.native
  val TableTooltip: MemoExoticComponent[js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, Element | Null]] = js.native
  
  trait TableTooltipProps extends StObject {
    
    var renderContent: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var rows: js.UndefOr[js.Array[js.Array[Node]]] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object TableTooltipProps {
    
    inline def apply(): TableTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableTooltipProps]
    }
    
    extension [Self <: TableTooltipProps](x: Self) {
      
      inline def setRenderContent(value: CallbackTo[Element]): Self = StObject.set(x, "renderContent", value.toJsFn)
      
      inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      inline def setRows(value: js.Array[js.Array[Node]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: js.Array[Node]*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
