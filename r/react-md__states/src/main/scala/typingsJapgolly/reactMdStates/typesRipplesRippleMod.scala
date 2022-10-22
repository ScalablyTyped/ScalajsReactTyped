package typingsJapgolly.reactMdStates

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.RippleState
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesRippleMod {
  
  @JSImport("@react-md/states/types/ripples/Ripple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Ripple(hasClassNamePropClassNamesPropTimeoutRippleEnteredExited: RippleProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(hasClassNamePropClassNamesPropTimeoutRippleEnteredExited.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait RippleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    def entered(ripple: RippleState): Unit
    
    def exited(ripple: RippleState): Unit
    
    var ripple: RippleState
    
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object RippleProps {
    
    inline def apply(entered: RippleState => Callback, exited: RippleState => Callback, ripple: RippleState): RippleProps = {
      val __obj = js.Dynamic.literal(entered = js.Any.fromFunction1((t0: RippleState) => entered(t0).runNow()), exited = js.Any.fromFunction1((t0: RippleState) => exited(t0).runNow()), ripple = ripple.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleProps]
    }
    
    extension [Self <: RippleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setEntered(value: RippleState => Callback): Self = StObject.set(x, "entered", js.Any.fromFunction1((t0: RippleState) => value(t0).runNow()))
      
      inline def setExited(value: RippleState => Callback): Self = StObject.set(x, "exited", js.Any.fromFunction1((t0: RippleState) => value(t0).runNow()))
      
      inline def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
