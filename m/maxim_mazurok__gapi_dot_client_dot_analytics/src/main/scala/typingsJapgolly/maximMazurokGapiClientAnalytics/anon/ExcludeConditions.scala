package typingsJapgolly.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeConditions extends StObject {
  
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.undefined
  
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[
    typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions
  ] = js.undefined
}
object ExcludeConditions {
  
  inline def apply(): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeConditions]
  }
  
  extension [Self <: ExcludeConditions](x: Self) {
    
    inline def setExcludeConditions(value: ExclusionDuration): Self = StObject.set(x, "excludeConditions", value.asInstanceOf[js.Any])
    
    inline def setExcludeConditionsUndefined: Self = StObject.set(x, "excludeConditions", js.undefined)
    
    inline def setIncludeConditions(value: typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    inline def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
