package typingsJapgolly.sharepoint.SP.BusinessData

import typingsJapgolly.sharepoint.SP.BusinessData.Collections.EntityIdentifierCollection
import typingsJapgolly.sharepoint.SP.BusinessData.Collections.EntityInstanceCollection
import typingsJapgolly.sharepoint.SP.BusinessData.Collections.FilterCollection
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityEventType
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityIdentity
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityInstance
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.NotificationCallback
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.Subscription
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.IntResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Entity")
@js.native
class Entity () extends ClientObject {
  def create(fieldValues: EntityFieldValueDictionary, lobSystemInstance: LobSystemInstance): EntityIdentity = js.native
  def execute(methodInstanceName: String, lobSystemInstance: LobSystemInstance, inputParams: js.Array[_]): MethodExecutionResult = js.native
  def findAssociated(
    entityInstance: EntityInstance,
    associationName: String,
    filterList: FilterCollection,
    lobSystemInstance: LobSystemInstance
  ): EntityInstanceCollection = js.native
  def findFiltered(filterList: FilterCollection, nameOfFinder: String, lobSystemInstance: LobSystemInstance): EntityInstanceCollection = js.native
  def findSpecific(identity: EntityIdentity, specificFinderName: String, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
  def findSpecificByBdcId(bdcIdentity: String, specificFinderName: String, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
  def findSpecificDefault(identity: EntityIdentity, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
  def findSpecificDefaultByBdcId(bdcIdentity: String, lobSystemInstance: LobSystemInstance): EntityInstance = js.native
  def getAssociationView(associationName: String): EntityView = js.native
  def getCreatorView(methodInstanceName: String): EntityView = js.native
  def getDefaultSpecificFinderView(): EntityView = js.native
  def getFilters(methodInstanceName: String): FilterCollection = js.native
  def getFinderView(methodInstanceName: String): EntityView = js.native
  def getIdentifierCount(): IntResult = js.native
  def getIdentifiers(): EntityIdentifierCollection = js.native
  def getLobSystem(): LobSystem = js.native
  def getSpecificFinderView(specificFinderName: String): EntityView = js.native
  def getUpdaterView(updaterName: String): EntityView = js.native
  def get_estimatedInstanceCount(): Double = js.native
  def get_name(): String = js.native
  def get_namespace(): String = js.native
  def subscribe(
    eventType: EntityEventType,
    notificationCallback: NotificationCallback,
    onBehalfOfUser: String,
    subscriberName: String,
    lobSystemInstance: LobSystemInstance
  ): Subscription = js.native
  def unsubscribe(
    subscription: Subscription,
    onBehalfOfUser: String,
    unsubscriberName: String,
    lobSystemInstance: LobSystemInstance
  ): Unit = js.native
}

