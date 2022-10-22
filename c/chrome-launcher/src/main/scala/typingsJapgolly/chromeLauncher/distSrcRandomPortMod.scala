package typingsJapgolly.chromeLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRandomPortMod {
  
  @JSImport("chrome-launcher/dist/src/random-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRandomPort(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomPort")().asInstanceOf[js.Promise[Double]]
}
