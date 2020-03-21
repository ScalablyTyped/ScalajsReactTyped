package typingsJapgolly.relayTestUtils

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRelay.mod.RelayPaginationProp
import typingsJapgolly.reactRelay.mod.RelayProp
import typingsJapgolly.reactRelay.mod.RelayRefetchProp
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayTestUtils.relayMockPayloadGeneratorMod.MockResolvers
import typingsJapgolly.relayTestUtils.relayModernMockEnvironmentMod.RelayMockEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMockEnvironment(): RelayMockEnvironment = js.native
  def createMockEnvironment(config: AnonHandlerProvider): RelayMockEnvironment = js.native
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
  @js.native
  object MockEnvironment extends js.Object {
    def createMockEnvironment(): RelayMockEnvironment = js.native
    def createMockEnvironment(config: AnonHandlerProvider): RelayMockEnvironment = js.native
  }
  
  @js.native
  object MockPayloadGenerator extends js.Object {
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
}

