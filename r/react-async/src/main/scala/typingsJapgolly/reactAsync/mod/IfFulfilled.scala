package typingsJapgolly.reactAsync.mod

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactAsync.anon.Children
import typingsJapgolly.reactAsync.anon.Persist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is resolved.
  *
  * @prop {Function|Node} children Function (passing data and state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data while pending (promise is loading)
  */
object IfFulfilled {
  
  inline def apply[T /* <: js.Object */](hasChildrenPersistState: Children[T]): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenPersistState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfFulfilled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfFulfilled.propTypes")
  @js.native
  def propTypes: Persist = js.native
  inline def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
