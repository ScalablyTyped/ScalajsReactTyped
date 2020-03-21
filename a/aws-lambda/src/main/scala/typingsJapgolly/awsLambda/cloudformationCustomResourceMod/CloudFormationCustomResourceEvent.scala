package typingsJapgolly.awsLambda.cloudformationCustomResourceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.AnonDictKey
import typingsJapgolly.awsLambda.awsLambdaStrings.Create
import typingsJapgolly.awsLambda.awsLambdaStrings.Delete
import typingsJapgolly.awsLambda.awsLambdaStrings.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent
  - typingsJapgolly.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent
  - typingsJapgolly.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent
*/
trait CloudFormationCustomResourceEvent extends js.Object

object CloudFormationCustomResourceEvent {
  @scala.inline
  def CloudFormationCustomResourceCreateEvent(
    LogicalResourceId: String,
    RequestId: String,
    RequestType: Create,
    ResourceProperties: AnonDictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFormationCustomResourceEvent]
  }
  @scala.inline
  def CloudFormationCustomResourceUpdateEvent(
    LogicalResourceId: String,
    OldResourceProperties: StringDictionary[js.Any],
    PhysicalResourceId: String,
    RequestId: String,
    RequestType: Update,
    ResourceProperties: AnonDictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFormationCustomResourceEvent]
  }
  @scala.inline
  def CloudFormationCustomResourceDeleteEvent(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    RequestType: Delete,
    ResourceProperties: AnonDictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFormationCustomResourceEvent]
  }
}

