package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsCheckPortMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/check-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPort(port: Double, host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPort")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
