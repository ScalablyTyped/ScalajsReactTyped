package typingsJapgolly.nextServer.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.nextServer.distLibSideEffectMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
trait ReadonlySideEffectPropsRe extends StObject {
  
  val children: js.UndefOr[Node] = js.undefined
  
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  
  val inAmpMode: js.UndefOr[Boolean] = js.undefined
  
  val reduceComponentsToState: js.Function2[/* components */ js.Array[Element], /* props */ Any, State]
}
object ReadonlySideEffectPropsRe {
  
  inline def apply(reduceComponentsToState: (/* components */ js.Array[Element], /* props */ Any) => State): ReadonlySideEffectPropsRe = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[ReadonlySideEffectPropsRe]
  }
  
  extension [Self <: ReadonlySideEffectPropsRe](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHandleStateChange(value: /* state */ State => Callback): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
    
    inline def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
    
    inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
    
    inline def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
    
    inline def setReduceComponentsToState(value: (/* components */ js.Array[Element], /* props */ Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
  }
}
