package typingsJapgolly.limiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmClockMod {
  
  @JSImport("limiter/dist/esm/clock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMilliseconds(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")().asInstanceOf[Double]
  
  inline def wait_(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
