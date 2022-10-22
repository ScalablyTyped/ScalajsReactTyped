package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverageSummary extends StObject {
  
  /**
    * Uri of build for which data is retrieved/published
    */
  var build: ShallowReference
  
  /**
    * List of coverage data and details for the build
    */
  var coverageData: js.Array[CodeCoverageData]
  
  /**
    * Uri of build against which difference in coverage is computed
    */
  var deltaBuild: ShallowReference
}
object CodeCoverageSummary {
  
  inline def apply(build: ShallowReference, coverageData: js.Array[CodeCoverageData], deltaBuild: ShallowReference): CodeCoverageSummary = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], coverageData = coverageData.asInstanceOf[js.Any], deltaBuild = deltaBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageSummary]
  }
  
  extension [Self <: CodeCoverageSummary](x: Self) {
    
    inline def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setCoverageData(value: js.Array[CodeCoverageData]): Self = StObject.set(x, "coverageData", value.asInstanceOf[js.Any])
    
    inline def setCoverageDataVarargs(value: CodeCoverageData*): Self = StObject.set(x, "coverageData", js.Array(value*))
    
    inline def setDeltaBuild(value: ShallowReference): Self = StObject.set(x, "deltaBuild", value.asInstanceOf[js.Any])
  }
}
