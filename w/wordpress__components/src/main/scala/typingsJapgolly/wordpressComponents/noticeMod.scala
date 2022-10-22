package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wordpressComponents.noticeMod.Notice.Props
import typingsJapgolly.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/notice", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Notice {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressComponents.noticeMod.Notice.ButtonAction
      - typingsJapgolly.wordpressComponents.noticeMod.Notice.URLAction
    */
    trait Action extends StObject
    object Action {
      
      inline def ButtonAction(label: String, onClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): typingsJapgolly.wordpressComponents.noticeMod.Notice.ButtonAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClick(t0).runNow()))
        __obj.asInstanceOf[typingsJapgolly.wordpressComponents.noticeMod.Notice.ButtonAction]
      }
      
      inline def URLAction(label: String, url: String): typingsJapgolly.wordpressComponents.noticeMod.Notice.URLAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.wordpressComponents.noticeMod.Notice.URLAction]
      }
    }
    
    trait BaseAction extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      var label: String
      
      /**
        * Should default classes be removed from the action?
        */
      var noDefaultClasses: js.UndefOr[Boolean] = js.undefined
    }
    object BaseAction {
      
      inline def apply(label: String): BaseAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseAction]
      }
      
      extension [Self <: BaseAction](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setNoDefaultClasses(value: Boolean): Self = StObject.set(x, "noDefaultClasses", value.asInstanceOf[js.Any])
        
        inline def setNoDefaultClassesUndefined: Self = StObject.set(x, "noDefaultClasses", js.undefined)
      }
    }
    
    trait ButtonAction
      extends StObject
         with BaseAction
         with Action {
      
      var onClick: MouseEventHandler[HTMLButtonElement]
    }
    object ButtonAction {
      
      inline def apply(label: String, onClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): ButtonAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClick(t0).runNow()))
        __obj.asInstanceOf[ButtonAction]
      }
      
      extension [Self <: ButtonAction](x: Self) {
        
        inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      }
    }
    
    trait Props extends StObject {
      
      /**
        * An array of action objects.
        */
      var actions: js.UndefOr[js.Array[Action]] = js.undefined
      
      /**
        * Content to render in the notice.
        */
      var children: Node
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the notice should be dismissible or not.
        * @defaultValue true
        */
      var isDismissible: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function called when dismissing the notice.
        */
      var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var status: js.UndefOr[Status] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
        
        inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait URLAction
      extends StObject
         with BaseAction
         with Action {
      
      var url: String
    }
    object URLAction {
      
      inline def apply(label: String, url: String): URLAction = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[URLAction]
      }
      
      extension [Self <: URLAction](x: Self) {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
