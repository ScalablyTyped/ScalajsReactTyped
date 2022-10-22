package typingsJapgolly.cfnResponse

import typingsJapgolly.awsLambda.handlerMod.Context
import typingsJapgolly.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cfn-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cfn-response", "FAILED")
  @js.native
  val FAILED: typingsJapgolly.cfnResponse.cfnResponseStrings.FAILED = js.native
  
  @JSImport("cfn-response", "SUCCESS")
  @js.native
  val SUCCESS: typingsJapgolly.cfnResponse.cfnResponseStrings.SUCCESS = js.native
  
  inline def send(event: CloudFormationCustomResourceEvent, context: Context, responseStatus: ResponseStatus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: Unit,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: Unit,
    physicalResourceId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: Unit,
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: Unit,
    physicalResourceId: Unit,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cfnResponse.cfnResponseStrings.SUCCESS
    - typingsJapgolly.cfnResponse.cfnResponseStrings.FAILED
  */
  trait ResponseStatus extends StObject
  object ResponseStatus {
    
    inline def FAILED: typingsJapgolly.cfnResponse.cfnResponseStrings.FAILED = "FAILED".asInstanceOf[typingsJapgolly.cfnResponse.cfnResponseStrings.FAILED]
    
    inline def SUCCESS: typingsJapgolly.cfnResponse.cfnResponseStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsJapgolly.cfnResponse.cfnResponseStrings.SUCCESS]
  }
}
