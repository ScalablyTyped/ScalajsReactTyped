package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateProvisionedProductOutput extends StObject {
  
  /**
    * Information about the result of this request.
    */
  var RecordDetail: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.RecordDetail] = js.undefined
}
object TerminateProvisionedProductOutput {
  
  inline def apply(): TerminateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateProvisionedProductOutput]
  }
  
  extension [Self <: TerminateProvisionedProductOutput](x: Self) {
    
    inline def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    inline def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
