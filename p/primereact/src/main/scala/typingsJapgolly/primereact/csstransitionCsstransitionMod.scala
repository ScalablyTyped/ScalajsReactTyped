package typingsJapgolly.primereact

import org.scalajs.dom.HTMLElement
import typingsJapgolly.primereact.anon.Disabled
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csstransitionCsstransitionMod {
  
  @JSImport("primereact/csstransition/csstransition", "CSSTransition")
  @js.native
  open class CSSTransition[Ref /* <: js.UndefOr[HTMLElement] */] protected () extends Component[CSSTransitionProps[Ref], Any, Any] {
    def this(props: CSSTransitionProps[Ref]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CSSTransitionProps[Ref], context: Any) = this()
  }
  
  type CSSTransitionProps[Ref /* <: js.UndefOr[HTMLElement] */] = typingsJapgolly.reactTransitionGroup.csstransitionMod.CSSTransitionProps[Ref] & Disabled
}
