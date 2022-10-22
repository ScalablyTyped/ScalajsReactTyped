package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteEntry extends StObject {
  
  /**
    * Id of child suite in a suite
    */
  var childSuiteId: Double
  
  /**
    * Sequence number for the test case or child suite in the suite
    */
  var sequenceNumber: Double
  
  /**
    * Id for the suite
    */
  var suiteId: Double
  
  /**
    * Id of a test case in a suite
    */
  var testCaseId: Double
}
object SuiteEntry {
  
  inline def apply(childSuiteId: Double, sequenceNumber: Double, suiteId: Double, testCaseId: Double): SuiteEntry = {
    val __obj = js.Dynamic.literal(childSuiteId = childSuiteId.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], suiteId = suiteId.asInstanceOf[js.Any], testCaseId = testCaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteEntry]
  }
  
  extension [Self <: SuiteEntry](x: Self) {
    
    inline def setChildSuiteId(value: Double): Self = StObject.set(x, "childSuiteId", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSuiteId(value: Double): Self = StObject.set(x, "suiteId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseId(value: Double): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
  }
}
