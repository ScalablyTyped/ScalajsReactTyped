package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamInstanceProfileSpecification extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the instance profile.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object IamInstanceProfileSpecification {
  
  inline def apply(): IamInstanceProfileSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfileSpecification]
  }
  
  extension [Self <: IamInstanceProfileSpecification](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
