package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSelect.reactSelectStrings.auto
import typingsJapgolly.reactTransitionGroup.transitionMod.ExitHandler
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedTransitionsMod {
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", "Collapse")
  @js.native
  open class Collapse protected () extends Component[CollapseProps, CollapseState, Any] {
    def this(props: CollapseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapseProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MCollapse(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCollapse(): Unit = js.native
    
    var duration: Double = js.native
    
    def getStyle(width: Width): CSSProperties = js.native
    
    def getTransition(state: TransitionStatus): js.UndefOr[CSSProperties] = js.native
    
    var nodeRef: RefHandle[HTMLDivElement] = js.native
    
    var rafID: js.UndefOr[Double | Null] = js.native
    
    var transition: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in react-transition-group.react-transition-group/Transition.TransitionStatus ]:? react.react.CSSProperties} */ js.Any = js.native
  }
  
  inline def Fade[ComponentProps /* <: js.Object */](hasTagDurationInPropOnExitedProps: FadeProps[ComponentProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Fade")(hasTagDurationInPropOnExitedProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", "collapseDuration")
  @js.native
  val collapseDuration: /* 260 */ Double = js.native
  
  trait CollapseProps extends StObject {
    
    var children: Node
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var onExited: js.UndefOr[ExitHandler[js.UndefOr[HTMLElement]]] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setOnExited(value: ExitHandler[js.UndefOr[HTMLElement]]): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    }
  }
  
  trait CollapseState extends StObject {
    
    var width: Width
  }
  object CollapseState {
    
    inline def apply(width: Width): CollapseState = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseState]
    }
    
    extension [Self <: CollapseState](x: Self) {
      
      inline def setWidth(value: Width): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type FadeProps[ComponentProps] = typingsJapgolly.reactSelect.anon.Component[ComponentProps] & ComponentProps
  
  type Width = Double | auto
}
