package typingsJapgolly.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeConditions extends StObject {
  
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[
    typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions
  ] = js.undefined
}
object IncludeConditions {
  
  inline def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  
  extension [Self <: IncludeConditions](x: Self) {
    
    inline def setIncludeConditions(value: typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    inline def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
