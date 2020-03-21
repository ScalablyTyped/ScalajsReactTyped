package typingsJapgolly.reactDom.experimentalMod.reactDomAugmentingMod

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Document_
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
  def apply(container: Element | Document_ | DocumentFragment | Comment): Root = js.native
  def apply(container: Element | Document_ | DocumentFragment | Comment, options: RootOptions): Root = js.native
}

