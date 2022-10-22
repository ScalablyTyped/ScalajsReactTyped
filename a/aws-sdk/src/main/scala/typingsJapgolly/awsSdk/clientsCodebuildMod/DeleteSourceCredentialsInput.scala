package typingsJapgolly.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSourceCredentialsInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the token.
    */
  var arn: NonEmptyString
}
object DeleteSourceCredentialsInput {
  
  inline def apply(arn: NonEmptyString): DeleteSourceCredentialsInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSourceCredentialsInput]
  }
  
  extension [Self <: DeleteSourceCredentialsInput](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
