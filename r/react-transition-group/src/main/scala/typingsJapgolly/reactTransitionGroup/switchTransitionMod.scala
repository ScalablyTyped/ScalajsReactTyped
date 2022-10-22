package typingsJapgolly.reactTransitionGroup

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchTransitionMod {
  
  /**
    * A transition component inspired by the [vue transition modes](https://vuejs.org/v2/guide/transitions.html#Transition-Modes).
    * You can use it when you want to control the render between state transitions.
    * Based on the selected mode and the child's key which is the `Transition` or `CSSTransition` component, the `SwitchTransition` makes a consistent transition between them.
    *
    * If the `out-in` mode is selected, the `SwitchTransition` waits until the old child leaves and then inserts a new child.
    * If the `in-out` mode is selected, the `SwitchTransition` inserts a new child first, waits for the new child to enter and then removes the old child
    *
    * ```jsx
    * function App() {
    *  const [state, setState] = useState(false);
    *  return (
    *    <SwitchTransition>
    *      <FadeTransition key={state ? "Goodbye, world!" : "Hello, world!"}
    *        addEndListener={(node, done) => node.addEventListener("transitionend", done, false)}
    *        classNames='fade' >
    *        <button onClick={() => setState(state => !state)}>
    *          {state ? "Goodbye, world!" : "Hello, world!"}
    *        </button>
    *      </FadeTransition>
    *    </SwitchTransition>
    *  )
    * }
    * ```
    */
  @JSImport("react-transition-group/SwitchTransition", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SwitchTransitionProps, js.Object, Any]
  
  @js.native
  sealed trait modes extends StObject
  @JSImport("react-transition-group/SwitchTransition", "modes")
  @js.native
  object modes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[modes & String] = js.native
    
    @js.native
    sealed trait in
      extends StObject
         with modes
    /* "in-out" */ val in: typingsJapgolly.reactTransitionGroup.switchTransitionMod.modes.in & String = js.native
    
    @js.native
    sealed trait out
      extends StObject
         with modes
    /* "out-in" */ val out: typingsJapgolly.reactTransitionGroup.switchTransitionMod.modes.out & String = js.native
  }
  
  /**
    * A transition component inspired by the [vue transition modes](https://vuejs.org/v2/guide/transitions.html#Transition-Modes).
    * You can use it when you want to control the render between state transitions.
    * Based on the selected mode and the child's key which is the `Transition` or `CSSTransition` component, the `SwitchTransition` makes a consistent transition between them.
    *
    * If the `out-in` mode is selected, the `SwitchTransition` waits until the old child leaves and then inserts a new child.
    * If the `in-out` mode is selected, the `SwitchTransition` inserts a new child first, waits for the new child to enter and then removes the old child
    *
    * ```jsx
    * function App() {
    *  const [state, setState] = useState(false);
    *  return (
    *    <SwitchTransition>
    *      <FadeTransition key={state ? "Goodbye, world!" : "Hello, world!"}
    *        addEndListener={(node, done) => node.addEventListener("transitionend", done, false)}
    *        classNames='fade' >
    *        <button onClick={() => setState(state => !state)}>
    *          {state ? "Goodbye, world!" : "Hello, world!"}
    *        </button>
    *      </FadeTransition>
    *    </SwitchTransition>
    *  )
    * }
    * ```
    */
  type SwitchTransition = japgolly.scalajs.react.facade.React.Component[SwitchTransitionProps & js.Object, js.Object]
  
  trait SwitchTransitionProps extends StObject {
    
    /**
      * Any `Transition` or `CSSTransition` component
      */
    var children: Element
    
    /**
      * Transition modes.
      * `out-in`: Current element transitions out first, then when complete, the new element transitions in.
      * `in-out`: New element transitions in first, then when complete, the current element transitions out.
      */
    var mode: js.UndefOr[`out-in` | `in-out`] = js.undefined
  }
  object SwitchTransitionProps {
    
    inline def apply(children: VdomElement): SwitchTransitionProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchTransitionProps]
    }
    
    extension [Self <: SwitchTransitionProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMode(value: `out-in` | `in-out`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
