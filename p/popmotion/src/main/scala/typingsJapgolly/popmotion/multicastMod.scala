package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.observerTypesMod.ObserverProps
import typingsJapgolly.popmotion.reactionsMod.BaseMulticast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/reactions/multicast", JSImport.Namespace)
@js.native
object multicastMod extends js.Object {
  @js.native
  class Multicast () extends BaseMulticast[Multicast] {
    def create(props: ObserverProps): Multicast = js.native
  }
  
  def default(): Multicast = js.native
}

