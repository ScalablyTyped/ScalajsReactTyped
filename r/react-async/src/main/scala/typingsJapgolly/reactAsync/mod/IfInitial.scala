package typingsJapgolly.reactAsync.mod

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactAsync.anon.Persist
import typingsJapgolly.reactAsync.anon.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when no promise has started or completed yet.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show until we have data, even while pending (loading) or when an error occurred
  */
object IfInitial {
  
  inline def apply[T /* <: js.Object */](hasChildrenPersistState: State[T]): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenPersistState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfInitial")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfInitial.propTypes")
  @js.native
  def propTypes: Persist = js.native
  inline def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
