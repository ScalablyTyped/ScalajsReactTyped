package typingsJapgolly.reactToastNotifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactToastNotifications.anon.Appearance
import typingsJapgolly.reactToastNotifications.anon.Toast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toast-notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  val DefaultToast: ComponentType[ToastProps] = js.native
  
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  val DefaultToastContainer: ComponentType[ToastContainerProps] = js.native
  
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  val ToastConsumer: ComponentType[ToastConsumerProps] = js.native
  
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  val ToastProvider: ComponentType[ToastProviderProps] = js.native
  
  inline def useToasts(): typingsJapgolly.reactToastNotifications.anon.AddToast = ^.asInstanceOf[js.Dynamic].applyDynamic("useToasts")().asInstanceOf[typingsJapgolly.reactToastNotifications.anon.AddToast]
  
  inline def withToastManager(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withToastManager")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  type AddToast = js.Function3[
    /* content */ Node, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.error
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.info
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.success
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.warning
  */
  trait AppearanceTypes extends StObject
  object AppearanceTypes {
    
    inline def error: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.error = "error".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.error]
    
    inline def info: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.info = "info".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.info]
    
    inline def success: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.success = "success".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.success]
    
    inline def warning: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.warning = "warning".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.warning]
  }
  
  trait Options
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var appearance: js.UndefOr[AppearanceTypes] = js.undefined
    
    var autoDismiss: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppearance(value: AppearanceTypes): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAutoDismiss(value: Boolean): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnDismiss(value: /* id */ String => Callback): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-left`
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-center`
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-right`
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-left`
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-center`
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-right`
  */
  trait Placement extends StObject
  object Placement {
    
    inline def `bottom-center`: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-center`]
    
    inline def `bottom-left`: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-left`]
    
    inline def `bottom-right`: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`bottom-right`]
    
    inline def `top-center`: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-center` = "top-center".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-center`]
    
    inline def `top-left`: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.`top-right`]
  }
  
  type RemoveAllToasts = js.Function0[Unit]
  
  type RemoveToast = js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
  
  trait ToastConsumerContext extends StObject {
    
    var add: AddToast
    
    var remove: RemoveToast
    
    var toasts: js.Array[Appearance]
  }
  object ToastConsumerContext {
    
    inline def apply(
      add: (/* content */ Node, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback,
      remove: (/* id */ String, /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback,
      toasts: js.Array[Appearance]
    ): ToastConsumerContext = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction3((t0: /* content */ Node, t1: /* options */ js.UndefOr[Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (add(t0, t1, t2)).runNow()), remove = js.Any.fromFunction2((t0: /* id */ String, t1: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (remove(t0, t1)).runNow()), toasts = toasts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastConsumerContext]
    }
    
    extension [Self <: ToastConsumerContext](x: Self) {
      
      inline def setAdd(
        value: (/* content */ Node, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
      ): Self = StObject.set(x, "add", js.Any.fromFunction3((t0: /* content */ Node, t1: /* options */ js.UndefOr[Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemove(
        value: (/* id */ String, /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
      ): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: /* id */ String, t1: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (value(t0, t1)).runNow()))
      
      inline def setToasts(value: js.Array[Appearance]): Self = StObject.set(x, "toasts", value.asInstanceOf[js.Any])
      
      inline def setToastsVarargs(value: Appearance*): Self = StObject.set(x, "toasts", js.Array(value*))
    }
  }
  
  trait ToastConsumerProps extends StObject {
    
    def children(context: ToastConsumerContext): Node
  }
  object ToastConsumerProps {
    
    inline def apply(children: ToastConsumerContext => Node): ToastConsumerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ToastConsumerProps]
    }
    
    extension [Self <: ToastConsumerProps](x: Self) {
      
      inline def setChildren(value: ToastConsumerContext => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait ToastContainerProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var hasToasts: Boolean
    
    var placement: Placement
  }
  object ToastContainerProps {
    
    inline def apply(hasToasts: Boolean, placement: Placement): ToastContainerProps = {
      val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ToastContainerProps]
    }
    
    extension [Self <: ToastContainerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHasToasts(value: Boolean): Self = StObject.set(x, "hasToasts", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToastProps extends StObject {
    
    var appearance: AppearanceTypes = js.native
    
    var autoDismiss: Boolean | Double = js.native
    
    // inherited from ToastProvider
    var autoDismissTimeout: Double = js.native
    
    // inherited from ToastProvider
    var children: Node = js.native
    
    var isRunning: Boolean = js.native
    
    def onDismiss(): Unit = js.native
    def onDismiss(id: String): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    var placement: Placement = js.native
    
    var transitionDuration: Double = js.native
    
    // inherited from ToastProvider
    var transitionState: TransitionState = js.native
  }
  
  trait ToastProviderProps extends StObject {
    
    var autoDismiss: js.UndefOr[Boolean | Double] = js.undefined
    
    var autoDismissTimeout: js.UndefOr[Double] = js.undefined
    
    var children: Node
    
    var components: js.UndefOr[Toast] = js.undefined
    
    var newestOnTop: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var portalTargetSelector: js.UndefOr[String] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ToastProviderProps {
    
    inline def apply(): ToastProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ToastProviderProps]
    }
    
    extension [Self <: ToastProviderProps](x: Self) {
      
      inline def setAutoDismiss(value: Boolean | Double): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissTimeout(value: Double): Self = StObject.set(x, "autoDismissTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissTimeoutUndefined: Self = StObject.set(x, "autoDismissTimeout", js.undefined)
      
      inline def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponents(value: Toast): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
      
      inline def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPortalTargetSelector(value: String): Self = StObject.set(x, "portalTargetSelector", value.asInstanceOf[js.Any])
      
      inline def setPortalTargetSelectorUndefined: Self = StObject.set(x, "portalTargetSelector", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.entering
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.entered
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.exiting
    - typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.exited
  */
  trait TransitionState extends StObject
  object TransitionState {
    
    inline def entered: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.entered = "entered".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.entered]
    
    inline def entering: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.entering = "entering".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.entering]
    
    inline def exited: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.exited = "exited".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.exited]
    
    inline def exiting: typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.exiting = "exiting".asInstanceOf[typingsJapgolly.reactToastNotifications.reactToastNotificationsStrings.exiting]
  }
  
  trait UpdateOptions
    extends StObject
       with Options {
    
    var content: js.UndefOr[Node] = js.undefined
  }
  object UpdateOptions {
    
    inline def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    extension [Self <: UpdateOptions](x: Self) {
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type UpdateToast = js.Function3[
    /* id */ String, 
    /* options */ js.UndefOr[UpdateOptions], 
    /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]], 
    Unit
  ]
}
