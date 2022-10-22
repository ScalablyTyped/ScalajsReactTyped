package typingsJapgolly.wordpressNotices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wordpressNotices.anon.TypeofimportedActions
import typingsJapgolly.wordpressNotices.anon.TypeofimportedSelectors
import typingsJapgolly.wordpressNotices.wordpressNoticesStrings.coreSlashnotices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_corenotices(key: coreSlashnotices): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_corenotices(key: coreSlashnotices): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressNotices.mod.ButtonAction
    - typingsJapgolly.wordpressNotices.mod.URLAction
  */
  trait Action extends StObject
  object Action {
    
    inline def ButtonAction(label: String, onClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): typingsJapgolly.wordpressNotices.mod.ButtonAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClick(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.wordpressNotices.mod.ButtonAction]
    }
    
    inline def URLAction(label: String, url: String): typingsJapgolly.wordpressNotices.mod.URLAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.wordpressNotices.mod.URLAction]
    }
  }
  
  trait BaseAction extends StObject {
    
    var label: String
  }
  object BaseAction {
    
    inline def apply(label: String): BaseAction = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAction]
    }
    
    extension [Self <: BaseAction](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
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
  
  trait Notice extends StObject {
    
    /**
      * Notice message as raw HTML. Intended to serve primarily for compatibility of server-rendered notices, and SHOULD
      * NOT be used for notices. It is subject to removal without notice.
      */
    var __unstableHTML: String
    
    /**
      * User actions to present with notice.
      */
    var actions: js.Array[Action]
    
    /**
      * Notice message.
      */
    var content: String
    
    /**
      * Unique identifier of notice.
      */
    var id: String
    
    /**
      * Whether the notice can be dismissed by user. Defaults to `true`
      */
    var isDismissible: Boolean
    
    /**
      * Whether the notice content should be announced to screen readers. Defaults to `true`.
      */
    var speak: Boolean
    
    /**
      * Audibly announced message text used by assistive technologies.
      */
    var spokenMessage: String
    
    /**
      * Status of notice, one of `success`, `info`, `error`, or `warning`. Defaults to `info`.
      */
    var status: Status
    
    /**
      * Type of notice, one of `default`, or `snackbar`. Defaults to `default`.
      * @defaultValue `'global'`
      */
    var `type`: NoticeType
  }
  object Notice {
    
    inline def apply(
      __unstableHTML: String,
      actions: js.Array[Action],
      content: String,
      id: String,
      isDismissible: Boolean,
      speak: Boolean,
      spokenMessage: String,
      status: Status,
      `type`: NoticeType
    ): Notice = {
      val __obj = js.Dynamic.literal(__unstableHTML = __unstableHTML.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], speak = speak.asInstanceOf[js.Any], spokenMessage = spokenMessage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notice]
    }
    
    extension [Self <: Notice](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
      
      inline def setSpeak(value: Boolean): Self = StObject.set(x, "speak", value.asInstanceOf[js.Any])
      
      inline def setSpokenMessage(value: String): Self = StObject.set(x, "spokenMessage", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set__unstableHTML(value: String): Self = StObject.set(x, "__unstableHTML", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.snackbar
    - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.default
  */
  trait NoticeType extends StObject
  object NoticeType {
    
    inline def default: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.default = "default".asInstanceOf[typingsJapgolly.wordpressNotices.wordpressNoticesStrings.default]
    
    inline def snackbar: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.snackbar = "snackbar".asInstanceOf[typingsJapgolly.wordpressNotices.wordpressNoticesStrings.snackbar]
  }
  
  trait Options extends StObject {
    
    /**
      * User actions to be presented with notice.
      */
    var actions: js.Array[Action]
    
    /**
      * Context under which to group notice.
      * @defaultValue `'global'`
      */
    var context: String
    
    /**
      * Whether the notice includes
      * an explict dismiss button and
      * can't be dismissed by clicking
      * the body of the notice.
      * @defaultValue `false`
      */
    var explicitDismiss: Boolean
    
    /**
      *  An icon displayed with the notice.
      * @defaultValue `null`
      */
    var icon: Null | typingsJapgolly.react.mod.global.JSX.Element
    
    /**
      * Identifier for notice. Automatically assigned if not specified.
      */
    var id: String
    
    /**
      * Whether the notice can be dismissed by user.
      * @defaultValue `true`
      */
    var isDismissible: Boolean
    
    /**
      *  Called when the notice is dismissed.
      */
    def onDismiss(): Unit
    
    /**
      * Whether the notice content should be announced to screen readers.
      * @defaultValue `true`
      */
    var speak: Boolean
    
    /**
      * The type of notice.
      * @defaultValue `'default'`
      */
    var `type`: NoticeType
  }
  object Options {
    
    inline def apply(
      actions: js.Array[Action],
      context: String,
      explicitDismiss: Boolean,
      id: String,
      isDismissible: Boolean,
      onDismiss: Callback,
      speak: Boolean,
      `type`: NoticeType
    ): Options = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], explicitDismiss = explicitDismiss.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn, speak = speak.asInstanceOf[js.Any], icon = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setExplicitDismiss(value: Boolean): Self = StObject.set(x, "explicitDismiss", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setSpeak(value: Boolean): Self = StObject.set(x, "speak", value.asInstanceOf[js.Any])
      
      inline def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.error
    - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.info
    - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.success
    - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.warning
  */
  trait Status extends StObject
  object Status {
    
    inline def error: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.error = "error".asInstanceOf[typingsJapgolly.wordpressNotices.wordpressNoticesStrings.error]
    
    inline def info: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.info = "info".asInstanceOf[typingsJapgolly.wordpressNotices.wordpressNoticesStrings.info]
    
    inline def success: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.success = "success".asInstanceOf[typingsJapgolly.wordpressNotices.wordpressNoticesStrings.success]
    
    inline def warning: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.warning = "warning".asInstanceOf[typingsJapgolly.wordpressNotices.wordpressNoticesStrings.warning]
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
