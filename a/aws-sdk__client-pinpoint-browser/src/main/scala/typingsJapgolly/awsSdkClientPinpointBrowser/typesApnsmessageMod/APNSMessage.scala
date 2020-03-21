package typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsmessageMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSMessage extends js.Object {
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
    */
  var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.undefined
  /**
    * Include this key when you want the system to modify the badge of your app icon. If this key is not included in the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
    */
  var Badge: js.UndefOr[Double] = js.undefined
  /**
    * The message body of the notification.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * Provide this key with a string value that represents the notification's type. This value corresponds to the value in the identifier property of one of your app's registered categories.
    */
  var Category: js.UndefOr[String] = js.undefined
  /**
    * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint uses this value to set the apns-collapse-id request header when it sends the message to APNs.
    */
  var CollapseId: js.UndefOr[String] = js.undefined
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  var Data: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * The URL that points to a video used in the push notification.
    */
  var MediaUrl: js.UndefOr[String] = js.undefined
  /**
    * The preferred authentication method, either "CERTIFICATE" or "TOKEN"
    */
  var PreferredAuthenticationMethod: js.UndefOr[String] = js.undefined
  /**
    * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the message to APNs. Accepts the following values:
    *
    * "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
    *
    * "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge on the receiving device.
    *
    * The default value is "10".
    *
    * The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for APNs messages and converts them.
    *
    * For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote Notification Programming Guide.
    */
  var Priority: js.UndefOr[String] = js.undefined
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[Boolean] = js.undefined
  /**
    * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be found, or if you specify defaultfor the value, the system plays the default alert sound.
    */
  var Sound: js.UndefOr[String] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.undefined
  /**
    * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If you provide a Notification Content app extension, you can use this value to group your notifications together.
    */
  var ThreadId: js.UndefOr[String] = js.undefined
  /**
    * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the apns-expiration request header when it sends the message to APNs.
    */
  var TimeToLive: js.UndefOr[Double] = js.undefined
  /**
    * The message title that displays above the message on the user's device.
    */
  var Title: js.UndefOr[String] = js.undefined
  /**
    * The URL to open in the user's mobile browser. Used if the value for Action is URL.
    */
  var Url: js.UndefOr[String] = js.undefined
}

object APNSMessage {
  @scala.inline
  def apply(
    Action: OPEN_APP | DEEP_LINK | URL | String = null,
    Badge: Int | Double = null,
    Body: String = null,
    Category: String = null,
    CollapseId: String = null,
    Data: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = null,
    MediaUrl: String = null,
    PreferredAuthenticationMethod: String = null,
    Priority: String = null,
    RawContent: String = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    Sound: String = null,
    Substitutions: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]) = null,
    ThreadId: String = null,
    TimeToLive: Int | Double = null,
    Title: String = null,
    Url: String = null
  ): APNSMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Badge != null) __obj.updateDynamic("Badge")(Badge.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (CollapseId != null) __obj.updateDynamic("CollapseId")(CollapseId.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl.asInstanceOf[js.Any])
    if (PreferredAuthenticationMethod != null) __obj.updateDynamic("PreferredAuthenticationMethod")(PreferredAuthenticationMethod.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.asInstanceOf[js.Any])
    if (Sound != null) __obj.updateDynamic("Sound")(Sound.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId.asInstanceOf[js.Any])
    if (TimeToLive != null) __obj.updateDynamic("TimeToLive")(TimeToLive.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSMessage]
  }
}

