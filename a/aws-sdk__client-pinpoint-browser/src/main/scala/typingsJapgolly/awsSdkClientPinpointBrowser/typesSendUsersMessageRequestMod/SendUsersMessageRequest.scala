package typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.DirectMessageConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.EndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessageRequest extends js.Object {
  /**
    * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  var Context: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined
  /**
    * A unique ID that you can use to trace a message. This ID is visible to recipients.
    */
  var TraceId: js.UndefOr[String] = js.undefined
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
    */
  var Users: js.UndefOr[
    StringDictionary[EndpointSendConfiguration] | (js.Iterable[js.Tuple2[String, EndpointSendConfiguration]])
  ] = js.undefined
}

object SendUsersMessageRequest {
  @scala.inline
  def apply(
    Context: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = null,
    MessageConfiguration: DirectMessageConfiguration = null,
    TraceId: String = null,
    Users: StringDictionary[EndpointSendConfiguration] | (js.Iterable[js.Tuple2[String, EndpointSendConfiguration]]) = null
  ): SendUsersMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessageRequest]
  }
}

