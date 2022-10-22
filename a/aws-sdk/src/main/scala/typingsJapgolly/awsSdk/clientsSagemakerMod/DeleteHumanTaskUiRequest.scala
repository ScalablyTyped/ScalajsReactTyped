package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHumanTaskUiRequest extends StObject {
  
  /**
    * The name of the human task user interface (work task template) you want to delete.
    */
  var HumanTaskUiName: typingsJapgolly.awsSdk.clientsSagemakerMod.HumanTaskUiName
}
object DeleteHumanTaskUiRequest {
  
  inline def apply(HumanTaskUiName: HumanTaskUiName): DeleteHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHumanTaskUiRequest]
  }
  
  extension [Self <: DeleteHumanTaskUiRequest](x: Self) {
    
    inline def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
  }
}
