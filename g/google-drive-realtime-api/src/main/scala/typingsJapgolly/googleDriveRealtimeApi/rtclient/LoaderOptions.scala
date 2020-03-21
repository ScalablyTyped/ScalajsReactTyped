package typingsJapgolly.googleDriveRealtimeApi.rtclient

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Document
import typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  // Your Application ID from the Google APIs Console.
  var appId: String
  // The ID of the button to click to authorize. Must be a DOM element ID.
  var authButtonElementId: String
  // Autocreate files right after auth automatically.
  var autoCreate: Boolean
  // Client ID from the console.
  var clientId: String
  // The name of newly created Drive files, if no title is specified.
  var defaultTitle: String
  // The MIME type of newly created Drive Files. By default the application
  // specific MIME type will be used:
  // application/vnd.google-apps.drive-sdk.
  var newFileMimeType: String
  // Function to be called after authorization and before loading files.
  def afterAuth(): Unit
  // Function to be called when a Realtime model is first created.
  def initializeModel(model: Model): Unit
  // Function to be called every time a Realtime file is loaded.
  def onFileLoaded(rtdoc: Document): Unit
  //newFileMimeType = null // default
  // Function to be called to initialize custom Collaborative Objects types.
  def registerTypes(): Unit
}

object LoaderOptions {
  @scala.inline
  def apply(
    afterAuth: Callback,
    appId: String,
    authButtonElementId: String,
    autoCreate: Boolean,
    clientId: String,
    defaultTitle: String,
    initializeModel: Model => Callback,
    newFileMimeType: String,
    onFileLoaded: Document => Callback,
    registerTypes: Callback
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], authButtonElementId = authButtonElementId.asInstanceOf[js.Any], autoCreate = autoCreate.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], defaultTitle = defaultTitle.asInstanceOf[js.Any], newFileMimeType = newFileMimeType.asInstanceOf[js.Any])
    __obj.updateDynamic("afterAuth")(afterAuth.toJsFn)
    __obj.updateDynamic("initializeModel")(js.Any.fromFunction1((t0: typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Model) => initializeModel(t0).runNow()))
    __obj.updateDynamic("onFileLoaded")(js.Any.fromFunction1((t0: typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Document) => onFileLoaded(t0).runNow()))
    __obj.updateDynamic("registerTypes")(registerTypes.toJsFn)
    __obj.asInstanceOf[LoaderOptions]
  }
}

