package typingsJapgolly.reactModalView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactModalView.anon.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-modal-view", JSImport.Default)
  @js.native
  open class default () extends Modal
  
  @js.native
  trait Modal
    extends Component[ModalProps, js.Object, Any] {
    
    def handleBeforeComponentUpdate(props: ModalProps): Unit = js.native
    
    def handleCloseBtnClick(e: MouseEvent): Unit = js.native
    
    def handleComponentUpdate(prevProps: ModalProps, prevState: Visible): Unit = js.native
    
    def handleOverlayClick(e: MouseEvent): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggleVisibility(): Unit = js.native
  }
  
  trait ModalProps extends StObject {
    
    /** Modal contents */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Whether or not the modal is closable */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /** Called when the modal is hidden */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Called when the modal is shown */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Whether or not the modal should be visible */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
