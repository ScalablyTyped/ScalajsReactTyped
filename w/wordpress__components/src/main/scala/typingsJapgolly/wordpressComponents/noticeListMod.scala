package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.noticeListMod.NoticeList.Props
import typingsJapgolly.wordpressComponents.noticeMod.Notice.Action
import typingsJapgolly.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeListMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/notice/list", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object NoticeList {
    
    /* Inlined parent std.Omit<@wordpress/components.@wordpress/components/notice.default.Props, 'children' | 'onRemove'> */
    trait Notice extends StObject {
      
      var actions: js.UndefOr[js.Array[Action]] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      var content: Node
      
      var id: String
      
      var isDismissible: js.UndefOr[Boolean] = js.undefined
      
      var status: js.UndefOr[Status] = js.undefined
    }
    object Notice {
      
      inline def apply(id: String): Notice = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], content = null)
        __obj.asInstanceOf[Notice]
      }
      
      extension [Self <: Notice](x: Self) {
        
        inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
        
        inline def setContentNull: Self = StObject.set(x, "content", null)
        
        inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Array of notices to render.
        */
      var notices: js.Array[Notice]
      
      /**
        * Function called when a notice should be removed / dismissed.
        */
      var onRemove: js.UndefOr[js.Function1[/* noticeId */ String, Unit]] = js.undefined
    }
    object Props {
      
      inline def apply(notices: js.Array[Notice]): Props = {
        val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
        
        inline def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value*))
        
        inline def setOnRemove(value: /* noticeId */ String => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: /* noticeId */ String) => value(t0).runNow()))
        
        inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      }
    }
  }
}
