package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecConfig
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSpecConfig extends StObject {
  
  var config: SpecConfig
  
  var steps: js.Array[SpecStep]
}
object ConfigSpecConfig {
  
  inline def apply(config: SpecConfig, steps: js.Array[SpecStep]): ConfigSpecConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSpecConfig]
  }
  
  extension [Self <: ConfigSpecConfig](x: Self) {
    
    inline def setConfig(value: SpecConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[SpecStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: SpecStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
