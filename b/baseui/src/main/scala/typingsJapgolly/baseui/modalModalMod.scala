package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.anon.IsVisible
import typingsJapgolly.baseui.anon.OmitSharedStylePropsArgchAnimate
import typingsJapgolly.baseui.anon.`15`
import typingsJapgolly.baseui.modalTypesMod.CloseSource
import typingsJapgolly.baseui.modalTypesMod.ModalOverrides
import typingsJapgolly.baseui.modalTypesMod.ModalProps
import typingsJapgolly.baseui.modalTypesMod.ModalState
import typingsJapgolly.baseui.modalTypesMod.RoleProp
import typingsJapgolly.baseui.modalTypesMod.SizeProp
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod {
  
  @JSImport("baseui/modal/modal", JSImport.Default)
  @js.native
  open class default () extends Modal
  object default {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/modal/types.ModalProps> */
    object defaultProps {
      
      @JSImport("baseui/modal/modal", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/modal/modal", "default.defaultProps.animate")
      @js.native
      def animate: js.UndefOr[Boolean] = js.native
      inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.children")
      @js.native
      def children: js.UndefOr[Node | js.Function0[Node]] = js.native
      inline def children_=(x: js.UndefOr[Node | js.Function0[Node]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.closeable")
      @js.native
      def closeable: js.UndefOr[Boolean] = js.native
      inline def closeable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.isOpen")
      @js.native
      def isOpen: js.UndefOr[Boolean] = js.native
      inline def isOpen_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.name")
      @js.native
      def name: js.UndefOr[String] = js.native
      inline def name_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function1[/* a */ `15`, Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function1[/* a */ `15`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[ModalOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[ModalOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.role")
      @js.native
      def role: js.UndefOr[RoleProp] = js.native
      inline def role_=(x: js.UndefOr[RoleProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal/modal", "default.defaultProps.size")
      @js.native
      def size: js.UndefOr[SizeProp] = js.native
      inline def size_=(x: js.UndefOr[SizeProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Modal extends Component[ModalProps, ModalState, Any] {
    
    def animateOutComplete(): Unit = js.native
    
    var animateOutTimer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeoutID */ Any) | Null
      ] = js.native
    
    var animateStartTimer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationFrameID */ Any) | Null
      ] = js.native
    
    def clearTimers(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MModal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MModal(prevProps: ModalProps, prevState: ModalState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModal(): Unit = js.native
    
    var dialogContainerRef: RefHandle[HTMLElement] = js.native
    
    def didClose(): Unit = js.native
    
    def didOpen(): Unit = js.native
    
    def disableMountNodeScroll(): Unit = js.native
    
    def getChildren(): Any = js.native
    
    def getMountNode(): HTMLElement = js.native
    
    def getSharedProps(): OmitSharedStylePropsArgchAnimate = js.native
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
    
    var lastFocus: js.UndefOr[HTMLElement | Null] = js.native
    
    var lastMountNodeOverflowStyle: js.UndefOr[String | Null] = js.native
    
    def onBackdropClick(): Unit = js.native
    
    def onCloseClick(): Unit = js.native
    
    def onDocumentClick(e: MouseEvent): Unit = js.native
    
    def onEscape(): Unit = js.native
    
    def renderModal(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def resetMountNodeScroll(): Unit = js.native
    
    var rootRef: RefHandle[HTMLElement] = js.native
    
    @JSName("state")
    var state_Modal: IsVisible = js.native
    
    def triggerClose(): Unit = js.native
    def triggerClose(source: CloseSource): Unit = js.native
  }
}
