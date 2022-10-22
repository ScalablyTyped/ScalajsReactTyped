package typingsJapgolly.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRevisionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
    
    */
  var Arn: string
  
  /**
    * 
    A string that uniquely identifies a revision of an MSK configuration.
    
    */
  var Revision: long
}
object DescribeConfigurationRevisionRequest {
  
  inline def apply(Arn: string, Revision: long): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
  
  extension [Self <: DescribeConfigurationRevisionRequest](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
