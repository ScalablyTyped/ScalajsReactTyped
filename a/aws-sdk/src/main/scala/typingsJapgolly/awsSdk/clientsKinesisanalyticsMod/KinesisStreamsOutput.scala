package typingsJapgolly.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsOutput extends StObject {
  
  /**
    * ARN of the destination Amazon Kinesis stream to write to.
    */
  var ResourceARN: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ResourceARN
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.RoleARN
}
object KinesisStreamsOutput {
  
  inline def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutput]
  }
  
  extension [Self <: KinesisStreamsOutput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
