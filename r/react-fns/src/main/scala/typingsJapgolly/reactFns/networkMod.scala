package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.networkNetworkMod.NetworkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Network", JSImport.Namespace)
@js.native
object networkMod extends js.Object {
  @js.native
  class Network ()
    extends typingsJapgolly.reactFns.networkNetworkMod.Network
  
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
}

