package typingsJapgolly.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failures extends StObject {
  
  var failures: Double
  
  var passes: Double
  
  var pending: Double
  
  var suites: Double
  
  var tests: Double
}
object Failures {
  
  inline def apply(failures: Double, passes: Double, pending: Double, suites: Double, tests: Double): Failures = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failures]
  }
  
  extension [Self <: Failures](x: Self) {
    
    inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setSuites(value: Double): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
    
    inline def setTests(value: Double): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
  }
}
