package typingsJapgolly.ionicDiscover

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/discover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/discover", "CommServer")
  @js.native
  open class CommServer protected ()
    extends typingsJapgolly.ionicDiscover.distCommMod.CommServer {
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
  
  @JSImport("@ionic/discover", "Publisher")
  @js.native
  open class Publisher protected ()
    extends typingsJapgolly.ionicDiscover.distPublisherMod.Publisher {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
  }
  
  inline def computeBroadcastAddress(address: String, netmask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBroadcastAddress")(address.asInstanceOf[js.Any], netmask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def newSilentPublisher(namespace: String, name: String, port: Double): typingsJapgolly.ionicDiscover.distPublisherMod.Publisher = (^.asInstanceOf[js.Dynamic].applyDynamic("newSilentPublisher")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ionicDiscover.distPublisherMod.Publisher]
}
