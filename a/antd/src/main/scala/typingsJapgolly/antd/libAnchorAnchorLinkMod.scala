package typingsJapgolly.antd

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libAnchorAnchorMod.AntAnchor
import typingsJapgolly.antd.libConfigProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorAnchorLinkMod {
  
  @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
  @js.native
  open class default () extends AnchorLink
  object default {
    
    @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/anchor/AnchorLink", "default.contextType")
    @js.native
    def contextType: Context[AntAnchor] = js.native
    inline def contextType_=(x: Context[AntAnchor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/anchor/AnchorLink", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/anchor/AnchorLink", "default.defaultProps.href")
      @js.native
      def href: String = js.native
      inline def href_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("href")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorLink extends Component[AnchorLinkProps, Any, AntAnchor] {
    
    @JSName("componentDidMount")
    def componentDidMount_MAnchorLink(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchorLink(hasPrevHref: AnchorLinkProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnchorLink(): Unit = js.native
    
    @JSName("context")
    var context_AnchorLink: AntAnchor = js.native
    
    def handleClick(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
    
    def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  trait AnchorLinkProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var href: String
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: Node
  }
  object AnchorLinkProps {
    
    inline def apply(href: String): AnchorLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[AnchorLinkProps]
    }
    
    extension [Self <: AnchorLinkProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
