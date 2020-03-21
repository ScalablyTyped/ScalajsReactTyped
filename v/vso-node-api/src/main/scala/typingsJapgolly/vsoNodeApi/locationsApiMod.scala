package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.locationsInterfacesMod.ConnectionData
import typingsJapgolly.vsoNodeApi.locationsInterfacesMod.ResourceAreaInfo
import typingsJapgolly.vsoNodeApi.locationsInterfacesMod.ServiceDefinition
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.ConnectOptions
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.VssJsonCollectionWrapperV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/LocationsApi", JSImport.Namespace)
@js.native
object locationsApiMod extends js.Object {
  @js.native
  trait ILocationsApi extends ClientApiBase {
    def deleteServiceDefinition(serviceType: String, identifier: String): js.Promise[Unit] = js.native
    def getConnectionData(): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Double, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    def getResourceArea(areaId: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: String, accountName: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceAreaByHost(areaId: String, hostId: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceAreas(): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: String, accountName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreasByHost(hostId: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getServiceDefinition(serviceType: String, identifier: String): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Boolean, previewFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinitions(): js.Promise[js.Array[ServiceDefinition]] = js.native
    def getServiceDefinitions(serviceType: String): js.Promise[js.Array[ServiceDefinition]] = js.native
    def updateServiceDefinitions(serviceDefinitions: VssJsonCollectionWrapperV[js.Array[ServiceDefinition]]): js.Promise[Unit] = js.native
  }
  
  @js.native
  class LocationsApi protected () extends ILocationsApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

