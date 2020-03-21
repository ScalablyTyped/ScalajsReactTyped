package typingsJapgolly.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineForExecutionOutput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition = js.native
  /**
    * The name of the state machine associated with the execution.
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution. 
    */
  var roleArn: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine associated with the execution.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The date and time the state machine associated with an execution was updated. For a newly created state machine, this is the creation date.
    */
  var updateDate: js.Date = js.native
}

object DescribeStateMachineForExecutionOutput {
  @scala.inline
  def apply(definition: Definition, name: Name, roleArn: Arn, stateMachineArn: Arn, updateDate: js.Date): DescribeStateMachineForExecutionOutput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], updateDate = updateDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStateMachineForExecutionOutput]
  }
}

