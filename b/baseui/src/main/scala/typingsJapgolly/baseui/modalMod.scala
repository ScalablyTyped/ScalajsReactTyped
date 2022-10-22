package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.anon.`15`
import typingsJapgolly.baseui.anon.`16`
import typingsJapgolly.baseui.baseuiStrings.$colors
import typingsJapgolly.baseui.baseuiStrings.$disabled
import typingsJapgolly.baseui.baseuiStrings.$isFocusVisible
import typingsJapgolly.baseui.baseuiStrings.$isLoading
import typingsJapgolly.baseui.baseuiStrings.$isSelected
import typingsJapgolly.baseui.baseuiStrings.$kind
import typingsJapgolly.baseui.baseuiStrings.$shape
import typingsJapgolly.baseui.baseuiStrings.$size
import typingsJapgolly.baseui.baseuiStrings.`type`
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.children
import typingsJapgolly.baseui.baseuiStrings.colors
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.disabled
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.endEnhancer
import typingsJapgolly.baseui.baseuiStrings.escape_
import typingsJapgolly.baseui.baseuiStrings.isLoading
import typingsJapgolly.baseui.baseuiStrings.isSelected
import typingsJapgolly.baseui.baseuiStrings.kind
import typingsJapgolly.baseui.baseuiStrings.onClick
import typingsJapgolly.baseui.baseuiStrings.overrides
import typingsJapgolly.baseui.baseuiStrings.shape
import typingsJapgolly.baseui.baseuiStrings.size
import typingsJapgolly.baseui.baseuiStrings.startEnhancer
import typingsJapgolly.baseui.buttonTypesMod.ButtonProps
import typingsJapgolly.baseui.buttonTypesMod.SharedStyleProps
import typingsJapgolly.baseui.modalFocusOnceMod.Props
import typingsJapgolly.baseui.modalModalMod.default
import typingsJapgolly.baseui.modalTypesMod.ModalOverrides
import typingsJapgolly.baseui.modalTypesMod.RoleProp
import typingsJapgolly.baseui.modalTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.modalTypesMod.SizeProp
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Pick
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("baseui/modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CLOSE_SOURCE {
    
    @JSImport("baseui/modal", "CLOSE_SOURCE.backdrop")
    @js.native
    val backdrop: typingsJapgolly.baseui.baseuiStrings.backdrop = js.native
    
    @JSImport("baseui/modal", "CLOSE_SOURCE.closeButton")
    @js.native
    val closeButton: typingsJapgolly.baseui.baseuiStrings.closeButton = js.native
    
    @JSImport("baseui/modal", "CLOSE_SOURCE.escape")
    @js.native
    val escape: escape_ = js.native
  }
  
  inline def FocusOnce(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusOnce")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/modal", "Modal")
  @js.native
  open class Modal () extends default
  object Modal {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/modal/types.ModalProps> */
    object defaultProps {
      
      @JSImport("baseui/modal", "Modal.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/modal", "Modal.defaultProps.animate")
      @js.native
      def animate: js.UndefOr[Boolean] = js.native
      inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.children")
      @js.native
      def children: js.UndefOr[Node | js.Function0[Node]] = js.native
      inline def children_=(x: js.UndefOr[Node | js.Function0[Node]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.closeable")
      @js.native
      def closeable: js.UndefOr[Boolean] = js.native
      inline def closeable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.isOpen")
      @js.native
      def isOpen: js.UndefOr[Boolean] = js.native
      inline def isOpen_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.name")
      @js.native
      def name: js.UndefOr[String] = js.native
      inline def name_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function1[/* a */ `15`, Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function1[/* a */ `15`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[ModalOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[ModalOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.role")
      @js.native
      def role: js.UndefOr[RoleProp] = js.native
      inline def role_=(x: js.UndefOr[RoleProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/modal", "Modal.defaultProps.size")
      @js.native
      def size: js.UndefOr[SizeProp] = js.native
      inline def size_=(x: js.UndefOr[SizeProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/modal", "ModalBody")
  @js.native
  val ModalBody: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/modal", "ModalButton")
  @js.native
  val ModalButton: ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `16`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ] = js.native
  
  @JSImport("baseui/modal", "ModalFooter")
  @js.native
  val ModalFooter: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/modal", "ModalHeader")
  @js.native
  val ModalHeader: StyletronComponent[div, js.Object] = js.native
  
  object ROLE {
    
    @JSImport("baseui/modal", "ROLE.alertdialog")
    @js.native
    val alertdialog: typingsJapgolly.baseui.baseuiStrings.alertdialog = js.native
    
    @JSImport("baseui/modal", "ROLE.dialog")
    @js.native
    val dialog: typingsJapgolly.baseui.baseuiStrings.dialog = js.native
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/modal", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/modal", "SIZE.auto")
    @js.native
    val auto: typingsJapgolly.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/modal", "SIZE.full")
    @js.native
    val full: typingsJapgolly.baseui.baseuiStrings.full = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/modal", "StyledClose")
  @js.native
  val StyledClose: StyletronComponent[button, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/modal", "StyledDialog")
  @js.native
  val StyledDialog: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/modal", "StyledDialogContainer")
  @js.native
  val StyledDialogContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/modal", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStylePropsArg] = js.native
}
