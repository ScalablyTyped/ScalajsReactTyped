package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.All
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessages
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessagesDelayed
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessagesNotVisible
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ContentBasedDeduplication
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.CreatedTimestamp
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.DelaySeconds
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.FifoQueue
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.KmsDataKeyReusePeriodSeconds
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.KmsMasterKeyId
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.LastModifiedTimestamp
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MaximumMessageSize
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageRetentionPeriod
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.Policy
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueArn
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiveMessageWaitTimeSeconds
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.RedrivePolicy
import typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.VisibilityTimeout
import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod.ChangeMessageVisibilityBatchRequestEntry
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchRequestEntryMod.DeleteMessageBatchRequestEntry
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod.SendMessageBatchRequestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput
    - typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput
    - typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
    - typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
    - typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
    - typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
    - typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
    - typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
    - typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
    - typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
    - typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
    - typingsJapgolly.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
    - typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
    - typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
    - typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput
    - typingsJapgolly.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
    - typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
    - typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
    - typingsJapgolly.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
    - typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def AddPermissionInput(
      AWSAccountIds: js.Array[String] | js.Iterable[String],
      Actions: js.Array[String] | js.Iterable[String],
      Label: String,
      QueueUrl: String
    ): typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput = {
      val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput]
    }
    
    inline def ChangeMessageVisibilityBatchInput(
      Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | js.Iterable[ChangeMessageVisibilityBatchRequestEntry],
      QueueUrl: String
    ): typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput]
    }
    
    inline def ChangeMessageVisibilityInput(QueueUrl: String, ReceiptHandle: String, VisibilityTimeout: Double): typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any], VisibilityTimeout = VisibilityTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput]
    }
    
    inline def CreateQueueInput(QueueName: String): typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput]
    }
    
    inline def DeleteMessageBatchInput(
      Entries: js.Array[DeleteMessageBatchRequestEntry] | js.Iterable[DeleteMessageBatchRequestEntry],
      QueueUrl: String
    ): typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput]
    }
    
    inline def DeleteMessageInput(QueueUrl: String, ReceiptHandle: String): typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput]
    }
    
    inline def DeleteQueueInput(QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput]
    }
    
    inline def GetQueueAttributesInput(QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput]
    }
    
    inline def GetQueueUrlInput(QueueName: String): typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput]
    }
    
    inline def ListDeadLetterSourceQueuesInput(QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput]
    }
    
    inline def ListQueueTagsInput(QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput]
    }
    
    inline def ListQueuesInput(): typingsJapgolly.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput]
    }
    
    inline def PurgeQueueInput(QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput]
    }
    
    inline def ReceiveMessageInput(QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput]
    }
    
    inline def RemovePermissionInput(Label: String, QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput = {
      val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput]
    }
    
    inline def SendMessageBatchInput(
      Entries: js.Array[SendMessageBatchRequestEntry] | js.Iterable[SendMessageBatchRequestEntry],
      QueueUrl: String
    ): typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput]
    }
    
    inline def SendMessageInput(MessageBody: String, QueueUrl: String): typingsJapgolly.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput = {
      val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput]
    }
    
    inline def SetQueueAttributesInput(
      Attributes: (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string} */ js.Any) | (js.Iterable[
          js.Tuple2[
            All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String, 
            String
          ]
        ]),
      QueueUrl: String
    ): typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput = {
      val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput]
    }
    
    inline def TagQueueInput(QueueUrl: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsJapgolly.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput]
    }
    
    inline def UntagQueueInput(QueueUrl: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput]
    }
  }
}
