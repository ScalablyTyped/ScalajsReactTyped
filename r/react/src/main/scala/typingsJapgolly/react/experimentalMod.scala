package typingsJapgolly.react

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import typingsJapgolly.react.reactStrings.fulfilled
import typingsJapgolly.react.reactStrings.pending
import typingsJapgolly.react.reactStrings.rejected
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react", "SuspenseList")
    @js.native
    val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    inline def experimentalUse[T](usable: Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def experimentalUseEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]
    
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with typingsJapgolly.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.undefined
    }
    object DirectionalSuspenseListProps {
      
      inline def apply(children: Element | js.Iterable[Element], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      extension [Self <: DirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    trait FulfilledThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typingsJapgolly.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: fulfilled
      
      var value: T
    }
    object FulfilledThenable {
      
      inline def apply[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[FulfilledThenable[T]]
      }
      
      extension [Self <: FulfilledThenable[?], T](x: Self & FulfilledThenable[T]) {
        
        inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with typingsJapgolly.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.undefined
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.undefined
    }
    object NonDirectionalSuspenseListProps {
      
      inline def apply(children: Element | js.Iterable[Element]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    trait PendingThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typingsJapgolly.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: pending
    }
    object PendingThenable {
      
      inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[PendingThenable[T]]
      }
      
      extension [Self <: PendingThenable[?], T](x: Self & PendingThenable[T]) {
        
        inline def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait RejectedThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typingsJapgolly.react.mod.Thenable[T]
         with Thenable[T] {
      
      var reason: Any
      
      var status: rejected
    }
    object RejectedThenable {
      
      inline def apply[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[RejectedThenable[T]]
      }
      
      extension [Self <: RejectedThenable[?], T](x: Self & RejectedThenable[T]) {
        
        inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: Element | js.Iterable[Element]
    }
    object SuspenseListCommonProps {
      
      inline def apply(children: Element | js.Iterable[Element]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      extension [Self <: SuspenseListCommonProps](x: Self) {
        
        inline def setChildren(value: Element | js.Iterable[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      inline def DirectionalSuspenseListProps(children: Element | js.Iterable[Element], revealOrder: forwards | backwards): typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      inline def NonDirectionalSuspenseListProps(children: Element | js.Iterable[Element]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.react.reactStrings.forwards
      - typingsJapgolly.react.reactStrings.backwards
      - typingsJapgolly.react.reactStrings.together
    */
    trait SuspenseListRevealOrder extends StObject
    object SuspenseListRevealOrder {
      
      inline def backwards: typingsJapgolly.react.reactStrings.backwards = "backwards".asInstanceOf[typingsJapgolly.react.reactStrings.backwards]
      
      inline def forwards: typingsJapgolly.react.reactStrings.forwards = "forwards".asInstanceOf[typingsJapgolly.react.reactStrings.forwards]
      
      inline def together: typingsJapgolly.react.reactStrings.together = "together".asInstanceOf[typingsJapgolly.react.reactStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.react.reactStrings.collapsed
      - typingsJapgolly.react.reactStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      inline def collapsed: typingsJapgolly.react.reactStrings.collapsed = "collapsed".asInstanceOf[typingsJapgolly.react.reactStrings.collapsed]
      
      inline def hidden: typingsJapgolly.react.reactStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.react.reactStrings.hidden]
    }
    
    trait SuspenseProps extends StObject {
      
      /**
        * The presence of this prop indicates that the content is computationally expensive to render.
        * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
        * @see {@link https://github.com/facebook/react/pull/19936}
        */
      var unstable_expectedLoadTime: js.UndefOr[Double] = js.undefined
    }
    object SuspenseProps {
      
      inline def apply(): SuspenseProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuspenseProps]
      }
      
      extension [Self <: SuspenseProps](x: Self) {
        
        inline def setUnstable_expectedLoadTime(value: Double): Self = StObject.set(x, "unstable_expectedLoadTime", value.asInstanceOf[js.Any])
        
        inline def setUnstable_expectedLoadTimeUndefined: Self = StObject.set(x, "unstable_expectedLoadTime", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T]
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T]
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T]
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T]
    */
    trait Thenable[T]
      extends StObject
         with typingsJapgolly.react.mod.Usable[T]
         with Usable[T]
    object Thenable {
      
      inline def FulfilledThenable[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T]]
      }
      
      inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T]]
      }
      
      inline def RejectedThenable[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T]]
      }
      
      inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T]]
      }
    }
    
    trait ThenableImpl[T] extends StObject {
      
      def `then`(onFulfill: js.Function1[/* value */ T, Any], onReject: js.Function1[/* error */ Any, Any]): Unit | PromiseLike[Any]
    }
    object ThenableImpl {
      
      inline def apply[T](
        `then`: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): ThenableImpl[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[ThenableImpl[T]]
      }
      
      extension [Self <: ThenableImpl[?], T](x: Self & ThenableImpl[T]) {
        
        inline def setThen(
          value: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
        ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
      }
    }
    
    trait UntrackedThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typingsJapgolly.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: js.UndefOr[Unit] = js.undefined
    }
    object UntrackedThenable {
      
      inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[UntrackedThenable[T]]
      }
      
      extension [Self <: UntrackedThenable[?], T](x: Self & UntrackedThenable[T]) {
        
        inline def setStatus(value: Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.react.experimentalMod.reactAugmentingMod.Thenable[T]
      - typingsJapgolly.react.mod.Context[T]
    */
    trait Usable[T] extends StObject
    object Usable {
      
      inline def Context[T](Consumer: Consumer[T], Provider: Provider[T]): typingsJapgolly.react.mod.Context[T] = {
        val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.react.mod.Context[T]]
      }
      
      inline def FulfilledThenable[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T]]
      }
      
      inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T]]
      }
      
      inline def RejectedThenable[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T]]
      }
      
      inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T]]
      }
    }
  }
}
