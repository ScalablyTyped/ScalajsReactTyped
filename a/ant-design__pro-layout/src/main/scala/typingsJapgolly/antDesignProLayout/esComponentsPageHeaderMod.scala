package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libAvatarAvatarMod.AvatarProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPageHeaderMod {
  
  @JSImport("@ant-design/pro-layout/es/components/PageHeader", "PageHeader")
  @js.native
  val PageHeader: FC[PageHeaderProps] = js.native
  
  trait PageHeaderProps extends StObject {
    
    var avatar: js.UndefOr[AvatarProps] = js.undefined
    
    var backIcon: js.UndefOr[Node] = js.undefined
    
    var breadcrumb: js.UndefOr[BreadcrumbProps | Element] = js.undefined
    
    var breadcrumbRender: js.UndefOr[js.Function2[/* props */ this.type, /* defaultDom */ Node, Node]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[Node] = js.undefined
    
    var footer: js.UndefOr[Node] = js.undefined
    
    var ghost: js.UndefOr[Boolean] = js.undefined
    
    var onBack: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[Node] = js.undefined
    
    var tags: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBackIcon(value: VdomNode): Self = StObject.set(x, "backIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBackIconNull: Self = StObject.set(x, "backIcon", null)
      
      inline def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
      
      inline def setBackIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "backIcon", js.Array(value*))
      
      inline def setBackIconVdomElement(value: VdomElement): Self = StObject.set(x, "backIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBreadcrumb(value: BreadcrumbProps | Element): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbRender(value: (PageHeaderProps, /* defaultDom */ Node) => Node): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction2(value))
      
      inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
      
      inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      inline def setBreadcrumbVdomElement(value: VdomElement): Self = StObject.set(x, "breadcrumb", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setOnBack(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): Self = StObject.set(x, "onBack", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
      
      inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: VdomNode): Self = StObject.set(x, "subTitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubTitleNull: Self = StObject.set(x, "subTitle", null)
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setSubTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subTitle", js.Array(value*))
      
      inline def setSubTitleVdomElement(value: VdomElement): Self = StObject.set(x, "subTitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTags(value: Element | js.Array[Element]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Element*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTagsVdomElement(value: VdomElement): Self = StObject.set(x, "tags", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
