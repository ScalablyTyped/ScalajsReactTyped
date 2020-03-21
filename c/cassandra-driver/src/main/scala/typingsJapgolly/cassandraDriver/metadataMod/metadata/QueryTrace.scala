package typingsJapgolly.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.AnonActivity
import typingsJapgolly.cassandraDriver.typesMod.types.InetAddress
import typingsJapgolly.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTrace extends js.Object {
  var clientAddress: String
  var coordinator: InetAddress
  var duration: Double
  var events: js.Array[AnonActivity]
  var parameters: StringDictionary[js.Any]
  var requestType: String
  var startedAt: Double | Long
}

object QueryTrace {
  @scala.inline
  def apply(
    clientAddress: String,
    coordinator: InetAddress,
    duration: Double,
    events: js.Array[AnonActivity],
    parameters: StringDictionary[js.Any],
    requestType: String,
    startedAt: Double | Long
  ): QueryTrace = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], coordinator = coordinator.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryTrace]
  }
}

