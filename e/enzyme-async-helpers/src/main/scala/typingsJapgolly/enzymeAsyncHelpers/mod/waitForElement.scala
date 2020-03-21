package typingsJapgolly.enzymeAsyncHelpers.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.enzyme.mod.EnzymeSelector
import typingsJapgolly.enzyme.mod.ReactWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", "waitForElement")
@js.native
object waitForElement extends js.Object {
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]],
    elementSelector: EnzymeSelector
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]],
    elementSelector: EnzymeSelector,
    config: Config
  ): js.Promise[Unit] = js.native
}

