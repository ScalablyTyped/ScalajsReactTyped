package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.relayObservableMod.RelayObservable
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var operation: OperationDescriptor
  var source: RelayObservable[GraphQLResponse]
}

object AnonSource {
  @scala.inline
  def apply(operation: OperationDescriptor, source: RelayObservable[GraphQLResponse]): AnonSource = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSource]
  }
}

