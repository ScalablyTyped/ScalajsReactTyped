package typingsJapgolly.reactBootstrapTypeahead.mod

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-typeahead", "AsyncTypeahead")
@js.native
open class AsyncTypeahead[T /* <: TypeaheadModel */] protected ()
  extends Component[AsyncTypeaheadProps[T], js.Object, Any] {
  def this(props: AsyncTypeaheadProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AsyncTypeaheadProps[T], context: Any) = this()
  
  def blur(): Unit = js.native
  
  def clear(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInput(): HTMLInputElement = js.native
  
  def hideMenu(): Unit = js.native
  
  def toggleMenu(): Unit = js.native
}
