package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilterResponse extends StObject {
  
  /**
    * The ARN of the new filter.
    */
  var filterArn: js.UndefOr[Arn] = js.undefined
}
object CreateFilterResponse {
  
  inline def apply(): CreateFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFilterResponse]
  }
  
  extension [Self <: CreateFilterResponse](x: Self) {
    
    inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    inline def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
  }
}
