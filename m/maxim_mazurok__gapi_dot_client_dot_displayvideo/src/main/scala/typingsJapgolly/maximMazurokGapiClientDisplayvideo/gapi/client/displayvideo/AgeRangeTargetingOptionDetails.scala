package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgeRangeTargetingOptionDetails extends StObject {
  
  /** Output only. The age range of an audience. */
  var ageRange: js.UndefOr[String] = js.undefined
}
object AgeRangeTargetingOptionDetails {
  
  inline def apply(): AgeRangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeTargetingOptionDetails]
  }
  
  extension [Self <: AgeRangeTargetingOptionDetails](x: Self) {
    
    inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
  }
}
