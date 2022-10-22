package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommandInvocationResult extends StObject {
  
  /**
    * Amazon CloudWatch Logs information where Systems Manager sent the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.CloudWatchOutputConfig] = js.undefined
  
  /**
    * The parent command ID of the invocation plugin.
    */
  var CommandId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.CommandId] = js.undefined
  
  /**
    * The comment text for the command.
    */
  var Comment: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.Comment] = js.undefined
  
  /**
    * The name of the document that was run. For example, AWS-RunShellScript.
    */
  var DocumentName: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DocumentName] = js.undefined
  
  /**
    * The Systems Manager document (SSM document) version used in the request.
    */
  var DocumentVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * Duration since ExecutionStartDateTime.
    */
  var ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.undefined
  
  /**
    * The date and time the plugin finished running. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample Amazon Web Services CLI command uses the InvokedAfter filter.  aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z  If the plugin hasn't started to run, the string is empty.
    */
  var ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.undefined
  
  /**
    * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample Amazon Web Services CLI command uses the InvokedBefore filter.  aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z  If the plugin hasn't started to run, the string is empty.
    */
  var ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.undefined
  
  /**
    * The ID of the managed node targeted by the command. A managed node can be an Amazon Elastic Compute Cloud (Amazon EC2) instance, edge device, or on-premises server or VM in your hybrid environment that is configured for Amazon Web Services Systems Manager.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * The name of the plugin, or step name, for which details are reported. For example, aws:RunShellScript is a plugin.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.undefined
  
  /**
    * The error level response code for the plugin script. If the response code is -1, then the command hasn't started running on the managed node, or it wasn't received by the node.
    */
  var ResponseCode: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ResponseCode] = js.undefined
  
  /**
    * The first 8,000 characters written by the plugin to stderr. If the command hasn't finished running, then this string is empty.
    */
  var StandardErrorContent: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.StandardErrorContent] = js.undefined
  
  /**
    * The URL for the complete text written by the plugin to stderr. If the command hasn't finished running, then this string is empty.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The first 24,000 characters written by the plugin to stdout. If the command hasn't finished running, if ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
    */
  var StandardOutputContent: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.StandardOutputContent] = js.undefined
  
  /**
    * The URL for the complete text written by the plugin to stdout in Amazon Simple Storage Service (Amazon S3). If an S3 bucket wasn't specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The status of this invocation plugin. This status can be different than StatusDetails.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
  
  /**
    * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the Amazon Web Services Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command hasn't been sent to the managed node.   In Progress: The command has been sent to the managed node but hasn't reached a terminal state.   Delayed: The system attempted to send the command to the target, but the target wasn't available. The managed node might not be available because of network issues, because the node was stopped, or for similar reasons. The system will try to send the command again.   Success: The command or plugin ran successfully. This is a terminal state.   Delivery Timed Out: The command wasn't delivered to the managed node before the delivery timeout expired. Delivery timeouts don't count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: The command started to run on the managed node, but the execution wasn't complete before the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't run successfully on the managed node. For a plugin, this indicates that the result code wasn't zero. For a command invocation, this indicates that the result code for one or more plugins wasn't zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Cancelled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the managed node. The node might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.StatusDetails] = js.undefined
}
object GetCommandInvocationResult {
  
  inline def apply(): GetCommandInvocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommandInvocationResult]
  }
  
  extension [Self <: GetCommandInvocationResult](x: Self) {
    
    inline def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = StObject.set(x, "CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchOutputConfigUndefined: Self = StObject.set(x, "CloudWatchOutputConfig", js.undefined)
    
    inline def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    inline def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setExecutionElapsedTime(value: StringDateTime): Self = StObject.set(x, "ExecutionElapsedTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionElapsedTimeUndefined: Self = StObject.set(x, "ExecutionElapsedTime", js.undefined)
    
    inline def setExecutionEndDateTime(value: StringDateTime): Self = StObject.set(x, "ExecutionEndDateTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionEndDateTimeUndefined: Self = StObject.set(x, "ExecutionEndDateTime", js.undefined)
    
    inline def setExecutionStartDateTime(value: StringDateTime): Self = StObject.set(x, "ExecutionStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartDateTimeUndefined: Self = StObject.set(x, "ExecutionStartDateTime", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setPluginName(value: CommandPluginName): Self = StObject.set(x, "PluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "PluginName", js.undefined)
    
    inline def setResponseCode(value: ResponseCode): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    inline def setStandardErrorContent(value: StandardErrorContent): Self = StObject.set(x, "StandardErrorContent", value.asInstanceOf[js.Any])
    
    inline def setStandardErrorContentUndefined: Self = StObject.set(x, "StandardErrorContent", js.undefined)
    
    inline def setStandardErrorUrl(value: Url): Self = StObject.set(x, "StandardErrorUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardErrorUrlUndefined: Self = StObject.set(x, "StandardErrorUrl", js.undefined)
    
    inline def setStandardOutputContent(value: StandardOutputContent): Self = StObject.set(x, "StandardOutputContent", value.asInstanceOf[js.Any])
    
    inline def setStandardOutputContentUndefined: Self = StObject.set(x, "StandardOutputContent", js.undefined)
    
    inline def setStandardOutputUrl(value: Url): Self = StObject.set(x, "StandardOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardOutputUrlUndefined: Self = StObject.set(x, "StandardOutputUrl", js.undefined)
    
    inline def setStatus(value: CommandInvocationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
