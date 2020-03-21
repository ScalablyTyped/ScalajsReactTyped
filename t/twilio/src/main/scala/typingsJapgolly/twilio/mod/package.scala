package typingsJapgolly.twilio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlertInstance = typingsJapgolly.twilio.mod.Resource
  type ApplicationInstance = typingsJapgolly.twilio.mod.InstanceResource
  type ApplicationResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.ApplicationInstance]
  type AuthorizedConnectAppInstance = typingsJapgolly.twilio.mod.Resource
  type AvailablePhoneNumberResource = typingsJapgolly.twilio.mod.BaseMappedResource[typingsJapgolly.twilio.mod.AvailablePhoneNumberInstance]
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ java.lang.String, T]
  type CallFeedbackSummaryInstance = typingsJapgolly.twilio.mod.DeletableResource
  type CallNotificationResource = typingsJapgolly.twilio.mod.ListableResource
  type CallRecordingResource = typingsJapgolly.twilio.mod.ListableResource
  type CountryInstance = typingsJapgolly.twilio.mod.Resource
  type CredentialInstance = typingsJapgolly.twilio.mod.InstanceResource
  type CredentialListMappingInstance = typingsJapgolly.twilio.mod.DeletableResource
  type DependentPhoneNumberResource = typingsJapgolly.twilio.mod.ListableResource
  type EventInstance = typingsJapgolly.twilio.mod.Resource
  type IPAccessControlListMappingInstance = typingsJapgolly.twilio.mod.DeletableResource
  type IPAddressInstance = typingsJapgolly.twilio.mod.InstanceResource
  type KeyInstance = typingsJapgolly.twilio.mod.InstanceResource
  type KeyResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.KeyInstance]
  type MessageMediaInstance = typingsJapgolly.twilio.mod.DeletableResource
  type MiddlewareFunction = js.Function3[
    /* request */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    scala.Unit
  ]
  type NotificationInstance = typingsJapgolly.twilio.mod.DeletableResource
  type NumberInstance = typingsJapgolly.twilio.mod.Resource
  type OriginationURLInstance = typingsJapgolly.twilio.mod.InstanceResource
  type OutgoingCallerIdResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.OutgoingCallerIdInstance]
  type PhoneNumberInstance = typingsJapgolly.twilio.mod.Resource
  type PhoneNumberResource = typingsJapgolly.twilio.mod.BaseMappedResource[typingsJapgolly.twilio.mod.PhoneNumberInstance]
  type QueueResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.QueueInstance]
  type RecordingTranscriptionResource = typingsJapgolly.twilio.mod.ListableResource
  type RequestCallback = js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  type SMSMessageInstance = typingsJapgolly.twilio.mod.Resource
  type SMSMessageResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.SMSMessageInstance]
  type ServiceChannelMemberInstance = typingsJapgolly.twilio.mod.InstanceResource
  type ServiceChannelMessageInstance = typingsJapgolly.twilio.mod.InstanceResource
  type ServiceRoleInstance = typingsJapgolly.twilio.mod.Resource
  type ServiceUserInstance = typingsJapgolly.twilio.mod.InstanceResource
  type TranscriptionInstance = typingsJapgolly.twilio.mod.DeletableResource
  type TwimlCallback = js.Function1[/* node */ typingsJapgolly.twilio.mod.Node, scala.Unit]
  type UsageRecordInstance = typingsJapgolly.twilio.mod.Resource
  type UsageRecordRange = typingsJapgolly.twilio.mod.ListableResource
  type UsageTriggerInstance = typingsJapgolly.twilio.mod.InstanceResource
  type UsageTriggerResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.UsageTriggerInstance]
  type WorkspaceActivityInstance = typingsJapgolly.twilio.mod.InstanceResource
  type WorkspaceEventInstance = typingsJapgolly.twilio.mod.Resource
  type WorkspaceInstanceStatisticResource = typingsJapgolly.twilio.mod.Resource
  type WorkspaceResource = typingsJapgolly.twilio.mod.CreatableMappedResource[typingsJapgolly.twilio.mod.WorkspaceInstance]
  type WorkspaceStatisticResource = typingsJapgolly.twilio.mod.ListableResource
  type twilio = js.Function3[
    /* sid */ js.UndefOr[java.lang.String], 
    /* tkn */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsJapgolly.twilio.mod.ClientOptions], 
    typingsJapgolly.twilio.mod.RestClient
  ]
}
