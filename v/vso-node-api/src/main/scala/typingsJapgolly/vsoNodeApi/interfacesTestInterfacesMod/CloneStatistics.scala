package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneStatistics extends StObject {
  
  /**
    * Number of Requirments cloned so far.
    */
  var clonedRequirementsCount: Double
  
  /**
    * Number of shared steps cloned so far.
    */
  var clonedSharedStepsCount: Double
  
  /**
    * Number of test cases cloned so far
    */
  var clonedTestCasesCount: Double
  
  /**
    * Total number of requirements to be cloned
    */
  var totalRequirementsCount: Double
  
  /**
    * Total number of test cases to be cloned
    */
  var totalTestCasesCount: Double
}
object CloneStatistics {
  
  inline def apply(
    clonedRequirementsCount: Double,
    clonedSharedStepsCount: Double,
    clonedTestCasesCount: Double,
    totalRequirementsCount: Double,
    totalTestCasesCount: Double
  ): CloneStatistics = {
    val __obj = js.Dynamic.literal(clonedRequirementsCount = clonedRequirementsCount.asInstanceOf[js.Any], clonedSharedStepsCount = clonedSharedStepsCount.asInstanceOf[js.Any], clonedTestCasesCount = clonedTestCasesCount.asInstanceOf[js.Any], totalRequirementsCount = totalRequirementsCount.asInstanceOf[js.Any], totalTestCasesCount = totalTestCasesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneStatistics]
  }
  
  extension [Self <: CloneStatistics](x: Self) {
    
    inline def setClonedRequirementsCount(value: Double): Self = StObject.set(x, "clonedRequirementsCount", value.asInstanceOf[js.Any])
    
    inline def setClonedSharedStepsCount(value: Double): Self = StObject.set(x, "clonedSharedStepsCount", value.asInstanceOf[js.Any])
    
    inline def setClonedTestCasesCount(value: Double): Self = StObject.set(x, "clonedTestCasesCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRequirementsCount(value: Double): Self = StObject.set(x, "totalRequirementsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalTestCasesCount(value: Double): Self = StObject.set(x, "totalTestCasesCount", value.asInstanceOf[js.Any])
  }
}
