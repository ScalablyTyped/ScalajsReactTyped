package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.cathoQuantum.anon.BreakpointsColors
import typingsJapgolly.cathoQuantum.anon.`17`
import typingsJapgolly.cathoQuantum.cardFooterMod.Footer
import typingsJapgolly.cathoQuantum.cardHeaderTextMod.HeaderText
import typingsJapgolly.cathoQuantum.cardTitleMod.Title
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("@catho/quantum/Modal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Modal", "default.Content")
    @js.native
    def Content: ModalContent = js.native
    inline def Content_=(x: ModalContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Footer")
    @js.native
    def Footer: typingsJapgolly.cathoQuantum.cardFooterMod.Footer = js.native
    inline def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Header")
    @js.native
    def Header: ModalHeader = js.native
    
    @JSImport("@catho/quantum/Modal", "default.HeaderText")
    @js.native
    def HeaderText: typingsJapgolly.cathoQuantum.cardHeaderTextMod.HeaderText = js.native
    inline def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    inline def Header_=(x: ModalHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Title")
    @js.native
    def Title: typingsJapgolly.cathoQuantum.cardTitleMod.Title = js.native
    inline def Title_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
  
  type Modal = japgolly.scalajs.react.facade.React.Component[ModalProps & js.Object, js.Object]
  
  type ModalContent = ComponentType[StaticProps]
  
  type ModalHeader = ComponentType[StaticProps]
  
  trait ModalProps extends StObject {
    
    var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
    
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent | ReactTouchEventFrom[Element]], Unit]
      ] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[BreakpointsColors] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (japgolly.scalajs.react.facade.React.Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setOnClick(value: /* e */ js.UndefOr[MouseEvent | ReactTouchEventFrom[Element]] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[MouseEvent | ReactTouchEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setTheme(value: BreakpointsColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait StaticProps extends StObject {
    
    var theme: js.UndefOr[`17`] = js.undefined
  }
  object StaticProps {
    
    inline def apply(): StaticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticProps]
    }
    
    extension [Self <: StaticProps](x: Self) {
      
      inline def setTheme(value: `17`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
