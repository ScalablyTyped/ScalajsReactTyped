package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.HasBackgroundImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageHeaderMod {
  
  @JSImport("wix-style-react/dist/types/PageHeader", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PageHeaderProps, js.Object, Any]
  
  type ActionsBarRenderFn = js.Function1[/* data */ HasBackgroundImage, Node]
  
  type BreadcrumbsRenderFn = js.Function1[/* minimized */ Boolean, Node]
  
  type PageHeader = PureComponent[PageHeaderProps, js.Object, Any]
  
  trait PageHeaderProps extends StObject {
    
    var actionsBar: js.UndefOr[Node | ActionsBarRenderFn] = js.undefined
    
    var breadcrumbs: js.UndefOr[Node | BreadcrumbsRenderFn] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hasBackgroundImage: js.UndefOr[Boolean] = js.undefined
    
    var minimized: js.UndefOr[Boolean] = js.undefined
    
    var onBackClicked: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var showBackButton: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node | TitleRenderFn] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setActionsBar(value: Node | ActionsBarRenderFn): Self = StObject.set(x, "actionsBar", value.asInstanceOf[js.Any])
      
      inline def setActionsBarFunction1(value: /* data */ HasBackgroundImage => Node): Self = StObject.set(x, "actionsBar", js.Any.fromFunction1(value))
      
      inline def setActionsBarNull: Self = StObject.set(x, "actionsBar", null)
      
      inline def setActionsBarUndefined: Self = StObject.set(x, "actionsBar", js.undefined)
      
      inline def setActionsBarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actionsBar", js.Array(value*))
      
      inline def setActionsBarVdomElement(value: VdomElement): Self = StObject.set(x, "actionsBar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBreadcrumbs(value: Node | BreadcrumbsRenderFn): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbsFunction1(value: /* minimized */ Boolean => Node): Self = StObject.set(x, "breadcrumbs", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbsNull: Self = StObject.set(x, "breadcrumbs", null)
      
      inline def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
      
      inline def setBreadcrumbsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "breadcrumbs", js.Array(value*))
      
      inline def setBreadcrumbsVdomElement(value: VdomElement): Self = StObject.set(x, "breadcrumbs", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHasBackgroundImage(value: Boolean): Self = StObject.set(x, "hasBackgroundImage", value.asInstanceOf[js.Any])
      
      inline def setHasBackgroundImageUndefined: Self = StObject.set(x, "hasBackgroundImage", js.undefined)
      
      inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      inline def setMinimizedUndefined: Self = StObject.set(x, "minimized", js.undefined)
      
      inline def setOnBackClicked(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBackClicked", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBackClickedUndefined: Self = StObject.set(x, "onBackClicked", js.undefined)
      
      inline def setShowBackButton(value: Boolean): Self = StObject.set(x, "showBackButton", value.asInstanceOf[js.Any])
      
      inline def setShowBackButtonUndefined: Self = StObject.set(x, "showBackButton", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: Node | TitleRenderFn): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* minimized */ Boolean => Node): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type TitleRenderFn = js.Function1[/* minimized */ Boolean, Node]
}
