package typingsJapgolly.enzymeRedux

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-redux", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def mountWithState[P](Component: Element, state: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object]] = js.native
  def mountWithStore[P](Component: Element, store: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object]] = js.native
  def shallowWithState[P](Component: Element, state: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object]] = js.native
  def shallowWithStore[P](Component: Element, store: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object]] = js.native
}

