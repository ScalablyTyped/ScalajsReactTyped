package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidRoboTest extends StObject {
  
  /** The initial activity that should be used to start the app. Optional */
  var appInitialActivity: js.UndefOr[String] = js.undefined
  
  /** The java package for the bootstrap. Optional */
  var bootstrapPackageId: js.UndefOr[String] = js.undefined
  
  /** The runner class for the bootstrap. Optional */
  var bootstrapRunnerClass: js.UndefOr[String] = js.undefined
  
  /** The max depth of the traversal stack Robo can explore. Optional */
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  /** The max number of steps/actions Robo can execute. Default is no limit (0). Optional */
  var maxSteps: js.UndefOr[Double] = js.undefined
}
object AndroidRoboTest {
  
  inline def apply(): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRoboTest]
  }
  
  extension [Self <: AndroidRoboTest](x: Self) {
    
    inline def setAppInitialActivity(value: String): Self = StObject.set(x, "appInitialActivity", value.asInstanceOf[js.Any])
    
    inline def setAppInitialActivityUndefined: Self = StObject.set(x, "appInitialActivity", js.undefined)
    
    inline def setBootstrapPackageId(value: String): Self = StObject.set(x, "bootstrapPackageId", value.asInstanceOf[js.Any])
    
    inline def setBootstrapPackageIdUndefined: Self = StObject.set(x, "bootstrapPackageId", js.undefined)
    
    inline def setBootstrapRunnerClass(value: String): Self = StObject.set(x, "bootstrapRunnerClass", value.asInstanceOf[js.Any])
    
    inline def setBootstrapRunnerClassUndefined: Self = StObject.set(x, "bootstrapRunnerClass", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setMaxSteps(value: Double): Self = StObject.set(x, "maxSteps", value.asInstanceOf[js.Any])
    
    inline def setMaxStepsUndefined: Self = StObject.set(x, "maxSteps", js.undefined)
  }
}
