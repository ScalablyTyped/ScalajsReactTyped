package typingsJapgolly.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewResult extends StObject {
  
  var changeSummary: OpMap
  
  var stderr: String
  
  var stdout: String
}
object PreviewResult {
  
  inline def apply(changeSummary: OpMap, stderr: String, stdout: String): PreviewResult = {
    val __obj = js.Dynamic.literal(changeSummary = changeSummary.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewResult]
  }
  
  extension [Self <: PreviewResult](x: Self) {
    
    inline def setChangeSummary(value: OpMap): Self = StObject.set(x, "changeSummary", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
