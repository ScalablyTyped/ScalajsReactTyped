package typingsJapgolly.testingLibraryReact.mod

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResult[Q /* <: Queries */] extends js.Object {
  var baseElement: HTMLElement = js.native
  var container: HTMLElement = js.native
  def asFragment(): DocumentFragment = js.native
  def debug(): Unit = js.native
  def debug(baseElement: js.Array[typingsJapgolly.std.HTMLElement | typingsJapgolly.std.DocumentFragment]): Unit = js.native
  def debug(baseElement: typingsJapgolly.std.DocumentFragment): Unit = js.native
  def debug(baseElement: typingsJapgolly.std.HTMLElement): Unit = js.native
  def rerender(ui: Element): Unit = js.native
  def unmount(): Boolean = js.native
}

