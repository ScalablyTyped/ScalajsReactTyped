package typingsJapgolly.testingLibraryReact.mod

import typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "waitForElement")
@js.native
object waitForElement extends js.Object {
  def apply[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T], options: WaitForElementOptions): js.Promise[T] = js.native
}

