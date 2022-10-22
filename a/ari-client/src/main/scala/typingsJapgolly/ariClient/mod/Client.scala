package typingsJapgolly.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client
  extends StObject
     with Resource {
  
  /**
    *  Creates a new Application instance.
    */
  def Application(): typingsJapgolly.ariClient.mod.Application = js.native
  def Application(id: String): typingsJapgolly.ariClient.mod.Application = js.native
  def Application(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Application = js.native
  def Application(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Application = js.native
  
  /**
    *  Creates a new Asterisk instance.
    */
  def Asterisk(): typingsJapgolly.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String): typingsJapgolly.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Asterisk = js.native
  def Asterisk(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Asterisk = js.native
  
  /**
    *  Creates a new Bridge instance.
    */
  def Bridge(): typingsJapgolly.ariClient.mod.Bridge = js.native
  def Bridge(id: String): typingsJapgolly.ariClient.mod.Bridge = js.native
  def Bridge(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Bridge = js.native
  def Bridge(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Bridge = js.native
  
  /**
    *  Creates a new Channel instance.
    */
  def Channel(): typingsJapgolly.ariClient.mod.Channel = js.native
  def Channel(id: String): typingsJapgolly.ariClient.mod.Channel = js.native
  def Channel(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Channel = js.native
  def Channel(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Channel = js.native
  
  /**
    *  Creates a new DeviceState instance.
    */
  def DeviceState(): typingsJapgolly.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String): typingsJapgolly.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.DeviceState = js.native
  def DeviceState(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.DeviceState = js.native
  
  /**
    *  Creates a new Endpoint instance.
    */
  def Endpoint(): typingsJapgolly.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String): typingsJapgolly.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Endpoint = js.native
  def Endpoint(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Endpoint = js.native
  
  /**
    *  Creates a new LiveRecording instance.
    */
  def LiveRecording(): typingsJapgolly.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String): typingsJapgolly.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.LiveRecording = js.native
  
  /**
    *  Creates a new Mailbox instance.
    */
  def Mailbox(): typingsJapgolly.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String): typingsJapgolly.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Mailbox = js.native
  def Mailbox(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Mailbox = js.native
  
  /**
    *  Creates a new Playback instance.
    */
  def Playback(): typingsJapgolly.ariClient.mod.Playback = js.native
  def Playback(id: String): typingsJapgolly.ariClient.mod.Playback = js.native
  def Playback(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Playback = js.native
  def Playback(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Playback = js.native
  
  /**
    *  Creates a new Sound instance.
    */
  def Sound(): typingsJapgolly.ariClient.mod.Sound = js.native
  def Sound(id: String): typingsJapgolly.ariClient.mod.Sound = js.native
  def Sound(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Sound = js.native
  def Sound(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.Sound = js.native
  
  /**
    *  Creates a new StoredRecording instance.
    */
  def StoredRecording(): typingsJapgolly.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String): typingsJapgolly.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String, objValues: IndexableObject): typingsJapgolly.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: Unit, objValues: IndexableObject): typingsJapgolly.ariClient.mod.StoredRecording = js.native
  
  /**
    *  Available Applications resources.
    */
  var applications: Applications = js.native
  
  /**
    *  Available Asterisk resource.
    */
  var asterisk: Asterisk = js.native
  
  /**
    *  Available Bridges resources.
    */
  var bridges: Bridges = js.native
  
  /**
    *  Available Channels resources.
    */
  var channels: Channels = js.native
  
  /**
    *  Available DeviceStates resources.
    */
  var deviceStates: DeviceStates = js.native
  
  /**
    *  Available Endpoints resources.
    */
  var endpoints: Endpoints = js.native
  
  /**
    *  Available Events resources.
    */
  var events: Events = js.native
  
  /**
    *  Available Mailboxes resources.
    */
  var mailboxes: Mailboxes = js.native
  
  /**
    *  Pings the WebSocket.
    */
  def ping(): Unit = js.native
  
  /**
    *  Available Playbacks resources.
    */
  var playbacks: Playbacks = js.native
  
  /**
    *  Available Recordings resources.
    */
  var recordings: Recordings = js.native
  
  /**
    *  Available Sounds resources.
    */
  var sounds: Sounds = js.native
  
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param [subscribeAll] - Subscribe to all Asterisk events (true/false).
    */
  def start(apps: String): js.Promise[Unit] = js.native
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param callback - The callback to be called after applications have started.
    */
  def start(apps: String, callback: js.Function2[/* err */ js.Error, /* repeated */ Any, Unit]): Unit = js.native
  def start(apps: String, subscribeAll: Boolean): js.Promise[Unit] = js.native
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param subscribeAll - Subscribe to all Asterisk events (true/false).
    *  @param callback - The callback to be called after applications have started.
    */
  def start(
    apps: String,
    subscribeAll: Boolean,
    callback: js.Function2[/* err */ js.Error, /* repeated */ Any, Unit]
  ): Unit = js.native
  def start(apps: js.Array[String]): js.Promise[Unit] = js.native
  def start(apps: js.Array[String], callback: js.Function2[/* err */ js.Error, /* repeated */ Any, Unit]): Unit = js.native
  def start(apps: js.Array[String], subscribeAll: Boolean): js.Promise[Unit] = js.native
  def start(
    apps: js.Array[String],
    subscribeAll: Boolean,
    callback: js.Function2[/* err */ js.Error, /* repeated */ Any, Unit]
  ): Unit = js.native
  
  /**
    *  Closes the WebSocket connection.
    */
  def stop(): Unit = js.native
}
