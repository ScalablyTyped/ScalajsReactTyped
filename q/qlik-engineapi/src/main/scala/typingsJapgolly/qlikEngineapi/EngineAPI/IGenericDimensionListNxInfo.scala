package typingsJapgolly.qlikEngineapi.EngineAPI

import typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.DimensionList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionListNxInfo width extend NxInfo
  */
trait IGenericDimensionListNxInfo
  extends StObject
     with INxInfo {
  
  @JSName("qType")
  var qType_IGenericDimensionListNxInfo: DimensionList
}
object IGenericDimensionListNxInfo {
  
  inline def apply(): IGenericDimensionListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "DimensionList")
    __obj.asInstanceOf[IGenericDimensionListNxInfo]
  }
  
  extension [Self <: IGenericDimensionListNxInfo](x: Self) {
    
    inline def setQType(value: DimensionList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
