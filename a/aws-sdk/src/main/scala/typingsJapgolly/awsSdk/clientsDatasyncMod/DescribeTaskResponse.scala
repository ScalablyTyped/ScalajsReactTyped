package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the task. For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  
  /**
    * The time that the task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task execution that is syncing files.
    */
  var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
    */
  var DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the destination elastic network interfaces (ENIs) that were created for your subnet.
    */
  var DestinationNetworkInterfaceArns: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.DestinationNetworkInterfaceArns] = js.undefined
  
  /**
    * Errors that DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.undefined
  
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2".   
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern contains a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2".
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The name of the task that was described.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the overriding OverrideOptions value to StartTaskExecution operation. 
    */
  var Options: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.Options] = js.undefined
  
  /**
    * The schedule used to periodically transfer files from a source to a destination location.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source file system's location.
    */
  var SourceLocationArn: js.UndefOr[LocationArn] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the source elastic network interfaces (ENIs) that were created for your subnet.
    */
  var SourceNetworkInterfaceArns: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.SourceNetworkInterfaceArns] = js.undefined
  
  /**
    * The status of the task that was described. For detailed information about task execution statuses, see Understanding Task Statuses in the DataSync User Guide.
    */
  var Status: js.UndefOr[TaskStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task that was described.
    */
  var TaskArn: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.TaskArn] = js.undefined
}
object DescribeTaskResponse {
  
  inline def apply(): DescribeTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskResponse]
  }
  
  extension [Self <: DescribeTaskResponse](x: Self) {
    
    inline def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "CurrentTaskExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentTaskExecutionArnUndefined: Self = StObject.set(x, "CurrentTaskExecutionArn", js.undefined)
    
    inline def setDestinationLocationArn(value: LocationArn): Self = StObject.set(x, "DestinationLocationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationLocationArnUndefined: Self = StObject.set(x, "DestinationLocationArn", js.undefined)
    
    inline def setDestinationNetworkInterfaceArns(value: DestinationNetworkInterfaceArns): Self = StObject.set(x, "DestinationNetworkInterfaceArns", value.asInstanceOf[js.Any])
    
    inline def setDestinationNetworkInterfaceArnsUndefined: Self = StObject.set(x, "DestinationNetworkInterfaceArns", js.undefined)
    
    inline def setDestinationNetworkInterfaceArnsVarargs(value: NetworkInterfaceArn*): Self = StObject.set(x, "DestinationNetworkInterfaceArns", js.Array(value*))
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorDetail(value: String): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    inline def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    inline def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value*))
    
    inline def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    inline def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value*))
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSchedule(value: TaskSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSourceLocationArn(value: LocationArn): Self = StObject.set(x, "SourceLocationArn", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationArnUndefined: Self = StObject.set(x, "SourceLocationArn", js.undefined)
    
    inline def setSourceNetworkInterfaceArns(value: SourceNetworkInterfaceArns): Self = StObject.set(x, "SourceNetworkInterfaceArns", value.asInstanceOf[js.Any])
    
    inline def setSourceNetworkInterfaceArnsUndefined: Self = StObject.set(x, "SourceNetworkInterfaceArns", js.undefined)
    
    inline def setSourceNetworkInterfaceArnsVarargs(value: NetworkInterfaceArn*): Self = StObject.set(x, "SourceNetworkInterfaceArns", js.Array(value*))
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
