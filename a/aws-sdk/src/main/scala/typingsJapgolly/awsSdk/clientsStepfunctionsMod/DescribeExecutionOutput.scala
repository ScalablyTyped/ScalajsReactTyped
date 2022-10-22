package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn
  
  /**
    * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  
  var inputDetails: js.UndefOr[CloudWatchEventsExecutionDataDetails] = js.undefined
  
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  
  var outputDetails: js.UndefOr[CloudWatchEventsExecutionDataDetails] = js.undefined
  
  /**
    * The date the execution is started.
    */
  var startDate: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the executed stated machine.
    */
  var stateMachineArn: Arn
  
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus
  
  /**
    * If the execution has already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The AWS X-Ray trace header that was passed to the execution.
    */
  var traceHeader: js.UndefOr[TraceHeader] = js.undefined
}
object DescribeExecutionOutput {
  
  inline def apply(executionArn: Arn, startDate: js.Date, stateMachineArn: Arn, status: ExecutionStatus): DescribeExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionOutput]
  }
  
  extension [Self <: DescribeExecutionOutput](x: Self) {
    
    inline def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    inline def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputDetails(value: CloudWatchEventsExecutionDataDetails): Self = StObject.set(x, "inputDetails", value.asInstanceOf[js.Any])
    
    inline def setInputDetailsUndefined: Self = StObject.set(x, "inputDetails", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputDetails(value: CloudWatchEventsExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStopDate(value: js.Date): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
    
    inline def setStopDateUndefined: Self = StObject.set(x, "stopDate", js.undefined)
    
    inline def setTraceHeader(value: TraceHeader): Self = StObject.set(x, "traceHeader", value.asInstanceOf[js.Any])
    
    inline def setTraceHeaderUndefined: Self = StObject.set(x, "traceHeader", js.undefined)
  }
}
