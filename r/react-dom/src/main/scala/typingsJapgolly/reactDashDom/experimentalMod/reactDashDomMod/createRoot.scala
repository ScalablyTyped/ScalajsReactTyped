package typingsJapgolly.reactDashDom.experimentalMod.reactDashDomMod

import typingsJapgolly.std.Comment
import typingsJapgolly.std.Document
import typingsJapgolly.std.DocumentFragment
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "createRoot")
@js.native
object createRoot extends js.Object {
  /**
    * Replaces `ReactDOM.render` when the `.render` method is called and enables Concurrent Mode.
    *
    * @see https://reactjs.org/docs/concurrent-mode-reference.html#createroot
    */
  def apply(container: Element | Document | DocumentFragment | Comment): Root = js.native
  def apply(container: Element | Document | DocumentFragment | Comment, options: RootOptions): Root = js.native
}

