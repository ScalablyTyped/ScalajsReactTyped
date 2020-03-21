package typingsJapgolly.ionicDiscover

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CommServer protected ()
    extends typingsJapgolly.ionicDiscover.commMod.CommServer {
    def this(
      namespace: String,
      /**
      * Unique identifier of the publisher.
      */
    id: String,
      /**
      * Port of communication server.
      */
    port: Double
    ) = this()
  }
  
  @js.native
  class Publisher protected ()
    extends typingsJapgolly.ionicDiscover.publisherMod.Publisher {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  }
  
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  def newSilentPublisher(namespace: String, name: String, port: Double): typingsJapgolly.ionicDiscover.publisherMod.Publisher = js.native
}

