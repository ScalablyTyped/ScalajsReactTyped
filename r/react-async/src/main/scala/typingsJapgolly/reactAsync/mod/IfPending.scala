package typingsJapgolly.reactAsync.mod

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactAsync.anon.ChildrenInitial
import typingsJapgolly.reactAsync.anon.Initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only while pending (promise is loading).
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} initial Show only on initial load (data is undefined)
  */
object IfPending {
  
  inline def apply[T /* <: js.Object */](hasChildrenInitialState: Initial[T]): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenInitialState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfPending")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfPending.propTypes")
  @js.native
  def propTypes: ChildrenInitial = js.native
  inline def propTypes_=(x: ChildrenInitial): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
