package typingsJapgolly.reactNotificationsComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNotificationsComponent.anon.Fade
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-center`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-full`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-left`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-right`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in-out`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-out`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`step-end`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`step-start`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`top-center`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`top-full`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`top-left`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.`top-right`
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.bottom
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.center
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.danger
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.ease
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.info
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.linear
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.success
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.top
import typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notifications-component", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ReactNotificationProps, js.Object, Any] {
    def this(props: ReactNotificationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactNotificationProps, context: Any) = this()
  }
  
  object store {
    
    @JSImport("react-notifications-component", "store")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addNotification(options: ReactNotificationOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addNotification")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def removeNotification(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNotification")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait DismissOptions extends StObject {
    
    var click: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var onScreen: js.UndefOr[Boolean] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var waitForAnimation: js.UndefOr[Boolean] = js.undefined
  }
  object DismissOptions {
    
    inline def apply(): DismissOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DismissOptions]
    }
    
    extension [Self <: DismissOptions](x: Self) {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnScreen(value: Boolean): Self = StObject.set(x, "onScreen", value.asInstanceOf[js.Any])
      
      inline def setOnScreenUndefined: Self = StObject.set(x, "onScreen", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setWaitForAnimation(value: Boolean): Self = StObject.set(x, "waitForAnimation", value.asInstanceOf[js.Any])
      
      inline def setWaitForAnimationUndefined: Self = StObject.set(x, "waitForAnimation", js.undefined)
    }
  }
  
  trait ReactNotificationOptions extends StObject {
    
    var animationIn: js.UndefOr[js.Array[String]] = js.undefined
    
    var animationOut: js.UndefOr[js.Array[String]] = js.undefined
    
    var container: `top-full` | `top-left` | `top-right` | `top-center` | center | `bottom-full` | `bottom-left` | `bottom-right` | `bottom-center`
    
    var content: js.UndefOr[ComponentClassP[js.Object] | FunctionComponent[js.Object] | Node] = js.undefined
    
    var dismiss: js.UndefOr[DismissOptions] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var insert: js.UndefOr[top | bottom] = js.undefined
    
    var message: js.UndefOr[String | Node | FunctionComponent[js.Object]] = js.undefined
    
    var onRemoval: js.UndefOr[js.Function2[/* id */ String, /* removedBy */ Any, Unit]] = js.undefined
    
    var slidingEnter: js.UndefOr[TransitionOptions] = js.undefined
    
    var slidingExit: js.UndefOr[TransitionOptions] = js.undefined
    
    var title: js.UndefOr[String | Node | FunctionComponent[js.Object]] = js.undefined
    
    var touchRevert: js.UndefOr[TransitionOptions] = js.undefined
    
    var touchSlidingExit: js.UndefOr[Fade] = js.undefined
    
    var `type`: js.UndefOr[
        success | danger | info | typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
      ] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ReactNotificationOptions {
    
    inline def apply(
      container: `top-full` | `top-left` | `top-right` | `top-center` | center | `bottom-full` | `bottom-left` | `bottom-right` | `bottom-center`
    ): ReactNotificationOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactNotificationOptions]
    }
    
    extension [Self <: ReactNotificationOptions](x: Self) {
      
      inline def setAnimationIn(value: js.Array[String]): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationInUndefined: Self = StObject.set(x, "animationIn", js.undefined)
      
      inline def setAnimationInVarargs(value: String*): Self = StObject.set(x, "animationIn", js.Array(value*))
      
      inline def setAnimationOut(value: js.Array[String]): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      inline def setAnimationOutUndefined: Self = StObject.set(x, "animationOut", js.undefined)
      
      inline def setAnimationOutVarargs(value: String*): Self = StObject.set(x, "animationOut", js.Array(value*))
      
      inline def setContainer(
        value: `top-full` | `top-left` | `top-right` | `top-center` | center | `bottom-full` | `bottom-left` | `bottom-right` | `bottom-center`
      ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ComponentClassP[js.Object] | FunctionComponent[js.Object] | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDismiss(value: DismissOptions): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
      
      inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInsert(value: top | bottom): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setMessage(value: String | Node | FunctionComponent[js.Object]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnRemoval(value: (/* id */ String, /* removedBy */ Any) => Callback): Self = StObject.set(x, "onRemoval", js.Any.fromFunction2((t0: /* id */ String, t1: /* removedBy */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnRemovalUndefined: Self = StObject.set(x, "onRemoval", js.undefined)
      
      inline def setSlidingEnter(value: TransitionOptions): Self = StObject.set(x, "slidingEnter", value.asInstanceOf[js.Any])
      
      inline def setSlidingEnterUndefined: Self = StObject.set(x, "slidingEnter", js.undefined)
      
      inline def setSlidingExit(value: TransitionOptions): Self = StObject.set(x, "slidingExit", value.asInstanceOf[js.Any])
      
      inline def setSlidingExitUndefined: Self = StObject.set(x, "slidingExit", js.undefined)
      
      inline def setTitle(value: String | Node | FunctionComponent[js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTouchRevert(value: TransitionOptions): Self = StObject.set(x, "touchRevert", value.asInstanceOf[js.Any])
      
      inline def setTouchRevertUndefined: Self = StObject.set(x, "touchRevert", js.undefined)
      
      inline def setTouchSlidingExit(value: Fade): Self = StObject.set(x, "touchSlidingExit", value.asInstanceOf[js.Any])
      
      inline def setTouchSlidingExitUndefined: Self = StObject.set(x, "touchSlidingExit", js.undefined)
      
      inline def setType(
        value: success | danger | info | typingsJapgolly.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ReactNotificationProps extends StObject {
    
    var breakpoint: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var types: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ReactNotificationProps {
    
    inline def apply(): ReactNotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNotificationProps]
    }
    
    extension [Self <: ReactNotificationProps](x: Self) {
      
      inline def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait TransitionOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var timingFunction: js.UndefOr[
        ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`
      ] = js.undefined
  }
  object TransitionOptions {
    
    inline def apply(): TransitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOptions]
    }
    
    extension [Self <: TransitionOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTimingFunction(value: ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
      
      inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    }
  }
}
