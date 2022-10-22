package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.baseui.anon.IsRendered
import typingsJapgolly.baseui.anon.PartialSharedStylePropsAr
import typingsJapgolly.baseui.anon.`259`
import typingsJapgolly.baseui.toastTypesMod.ToastPrivateState
import typingsJapgolly.baseui.toastTypesMod.ToastProps
import typingsJapgolly.baseui.toastTypesMod.ToastPropsShape
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastToastMod {
  
  @JSImport("baseui/toast/toast", JSImport.Default)
  @js.native
  open class default protected () extends Toast {
    def this(props: ToastProps) = this()
  }
  object default {
    
    @JSImport("baseui/toast/toast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/toast/toast", "default.defaultProps")
    @js.native
    def defaultProps: ToastPropsShape = js.native
    inline def defaultProps_=(x: ToastPropsShape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Toast extends Component[ToastProps, ToastPrivateState, Any] {
    
    def animateIn(): Unit = js.native
    
    var animateInTimer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeoutID */ Any) | Null
      ] = js.native
    
    def animateOut(): Unit = js.native
    def animateOut(callback: js.Function0[Any]): Unit = js.native
    
    var animateOutCompleteTimer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeoutID */ Any) | Null
      ] = js.native
    
    var autoHideTimeout: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeoutID */ Any) | Null
      ] = js.native
    
    def clearTimeout(): Unit = js.native
    
    var closeRef: js.UndefOr[`259` | Null] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToast(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MToast(prevProps: ToastProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToast(): Unit = js.native
    
    def dismiss(): Unit = js.native
    
    def getSharedProps(): PartialSharedStylePropsAr = js.native
    
    def handleBlur(event: ReactFocusEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactFocusEventFrom[Element]): Unit = js.native
    
    def onBlur(e: ReactFocusEventFrom[Element]): Unit = js.native
    
    def onFocus(e: ReactFocusEventFrom[Element]): Unit = js.native
    
    def onMouseEnter(e: ReactMouseEventFrom[Element]): Unit = js.native
    
    def onMouseLeave(e: ReactMouseEventFrom[Element]): Unit = js.native
    
    var previouslyFocusedElement: js.UndefOr[SVGElement | HTMLElement | Null] = js.native
    
    def startTimeout(): Unit = js.native
    
    @JSName("state")
    var state_Toast: IsRendered = js.native
  }
}
