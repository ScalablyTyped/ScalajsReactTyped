package typingsJapgolly.ethersprojectRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRandomMod {
  
  @JSImport("@ethersproject/random/lib/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomBytes(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
