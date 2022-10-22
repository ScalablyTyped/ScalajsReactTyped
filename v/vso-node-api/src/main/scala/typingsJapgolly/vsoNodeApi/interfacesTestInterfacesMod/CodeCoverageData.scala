package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverageData extends StObject {
  
  /**
    * Flavor of build for which data is retrieved/published
    */
  var buildFlavor: String
  
  /**
    * Platform of build for which data is retrieved/published
    */
  var buildPlatform: String
  
  /**
    * List of coverage data for the build
    */
  var coverageStats: js.Array[CodeCoverageStatistics]
}
object CodeCoverageData {
  
  inline def apply(buildFlavor: String, buildPlatform: String, coverageStats: js.Array[CodeCoverageStatistics]): CodeCoverageData = {
    val __obj = js.Dynamic.literal(buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], coverageStats = coverageStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageData]
  }
  
  extension [Self <: CodeCoverageData](x: Self) {
    
    inline def setBuildFlavor(value: String): Self = StObject.set(x, "buildFlavor", value.asInstanceOf[js.Any])
    
    inline def setBuildPlatform(value: String): Self = StObject.set(x, "buildPlatform", value.asInstanceOf[js.Any])
    
    inline def setCoverageStats(value: js.Array[CodeCoverageStatistics]): Self = StObject.set(x, "coverageStats", value.asInstanceOf[js.Any])
    
    inline def setCoverageStatsVarargs(value: CodeCoverageStatistics*): Self = StObject.set(x, "coverageStats", js.Array(value*))
  }
}
