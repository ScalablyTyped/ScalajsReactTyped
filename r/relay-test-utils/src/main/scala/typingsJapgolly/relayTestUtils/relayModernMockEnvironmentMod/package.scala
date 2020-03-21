package typingsJapgolly.relayTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayModernMockEnvironmentMod {
  type OperationMockResolver = js.Function1[
    /* operation */ typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor, 
    typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse | js.Error | scala.Null
  ]
}
