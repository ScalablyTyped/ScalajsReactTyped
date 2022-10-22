package typingsJapgolly.firebaseInstallations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilSleepMod {
  
  @JSImport("@firebase/installations/dist/src/util/sleep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
