package typingsJapgolly.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearBladeInt extends StObject {
  
  def Analytics(): typingsJapgolly.clearbladejsClient.CbClient.Analytics = js.native
  
  def Code(): typingsJapgolly.clearbladejsClient.CbClient.Code = js.native
  
  def Collection(options: String): typingsJapgolly.clearbladejsClient.CbClient.Collection = js.native
  def Collection(options: CollectionOptionsWithID): typingsJapgolly.clearbladejsClient.CbClient.Collection = js.native
  def Collection(options: CollectionOptionsWithName): typingsJapgolly.clearbladejsClient.CbClient.Collection = js.native
  
  def Device(): typingsJapgolly.clearbladejsClient.CbClient.Device = js.native
  
  def Edge(): typingsJapgolly.clearbladejsClient.CbClient.Edge = js.native
  
  def Item(data: js.Object, collectionID: String): typingsJapgolly.clearbladejsClient.CbClient.Item = js.native
  def Item(data: js.Object, collectionID: ItemOptions): typingsJapgolly.clearbladejsClient.CbClient.Item = js.native
  
  def Messaging(options: MessagingOptions, callback: CbCallback): typingsJapgolly.clearbladejsClient.CbClient.Messaging = js.native
  
  def MessagingStats(): typingsJapgolly.clearbladejsClient.CbClient.MessagingStats = js.native
  
  def Metrics(): typingsJapgolly.clearbladejsClient.CbClient.Metrics = js.native
  
  def Portal(name: String): typingsJapgolly.clearbladejsClient.CbClient.Portal = js.native
  
  def Query(options: String): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  
  def Triggers(): typingsJapgolly.clearbladejsClient.CbClient.Triggers = js.native
  
  var URI: String = js.native
  
  def User(): AppUser = js.native
  
  var defaultQoS: MessagingQOS = js.native
  
  def getAllCollections(callback: CbCallback): Unit = js.native
  
  def getEdges(query: Query, callback: CbCallback): Unit = js.native
  
  def init(options: InitOptions): Unit = js.native
  
  def isCurrentUserAuthenticated(callback: CbCallback): Unit = js.native
  
  var logging: Boolean = js.native
  
  def loginAnon(callback: CbCallback): Unit = js.native
  
  def loginUser(email: String, password: String, callback: CbCallback): Unit = js.native
  
  def loginUserMqtt(email: String, password: String, callback: CbCallback): Unit = js.native
  
  def logoutUser(callback: CbCallback): Unit = js.native
  
  var masterSecret: String = js.native
  
  var messagingPort: Double = js.native
  
  var messagingURI: String = js.native
  
  def registerMasterCallback(callback: CbCallback): Unit = js.native
  
  def registerUser(email: String, password: String, callback: CbCallback): Unit = js.native
  
  def sendPush(users: js.Array[String], payload: js.Object, appId: String, callback: CbCallback): Unit = js.native
  
  def setUser(email: String, password: String): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
}
