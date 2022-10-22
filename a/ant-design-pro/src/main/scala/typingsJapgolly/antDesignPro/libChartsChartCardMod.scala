package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libCardCardMod.CardProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsChartCardMod {
  
  @JSImport("ant-design-pro/lib/Charts/ChartCard", JSImport.Default)
  @js.native
  open class default () extends Component[IChartCardProps, Any, Any]
  
  type ChartCard = japgolly.scalajs.react.facade.React.Component[IChartCardProps & js.Object, js.Object]
  
  trait IChartCardProps
    extends StObject
       with CardProps {
    
    var action: js.UndefOr[Node] = js.undefined
    
    var avatar: js.UndefOr[Node] = js.undefined
    
    var contentHeight: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[Node] = js.undefined
    
    @JSName("title")
    var title_IChartCardProps: Node
    
    var total: js.UndefOr[Node | Double | (js.Function0[Node | Double])] = js.undefined
  }
  object IChartCardProps {
    
    inline def apply(): IChartCardProps = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[IChartCardProps]
    }
    
    extension [Self <: IChartCardProps](x: Self) {
      
      inline def setAction(value: VdomNode): Self = StObject.set(x, "action", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setActionVdomElement(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAvatar(value: VdomNode): Self = StObject.set(x, "avatar", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value*))
      
      inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTotal(value: Node | Double | (js.Function0[Node | Double])): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalCallbackTo(value: CallbackTo[Node | Double]): Self = StObject.set(x, "total", value.toJsFn)
      
      inline def setTotalNull: Self = StObject.set(x, "total", null)
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setTotalVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "total", js.Array(value*))
      
      inline def setTotalVdomElement(value: VdomElement): Self = StObject.set(x, "total", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
