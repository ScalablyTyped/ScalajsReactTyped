package typingsJapgolly.reactTransitionGroup

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactTransitionGroup.configMod.Config
import typingsJapgolly.reactTransitionGroup.csstransitionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-transition-group", "CSSTransition")
  @js.native
  open class CSSTransition[Ref /* <: js.UndefOr[HTMLElement] */] () extends default[Ref]
  
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
  @JSImport("react-transition-group", "SwitchTransition")
  @js.native
  open class SwitchTransition ()
    extends typingsJapgolly.reactTransitionGroup.switchTransitionMod.default
  
  /**
    * The Transition component lets you describe a transition from one component
    * state to another _over time_ with a simple declarative API. Most commonly
    * It's used to animate the mounting and unmounting of Component, but can also
    * be used to describe in-place transition states as well.
    *
    * By default the `Transition` component does not alter the behavior of the
    * component it renders, it only tracks "enter" and "exit" states for the components.
    * It's up to you to give meaning and effect to those states. For example we can
    * add styles to a component when it enters or exits:
    *
    * ```jsx
    * import Transition from 'react-transition-group/Transition';
    *
    * const duration = 300;
    *
    * const defaultStyle = {
    *   transition: `opacity ${duration}ms ease-in-out`,
    *   opacity: 0,
    * }
    *
    * const transitionStyles = {
    *   entering: { opacity: 1 },
    *   entered:  { opacity: 1 },
    * };
    *
    * const Fade = ({ in: inProp }) => (
    *   <Transition in={inProp} timeout={duration}>
    *     {(state) => (
    *       <div style={{
    *         ...defaultStyle,
    *         ...transitionStyles[state]
    *       }}>
    *         I'm A fade Transition!
    *       </div>
    *     )}
    *   </Transition>
    * );
    * ```
    *
    */
  @JSImport("react-transition-group", "Transition")
  @js.native
  open class Transition[RefElement /* <: js.UndefOr[HTMLElement] */] ()
    extends typingsJapgolly.reactTransitionGroup.transitionMod.default[RefElement]
  
  /**
    * The `<TransitionGroup>` component manages a set of `<Transition>` components
    * in a list. Like with the `<Transition>` component, `<TransitionGroup>`, is a
    * state machine for managing the mounting and unmounting of components over
    * time.
    *
    * Consider the example below using the `Fade` CSS transition from before.
    * As items are removed or added to the TodoList the `in` prop is toggled
    * automatically by the `<TransitionGroup>`. You can use _any_ `<Transition>`
    * component in a `<TransitionGroup>`, not just css.
    *
    * ```jsx
    * import TransitionGroup from 'react-transition-group/TransitionGroup';
    *
    * class TodoList extends React.Component {
    *   constructor(props) {
    *     super(props)
    *     this.state = {items: ['hello', 'world', 'click', 'me']}
    *   }
    *   handleAdd() {
    *     const newItems = this.state.items.concat([
    *       prompt('Enter some text')
    *     ]);
    *     this.setState({ items: newItems });
    *   }
    *   handleRemove(i) {
    *     let newItems = this.state.items.slice();
    *     newItems.splice(i, 1);
    *     this.setState({items: newItems});
    *   }
    *   render() {
    *     return (
    *       <div>
    *         <button onClick={() => this.handleAdd()}>Add Item</button>
    *         <TransitionGroup>
    *           {this.state.items.map((item, i) => (
    *             <FadeTransition key={item}>
    *               <div>
    *                 {item}{' '}
    *                 <button onClick={() => this.handleRemove(i)}>
    *                   remove
    *                 </button>
    *               </div>
    *             </FadeTransition>
    *           ))}
    *         </TransitionGroup>
    *       </div>
    *     );
    *   }
    * }
    * ```
    *
    * Note that `<TransitionGroup>`  does not define any animation behavior!
    * Exactly _how_ a list item animates is up to the individual `<Transition>`
    * components. This means you can mix and match animations across different
    * list items.
    */
  @JSImport("react-transition-group", "TransitionGroup")
  @js.native
  open class TransitionGroup ()
    extends typingsJapgolly.reactTransitionGroup.transitionGroupMod.default
  
  @JSImport("react-transition-group", "config")
  @js.native
  val config: Config = js.native
}
