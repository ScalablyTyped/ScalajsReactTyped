package typingsJapgolly.reactTransitionGroup

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Appear extends StObject {
    
    var appear: js.UndefOr[Double] = js.undefined
    
    var enter: js.UndefOr[Double] = js.undefined
    
    var exit: js.UndefOr[Double] = js.undefined
  }
  object Appear {
    
    inline def apply(): Appear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Appear]
    }
    
    extension [Self <: Appear](x: Self) {
      
      inline def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  trait ClassNames extends StObject {
    
    /**
      * The animation `classNames` applied to the component as it enters or exits.
      * A single name can be provided and it will be suffixed for each stage: e.g.
      *
      * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
      * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
      *
      * Each individual classNames can also be specified independently like:
      *
      * ```js
      * classNames={{
      *   appear: 'my-appear',
      *   appearActive: 'my-appear-active',
      *   appearDone: 'my-appear-done',
      *   enter: 'my-enter',
      *   enterActive: 'my-enter-active',
      *   enterDone: 'my-enter-done',
      *   exit: 'my-exit',
      *   exitActive: 'my-exit-active',
      *   exitDone: 'my-exit-done'
      * }}
      * ```
      */
    var classNames: js.UndefOr[String | CSSTransitionClassNames] = js.undefined
  }
  object ClassNames {
    
    inline def apply(): ClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassNames]
    }
    
    extension [Self <: ClassNames](x: Self) {
      
      inline def setClassNames(value: String | CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    }
  }
  
  trait Dictprop
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var childFactory: js.UndefOr[js.Function1[/* child */ Element, Element]] = js.undefined
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
  }
  object Dictprop {
    
    inline def apply(): Dictprop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictprop]
    }
    
    extension [Self <: Dictprop](x: Self) {
      
      inline def setChildFactory(value: /* child */ Element => Element): Self = StObject.set(x, "childFactory", js.Any.fromFunction1(value))
      
      inline def setChildFactoryUndefined: Self = StObject.set(x, "childFactory", js.undefined)
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Explicit[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ Any, Unit] */] extends StObject {
    
    var explicit: ExplicitRefHandler
    
    var `implicit`: ImplicitRefHandler
  }
  object Explicit {
    
    inline def apply[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ Any, Unit] */](explicit: ExplicitRefHandler, `implicit`: ImplicitRefHandler): Explicit[ImplicitRefHandler, ExplicitRefHandler] = {
      val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
      __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explicit[ImplicitRefHandler, ExplicitRefHandler]]
    }
    
    extension [Self <: Explicit[?, ?], ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ Any, Unit] */](x: Self & (Explicit[ImplicitRefHandler, ExplicitRefHandler])) {
      
      inline def setExplicit(value: ExplicitRefHandler): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setImplicit(value: ImplicitRefHandler): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    }
  }
}
