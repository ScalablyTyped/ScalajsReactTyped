package typingsJapgolly.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExclusionDuration extends StObject {
  
  /** Whether to make the exclusion TEMPORARY or PERMANENT. */
  var exclusionDuration: js.UndefOr[String] = js.undefined
  
  /** The segment condition that will cause a user to be removed from an audience. */
  var segment: js.UndefOr[String] = js.undefined
}
object ExclusionDuration {
  
  inline def apply(): ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusionDuration]
  }
  
  extension [Self <: ExclusionDuration](x: Self) {
    
    inline def setExclusionDuration(value: String): Self = StObject.set(x, "exclusionDuration", value.asInstanceOf[js.Any])
    
    inline def setExclusionDurationUndefined: Self = StObject.set(x, "exclusionDuration", js.undefined)
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
