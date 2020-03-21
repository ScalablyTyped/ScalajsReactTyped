package typingsJapgolly.relayTestUtils

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRelay.mod.RelayPaginationProp
import typingsJapgolly.reactRelay.mod.RelayProp
import typingsJapgolly.reactRelay.mod.RelayRefetchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils/lib/unwrapContainer", JSImport.Namespace)
@js.native
object unwrapContainerMod extends js.Object {
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
}

