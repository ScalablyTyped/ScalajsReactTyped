package typingsJapgolly.testingLibraryReact.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.testingLibraryDom.getQueriesForElementMod.BoundFunctions
import typingsJapgolly.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "within")
@js.native
object within extends js.Object {
  def apply[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def apply[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
}

