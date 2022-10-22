package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.anon.Href
import typingsJapgolly.antDesignPro.antDesignProStrings.`403`
import typingsJapgolly.antDesignPro.antDesignProStrings.`404`
import typingsJapgolly.antDesignPro.antDesignProStrings.`500`
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionMod {
  
  @JSImport("ant-design-pro/lib/Exception", JSImport.Default)
  @js.native
  open class default () extends Component[ExceptionProps[Href], Any, Any]
  
  type Exception = japgolly.scalajs.react.facade.React.Component[ExceptionProps[Href] & js.Object, js.Object]
  
  trait ExceptionProps[L] extends StObject {
    
    var actions: js.UndefOr[Node] = js.undefined
    
    var backText: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var desc: js.UndefOr[Node] = js.undefined
    
    var img: js.UndefOr[String] = js.undefined
    
    var linkElement: js.UndefOr[String | ComponentType[L]] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var `type`: js.UndefOr[`403` | `404` | `500`] = js.undefined
  }
  object ExceptionProps {
    
    inline def apply[L](): ExceptionProps[L] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExceptionProps[L]]
    }
    
    extension [Self <: ExceptionProps[?], L](x: Self & ExceptionProps[L]) {
      
      inline def setActions(value: VdomNode): Self = StObject.set(x, "actions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActionsVdomElement(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBackText(value: VdomNode): Self = StObject.set(x, "backText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBackTextNull: Self = StObject.set(x, "backText", null)
      
      inline def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
      
      inline def setBackTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "backText", js.Array(value*))
      
      inline def setBackTextVdomElement(value: VdomElement): Self = StObject.set(x, "backText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDesc(value: VdomNode): Self = StObject.set(x, "desc", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescNull: Self = StObject.set(x, "desc", null)
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDescVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "desc", js.Array(value*))
      
      inline def setDescVdomElement(value: VdomElement): Self = StObject.set(x, "desc", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setLinkElement(value: String | ComponentType[L]): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      inline def setLinkElementUndefined: Self = StObject.set(x, "linkElement", js.undefined)
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setType(value: `403` | `404` | `500`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
