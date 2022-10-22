package typingsJapgolly.styledReactModal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalProps, js.Object, Any]
  object default {
    
    @JSImport("styled-react-modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def styled(
      `object`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterpolationFunction<any> */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
    /* static member */
    inline def styled(strings: TemplateStringsArray, interpolations: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
  
  @JSImport("styled-react-modal", "BaseModalBackground")
  @js.native
  val BaseModalBackground: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyledComponent<'div', any> */ Any = js.native
  
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  open class ModalProvider protected ()
    extends Component[ModalProviderProps, js.Object, Any] {
    def this(props: ModalProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProviderProps, context: Any) = this()
  }
  
  type Modal = japgolly.scalajs.react.facade.React.Component[ModalProps & js.Object, js.Object]
  
  trait ModalProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var allowScroll: js.UndefOr[Boolean] = js.undefined
    
    var backgroundProps: js.UndefOr[js.Object] = js.undefined
    
    var beforeClose: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
    
    var beforeOpen: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var isOpen: Boolean
    
    var onBackgroundClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
    
    var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object ModalProps {
    
    inline def apply(isOpen: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(value: Callback): Self = StObject.set(x, "afterOpen", value.toJsFn)
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAllowScroll(value: Boolean): Self = StObject.set(x, "allowScroll", value.asInstanceOf[js.Any])
      
      inline def setAllowScrollUndefined: Self = StObject.set(x, "allowScroll", js.undefined)
      
      inline def setBackgroundProps(value: js.Object): Self = StObject.set(x, "backgroundProps", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPropsUndefined: Self = StObject.set(x, "backgroundProps", js.undefined)
      
      inline def setBeforeClose(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
      
      inline def setBeforeCloseCallback(value: Callback): Self = StObject.set(x, "beforeClose", value.toJsFn)
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeOpen", value.asInstanceOf[js.Any])
      
      inline def setBeforeOpenCallback(value: Callback): Self = StObject.set(x, "beforeOpen", value.toJsFn)
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnBackgroundClick(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onBackgroundClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnBackgroundClickUndefined: Self = StObject.set(x, "onBackgroundClick", js.undefined)
      
      inline def setOnEscapeKeydown(value: /* event */ Event => Callback): Self = StObject.set(x, "onEscapeKeydown", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setOnEscapeKeydownUndefined: Self = StObject.set(x, "onEscapeKeydown", js.undefined)
    }
  }
  
  trait ModalProviderProps extends StObject {
    
    var backgroundComponent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any
      ] = js.undefined
    
    var children: Node
  }
  object ModalProviderProps {
    
    inline def apply(): ModalProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ModalProviderProps]
    }
    
    extension [Self <: ModalProviderProps](x: Self) {
      
      inline def setBackgroundComponent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any
      ): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
      
      inline def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
