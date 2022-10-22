package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHumanTaskUiResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
    */
  var HumanTaskUiArn: typingsJapgolly.awsSdk.clientsSagemakerMod.HumanTaskUiArn
}
object CreateHumanTaskUiResponse {
  
  inline def apply(HumanTaskUiArn: HumanTaskUiArn): CreateHumanTaskUiResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHumanTaskUiResponse]
  }
  
  extension [Self <: CreateHumanTaskUiResponse](x: Self) {
    
    inline def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
  }
}
