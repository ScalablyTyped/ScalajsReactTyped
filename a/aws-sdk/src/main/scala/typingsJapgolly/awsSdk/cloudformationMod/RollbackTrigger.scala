package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackTrigger extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rollback trigger. If a specified trigger is missing, the entire stack operation fails and is rolled back. 
    */
  var Arn: typingsJapgolly.awsSdk.cloudformationMod.Arn = js.native
  /**
    * The resource type of the rollback trigger. Currently, AWS::CloudWatch::Alarm is the only supported resource type.
    */
  var Type: typingsJapgolly.awsSdk.cloudformationMod.Type = js.native
}

object RollbackTrigger {
  @scala.inline
  def apply(Arn: Arn, Type: Type): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollbackTrigger]
  }
}

