package typingsJapgolly.reactTransitionGroup

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactTransitionGroup.anon.Dictprop
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.div
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionGroupMod {
  
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
  @JSImport("react-transition-group/TransitionGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TransitionGroupProps[div, Any], js.Object, Any]
  
  trait ComponentTransitionGroupProps[T /* <: ElementType */]
    extends StObject
       with TransitionActions {
    
    var component: T
  }
  object ComponentTransitionGroupProps {
    
    inline def apply[T /* <: ElementType */](component: T): ComponentTransitionGroupProps[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
    }
    
    extension [Self <: ComponentTransitionGroupProps[?], T /* <: ElementType */](x: Self & ComponentTransitionGroupProps[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntrinsicTransitionGroupProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.a, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.abbr, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.address */ Any */]
    extends StObject
       with TransitionActions {
    
    var component: js.UndefOr[T | Null] = js.undefined
  }
  object IntrinsicTransitionGroupProps {
    
    inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.a, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.abbr, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.address */ Any */](): IntrinsicTransitionGroupProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntrinsicTransitionGroupProps[T]]
    }
    
    extension [Self <: IntrinsicTransitionGroupProps[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.a, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.abbr, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.address */ Any */](x: Self & IntrinsicTransitionGroupProps[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentNull: Self = StObject.set(x, "component", null)
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
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
  type TransitionGroup = japgolly.scalajs.react.facade.React.Component[(TransitionGroupProps[div, Any]) & js.Object, js.Object]
  
  type TransitionGroupProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.a, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.abbr, typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.address */ Any */, V /* <: ElementType */] = (IntrinsicTransitionGroupProps[T] & (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)) | (ComponentTransitionGroupProps[V] & Dictprop)
}
