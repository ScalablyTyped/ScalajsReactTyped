package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageSectionMod {
  
  @JSImport("wix-style-react/dist/types/PageSection", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PageSectionProps, js.Object, Any]
  
  type PageSection = PureComponent[PageSectionProps, js.Object, Any]
  
  trait PageSectionProps extends StObject {
    
    var actionsBar: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var title: Node
  }
  object PageSectionProps {
    
    inline def apply(): PageSectionProps = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[PageSectionProps]
    }
    
    extension [Self <: PageSectionProps](x: Self) {
      
      inline def setActionsBar(value: VdomNode): Self = StObject.set(x, "actionsBar", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionsBarNull: Self = StObject.set(x, "actionsBar", null)
      
      inline def setActionsBarUndefined: Self = StObject.set(x, "actionsBar", js.undefined)
      
      inline def setActionsBarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actionsBar", js.Array(value*))
      
      inline def setActionsBarVdomElement(value: VdomElement): Self = StObject.set(x, "actionsBar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
