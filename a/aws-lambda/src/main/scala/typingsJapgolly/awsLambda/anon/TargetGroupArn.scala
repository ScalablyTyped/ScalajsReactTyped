package typingsJapgolly.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupArn extends StObject {
  
  var targetGroupArn: String
}
object TargetGroupArn {
  
  inline def apply(targetGroupArn: String): TargetGroupArn = {
    val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupArn]
  }
  
  extension [Self <: TargetGroupArn](x: Self) {
    
    inline def setTargetGroupArn(value: String): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
  }
}
