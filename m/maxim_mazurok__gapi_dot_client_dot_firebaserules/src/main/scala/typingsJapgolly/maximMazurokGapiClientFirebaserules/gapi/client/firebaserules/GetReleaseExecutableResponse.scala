package typingsJapgolly.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReleaseExecutableResponse extends StObject {
  
  /** Executable view of the `Ruleset` referenced by the `Release`. */
  var executable: js.UndefOr[String] = js.undefined
  
  /** The Rules runtime version of the executable. */
  var executableVersion: js.UndefOr[String] = js.undefined
  
  /** `Language` used to generate the executable bytes. */
  var language: js.UndefOr[String] = js.undefined
  
  /** `Ruleset` name associated with the `Release` executable. */
  var rulesetName: js.UndefOr[String] = js.undefined
  
  /** Optional, indicates the freshness of the result. The response is guaranteed to be the latest within an interval up to the sync_time (inclusive). */
  var syncTime: js.UndefOr[String] = js.undefined
  
  /** Timestamp for the most recent `Release.update_time`. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GetReleaseExecutableResponse {
  
  inline def apply(): GetReleaseExecutableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReleaseExecutableResponse]
  }
  
  extension [Self <: GetReleaseExecutableResponse](x: Self) {
    
    inline def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
    
    inline def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
    
    inline def setExecutableVersion(value: String): Self = StObject.set(x, "executableVersion", value.asInstanceOf[js.Any])
    
    inline def setExecutableVersionUndefined: Self = StObject.set(x, "executableVersion", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRulesetName(value: String): Self = StObject.set(x, "rulesetName", value.asInstanceOf[js.Any])
    
    inline def setRulesetNameUndefined: Self = StObject.set(x, "rulesetName", js.undefined)
    
    inline def setSyncTime(value: String): Self = StObject.set(x, "syncTime", value.asInstanceOf[js.Any])
    
    inline def setSyncTimeUndefined: Self = StObject.set(x, "syncTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
