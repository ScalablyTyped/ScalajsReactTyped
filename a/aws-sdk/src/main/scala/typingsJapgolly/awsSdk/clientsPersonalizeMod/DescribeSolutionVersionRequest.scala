package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSolutionVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution version.
    */
  var solutionVersionArn: Arn
}
object DescribeSolutionVersionRequest {
  
  inline def apply(solutionVersionArn: Arn): DescribeSolutionVersionRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSolutionVersionRequest]
  }
  
  extension [Self <: DescribeSolutionVersionRequest](x: Self) {
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
