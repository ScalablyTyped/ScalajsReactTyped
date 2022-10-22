package typingsJapgolly.fluentuiReactComponentRef

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.fluentuiReactComponentRef.anon.Kind
import typingsJapgolly.fluentuiReactComponentRef.fluentuiReactComponentRefStrings.find
import typingsJapgolly.fluentuiReactComponentRef.fluentuiReactComponentRefStrings.forward
import typingsJapgolly.fluentuiReactComponentRef.fluentuiReactComponentRefStrings.self
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsRefMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/Ref", "Ref")
  @js.native
  open class Ref protected () extends Component[RefProps, RefState, Any] {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MRef(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRef(prevProps: RefProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRef(): Unit = js.native
    
    var currentNode: js.UndefOr[Node | Null] = js.native
    
    def handleForwardRefOverride(node: HTMLElement): Unit = js.native
    
    def handleSelfOverride(node: HTMLElement): Unit = js.native
    
    var prevNode: js.UndefOr[Node | Null] = js.native
    
    @JSName("state")
    var state_Ref: Kind = js.native
  }
  /* static members */
  object Ref {
    
    @JSImport("@fluentui/react-component-ref/dist/es/Ref", "Ref")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: RefProps): RefState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[RefState]
  }
  
  trait RefProps extends StObject {
    
    var children: Element
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param node - Referred node.
      */
    var innerRef: typingsJapgolly.react.mod.Ref[HTMLElement]
  }
  object RefProps {
    
    inline def apply(children: VdomElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[RefProps]
    }
    
    extension [Self <: RefProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: typingsJapgolly.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
  
  trait RefState extends StObject {
    
    var kind: self | forward | find | Null
  }
  object RefState {
    
    inline def apply(): RefState = {
      val __obj = js.Dynamic.literal(kind = null)
      __obj.asInstanceOf[RefState]
    }
    
    extension [Self <: RefState](x: Self) {
      
      inline def setKind(value: self | forward | find): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindNull: Self = StObject.set(x, "kind", null)
    }
  }
}
