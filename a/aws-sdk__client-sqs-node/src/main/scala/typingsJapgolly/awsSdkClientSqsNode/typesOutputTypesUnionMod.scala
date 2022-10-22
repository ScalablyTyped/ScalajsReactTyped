package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod.UnmarshalledChangeMessageVisibilityBatchResultEntry
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod.UnmarshalledSendMessageBatchResultEntry
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
    - typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    inline def AddPermissionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput]
    }
    
    inline def ChangeMessageVisibilityBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]
    ): typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput]
    }
    
    inline def ChangeMessageVisibilityOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput]
    }
    
    inline def CreateQueueOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput]
    }
    
    inline def DeleteMessageBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
    ): typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput]
    }
    
    inline def DeleteMessageOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput]
    }
    
    inline def DeleteQueueOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput]
    }
    
    inline def GetQueueAttributesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput]
    }
    
    inline def GetQueueUrlOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput]
    }
    
    inline def ListDeadLetterSourceQueuesOutput($metadata: ResponseMetadata, queueUrls: js.Array[String]): typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput]
    }
    
    inline def ListQueueTagsOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput]
    }
    
    inline def ListQueuesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput]
    }
    
    inline def PurgeQueueOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput]
    }
    
    inline def ReceiveMessageOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput]
    }
    
    inline def RemovePermissionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput]
    }
    
    inline def SendMessageBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
    ): typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput]
    }
    
    inline def SendMessageOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput]
    }
    
    inline def SetQueueAttributesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput]
    }
    
    inline def TagQueueOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput]
    }
    
    inline def UntagQueueOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput]
    }
  }
}
